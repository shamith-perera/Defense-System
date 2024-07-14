/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.defence.utilities.DefenceObservable;
import com.defence.maincontroller.MainController;
import com.defence.units.*;
/**
 *
 * @author shami
 */
public class Starter {
    public static void main(String args[]){
        DefenceObservable defenceObservale = new DefenceObservable();
        MainController mainController = new MainController(defenceObservale);
        defenceObservale.add(new Tank("Panzer",mainController));
        defenceObservale.add(new Submarine("2",mainController));
        defenceObservale.add(new Helicopter("Monster",mainController));
    }
    
}
