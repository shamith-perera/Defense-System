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
    public String[] getAllUnits() {
        String[] unitNamesArray = new String[defenceUnits.size()];
        for (int i = 0; i < defenceUnits.size(); i++) {
            unitNamesArray[i] = defenceUnits.get(i).getName();

        }
        return unitNamesArray;
    }

    @Override
    public void sendMsgtoUnitInIndex(int index, String msg) {
        defenceUnits.get(index).sendMsg(msg);

    }

    @Override
    public String getStatusOfUnitInIndex(int index) {
        return defenceUnits.get(index).getStatus();
    }

    @Override
    public void sendStrengthToUnits(Strength strength) {
        for (DefenceObserver unit : defenceUnits) {
            unit.sendStrength(strength);
        }
    }

}
