package AbsFactoryPattern.Factory;

import AbsFactoryPattern.BJCheesePizza;
import AbsFactoryPattern.BJPepperPizza;
import AbsFactoryPattern.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
            pizza.setName("BJCheesePizza");
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
            pizza.setName("BJPepperPizza");
        }
        return pizza;
    }
}
