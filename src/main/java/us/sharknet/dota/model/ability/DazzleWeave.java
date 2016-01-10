package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DazzleWeave extends Ability {

    private static DazzleWeave instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] armor_per_second;
    private final double[] armor_per_second_scepter;
    private final int duration;
    private final int duration_scepter;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final int[] radius_scepter;
    private final int vision;

    private DazzleWeave() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = new int[]{2000,2000,2000,2000};
        abilityCooldown = new double[]{40,40,40};
        abilityManaCost = new int[]{100,100,100};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5236;
        key = "dazzle_weave";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        armor_per_second = new double[]{0.75,1.0,1.25};
        armor_per_second_scepter = new double[]{1.25,1.5,1.75};
        duration = 24;
        duration_scepter = 24;
        localizedName = "Weave";
        ownerKey = "npc_dota_hero_dazzle";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{575,575,575};
        radius_scepter = new int[]{775,775,775};
        vision = 800;
    }

    public static DazzleWeave instance() {
        if( instance == null ){
            instance = new DazzleWeave();
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

    public String getAbilityType() {
        return abilityType;
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

    public double[] getArmorPerSecond() {
        return armor_per_second;
    }

    public double[] getArmorPerSecondScepter() {
        return armor_per_second_scepter;
    }

    public int getDuration() {
        return duration;
    }

    public int getDurationScepter() {
        return duration_scepter;
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

    public int[] getRadius() {
        return radius;
    }

    public int[] getRadiusScepter() {
        return radius_scepter;
    }

    public int getVision() {
        return vision;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DazzleWeave))
            return false;
        if (object == this)
            return true;
        DazzleWeave otherObject = (DazzleWeave) object;
        return otherObject.getKey().equals(getKey());
    }

}
