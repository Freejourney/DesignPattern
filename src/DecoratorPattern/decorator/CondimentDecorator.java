package DecoratorPattern.decorator;

import DecoratorPattern.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
