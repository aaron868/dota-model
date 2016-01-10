package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NyxAssassinSpikedCarapace extends Ability {

    private static NyxAssassinSpikedCarapace instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bonus_armor;
    private final int bonus_damage;
    private final int bonus_intellect;
    private final int burrow_aoe;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double reflect_duration;
    private final double[] stun_duration;

    private NyxAssassinSpikedCarapace() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCooldown = new double[]{22,18,14,10};
        abilityManaCost = new int[]{40,40,40,40};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        iD = 5464;
        key = "nyx_assassin_spiked_carapace";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_armor = 0;
        bonus_damage = 0;
        bonus_intellect = 0;
        burrow_aoe = 300;
        localizedName = "Spiked Carapace";
        ownerKey = "npc_dota_hero_nyx_assassin";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        reflect_duration = 2.25;
        stun_duration = new double[]{0.6,1.2,1.8,2.4};
    }

    public static NyxAssassinSpikedCarapace instance() {
        if( instance == null ){
            instance = new NyxAssassinSpikedCarapace();
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

    public int getBonusArmor() {
        return bonus_armor;
    }

    public int getBonusDamage() {
        return bonus_damage;
    }

    public int getBonusIntellect() {
        return bonus_intellect;
    }

    public int getBurrowAoe() {
        return burrow_aoe;
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

    public double getReflectDuration() {
        return reflect_duration;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NyxAssassinSpikedCarapace))
            return false;
        if (object == this)
            return true;
        NyxAssassinSpikedCarapace otherObject = (NyxAssassinSpikedCarapace) object;
        return otherObject.getKey().equals(getKey());
    }

}
