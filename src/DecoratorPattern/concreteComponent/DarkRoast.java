package DecoratorPattern.concreteComponent;

import DecoratorPattern.component.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0;
    }
}
