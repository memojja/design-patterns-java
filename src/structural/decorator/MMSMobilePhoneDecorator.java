package structural.decorator;

public class MMSMobilePhoneDecorator extends MobilePhoneDecorator {

    public MMSMobilePhoneDecorator(MobilePhone mobilePhone) {
        super(mobilePhone);
    }

    @Override
    public void createPhone() {
        mobilePhone.createPhone();
        addMMSProperty();
    }

    private void addMMSProperty() {
        System.out.println("added mms propery");
    }
}
