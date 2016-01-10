package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SlarkShadowDance extends Ability {

    private static SlarkShadowDance instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final double[] activation_delay;
    private final int[] bonus_movement_speed;
    private final int[] bonus_regen_pct;
    private final int duration;
    private final double[] fade_time;
    private final String localizedName;
    private final double[] neutral_disable;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int scepter_aoe;
    private final int scepter_cooldown;

    private SlarkShadowDance() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCooldown = new double[]{6,6,6,6};
        abilityManaCost = new int[]{120,120,120};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5497;
        key = "slark_shadow_dance";
        activation_delay = new double[]{0.5,0.5,0.5};
        bonus_movement_speed = new int[]{30,35,40};
        bonus_regen_pct = new int[]{3,5,7};
        duration = 4;
        fade_time = new double[]{0.0,0.0,0.0};
        localizedName = "Shadow Dance";
        neutral_disable = new double[]{2.0,2.0,2.0};
        ownerKey = "npc_dota_hero_slark";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        scepter_aoe = 350;
        scepter_cooldown = 35;
    }

    public static SlarkShadowDance instance() {
        if( instance == null ){
            instance = new SlarkShadowDance();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public double[] getActivationDelay() {
        return activation_delay;
    }

    public int[] getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int[] getBonusRegenPct() {
        return bonus_regen_pct;
    }

    public int getDuration() {
        return duration;
    }

    public double[] getFadeTime() {
        return fade_time;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double[] getNeutralDisable() {
        return neutral_disable;
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

    public int getScepterAoe() {
        return scepter_aoe;
    }

    public int getScepterCooldown() {
        return scepter_cooldown;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SlarkShadowDance))
            return false;
        if (object == this)
            return true;
        SlarkShadowDance otherObject = (SlarkShadowDance) object;
        return otherObject.getKey().equals(getKey());
    }

}
