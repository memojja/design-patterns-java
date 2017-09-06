package creational.singleton;

import java.util.Set;

public class Main {

    public static void main(String[] args){
        String password = Settings.getSettings().getPassword();
        String userName = Settings.getSettings().getPassword();

        System.out.println("User Name :" + userName + " password :"+ password);
    }
}
