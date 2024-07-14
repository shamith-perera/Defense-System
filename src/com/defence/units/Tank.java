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
public class Tank  extends SuperDefence{
    public Tank(String name,MainController mainController) {
        super(("Tank(" + name +")"),mainController);
        setVisible(true); 
    }
   
}
