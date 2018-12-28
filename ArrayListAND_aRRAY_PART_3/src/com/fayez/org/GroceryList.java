package com.fayez.org;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addgroceryList(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("you have " + groceryList.size() + " items in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + " --> " + groceryList.get(i));
            //////////////////////////////kjjjjg

        }
    }


    public void modifyGroceryItem(String currentItem,String newItem){


        int position=findItem(currentItem);
        if (position>=0){
            modifyGroceryItem(position,newItem);
        }

    }

    private void modifyGroceryItem(int position, String NewItem) {

        groceryList.set(position, NewItem);
        System.out.println("Grocery item " + (position + 1) + "  has benn modified");

    }

    public void removeGroceryItem(String Item){
        int position=findItem(Item);
        if (position>=0){
            removeGroceryItem(position);
        }


    }

    private void removeGroceryItem(int position) {
       // String  theItem=groceryList.get(position);

        groceryList.remove(position);

    }

    private int findItem(String SearchItem){
//        boolean exists= groceryList.contains(SearchItem);

        return groceryList.indexOf(SearchItem);


    }
    public boolean onFILE(String searchItem){
        int position=findItem(searchItem);
        if (position>=0){
            return true;
        }
        return  false;
    }

}
