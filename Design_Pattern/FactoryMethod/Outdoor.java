package FactoryMethod;

public class Outdoor extends Basic {

    public String name = "outdoor games Ticket";
    public int price = 2000;
  

    @Override
    public void printPack() {
        System.out.printf("%-15s %10s %n",name, price);
    }
}
