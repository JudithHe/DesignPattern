package StrategyPattern;

public abstract class Duck {
    //add strategy interface as attribute(组合）
    FlyBehavior flyBehavior;
    public Duck(){
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void fly(){
        if(flyBehavior!=null){
            flyBehavior.fly();
        }
    }

}
