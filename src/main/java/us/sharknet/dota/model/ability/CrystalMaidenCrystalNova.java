package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CrystalMaidenCrystalNova extends Ability {

    private static CrystalMaidenCrystalNova instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] attackspeed_slow;
    private final double duration;
    private final String localizedName;
    private final int[] movespeed_slow;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final int vision_duration;

    private CrystalMaidenCrystalNova() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{700,700,700,700};
        abilityCooldown = new double[]{12,12,12,12};
        abilityDamage = new int[]{100,150,200,250};
        abilityManaCost = new int[]{100,120,140,160};
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5126;
        key = "crystal_maiden_crystal_nova";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        attackspeed_slow = new int[]{-20,-30,-40,-50};
        duration = 4.5;
        localizedName = "Crystal Nova";
        movespeed_slow = new int[]{-20,-30,-40,-50};
        ownerKey = "npc_dota_hero_crystal_maiden";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 400;
        vision_duration = 6;
    }

    public static CrystalMaidenCrystalNova instance() {
        if( instance == null ){
            instance = new CrystalMaidenCrystalNova();
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

    public int[] getAttackspeedSlow() {
        return attackspeed_slow;
    }

    public double getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovespeedSlow() {
        return movespeed_slow;
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

    public int getVisionDuration() {
        return vision_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof CrystalMaidenCrystalNova))
            return false;
        if (object == this)
            return true;
        CrystalMaidenCrystalNova otherObject = (CrystalMaidenCrystalNova) object;
        return otherObject.getKey().equals(getKey());
    }

}
