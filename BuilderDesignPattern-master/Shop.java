package designPattern.Builder;

/**
 *
 * @author ddilipk
 */
public class Shop {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setName("Samsung").setRam("4GB").setStorage("64GB").setCamera("13MP").getPhone(); //prints the phone with all sttributes which has been set, we can set partial attributes.
        System.out.println(phone);
    }
}
