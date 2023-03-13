package StrategyPattern;

public class GoodFlyAbility implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("flying ability is good");
    }
}
