package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class VengefulspiritMagicMissile extends Ability {

    private static VengefulspiritMagicMissile instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final int magic_missile_speed;
    private final double[] magic_missile_stun;
    private final String owningHeroShortKey;

    private VengefulspiritMagicMissile() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 500;
        abilityCooldown = new int[]{13,12,11,10};
        abilityDamage = new int[]{100,175,250,325};
        abilityManaCost = new int[]{110,120,130,140};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5122;
        key = "vengefulspirit_magic_missile";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Magic Missile";
        magic_missile_speed = 1250;
        magic_missile_stun = new double[]{1.45,1.55,1.65,1.75};
        owningHeroShortKey = "vengefulspirit";
    }

    public static VengefulspiritMagicMissile instance() {
        if( instance == null ){
            instance = new VengefulspiritMagicMissile();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMagicMissileSpeed() {
        return magic_missile_speed;
    }

    public double[] getMagicMissileStun() {
        return magic_missile_stun;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VengefulspiritMagicMissile))
            return false;
        if (object == this)
            return true;
        VengefulspiritMagicMissile otherObject = (VengefulspiritMagicMissile) object;
        return otherObject.getKey().equals(getKey());
    }

}
