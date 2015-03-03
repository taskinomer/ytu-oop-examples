package tr.edu.yildiz.oop.example.phone.mobile;

import tr.edu.yildiz.oop.example.phone.Phone;

public class MobilePhone extends Phone {

    @Override
    public void call(Phone phone) {
        System.out.println(phone.getPhoneNumber() + " was called by mobile phone");
    }
}
