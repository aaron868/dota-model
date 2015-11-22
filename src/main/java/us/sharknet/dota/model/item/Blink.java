package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class Blink extends Item {

    private static Blink instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String[] itemDeclarations;
    private final String itemQuality;
    private final String itemShopTags;
    private final String key;
    private final int sideShop;
    private final int blink_damage_cooldown;
    private final int blink_range;
    private final int blink_range_clamp;
    private final String localizedName;

    private Blink() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_DIRECTIONAL","DOTA_ABILITY_BEHAVIOR_ROOT_DISABLES"};
        abilityCastPoint = 0;
        abilityCastRange = 0;
        abilityCooldown = 12;
        abilityManaCost = 0;
        iD = 1;
        itemAliases = "blink dagger";
        itemCost = 2250;
        itemDeclarations = new String[]{"DECLARE_PURCHASES_TO_TEAMMATES","DECLARE_PURCHASES_IN_SPEECH","DECLARE_PURCHASES_TO_SPECTATORS"};
        itemQuality = "component";
        itemShopTags = "teleport";
        key = "item_blink";
        sideShop = 1;
        blink_damage_cooldown = 3;
        blink_range = 1200;
        blink_range_clamp = 960;
        localizedName = "Blink Dagger";
    }

    public static Blink instance() {
        if( instance == null ){
            instance = new Blink();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getItemAliases() {
        return itemAliases;
    }

    public int getItemCost() {
        return itemCost;
    }

    public String[] getItemDeclarations() {
        return itemDeclarations;
    }

    public String getItemQuality() {
        return itemQuality;
    }

    public String getItemShopTags() {
        return itemShopTags;
    }

    public String getKey() {
        return key;
    }

    public int getSideShop() {
        return sideShop;
    }

    public int getBlinkDamageCooldown() {
        return blink_damage_cooldown;
    }

    public int getBlinkRange() {
        return blink_range;
    }

    public int getBlinkRangeClamp() {
        return blink_range_clamp;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Blink))
            return false;
        if (object == this)
            return true;
        Blink otherObject = (Blink) object;
        return otherObject.getKey().equals(getKey());
    }

}
