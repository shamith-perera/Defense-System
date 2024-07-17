/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.defence.units;

import com.defence.mainunit.SuperDefence;
import javax.swing.JSpinner;
import com.defence.maincontroller.MainController;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSlider;

/**
 *
 * @author shami
 */
public class Helicopter extends SuperDefence {

    private int ammoCount;
    private int soldierCount;
    private int missileCount;
    private int fuelLevel;
    private final JSpinner ammoCountSpinner;
    private final JSpinner soldierCountSpinner;
    private final JSpinner missileCountSpinner;
    private final JButton shootBtn;
    private final JButton missileShootBtn;
    private final JSlider fuelSlider;
    private final JButton laserBtn;

    public Helicopter(String name, MainController mainController) {
        super(("Helicopter(" + name + ")"), mainController);
        this.ammoCount = 100;
        this.soldierCount = 5;
        this.missileCount = 20;
        this.fuelLevel = 100;
        unitNameTitle.setIcon(new ImageIcon("src/com/defence/icons/heli.png"));

        ammoCountSpinner = new JSpinner();
        ammoCountSpinner.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            ammoCount = (int) ammoCountSpinner.getValue();
            unitStatusChanged();
        });
        addSpinnerToSupplyStatusPanel(ammoCountSpinner, "Ammo Count", 100, 0, 100);

        missileCountSpinner = new JSpinner();
        missileCountSpinner.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            missileCount = (int) missileCountSpinner.getValue();
            unitStatusChanged();
        });
        addSpinnerToSupplyStatusPanel(missileCountSpinner, "Missile Count", 20, 0, 20);

        soldierCountSpinner = new JSpinner();

        soldierCountSpinner.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            soldierCount = (int) soldierCountSpinner.getValue();
            unitStatusChanged();
        });
        addSpinnerToSupplyStatusPanel(soldierCountSpinner, "Soldier Count", 5, 0, 5);

        shootBtn = new JButton("Shoot");
        shootBtn.addActionListener((java.awt.event.ActionEvent evt) -> {
            if (isSoldeiersExist()) {
                if (ammoCount > 0) {
                    ammoCount--;
                    int currentValue = (int) ammoCountSpinner.getValue();
                    ammoCountSpinner.setValue(--currentValue);
                    unitStatusChanged();
                } else {
                    JOptionPane.showMessageDialog(this, "No Ammo !!! Refill to Shoot", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        addButtonToOperationsPanel(shootBtn);

        missileShootBtn = new JButton("Launch Missile");
        missileShootBtn.addActionListener((java.awt.event.ActionEvent evt) -> {
            if (isSoldeiersExist()) {
                if (missileCount > 0) {
                    missileCount--;
                    int currentValue = (int) missileCountSpinner.getValue();
                    missileCountSpinner.setValue(--currentValue);
                    unitStatusChanged();
                } else {
                    JOptionPane.showMessageDialog(this, "No Missile Ammo !!! Refill to Launch", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        addButtonToOperationsPanel(missileShootBtn);

        laserBtn = new JButton("Laser Operation");
        laserBtn.addActionListener((java.awt.event.ActionEvent evt) -> {
            isSoldeiersExist();
        });
        addButtonToOperationsPanel(laserBtn);

        fuelSlider = new JSlider();
        fuelSlider.addChangeListener((javax.swing.event.ChangeEvent e) -> {
            fuelLevel = fuelSlider.getValue();
            unitStatusChanged();
        });
        addSliderToUnistStatusPanel(fuelSlider, "Fuel", 0, 100, 100);
        setLocation(50, 400);
        setVisible(true);
    }

    private boolean isSoldeiersExist() {
        if (soldierCount > 0) {
            return true;
        }
        JOptionPane.showMessageDialog(this, "No Soldiers to Operate", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    @Override
    protected String generateStatusReport() {
        String status = "  Ammo\t : " + ammoCount + "\n";
        status += "  Missiles\t : " + missileCount + "\n";
        status += "  Soldiers\t : " + soldierCount + "\n\n";
        status += "  Fuel Level\t : " + fuelLevel;
        return status;
    }

    @Override
    protected void unlockOperationsAccordingToStrength() {

        if (isPostioned) {
            disableAllOperations();
            switch (warStrength) {
                case STRONG:
                    laserBtn.setEnabled(true);
                case HIGH:
                case MEDIUM:
                    missileShootBtn.setEnabled(true);
                case LOW:
                    shootBtn.setEnabled(true);

            }
        } else {
            disableAllOperations();
        }

    }

    protected void disableAllOperations() {
        shootBtn.setEnabled(false);
        missileShootBtn.setEnabled(false);
        laserBtn.setEnabled(false);
    }

}
