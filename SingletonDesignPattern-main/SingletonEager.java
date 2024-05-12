public class SingletonEager {
    private static SingletonEager uniqueInstance = new SingletonEager();
    private SingletonEager(){}
    public static SingletonEager getInstance(){
        return uniqueInstance;
    }
    public void display(){
        System.out.println("I am good from SingletonEager");
    }
}