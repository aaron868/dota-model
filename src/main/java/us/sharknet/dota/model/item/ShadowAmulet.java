package us.sharknet.dota.model.item;

import us.sharknet.dota.model.Item;

public final class ShadowAmulet extends Item {

    private static ShadowAmulet instance;

    private final String[] abilityBehavior;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String itemAliases;
    private final int itemCost;
    private final String key;
    private final int bonus_attack_speed;
    private final double fade_time;
    private final String localizedName;

    private ShadowAmulet() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_MOVEMENT"};
        abilityCastRange = 6;
        abilityCooldown = 1;
        abilityManaCost = 0;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        fightRecapLevel = 1;
        iD = 215;
        itemAliases = "shadow amulet";
        itemCost = 14;
        key = "item_shadow_amulet";
        bonus_attack_speed = 2;
        fade_time = 1.5;
        localizedName = "Shadow Amulet";
    }

    public static ShadowAmulet instance() {
        if( instance == null ){
            instance = new ShadowAmulet();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public String getKey() {
        return key;
    }

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public double getFadeTime() {
        return fade_time;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShadowAmulet))
            return false;
        if (object == this)
            return true;
        ShadowAmulet otherObject = (ShadowAmulet) object;
        return otherObject.getKey().equals(getKey());
    }

}
