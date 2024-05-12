package designPattern.Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ddilipk
 */
public class BookShop implements Cloneable{
    String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    //Manually loading books, ideally here we can have DB call to fetch books record
    public void loaData(){
        for(int i = 0; i<10; i++){
            Book b = new Book();
            b.setId(i);
            b.setName("Book " +i);
            getBooks().add(b);
        }
    }
    
    @Override
    public String toString() {
        return "BookShop{" + "shopName=" + shopName + ", books=" + books + '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
       BookShop bs = new BookShop();
       for(Book b:this.getBooks()){
           bs.getBooks().add(b);
       }
       return bs;
    }  
}
