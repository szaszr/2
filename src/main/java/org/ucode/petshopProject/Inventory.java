package org.ucode.petshopProject;

import java.util.ArrayList;

public class Inventory {

    ArrayList<InventoryItem> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(InventoryItem item){
        items.add(item);
    }

    public void removeItem (InventoryItem item){
        items.remove(item);
    }

    public ArrayList<InventoryItem> findByPriceBetween (int low, int high){
        ArrayList<InventoryItem> priceBetween = new ArrayList<>();
        for (int i=0;i<items.size();i++){
            if (items.get(i).getPrice()>low && items.get(i).getPrice()<high){
                priceBetween.add(items.get(i));
        }
    }
        return priceBetween;
    }

    public ArrayList<InventoryItem> findByQuantityBetween (int low, int high){
        ArrayList<InventoryItem> quantityBetween = new ArrayList<>();
        for (int i=0;i<items.size();i++){
            if (items.get(i).getQuantity()>low && items.get(i).getQuantity()<high){
                quantityBetween.add(items.get(i));
            }
        }
        return quantityBetween;
    }

    public ArrayList<InventoryItem> listAllAvailableItems (boolean available){
        ArrayList<InventoryItem> allItems = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (available && items.get(i).getQuantity()>0) {
                    allItems.add(items.get(i));
                }
            else if (!available && items.get(i).getQuantity()==0){
                    allItems.add(items.get(i));
            }
        }
        return allItems;
    }

//    public ArrayList<InventoryItem> transactionList () {
//        ArrayList<InventoryItem> transactionList = new ArrayList<>();
//
//    }
//
//    public ArrayList<InventoryItem> listByBuyInterval (String startDate, String endDate){
//        ArrayList<InventoryItem> byBuyInterval = new ArrayList<>();
//        for (int i = 0; i < items.size() ; i++) {
//            if ()
//        }
//    }


}
