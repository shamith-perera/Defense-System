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
public class Submarine  extends SuperDefence{
    public Submarine(String name,MainController mainController) {
        super(("Submarine(" + name +")"),mainController);
        supplyStatusPanel.add(new JLabel("Hello"));
        setVisible(true); 
    }
   
}
