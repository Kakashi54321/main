package designPattern.Prototype;

/**
 *
 * @author ddilipk
 */
public class Book {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + '}';
    }   
}
