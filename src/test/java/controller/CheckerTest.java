package controller;

import beans.Item;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckerTest extends TestCase {

    @Test
    public void testGetWeightOfItems() {
        Checker checker = new Checker();
        List<Item> items = new ArrayList<>();
        items.add(new Item("book", 1.0, 50));
        items.add(new Item("book1", 1.0, 30));
        items.add(new Item("book2", 2.0, 150));
        items.add(new Item("book3", 0.4, 200));
        double rez = checker.getWeightOfItems(items);
        Assert.assertEquals(4.4, rez, 0.0);

    }

    @Test
    public void testGetCostOfItems() {
        Checker checker = new Checker();
        List<Item> items = new ArrayList<>();
        items.add(new Item("book", 1.0, 50));
        items.add(new Item("book1", 1.0, 30));
        items.add(new Item("book2", 2.0, 150));
        items.add(new Item("book3", 0.4, 200));
        double rez = checker.getCostOfItems(items);
        Assert.assertEquals(430, rez, 0.0);

    }
}