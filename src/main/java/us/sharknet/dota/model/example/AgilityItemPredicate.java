package us.sharknet.dota.model.example;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.Predicate;
import us.sharknet.dota.model.Item;

/**
 * A predicate that returns true if the Item improves a hero's agility score.
 */
public class AgilityItemPredicate implements Predicate{

    @Override
    public boolean evaluate(Object o) {
        if( !(o instanceof Item)) {
            return false;
        }

        //This checks if the item has the property bonusAgility ("bonus_agility" in the Item file)
        //It also check for items that provide a general stats bonus ("bonus_all_stats" or "bonus_stats" as Valve is not consistent)
        //This uses the JavaBean reflection API to test for certain properties.
        if(     PropertyUtils.isReadable(o,"bonusAgility") ||
                PropertyUtils.isReadable(o,"bonusStats") ||
                PropertyUtils.isReadable(o,"bonusAllStats")
                ) {
            return true;
        }

        return false;
    }

}
