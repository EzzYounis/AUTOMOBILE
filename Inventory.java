import Automoblie.AutoMobile;
import Automoblie.Car;
import Automoblie.Motorbike;


import java.util.ArrayList;

public class Inventory {
    ArrayList<AutoMobile> AMlist =new ArrayList<>();
    public void add(AutoMobile AM) {
        AMlist.add(AM);
    }
    public Integer CountCars(){
        int counter=0;
        for (AutoMobile vehicle: AMlist){
            if ( vehicle instanceof Car){
                counter++;
            }
        }
        return counter;
    }
    public Integer CountMotor(){
        int counter=0;
        for (AutoMobile vehicle: AMlist){
            if ( vehicle instanceof Motorbike){
                counter++;
            }
        }
        return counter;
    }
    public Integer TotalValue(){
        Integer Total=0;
        for (AutoMobile vehicle: AMlist){
            Total+=vehicle.GetValue();
        }
        return Total;
    }


    public String toString(){
        StringBuilder text=new StringBuilder();
        for (AutoMobile vehicle: AMlist){
            text.append(vehicle.toString()+"\n");
        }
        text.append("TOTAL : "+ AMlist.size());
        text.append(" Vehicles including ");
        text.append( CountCars() +" Cars and "+CountMotor()+" Motorbikes ");
        text.append("having a total price of "+TotalValue()+" TL");
        return text.toString();
    }


}
