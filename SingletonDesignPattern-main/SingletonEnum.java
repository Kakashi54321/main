enum Singleton{
    UNIQUE_INSTANCE;
}

public class SingletonEnum {
    public static void main(String[] args){
        Singleton singleton = Singleton.UNIQUE_INSTANCE;
        System.out.println("I am good from SingletonEnum " +singleton );
    }
}
