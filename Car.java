package Automoblie;

import java.awt.*;

public class Car implements AutoMobile{
    int Totalvalue=0;
    boolean ABS=false;
    boolean MusicSystem=false;
    boolean Airbag=false;
    boolean sunroof=false;
    String name;


    public void setAbs(boolean b) {
        if (b){
            ABS=true;
            Totalvalue+=5000;
        }

    }
    public Integer GetValue(){
        return Totalvalue;
    }


    public void setMusicSystem(boolean b) {
        if (b){
            MusicSystem=true;
            Totalvalue+=1000;
        }

    }


    public void setAirBag(boolean b) {
        if (b){
            Airbag=true;
            Totalvalue+=3000;
        }
    }


    public void setSunRoof(boolean b) {
        if (b){
            sunroof=true;
            Totalvalue+=2000;
        }

    }
    public String toString(){
        StringBuilder Text= new StringBuilder(name+" with ");
        Text.append((ABS? "ABS, ":"")+(MusicSystem ? "MusicSystem, ":"")+(Airbag ? "AirBag, ":"")+(sunroof ? "SunRoof, ":""));
        Text.setLength(Text.length()-2); // this removes the (, ) for the last option
        Text.append(" having a total price of "+ Totalvalue +" TL");
        return Text.toString();
    }


}
