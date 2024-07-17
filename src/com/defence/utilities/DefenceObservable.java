/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.defence.utilities;

import java.util.ArrayList;

/**
 *
 * @author shami
 */
public class DefenceObservable implements DefenceObservableInterface {

    private final ArrayList<DefenceObserver> defenceUnits;

    public DefenceObservable() {
        defenceUnits = new ArrayList<>();
    }

    public void add(DefenceObserver unit) {
        defenceUnits.add(unit);
    }

    @Override
    public void sendAreaStatus(boolean status) {
        for (DefenceObserver unit : defenceUnits) {
            unit.setAreaStatus(status);
        }
    }

    @Override
    public void sendMsgtoAllUnits(String msg) {
        for (DefenceObserver unit : defenceUnits) {
            unit.sendMsg(msg);
        }
    }

    @Override
    public Object[] getAllUnits() {
        Object[] unitArray = new Object[defenceUnits.size()];
        for (int i = 0; i < defenceUnits.size(); i++) {
            unitArray[i] = defenceUnits.get(i);

        }
        return unitArray;
    }

    @Override
    public void sendMsgtoUnit(Object unit, String msg) {
       ((DefenceObserver)unit).sendMsg(msg);

    }

    @Override
    public void enableTrackingForUnit(Object unitToEnable) {
        for (DefenceObserver unit : defenceUnits) {
            unit.setTracking(false);
        }
        ((DefenceObserver)unitToEnable).setTracking(true);
    }

    @Override
    public void sendStrengthToUnits(Strength strength) {
        for (DefenceObserver unit : defenceUnits) {
            unit.sendStrength(strength);
        }
    }

}
