package creational.prototype;

public class Main {

    public static void main(String[] args){

        User user = new User("book name1","printing house1");
        User user2 = user.getCopy();

        System.out.println("orginal user : " + user);
        System.out.println("copying user : " + user2);

    }
}
