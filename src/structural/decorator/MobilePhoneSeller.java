package structural.decorator;

public class MobilePhoneSeller {

    public static void main(String[] args){

        MobilePhone mobilePhone = new CAMERAMobilePhoneDecorator( new MMSMobilePhoneDecorator(new Nokia()));
        mobilePhone.createPhone();

    }
}
