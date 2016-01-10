package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TinyToss extends Ability {

    private static TinyToss instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage_pct;
    private final double duration;
    private final int grab_radius;
    private final int[] grow_bonus_damage_pct;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final int tooltip_range;
    private final int[] toss_damage;

    private TinyToss() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_RUNE_TARGET"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = new int[]{1300,1300,1300,1300};
        abilityCooldown = new double[]{9,9,9,9};
        abilityManaCost = new int[]{120,120,120,120};
        abilityModifierSupportValue = .25;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_CUSTOM"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_CUSTOM"};
        iD = 5107;
        key = "tiny_toss";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_damage_pct = new int[]{20,20,20,20};
        duration = 1.3;
        grab_radius = 275;
        grow_bonus_damage_pct = new int[]{35,50,65,80};
        localizedName = "Toss";
        ownerKey = "npc_dota_hero_tiny";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{275,275,275,275};
        tooltip_range = 1300;
        toss_damage = new int[]{75,150,225,300};
    }

    public static TinyToss instance() {
        if( instance == null ){
            instance = new TinyToss();
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public int[] getBonusDamagePct() {
        return bonus_damage_pct;
    }

    public double getDuration() {
        return duration;
    }

    public int getGrabRadius() {
        return grab_radius;
    }

    public int[] getGrowBonusDamagePct() {
        return grow_bonus_damage_pct;
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

    public int[] getRadius() {
        return radius;
    }

    public int getTooltipRange() {
        return tooltip_range;
    }

    public int[] getTossDamage() {
        return toss_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TinyToss))
            return false;
        if (object == this)
            return true;
        TinyToss otherObject = (TinyToss) object;
        return otherObject.getKey().equals(getKey());
    }

}
