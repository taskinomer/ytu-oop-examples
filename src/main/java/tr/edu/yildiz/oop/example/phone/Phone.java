package tr.edu.yildiz.oop.example.phone;

import tr.edu.yildiz.oop.example.Callable;

public abstract class Phone implements Callable {

    private Integer phoneNumber;

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
