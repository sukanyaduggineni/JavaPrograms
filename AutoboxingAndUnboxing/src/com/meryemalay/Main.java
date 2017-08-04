package com.meryemalay;

import java.util.ArrayList;

class IntClass{
    private int mayValue;

    public IntClass(int mayValue) {
        this.mayValue = mayValue;
    }

    public int getMayValue() {
        return mayValue;
    }

    public void setMayValue(int mayValue) {
        this.mayValue = mayValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        // This is not possible because ArrayList wants to get object type
        //ArrayList<int> intArrayLİst = new ArrayList<int>();

        //You can create an objects which takes primitive type and create wrapper
        ArrayList<IntClass> intArrayList = new ArrayList<>();
        intArrayList.add(new IntClass(22));

        Integer integerValue = new Integer(11);
        Double doubleValue = new Double(32.2);

        ArrayList<Integer> intArrayL = new ArrayList<>();
        for (int i = 0; i <= 10 ; i++) {
            intArrayL.add(Integer.valueOf(i));
        }
        // Integer.valueOf(i) -> this is autoboxing
        // We are taking the primitive type and we are going to object wrapper

//        for (int i = 0; i <= intArrayL.size() ; i++) {
//            System.out.println(i + " --> " + intArrayL.get(i).intValue());
//        }

        // Unboxing is where we are taking it from the class or from the object wrapper
        // and converting it back to a primitive type
        // intArrayL.get(i).intValue() -> this is unboxing

        Integer myIntegerValue = 56; // Integer.valueOf(56) -> Autoboxing
        int myIntValue = myIntegerValue.intValue();  // -> Un boxing

        ArrayList<Double> dblList = new ArrayList<>();
        for (double i = 0; i <= 10 ; i += 0.5) {
            dblList.add(i);
        }

        for (int i = 0; i < dblList.size(); i++) {
            System.out.println(i + " ->" + dblList.get(i));
        }








    }
}
