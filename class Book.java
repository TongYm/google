
public class Book {
    private int pages;
    private double price;
    public Book( int pages,double price) {
        this.price = price;
        this.pages = pages;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


public class Magazine extends Book{
    private String dataofpublish;
    public Magazine(String dataofpublish,int pages, double price) {
        super(pages, price);
        this.dataofpublish = dataofpublish;
    }
    public String getDataofpublish() {
        return dataofpublish;
    }
    public void setDataofpublish(String dataofpublish) {
        this.dataofpublish = dataofpublish;
    }
}

public class Novel extends Book{
    private String dataofpublish;
    public Novel(String dataofpublish,int pages, double price) {
        super(pages, price);
        this.dataofpublish = dataofpublish;
    }
    public String getDataofpublish() {
        return dataofpublish;
    }
    public void setDataofpublish(String dataofpublish) {
        this.dataofpublish = dataofpublish;
    }
}

public class Periodical extends Book {
    private String dataofpublish;
    public Periodical (String dataofpublish,int pages,int price ) {
        super(pages, price);
        this.dataofpublish = dataofpublish;
    }
    public String getDataofpublish() {
        return dataofpublish;
    }
    public void setDataofpublish(String dataofpublish) {
        this.dataofpublish = dataofpublish;
    }
}

public class Textbook extends Book {
    private String dataofpublish;
    private String user;
    public Textbook(String user,String dataofpublish,int pages,int price ) {
        super(pages, price);
        this.user = user;
        this.dataofpublish = dataofpublish;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getDataofpublish() {
        return dataofpublish;
    }
    public void setDataofpublish(String dataofpublish) {
        this.dataofpublish = dataofpublish;
    }
}

public class Manager {
    public static void main (String[] args){
        Book book = new Book(120,15);
        Textbook textbook = new Textbook("小学生","15期",120,15);
        Novel novel = new Novel("17期",120,15);
        Magazine magazine = new Magazine("12期",170,15);
        Periodical periodical = new Periodical("13版",160,20);
        System.out.println(book.toString());
        System.out.println(novel.toString());
        System.out.println(magazine.toString());
        System.out.println(textbook.toString());
        System.out.println(periodical.toString());
        System.out.println(book.getPrice());
        System.out.println(book.getPages());
        System.out.println(textbook.getUser());
        System.out.println(textbook.getDataofpublish());
        System.out.println(textbook.getPages());
        System.out.println(textbook.getPrice());
        System.out.println(novel.getDataofpublish());
        System.out.println(novel.getPages());
        System.out.println(novel.getPrice());
        System.out.println(magazine.getDataofpublish());
        System.out.println(magazine.getPages());
        System.out.println(magazine.getPrice());
        System.out.println(periodical.getDataofpublish());
        System.out.println(periodical.getPages());
        System.out.println(periodical.getPrice());
    }
}

public interface BookService {
    public String product();
    public String output();
}
