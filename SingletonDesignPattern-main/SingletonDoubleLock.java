public class SingletonDoubleLock {
    private volatile static SingletonDoubleLock uniqueInstance;
    private SingletonDoubleLock(){}
    public static SingletonDoubleLock getInstance(){
        if(uniqueInstance == null){
            synchronized (SingletonDoubleLock.class){
                if(uniqueInstance == null){
                    uniqueInstance = new SingletonDoubleLock();
                }
            }
        }
        return uniqueInstance;
    }
    public void display(){
        System.out.println("I am good from SingletonDoubleLock");
    }
}


