package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DragonKnightDragonTail extends Ability {

    private static DragonKnightDragonTail instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int dragon_cast_range;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] stun_duration;

    private DragonKnightDragonTail() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = new int[]{150,150,150,150};
        abilityCooldown = new double[]{12,11,10,9};
        abilityDamage = new int[]{25,50,75,100};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5227;
        key = "dragon_knight_dragon_tail";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        dragon_cast_range = 400;
        localizedName = "Dragon Tail";
        ownerKey = "npc_dota_hero_dragon_knight";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        stun_duration = new double[]{2.5,2.75,3.0,3.25};
    }

    public static DragonKnightDragonTail instance() {
        if( instance == null ){
            instance = new DragonKnightDragonTail();
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

    public int getDragonCastRange() {
        return dragon_cast_range;
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
        if (!(object instanceof DragonKnightDragonTail))
            return false;
        if (object == this)
            return true;
        DragonKnightDragonTail otherObject = (DragonKnightDragonTail) object;
        return otherObject.getKey().equals(getKey());
    }

}
