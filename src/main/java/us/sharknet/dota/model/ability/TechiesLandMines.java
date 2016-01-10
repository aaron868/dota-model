package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TechiesLandMines extends Ability {

    private static TechiesLandMines instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double activation_time;
    private final int big_radius;
    private final int[] damage;
    private final double explode_delay;
    private final int fade_time;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int small_radius;

    private TechiesLandMines() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = new int[]{100,100,100,100};
        abilityCooldown = new double[]{9,8,7,5};
        abilityManaCost = new int[]{60,75,85,100};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5599;
        key = "techies_land_mines";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        activation_time = .5;
        big_radius = 500;
        damage = new int[]{150,190,225,260};
        explode_delay = .3;
        fade_time = 2;
        localizedName = "Land Mines";
        ownerKey = "npc_dota_hero_techies";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        small_radius = 200;
    }

    public static TechiesLandMines instance() {
        if( instance == null ){
            instance = new TechiesLandMines();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public double getActivationTime() {
        return activation_time;
    }

    public int getBigRadius() {
        return big_radius;
    }

    public int[] getDamage() {
        return damage;
    }

    public double getExplodeDelay() {
        return explode_delay;
    }

    public int getFadeTime() {
        return fade_time;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
    }

    public int getSmallRadius() {
        return small_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TechiesLandMines))
            return false;
        if (object == this)
            return true;
        TechiesLandMines otherObject = (TechiesLandMines) object;
        return otherObject.getKey().equals(getKey());
    }

}
