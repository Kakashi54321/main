package designPattern;

public class FactoryMain {
    public static void main(String[] args){
        FactoryPattern fP = new FactoryPattern();
        OS openType = fP.getInstance("open");
        openType.specification(); //prints I am Powerful
        
        OS closeType = fP.getInstance("close");
        closeType.specification(); //prints I am Secure
        
        OS powerType = fP.getInstance("power");
        powerType.specification(); //prints I am Outdated
    }
}
