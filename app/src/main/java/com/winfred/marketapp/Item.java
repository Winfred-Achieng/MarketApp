package com.winfred.marketapp;

public class Item {
    String itemName, itemDesc;
    int itemImg;

    public Item(String itemName, String itemDesc, int itemImg) {
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemImg = itemImg;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }
}
