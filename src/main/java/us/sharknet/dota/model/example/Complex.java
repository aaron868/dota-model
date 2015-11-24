package us.sharknet.dota.model.example;

import org.apache.commons.collections.CollectionUtils;
import us.sharknet.dota.model.Item;
import us.sharknet.dota.model.Library;

import java.util.Collection;

/**
 * Complex examples that show how to handle the problem of objects having different properties.
 */
public class Complex {

    private Library library;

    public Complex() {
        library = new Library();
    }

    public static void main(String[] args) {
        Complex complex = new Complex();
        complex.printAgilityItems();
    }

    public void printAgilityItems() {
        AgilityItemPredicate agilityItemPredicate = new AgilityItemPredicate();
        Collection<Item> agilityItems = CollectionUtils.select( library.getItems(), agilityItemPredicate );
        System.out.println("Items that provide agility");
        for( Item item : agilityItems) {
            System.out.println(item.getLocalizedName());
        }
    }

}
