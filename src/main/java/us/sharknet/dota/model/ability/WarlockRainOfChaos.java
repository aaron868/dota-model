package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WarlockRainOfChaos extends Ability {

    private static WarlockRainOfChaos instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int aoe;
    private final int bounty_reduction_scepter;
    private final int[] golem_armor_tooltip;
    private final int[] golem_dmg_tooltip;
    private final int[] golem_dmg_tooltip_scepter;
    private final double[] golem_duration;
    private final int[] golem_hp_tooltip;
    private final int[] golem_hp_tooltip_scepter;
    private final int[] golem_regen_tooltip;
    private final int hp_dmg_reduction_scepter;
    private final String localizedName;
    private final int number_of_golems_scepter;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int stun_duration;

    private WarlockRainOfChaos() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0.5,0.5,0.5};
        abilityCastRange = new int[]{1200,1200,1200,1200};
        abilityCooldown = new double[]{165,165,165};
        abilityManaCost = new int[]{200,300,400};
        abilityModifierSupportValue = .5;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5165;
        key = "warlock_rain_of_chaos";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        aoe = 600;
        bounty_reduction_scepter = 50;
        golem_armor_tooltip = new int[]{6,9,12};
        golem_dmg_tooltip = new int[]{75,100,125};
        golem_dmg_tooltip_scepter = new int[]{56,75,94};
        golem_duration = new double[]{60.0,60.0,60.0};
        golem_hp_tooltip = new int[]{900,1200,1500};
        golem_hp_tooltip_scepter = new int[]{675,900,1125};
        golem_regen_tooltip = new int[]{25,50,75};
        hp_dmg_reduction_scepter = 25;
        localizedName = "Rain Of Chaos";
        number_of_golems_scepter = 2;
        ownerKey = "npc_dota_hero_warlock";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        stun_duration = 1;
    }

    public static WarlockRainOfChaos instance() {
        if( instance == null ){
            instance = new WarlockRainOfChaos();
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

    public String getAbilityType() {
        return abilityType;
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

    public int getAoe() {
        return aoe;
    }

    public int getBountyReductionScepter() {
        return bounty_reduction_scepter;
    }

    public int[] getGolemArmorTooltip() {
        return golem_armor_tooltip;
    }

    public int[] getGolemDmgTooltip() {
        return golem_dmg_tooltip;
    }

    public int[] getGolemDmgTooltipScepter() {
        return golem_dmg_tooltip_scepter;
    }

    public double[] getGolemDuration() {
        return golem_duration;
    }

    public int[] getGolemHpTooltip() {
        return golem_hp_tooltip;
    }

    public int[] getGolemHpTooltipScepter() {
        return golem_hp_tooltip_scepter;
    }

    public int[] getGolemRegenTooltip() {
        return golem_regen_tooltip;
    }

    public int getHpDmgReductionScepter() {
        return hp_dmg_reduction_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getNumberOfGolemsScepter() {
        return number_of_golems_scepter;
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

    public int getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WarlockRainOfChaos))
            return false;
        if (object == this)
            return true;
        WarlockRainOfChaos otherObject = (WarlockRainOfChaos) object;
        return otherObject.getKey().equals(getKey());
    }

}
