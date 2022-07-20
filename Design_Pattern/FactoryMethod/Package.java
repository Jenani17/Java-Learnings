package FactoryMethod;


import java.util.ArrayList;
import java.util.List;

public abstract class Package {

    protected List<Basic> basic = new ArrayList<Basic>();
    
    public  Package(){
        packageDetails();
    }
    protected abstract void packageDetails();


    public void printPack(){
            System.out.printf("%-15s %10s %n","Sport", "Price");
            for(int i = 1; i < basic.size(); i++){
                basic.get(i).printPack();
            }
           
    }
}
