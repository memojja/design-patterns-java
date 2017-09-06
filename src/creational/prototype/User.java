package creational.prototype;

public class User implements Cloneable{

    private String bookName;
    private String printingHouse;

    public User(String bookName, String printingHouse) {
        this.bookName = bookName;
        this.printingHouse = printingHouse;
    }


    public User getCopy(){

        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "User{" +
                "bookName='" + bookName + '\'' +
                ", printingHouse='" + printingHouse + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPrintingHouse() {
        return printingHouse;
    }

    public void setPrintingHouse(String printingHouse) {
        this.printingHouse = printingHouse;
    }

}
