package AbsFactoryPattern.Factory;

import AbsFactoryPattern.Pizza;

//抽象模式的抽象interface
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
