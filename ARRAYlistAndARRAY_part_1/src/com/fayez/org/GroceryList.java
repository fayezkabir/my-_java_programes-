package com.fayez.org;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addgroceryList(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("you have " + groceryList.size() + " items in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + " --> " + groceryList.get(i));

        }
    }

    public void mdifyGroceryItem(int position, String NewItem) {

        groceryList.set(position, NewItem);
        System.out.println("Grocery item " + (position + 1) + "  has benn modified");

    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);

        groceryList.remove(position);

    }

    public String findItem(String SearchItem){
//        boolean exists= groceryList.contains(SearchItem);

        int position=groceryList.indexOf(SearchItem);

        if (position >=0){
            return groceryList.get(position);

        }
        return null;


    }


}
