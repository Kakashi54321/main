public class SingletonDemo {
    public static void main(String[] args){
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonEager singletonEager = SingletonEager.getInstance();
        SingletonSync singletonSync = SingletonSync.getInstance();
        SingletonDoubleLock singletonDoubleLock = SingletonDoubleLock.getInstance();

        singletonLazy.display();
        singletonEager.display();
        singletonSync.display();
        singletonDoubleLock.display();

        Singleton singleton = Singleton.UNIQUE_INSTANCE;
        System.out.println("I am good from SingletonEnum " +singleton );
    }
}
