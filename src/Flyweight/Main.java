package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Object> activeUnits = new ArrayList<>();

        for(int i=0;i<1000;i++){
          activeUnits.add(new TeslTank("TeslaTank",200,100,50,25,0,0,500));
            activeUnits.add(new TeslTank("Rifleman",25,5,20,25,0,0,50));

        }

    }
}
