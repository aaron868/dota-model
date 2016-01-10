package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class EarthshakerFissure extends Ability {

    private static EarthshakerFissure instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int fissure_duration;
    private final int fissure_radius;
    private final int fissure_range;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] stun_duration;

    private EarthshakerFissure() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.69,0.69,0.69,0.69};
        abilityCastRange = new int[]{1400,1400,1400,1400};
        abilityCooldown = new double[]{15.0,15.0,15.0,15.0};
        abilityDamage = new int[]{110,160,210,260};
        abilityDuration = new double[]{1.0,1.25,1.5,1.75};
        abilityManaCost = new int[]{125,140,155,170};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5023;
        key = "earthshaker_fissure";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        fissure_duration = 8;
        fissure_radius = 225;
        fissure_range = 1400;
        localizedName = "Fissure";
        ownerKey = "npc_dota_hero_earthshaker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        stun_duration = new double[]{1.0,1.25,1.5,1.75};
    }

    public static EarthshakerFissure instance() {
        if( instance == null ){
            instance = new EarthshakerFissure();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String[] getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public int getFissureDuration() {
        return fissure_duration;
    }

    public int getFissureRadius() {
        return fissure_radius;
    }

    public int getFissureRange() {
        return fissure_range;
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

    public double[] getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EarthshakerFissure))
            return false;
        if (object == this)
            return true;
        EarthshakerFissure otherObject = (EarthshakerFissure) object;
        return otherObject.getKey().equals(getKey());
    }

}
