package AbsFactoryPattern.Factory;

import AbsFactoryPattern.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    AbsFactory factory;
    //聚合接口，放入接口
    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    public void setFactory(AbsFactory factory){
        //set Factory according to Ordertype
        String orderType = "";
        Pizza pizza = null;
        this.factory = factory;
        do{
            orderType = getType();
            //factory 指向哪个factory实例就create哪个factory的piazza
            pizza = factory.createPizza(orderType);
            if(pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("order is unsuccessful");
                break;
            }
        }while(true);


    }

    private String getType() {
        try{
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Which type of pizza do you want, cheese or pepper");
            String type = strin.readLine();
            return type;
        }catch(IOException e){
            e.printStackTrace();
            return "";
        }
    }

}
