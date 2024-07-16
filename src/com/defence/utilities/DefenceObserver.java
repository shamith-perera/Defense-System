/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.defence.utilities;

/**
 *
 * @author shami
 */
public interface DefenceObserver {

    public void setAreaStatus(boolean status);

    public void getMsg(String msg);

    public String getName();
    
    public String getStatus();

    public void sendStrength(Strength strength);
}
