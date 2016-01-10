package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TreantOvergrowth extends Ability {

    private static TreantOvergrowth instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final int eyes_radius;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private TreantOvergrowth() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCooldown = new double[]{70,70,70,70};
        abilityManaCost = new int[]{150,175,200};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5437;
        key = "treant_overgrowth";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        duration = new double[]{3.0,3.75,4.5};
        eyes_radius = 800;
        localizedName = "Overgrowth";
        ownerKey = "npc_dota_hero_treant";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 800;
    }

    public static TreantOvergrowth instance() {
        if( instance == null ){
            instance = new TreantOvergrowth();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public double[] getDuration() {
        return duration;
    }

    public int getEyesRadius() {
        return eyes_radius;
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

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TreantOvergrowth))
            return false;
        if (object == this)
            return true;
        TreantOvergrowth otherObject = (TreantOvergrowth) object;
        return otherObject.getKey().equals(getKey());
    }

}
