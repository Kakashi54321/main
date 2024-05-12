package designPattern.Builder;

/**
 *
 * @author ddilipk
 */
public class Phone {
    String name;
    String ram;
    String storage;
    String camera;

    public Phone(String name, String ram, String storage, String camera) {
        this.name = name;
        this.ram = ram;
        this.storage = storage;
        this.camera = camera;
    }
    
    @Override
    public String toString(){
        return "Phone: Name = "+name+" RAM = "+ram+" Storage = "+storage+" Camera = "+camera+"";
    }
}
