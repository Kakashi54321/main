public class SingletonLazy {
    private static SingletonLazy uniqueInstance;
    private SingletonLazy(){}
    public static SingletonLazy getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new SingletonLazy();
        }
        return uniqueInstance;
    }
    public void display(){
        System.out.println("I am good from SingletonLazy");
    }
}


