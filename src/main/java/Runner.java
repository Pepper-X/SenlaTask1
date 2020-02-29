import beans.Backpack;
import beans.Item;
import controller.Checker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Checker checker = new Checker();
        Backpack backpack = new Backpack();
        System.out.println("Enter maxWeight");
        double weight = in.nextDouble();
        backpack.setMaxWeight(weight);
        System.out.println("Max weight of the backpack is " + backpack.getMaxWeight());

        List<Item> items = new ArrayList<>();
        items.add(new Item("book", 1.0, 50));
        items.add(new Item("book1", 1.0, 30));
        items.add(new Item("book2", 2.0, 150));
        items.add(new Item("book3", 0.4, 200));
        items.add(new Item("phone", 0.5, 25));
        items.add(new Item("powerbank", 2.0, 300));
        items.add(new Item("book6", 1.5, 350));
        items.add(new Item("laptop", 4.0, 40));

        System.out.println("Weight of all items is " + checker.getWeightOfItems(items));
        System.out.println("Cost of all items is " + checker.getCostOfItems(items));
        backpack = checker.checkAllSets(backpack, items.stream().sorted().collect(Collectors.toList()));


        System.out.println("Items in the backpack:");
        for (Item item : backpack.getItems()) {
            System.out.println(item.getName() + " weight is " + item.getWeight() + " cost is " + item.getCost());
        }
        System.out.println("Total cost items in the backpack is " + backpack.getBestCost());

        System.out.println("Total weight of items in the backpack");
        double totalWeight = 0.0;
        for (Item it : backpack.getItems()) {
            totalWeight += it.getWeight();
        }
        System.out.println(totalWeight);
    }
}
