public class Book {
    private String bookId;
    private String bookName;
    protected int pages;


    public Book() {
    }
//构造方法
    public Book(String bookId, String bookName, int pages) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.pages = pages;
    }


    public String getBookId() {
        return bookId;
    }


    public void setBookId(String bookId) {
        this.bookId = bookId;
    }


    public String getBookName() {
        return bookName;
    }


    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    public int getPages() {
        return pages;
    }


    public void setPages(int pages) {
        this.pages = pages;
    }
}

//BookManager.java 
package com.apple.chapter.six;
import java.util.ArrayList;
import java.util.Arrays;


public class BookManager {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary("INB001","CookBook",90,9);
        //x子类访问父类的 protect 成员变量
        int pages = dictionary.pages;
        //类型转换 int 转 String
        display(String.valueOf(pages));
        display(dictionary.getBookName());


        Book book = new Book("INB002","James",70);
        display(book.getBookId());
        Book bookdictionary = new Dictionary("INB003","Toms",98,8);
        display(bookdictionary.getBookId());




        //final
    }


    public static void display(String content){
        System.out.println(content);
    }
}



//DefaultValue.java 
package com.apple.chapter.six;


public class DefaultValue {
    //图书的编码必须包含“INB”
    //设置一个常量，名为BOOK_SKU
    final public static String DICTIONARY_SKU = "D001";
    final public static String content(){
        return "INB";
    }
}

//Dictionary.java 
package com.apple.chapter.six;

public class Dictionary extends Book {
    private int definitions;
//使用this调用另外一种构造方法
    public Dictionary(int definitions) {
        this.definitions = definitions;
    }
//使用super把bookId, bookName, pages作为参数传递给父类。注意：这个super一定要放在构造方法第一行，并且每个构造方法只可以有一个super（）
    public Dictionary(String bookId, String bookName, int pages, int definitions) {
        super(bookId, bookName, pages);
        this.definitions = definitions;
    }


    public int getDefinitions() {
        return definitions;
    }


    public void setDefinitions(int definitions) {
        this.definitions = definitions;
    }


    //覆盖
    public String getBookId(){
        return DefaultValue.DICTIONARY_SKU + super.getBookId();
    }
}


//Shapes.java 
package com.apple.chapter.six;


abstract class Shape{
    abstract void draw();
    abstract void erase();
}


class Circle extends Shape{
    void draw(){
        System.out.println("Circle.draw()");
    }


    @Override
    void erase() {


    }


    void earse(){
        System.out.println("Circle.erase()");
    }
}


class Square extends Shape{
    void draw(){
        System.out.println("Square.draw()");
    }
    void erase(){
        System.out.println("Square.erase()");
    }
}
public class Shapes {
    public static Shape randShape(){
        switch((int)(Math.random()*3)){
            default:
            case 0:return new Circle();
            case 1:return new Square();
        }
    }

    public static void main(String[] args){
        Shape[] s = new Shape[9];
        for (int i = 0;i<s.length;++i)
            s[i] = randShape();
        for(int i = 0;i<s.length;++i)
            s[i].draw();
    }
}
