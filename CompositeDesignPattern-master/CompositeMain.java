package designPattern.Composite;

/**
 *
 * @author ddilipk
 */
public class CompositeMain {
    public static void main(String[] args) {
        Component hd = new Leaf(100, "HD");
        Component mouse = new Leaf(500, "Mouse");
        Component screen = new Leaf(8000, "Screen");
        Component ram = new Leaf(400, "RAM");
        Component cpu = new Leaf(9000, "CPU");
        
        Composite ph = new Composite("Peri");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("MotherBoard");
        Composite computer = new Composite("Computer");
        
        ph.addComponent(mouse);
        ph.addComponent(screen);
        
        mb.addComponent(cpu);
        mb.addComponent(ram);
        
        cabinet.addComponent(hd);
        cabinet.addComponent(mb);
          
        computer.addComponent(ph);
        computer.addComponent(cabinet);
        
        computer.showPrice();
    }
}
