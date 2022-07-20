package FactoryMethod;

public class Water extends Basic {

    public String name = "Water games Ticket";
    public int price = 2500;
    

    @Override
    public void printPack() {
        System.out.printf("%-15s %10s %n", name, price);
    }
}
