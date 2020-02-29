package controller;

import beans.Backpack;
import beans.Item;

import java.util.ArrayList;
import java.util.List;

public class Checker {

    public double getWeightOfItems(List<Item> items) {
        double weightOfItems = 0;
        for (Item item : items) {
            weightOfItems += item.getWeight();
        }
        return weightOfItems;
    }

    public double getCostOfItems(List<Item> items) {
        double costOfItems = 0;
        for (Item item : items) {
            costOfItems += item.getCost();
        }
        return costOfItems;
    }

    private void checkItems(Backpack backpack, List<Item> items) {
        if (backpack.getItems() == null) {
            if (getWeightOfItems(items) <= backpack.getMaxWeight()) {
                backpack.setItems(items);
                backpack.setBestCost(getCostOfItems(items));
            } else {
                if (getWeightOfItems(items) <= backpack.getMaxWeight() && getCostOfItems(items) >=backpack.getBestCost()){
                    backpack.setItems(items);
                    backpack.setBestCost(getCostOfItems(items));
                }
            }
        }
    }

    public Backpack checkAllSets(Backpack backpack, List<Item> items){
        if(items.size() > 0)
        checkItems(backpack, items);
            for (int i = 0; i < items.size(); i++) {
                List<Item> newItems = new ArrayList<>(items);
                newItems.remove(i);
                checkAllSets(backpack, newItems);
            }
            return backpack;
        }

}
