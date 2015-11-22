package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BountyHunterWindWalk extends Ability {

    private static BountyHunterWindWalk instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage;
    private final double[] duration;
    private final double[] fade_time;
    private final String localizedName;
    private final String owningHeroShortKey;

    private BountyHunterWindWalk() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCooldown = new double[]{15.0,15.0,15.0,15.0};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5287;
        key = "bounty_hunter_wind_walk";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_damage = new int[]{30,60,90,120};
        duration = new double[]{20.0,25.0,30.0,35.0};
        fade_time = new double[]{1.0,0.75,0.5,0.25};
        localizedName = "Wind Walk";
        owningHeroShortKey = "bounty_hunter";
    }

    public static BountyHunterWindWalk instance() {
        if( instance == null ){
            instance = new BountyHunterWindWalk();
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

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public double[] getDuration() {
        return duration;
    }

    public double[] getFadeTime() {
        return fade_time;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BountyHunterWindWalk))
            return false;
        if (object == this)
            return true;
        BountyHunterWindWalk otherObject = (BountyHunterWindWalk) object;
        return otherObject.getKey().equals(getKey());
    }

}
