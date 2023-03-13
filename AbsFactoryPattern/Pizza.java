package AbsFactoryPattern;

public abstract class Pizza {
    protected String name;
    public Pizza(){
    }
    public abstract void prepare();
    public void bake(){
        System.out.println(name+" is been baking");
    };
    public void cut(){
        System.out.println(name+" is been cutting");
    };
    public void box(){
        System.out.println(name+" is been boxing");
    };
    public void setName(String name){
        this.name = name;
    }

}
