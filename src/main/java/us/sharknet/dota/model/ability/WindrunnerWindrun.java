package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WindrunnerWindrun extends Ability {

    private static WindrunnerWindrun instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final int[] enemy_movespeed_bonus_pct;
    private final int evasion_pct_tooltip;
    private final String localizedName;
    private final int[] movespeed_bonus_pct;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;

    private WindrunnerWindrun() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCooldown = new double[]{15.0,15.0,15.0,15.0};
        abilityDuration = new double[]{3,4,5,6};
        abilityManaCost = new int[]{100,100,100,100};
        abilityModifierSupportValue = .1;
        iD = 5132;
        key = "windrunner_windrun";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = new double[]{3.0,4.0,5.0,6.0};
        enemy_movespeed_bonus_pct = new int[]{-8,-16,-24,-30};
        evasion_pct_tooltip = 100;
        localizedName = "Windrun";
        movespeed_bonus_pct = new int[]{50,50,50,50};
        ownerKey = "npc_dota_hero_windrunner";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{300,300,300,300};
    }

    public static WindrunnerWindrun instance() {
        if( instance == null ){
            instance = new WindrunnerWindrun();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public double[] getDuration() {
        return duration;
    }

    public int[] getEnemyMovespeedBonusPct() {
        return enemy_movespeed_bonus_pct;
    }

    public int getEvasionPctTooltip() {
        return evasion_pct_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovespeedBonusPct() {
        return movespeed_bonus_pct;
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

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WindrunnerWindrun))
            return false;
        if (object == this)
            return true;
        WindrunnerWindrun otherObject = (WindrunnerWindrun) object;
        return otherObject.getKey().equals(getKey());
    }

}
