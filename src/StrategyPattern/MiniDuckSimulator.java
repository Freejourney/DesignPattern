package StrategyPattern;

import StrategyPattern.bean.Duck;
import StrategyPattern.bean.MallardDuck;
import StrategyPattern.bean.ModelDuck;
import StrategyPattern.behavior.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
