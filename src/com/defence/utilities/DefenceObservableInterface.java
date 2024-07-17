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

    public void sendAreaStatus(boolean status);

    public void sendMsgtoAllUnits(String msg);

    public Object[] getAllUnits();

    public void sendMsgtoUnit(Object unit, String msg);

    public void enableTrackingForUnit(Object unit);

    public void sendStrengthToUnits(Strength strength);

}
