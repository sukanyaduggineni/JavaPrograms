package com.meryemalay;

public class Main {

    public static void main(String[] args) {
	    ITelephone merysPhpne;
	    merysPhpne = new DeskTelephone(6575876);

	    merysPhpne.powerOn();
	    merysPhpne.callPhone(6575876);
	    merysPhpne.answer();
    }
}
