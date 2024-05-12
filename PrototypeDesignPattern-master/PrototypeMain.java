package designPattern.Prototype;

/**
 *
 * @author ddilipk
 */
public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException{
        BookShop bs1 = new BookShop();
        bs1.setShopName("The Book Exchange");
        bs1.loaData();

        BookShop bs2 = bs1.clone(); // Deep cloning, doesn't load data again(no DB call) rather gets it from bs1
        
        bs2.setShopName("The Book Haven");
        System.out.println(bs1);
        System.out.println(bs2);
    }
}
