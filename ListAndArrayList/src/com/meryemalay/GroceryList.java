package com.meryemalay;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryList(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+ groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". "+ groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+ (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position){
        String item = groceryList.get(position);
        groceryList.remove(position);
    }
}
