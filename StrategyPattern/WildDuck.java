package StrategyPattern;

public class WildDuck extends Duck{
    public WildDuck(){
        flyBehavior = new GoodFlyAbility();
    }
}
