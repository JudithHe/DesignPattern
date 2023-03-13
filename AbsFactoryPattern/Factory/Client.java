package AbsFactoryPattern.Factory;

public class Client {
    public static void main(String[] args) {
        //AbsFactory bjFactory = new BJFactory();
        //new OrderPizza(bjFactory);
        new OrderPizza(new LDFactory());
    }
}
