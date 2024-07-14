/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.defence.utilities;


/**
 *
 * @author shami
 */
public interface DefenceObservableInterface {
    public void sendAreaStatus(int status);
    public void sendMsgtoAllUnits(String msg);
    public String[] getAllUnits();
    public void sendMsgtoUnitInIndex(int index,String msg);
}
