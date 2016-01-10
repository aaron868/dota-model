package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShredderWhirlingDeath extends Ability {

    private static ShredderWhirlingDeath instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int stat_loss_pct;
    private final int[] whirling_damage;
    private final int whirling_radius;
    private final double whirling_tick;

    private ShredderWhirlingDeath() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = new int[]{300,300,300,300};
        abilityCooldown = new double[]{6,6,6,6};
        abilityManaCost = new int[]{70,70,70,70};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5524;
        key = "shredder_whirling_death";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = 11;
        localizedName = "Whirling Death";
        ownerKey = "npc_dota_hero_shredder";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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

    public int[] getAbilityCastRange() {
        return abilityCastRange;
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

    public int getDuration() {
        return duration;
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
