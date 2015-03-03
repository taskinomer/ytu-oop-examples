package tr.edu.yildiz.oop.example.phone.desk;

import tr.edu.yildiz.oop.example.phone.Phone;

/**
 * Created by otaskin on 04/03/15.
 */
public class DeskPhone extends Phone {

    @Override
    public void call(Phone phone) {
        System.out.println(phone.getPhoneNumber() + " was called by dial phone");
    }
}
