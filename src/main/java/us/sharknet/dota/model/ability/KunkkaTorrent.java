package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KunkkaTorrent extends Ability {

    private static KunkkaTorrent instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] delay;
    private final String localizedName;
    private final int movespeed_bonus;
    private final String owningHeroShortKey;
    private final int radius;
    private final double[] slow_duration;
    private final double[] stun_duration;

    private KunkkaTorrent() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = .4;
        abilityCastRange = 1500;
        abilityCooldown = 10;
        abilityDamage = new int[]{120,180,240,300};
        abilityManaCost = new int[]{120,120,120,120};
        abilityModifierSupportValue = .5;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5031;
        key = "kunkka_torrent";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        delay = new double[]{1.6,1.6,1.6,1.6};
        localizedName = "Torrent";
        movespeed_bonus = -35;
        owningHeroShortKey = "kunkka";
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

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
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

    public double[] getDelay() {
        return delay;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeedBonus() {
        return movespeed_bonus;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
