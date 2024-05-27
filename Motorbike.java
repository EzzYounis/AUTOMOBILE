package Automoblie;

public class Motorbike implements AutoMobile{
    int Totalvalue=0;
    boolean ABS =false;
    boolean seatheating = false;
    String name;
    public void setAbs(boolean b) {
        if (b){
            ABS=true;
            Totalvalue+=5000;
        }

    }

    public void setSeatHeating(boolean b){
        if (b){
            seatheating=true;
            Totalvalue+=2000;
        }
    }
    public Integer GetValue(){
        return Totalvalue;
    }

    public String toString(){
            StringBuilder Text= new StringBuilder(name+" with ");
            Text.append((ABS? "ABS, ":"")+(seatheating ? "SeatHeating, ":""));
            Text.setLength(Text.length()-2); // this removes the (, ) for the last option
            Text.append(" having a total price of "+ Totalvalue +" TL");
            return Text.toString();
        }

}
