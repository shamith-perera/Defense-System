/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.defence.units;

import com.defence.mainunit.SuperDefence;
import javax.swing.JLabel;
import com.defence.maincontroller.MainController;
/**
 *
 * @author shami
 */
public class Helicopter  extends SuperDefence{
    public Helicopter(String name,MainController mainController) {
        super(("Helicopter(" + name +")"),mainController);
        supplyStatusPanel.add(new JLabel("Hello"));
        setVisible(true); 
    }
   
}
