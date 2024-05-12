package designPattern.Builder;

/**
 *
 * @author ddilipk
 */
public class PhoneBuilder {
    String name;
    String ram;
    String storage;
    String camera;

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public PhoneBuilder setCamera(String camera) {
        this.camera = camera;
        return this;
    }
    
    public Phone getPhone(){
        return new Phone(name, ram, storage, camera);
    }  
}
