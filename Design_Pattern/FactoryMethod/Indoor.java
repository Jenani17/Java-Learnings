package FactoryMethod;

public class Indoor extends Basic {

    public String name = "Indoor games Ticket";
    public int price = 1500;
   

    @Override
    public void printPack() {
        System.out.printf("%-15s %10s %n",name, price);
    }
}
