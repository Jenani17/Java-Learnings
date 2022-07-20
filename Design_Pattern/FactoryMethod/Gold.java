package FactoryMethod;

public class Gold extends Package {
    @Override
    protected void packageDetails() {
        basic.add(new Indoor());
        basic.add(new Outdoor());
       

    }
}
