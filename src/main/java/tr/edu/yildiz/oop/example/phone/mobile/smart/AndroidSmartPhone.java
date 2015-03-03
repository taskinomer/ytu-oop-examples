package tr.edu.yildiz.oop.example.phone.mobile.smart;

import tr.edu.yildiz.oop.example.phone.Application;
import tr.edu.yildiz.oop.example.phone.Phone;

public class AndroidSmartPhone extends SmartPhone {

    @Override
    public void install(Application application) {
        System.out.println(application.getApplicationName() + " is installing from play store");
    }

    @Override
    public void call(Phone phone) {
        System.out.println(phone.getPhoneNumber() + " called by android smart phone");
    }
}
