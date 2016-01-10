package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KeeperOfTheLightManaLeak extends Ability {

    private static KeeperOfTheLightManaLeak instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] cast_range_tooltip;
    private final double[] duration;
    private final String localizedName;
    private final int mana_leak_pct;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] stun_duration;

    private KeeperOfTheLightManaLeak() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{550,700,850,1000};
        abilityCooldown = new double[]{16,14,12,10};
        abilityManaCost = new int[]{75,75,75,75};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5472;
        key = "keeper_of_the_light_mana_leak";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        cast_range_tooltip = new int[]{550,700,850,1000};
        duration = new double[]{5.0,6.0,7.0,8.0};
        localizedName = "Mana Leak";
        mana_leak_pct = 5;
        ownerKey = "npc_dota_hero_keeper_of_the_light";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        stun_duration = new double[]{1.5,2.0,2.5,3.0};
    }

    public static KeeperOfTheLightManaLeak instance() {
        if( instance == null ){
            instance = new KeeperOfTheLightManaLeak();
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

    public int[] getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getManaLeakPct() {
        return mana_leak_pct;
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

    public double[] getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof KeeperOfTheLightManaLeak))
            return false;
        if (object == this)
            return true;
        KeeperOfTheLightManaLeak otherObject = (KeeperOfTheLightManaLeak) object;
        return otherObject.getKey().equals(getKey());
    }

}
