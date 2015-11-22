package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShredderWhirlingDeath extends Ability {

    private static ShredderWhirlingDeath instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int stat_loss_pct;
    private final int[] whirling_damage;
    private final int whirling_radius;
    private final double whirling_tick;

    private ShredderWhirlingDeath() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 300;
        abilityCooldown = 6;
        abilityManaCost = new int[]{70,80,90,100};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5524;
        key = "shredder_whirling_death";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = 7;
        localizedName = "Whirling Death";
        owningHeroShortKey = "shredder";
        stat_loss_pct = 15;
        whirling_damage = new int[]{100,150,200,250};
        whirling_radius = 300;
        whirling_tick = .3;
    }

    public static ShredderWhirlingDeath instance() {
        if( instance == null ){
            instance = new ShredderWhirlingDeath();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getStatLossPct() {
        return stat_loss_pct;
    }

    public int[] getWhirlingDamage() {
        return whirling_damage;
    }

    public int getWhirlingRadius() {
        return whirling_radius;
    }

    public double getWhirlingTick() {
        return whirling_tick;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShredderWhirlingDeath))
            return false;
        if (object == this)
            return true;
        ShredderWhirlingDeath otherObject = (ShredderWhirlingDeath) object;
        return otherObject.getKey().equals(getKey());
    }

}
