package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DoomBringerScorchedEarth extends Ability {

    private static DoomBringerScorchedEarth instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bonus_movement_speed_pct;
    private final int[] damage_per_second;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;

    private DoomBringerScorchedEarth() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{55,55,55,55};
        abilityManaCost = new int[]{60,65,70,75};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5340;
        key = "doom_bringer_scorched_earth";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_movement_speed_pct = 14;
        damage_per_second = new int[]{10,20,30,40};
        duration = new double[]{10.0,12.0,14.0,16.0};
        localizedName = "Scorched Earth";
        ownerKey = "npc_dota_hero_doom_bringer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{600,600,600,600};
    }

    public static DoomBringerScorchedEarth instance() {
        if( instance == null ){
            instance = new DoomBringerScorchedEarth();
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

    public int getBonusMovementSpeedPct() {
        return bonus_movement_speed_pct;
    }

    public int[] getDamagePerSecond() {
        return damage_per_second;
    }

    public double[] getDuration() {
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

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DoomBringerScorchedEarth))
            return false;
        if (object == this)
            return true;
        DoomBringerScorchedEarth otherObject = (DoomBringerScorchedEarth) object;
        return otherObject.getKey().equals(getKey());
    }

}
