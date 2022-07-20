package FactoryMethod;

public class Silver extends Package {
    @Override
    protected void packageDetails() {
        basic.add(new Indoor());
       
    }
}
