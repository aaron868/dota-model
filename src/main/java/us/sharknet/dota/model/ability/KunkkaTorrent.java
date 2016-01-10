package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KunkkaTorrent extends Ability {

    private static KunkkaTorrent instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] delay;
    private final String localizedName;
    private final int movespeed_bonus;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final double[] slow_duration;
    private final double[] stun_duration;

    private KunkkaTorrent() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{.4,.4,.4,.4};
        abilityCastRange = new int[]{1500,1500,1500,1500};
        abilityCooldown = new double[]{10,10,10,10};
        abilityDamage = new int[]{120,180,240,300};
        abilityManaCost = new int[]{120,120,120,120};
        abilityModifierSupportValue = .5;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5031;
        key = "kunkka_torrent";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        delay = new double[]{1.6,1.6,1.6,1.6};
        localizedName = "Torrent";
        movespeed_bonus = -35;
        ownerKey = "npc_dota_hero_kunkka";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 225;
        slow_duration = new double[]{1.0,2.0,3.0,4.0};
        stun_duration = new double[]{1.53,1.53,1.53,1.53};
    }

    public static KunkkaTorrent instance() {
        if( instance == null ){
            instance = new KunkkaTorrent();
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public double[] getDelay() {
        return delay;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeedBonus() {
        return movespeed_bonus;
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

    public double[] getSlowDuration() {
        return slow_duration;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof KunkkaTorrent))
            return false;
        if (object == this)
            return true;
        KunkkaTorrent otherObject = (KunkkaTorrent) object;
        return otherObject.getKey().equals(getKey());
    }

}
