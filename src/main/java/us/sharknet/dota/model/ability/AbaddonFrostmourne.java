package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AbaddonFrostmourne extends Ability {

    private static AbaddonFrostmourne instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] attack_slow_tooltip;
    private final int[] attack_speed;
    private final double buff_duration;
    private final double debuff_duration;
    private final String localizedName;
    private final int move_speed_pct;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] slow_pct;

    private AbaddonFrostmourne() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5587;
        key = "abaddon_frostmourne";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        attack_slow_tooltip = new int[]{5,10,15,20};
        attack_speed = new int[]{10,20,30,40};
        buff_duration = 4.5;
        debuff_duration = 2.5;
        localizedName = "Curse of Avernus";
        move_speed_pct = 15;
        ownerKey = "npc_dota_hero_abaddon";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        slow_pct = new int[]{5,10,15,20};
    }

    public static AbaddonFrostmourne instance() {
        if( instance == null ){
            instance = new AbaddonFrostmourne();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public int[] getAttackSlowTooltip() {
        return attack_slow_tooltip;
    }

    public int[] getAttackSpeed() {
        return attack_speed;
    }

    public double getBuffDuration() {
        return buff_duration;
    }

    public double getDebuffDuration() {
        return debuff_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMoveSpeedPct() {
        return move_speed_pct;
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

    public int[] getSlowPct() {
        return slow_pct;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AbaddonFrostmourne))
            return false;
        if (object == this)
            return true;
        AbaddonFrostmourne otherObject = (AbaddonFrostmourne) object;
        return otherObject.getKey().equals(getKey());
    }

}
