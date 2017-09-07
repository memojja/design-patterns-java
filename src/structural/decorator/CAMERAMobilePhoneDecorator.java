package structural.decorator;

public class CAMERAMobilePhoneDecorator extends MobilePhoneDecorator {

    public CAMERAMobilePhoneDecorator(MobilePhone mobilePhone) {
        super(mobilePhone);
    }

    @Override
    public void createPhone() {
        mobilePhone.createPhone();
        addCameraPropery();
    }

    private void addCameraPropery() {
        System.out.println("added camera propery");
    }
}
