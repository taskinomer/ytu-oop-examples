package tr.edu.yildiz.oop.example.phone.mobile.smart;

import tr.edu.yildiz.oop.example.phone.Application;
import tr.edu.yildiz.oop.example.phone.Phone;

public class IPhoneSmartPhone extends SmartPhone {

    @Override
    public void install(Application application) {
        System.out.println(application.getApplicationName() + " is installing from app store");
    }

    @Override
    public void call(Phone phone) {
        System.out.println(phone.getPhoneNumber() + " called by iPhone smart phone");
    }
}
