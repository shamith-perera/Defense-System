/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.defence.units;

import com.defence.mainunit.SuperDefence;
import com.defence.maincontroller.MainController;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;

/**
 *
 * @author shami
 */
public class Submarine extends SuperDefence {

    private int ammoCount;
    private int soldierCount;
    private int tomhawkMissileCount;
    private int tridentMissileCount;
    private int fuelLevel;
    private int oxygenLevel;
    private final JSpinner ammoCountSpinner;
    private final JSpinner soldierCountSpinner;
    private final JSpinner tomhawkmissileCountSpinner;
    private final JSpinner tridentmissileCountSpinner;
    private final JButton shootBtn;
    private final JButton tomhawkMissileBtn;
    private final JButton tridentmissileBtn;
    private final JButton sonarOperationBtn;
    private final JSlider fuelSlider;
    private final JSlider oxygenSlider;

    public Submarine(String name, MainController mainController) {
        super(("Submarine(" + name + ")"), mainController);
        this.ammoCount = 250;
        this.soldierCount = 10;
        this.tomhawkMissileCount = 15;
        this.tridentMissileCount = 10;
        this.fuelLevel = 100;
        this.oxygenLevel = 100;
        unitNameTitle.setIcon(new ImageIcon("src/com/defence/icons/sub.png"));

        ammoCountSpinner = new JSpinner();
        ammoCountSpinner.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            ammoCount = (int) ammoCountSpinner.getValue();
            unitStatusChanged();
        });
        addSpinnerToSupplyStatusPanel(ammoCountSpinner, "Ammo Count", 250, 0, 250);

        tomhawkmissileCountSpinner = new JSpinner();
        tomhawkmissileCountSpinner.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            tomhawkMissileCount = (int) tomhawkmissileCountSpinner.getValue();
            unitStatusChanged();
        });
        addSpinnerToSupplyStatusPanel(tomhawkmissileCountSpinner, "Missile(Tomhawk) Count", 15, 0, 15);

        tridentmissileCountSpinner = new JSpinner();
        tridentmissileCountSpinner.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            tridentMissileCount = (int) tridentmissileCountSpinner.getValue();
            unitStatusChanged();
        });
        addSpinnerToSupplyStatusPanel(tridentmissileCountSpinner, "Missile(Trident-2) Count", 10, 0, 10);

        soldierCountSpinner = new JSpinner();
        soldierCountSpinner.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            soldierCount = (int) soldierCountSpinner.getValue();
            unitStatusChanged();
        });
        addSpinnerToSupplyStatusPanel(soldierCountSpinner, "Soldier Count", 10, 0, 10);

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

        sonarOperationBtn = new JButton("Sonar Operation");
        sonarOperationBtn.addActionListener((java.awt.event.ActionEvent evt) -> {
            isSoldeiersExist();
        });
        addButtonToOperationsPanel(sonarOperationBtn);

        tomhawkMissileBtn = new JButton("Tomhawk(Missile) Launch");
        tomhawkMissileBtn.addActionListener((java.awt.event.ActionEvent evt) -> {
            if (isSoldeiersExist()) {
                if (tomhawkMissileCount > 0) {
                    tomhawkMissileCount--;
                    int currentValue = (int) tomhawkmissileCountSpinner.getValue();
                    tomhawkmissileCountSpinner.setValue(--currentValue);
                    unitStatusChanged();
                } else {
                    JOptionPane.showMessageDialog(this, "No Tomhawk(Missile) Ammo !!! Refill to Launch", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        addButtonToOperationsPanel(tomhawkMissileBtn);

        tridentmissileBtn = new JButton("Trident(Missile) Launch");
        tridentmissileBtn.addActionListener((java.awt.event.ActionEvent evt) -> {
            if (isSoldeiersExist()) {
                if (tridentMissileCount > 0) {
                    tridentMissileCount--;
                    int currentValue = (int) tridentmissileCountSpinner.getValue();
                    tridentmissileCountSpinner.setValue(--currentValue);
                    unitStatusChanged();
                } else {
                    JOptionPane.showMessageDialog(this, "No Trident(Missile) Ammo !!! Refill to Launch", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        addButtonToOperationsPanel(tridentmissileBtn);

        fuelSlider = new JSlider();
        fuelSlider.addChangeListener((javax.swing.event.ChangeEvent e) -> {
            fuelLevel = fuelSlider.getValue();
            unitStatusChanged();
        });
        addSliderToUnistStatusPanel(fuelSlider, "Fuel", 0, 100, 100);

        oxygenSlider = new JSlider();
        oxygenSlider.addChangeListener((javax.swing.event.ChangeEvent e) -> {
            oxygenLevel = oxygenSlider.getValue();
            unitStatusChanged();
        });
        addSliderToUnistStatusPanel(oxygenSlider, "Oxygen", 0, 100, 100);
        setLocation(800, 400);
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
        String status = "  Ammo \t : " + ammoCount + "\n";
        status += "  Tomhawk M\t : " + tomhawkMissileCount + "\n";
        status += "  Trident M\t : " + tridentMissileCount + "\n";
        status += "  Soldiers\t : " + soldierCount + "\n\n";
        status += "  Oxygen\t : " + oxygenLevel + "\n";
        status += "  Fuel Level\t : " + fuelLevel;
        return status;
    }

    @Override
    protected void unlockOperationsAccordingToStrength() {

        if (isPostioned) {
            disableAllOperations();
            switch (warStrength) {
                case STRONG:
                    tridentmissileBtn.setEnabled(true);
                case HIGH:
                    tomhawkMissileBtn.setEnabled(true);
                case MEDIUM:
                    sonarOperationBtn.setEnabled(true);
                case LOW:
                    shootBtn.setEnabled(true);

            }
        } else {
            disableAllOperations();
        }

    }

    protected void disableAllOperations() {
        shootBtn.setEnabled(false);
        sonarOperationBtn.setEnabled(false);
        tomhawkMissileBtn.setEnabled(false);
        tridentmissileBtn.setEnabled(false);
    }
}
