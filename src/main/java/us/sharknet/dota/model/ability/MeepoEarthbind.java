package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MeepoEarthbind extends Ability {

    private static MeepoEarthbind instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int speed;
    private final int[] tooltip_range;

    private MeepoEarthbind() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{.3,.3,.3,.3};
        abilityCastRange = new int[]{500,750,1000,1250};
        abilityCooldown = new double[]{20,16,12,8};
        abilityManaCost = new int[]{100,100,100,100};
        iD = 5430;
        key = "meepo_earthbind";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = 2;
        localizedName = "Earthbind";
        ownerKey = "npc_dota_hero_meepo";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 220;
        speed = 857;
        tooltip_range = new int[]{500,750,1000,1250};
    }

    public static MeepoEarthbind instance() {
        if( instance == null ){
            instance = new MeepoEarthbind();
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int getDuration() {
        return duration;
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

    public int getSpeed() {
        return speed;
    }

    public int[] getTooltipRange() {
        return tooltip_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MeepoEarthbind))
            return false;
        if (object == this)
            return true;
        MeepoEarthbind otherObject = (MeepoEarthbind) object;
        return otherObject.getKey().equals(getKey());
    }

}
