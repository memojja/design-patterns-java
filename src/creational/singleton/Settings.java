package creational.singleton;

public class Settings {

    private String userName="Memojja";
    private String password = "123456";

    private static Settings settings= new Settings();;

    private Settings(){

    }

    public static Settings getSettings(){
        return settings;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }



}
