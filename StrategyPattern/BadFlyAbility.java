package StrategyPattern;

public class BadFlyAbility implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("flying ability is bad");
    }
}
