package com.meryemalay;

public class Main {

    public static void main(String[] args) {
        ITelephone merysPhone;
        merysPhone = new DeskTelephone(6575876);

        merysPhone.powerOn();
        merysPhone.callPhone(6575876);
        merysPhone.answer();

        merysPhone = new MobilePhone(112233);
        merysPhone.powerOn();
        merysPhone.callPhone(112233);
        merysPhone.answer();
    }
}
