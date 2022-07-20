package FactoryMethod;

public class Platinum extends Package {
    @Override
    protected void packageDetails() {
        basic.add(new Indoor());
        basic.add(new Outdoor());
        basic.add(new Water());

    }
}
