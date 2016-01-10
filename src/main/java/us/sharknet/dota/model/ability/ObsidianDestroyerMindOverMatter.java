package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ObsidianDestroyerMindOverMatter extends Ability {

    private static ObsidianDestroyerMindOverMatter instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int area_of_effect;
    private final int[] base_damage;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int slow_duration;
    private final double slow_per_int;
    private final int trigger_delay;

    private ObsidianDestroyerMindOverMatter() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{.2,.2,.2,.2};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{16,14,12,10};
        abilityManaCost = new int[]{80,100,120,140};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGIC";
        iD = 5684;
        key = "obsidian_destroyer_mind_over_matter";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        area_of_effect = 350;
        base_damage = new int[]{100,175,250,325};
        localizedName = "Mind Over Matter";
        ownerKey = "npc_dota_hero_obsidian_destroyer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        slow_duration = 4;
        slow_per_int = .5;
        trigger_delay = 2;
    }

    public static ObsidianDestroyerMindOverMatter instance() {
        if( instance == null ){
            instance = new ObsidianDestroyerMindOverMatter();
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

    public int getAreaOfEffect() {
        return area_of_effect;
    }

    public int[] getBaseDamage() {
        return base_damage;
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

    public int getSlowDuration() {
        return slow_duration;
    }

    public double getSlowPerInt() {
        return slow_per_int;
    }

    public int getTriggerDelay() {
        return trigger_delay;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ObsidianDestroyerMindOverMatter))
            return false;
        if (object == this)
            return true;
        ObsidianDestroyerMindOverMatter otherObject = (ObsidianDestroyerMindOverMatter) object;
        return otherObject.getKey().equals(getKey());
    }

}
