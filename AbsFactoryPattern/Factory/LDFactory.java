package AbsFactoryPattern.Factory;

import AbsFactoryPattern.*;

public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
            pizza.setName("LDCheesePizza");
        }else if(orderType.equals("pepper")){
            pizza = new LDCheesePizza();
            pizza.setName("LDCheesePizza");
        }
        return pizza;
    }
}
