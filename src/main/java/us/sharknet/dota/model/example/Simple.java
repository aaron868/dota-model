package us.sharknet.dota.model.example;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.Item;
import us.sharknet.dota.model.Library;
import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.AbaddonBorrowedTime;

/**
 * A few basic usage examples.
 */
public class Simple {

    private Library library;

    public Simple() {
        library = new Library();
    }

    public static void main(String[] args) {
        Simple simple = new Simple();
        simple.heroLookupByKey("npc_dota_hero_ogre_magi");
        simple.abilityDirectCreation();
        simple.printItemsWithNoCost();
        simple.printNeutralCreeps();
    }

    public void heroLookupByKey(String key) {
        Hero hero = library.getHero(key);
        if (hero == null) {
            System.out.println("Hero not found for key: " + key);
        }
        else {
            System.out.println("Hero with key " + key + " is called " + hero.getLocalizedName());
        }
    }

    public void abilityDirectCreation() {
        AbaddonBorrowedTime abaddonBorrowedTime = AbaddonBorrowedTime.instance();
        //Note that many ability stats are arrays with the index based on the ability level
        System.out.println("At level 3 Abbadon's borrowed time lasts for " + abaddonBorrowedTime.getDuration()[2] + " seconds.");
        System.out.println("With Aghs and level 3 Abbadon's borrowed time lasts for " + abaddonBorrowedTime.getDurationScepter()[2] + " seconds.");
    }

    public void printItemsWithNoCost() {
        System.out.println("**************************");
        System.out.println("Free Dota Items");
        System.out.println("**************************");
        for (Item item : library.getItems()) {
            if (item.getCost() == 0) {
                System.out.println(item.getLocalizedName());
            }
        }
        System.out.println("**************************");
    }

    public void printNeutralCreeps() {
        System.out.println("**************************");
        System.out.println("Neutral Creeps");
        System.out.println("**************************");
        for (NpcUnit unit : library.getUnits()) {
            if (unit.isNeutralCreep()) {
                System.out.println(unit.getLocalizedName());
            }
        }
        System.out.println("**************************");
    }

}
