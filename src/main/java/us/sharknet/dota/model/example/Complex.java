package us.sharknet.dota.model.example;


import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.CollectionUtils;
import us.sharknet.dota.model.Ability;
import us.sharknet.dota.model.Item;
import us.sharknet.dota.model.Library;
import us.sharknet.dota.model.item.Manta;
import us.sharknet.dota.model.item.UltimateScepter;

import java.util.Collection;

/**
 * Complex examples that show how to handle the problem of objects having different properties.
 * I use the Apache BeanUtils library to filter classes by their properties.
 */
public class Complex {

    private static final String[] ITEM_AGILITY_PROPERTIES = new String[]{"bonusAgility","bonusStats","bonusAllStats"};

    private Library library;

    public Complex() {
        library = new Library();
    }

    public static void main(String[] args) {
        Complex complex = new Complex();
        complex.printAgilityItems();
        complex.getAgilityBonus();
        complex.printPassiveAbilties();
    }

    public void printAgilityItems() {
        //Create a predicate that returns true if the item has a property that affects a hero's agility
        AgilityItemPredicate agilityItemPredicate = new AgilityItemPredicate();
        //Create a filtered collection of only agility related items
        Collection<Item> agilityItems = CollectionUtils.select(library.getItems(), agilityItemPredicate);
        System.out.println("Items that provide agility");
        for (Item item : agilityItems) {
            System.out.println(item.getLocalizedName());
        }
    }

    public void getAgilityBonus() {
        Item[] items = new Item[]{Manta.instance(), UltimateScepter.instance()};
        int bonus = getIntegerItemBonus(items, ITEM_AGILITY_PROPERTIES);
        System.out.println("Agility bonus from a Manta and an Aghs is: " + bonus);
    }

    /**
     * This is a general purpose method to sum item bonuses. You must pass
     * an array of property names which have an integer return type. It will
     * look up their values using reflection.
     *
     * @param itemArray An array of Item objects
     * @param propertyNames An array of item JavaBean property names that affect agility.
     * @return The sum of the item agility bonuses.
     */
    private int getIntegerItemBonus(Item[] itemArray, final String[] propertyNames) {
        int bonus = 0;
        try {
            for (Item item : itemArray) {
                for (String propertyName : propertyNames) {
                    if (PropertyUtils.isReadable(item, propertyName)) {
                        bonus += (int) PropertyUtils.getProperty(item, propertyName);
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return bonus;
    }

    public void printPassiveAbilties() {
        System.out.println("-----------------");
        System.out.println("Passive Abilities");
        System.out.println("-----------------");
        for(Ability ability : library.getAbilities()) {
            if( ability.isPassive() && !ability.getLocalizedName().startsWith("Empty")) {
                System.out.println(ability.getOwnerKey() + ":" + ability.getLocalizedName());
            }
        }
    }


}
