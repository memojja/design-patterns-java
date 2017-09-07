package structural.decorator;

public class Nokia implements MobilePhone {

    @Override
    public void createPhone() {
        System.out.println("created basic nokia");
    }
}
