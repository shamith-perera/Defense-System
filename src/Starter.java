/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.defence.utilities.DefenceObservable;
import com.defence.maincontroller.MainController;
import com.defence.units.*;
import com.defence.utilities.Strength;

/**
 *
 * @author shami
 */
public class Starter {

    public static void main(String args[]) {
        DefenceObservable defenceObservale = new DefenceObservable();
        MainController mainController = new MainController(defenceObservale);
        defenceObservale.add(new Tank("1", mainController));
        defenceObservale.add(new Submarine("1", mainController));
        defenceObservale.add(new Helicopter("1", mainController));
        defenceObservale.sendStrengthToUnits(Strength.CLOSED);
    }

}
