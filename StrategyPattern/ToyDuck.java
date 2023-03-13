package StrategyPattern;

public class ToyDuck extends Duck{
    public ToyDuck(){
        flyBehavior = new BadFlyAbility();
    }
}
