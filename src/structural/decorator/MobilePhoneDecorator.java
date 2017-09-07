package structural.decorator;

public abstract class MobilePhoneDecorator implements MobilePhone {

    protected final MobilePhone mobilePhone;

    public MobilePhoneDecorator(MobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

}
