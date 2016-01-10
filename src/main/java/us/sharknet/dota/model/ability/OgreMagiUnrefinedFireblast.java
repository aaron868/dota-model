package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OgreMagiUnrefinedFireblast extends Ability {

    private static OgreMagiUnrefinedFireblast instance;

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
    private final boolean isGrantedByScepter;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final double multicast_delay;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double scepter_mana;
    private final double stun_duration;

    private OgreMagiUnrefinedFireblast() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.45,.45,.45,.45};
        abilityCastRange = new int[]{475,475,475,475};
        abilityCooldown = new double[]{6,6,6,6};
        abilityDamage = new int[]{275,275,275,275};
        abilityManaCost = new int[]{400,400,400,400};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5466;
        isGrantedByScepter = true;
        key = "ogre_magi_unrefined_fireblast";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Unrefined Fireblast";
        multicast_delay = .4;
        ownerKey = "npc_dota_hero_ogre_magi";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        scepter_mana = .6;
        stun_duration = 1.5;
    }

    public static OgreMagiUnrefinedFireblast instance() {
        if( instance == null ){
            instance = new OgreMagiUnrefinedFireblast();
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

    public boolean getIsGrantedByScepter() {
        return isGrantedByScepter;
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

    public double getMulticastDelay() {
        return multicast_delay;
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

    public double getScepterMana() {
        return scepter_mana;
    }

    public double getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OgreMagiUnrefinedFireblast))
            return false;
        if (object == this)
            return true;
        OgreMagiUnrefinedFireblast otherObject = (OgreMagiUnrefinedFireblast) object;
        return otherObject.getKey().equals(getKey());
    }

}
