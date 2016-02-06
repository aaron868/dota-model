package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NyxAssassinVendetta extends Ability {

    private static NyxAssassinVendetta instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage;
    private final double[] cooldown_scepter;
    private final double[] duration;
    private final int fade_time;
    private final int health_regen_rate_scepter;
    private final String localizedName;
    private final int mana_regen_rate_scepter;
    private final int[] movement_speed;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private NyxAssassinVendetta() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCooldown = new double[]{70.0,60.0,50.0};
        abilityManaCost = new int[]{160,210,260};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5465;
        key = "nyx_assassin_vendetta";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_damage = new int[]{250,400,550};
        cooldown_scepter = new double[]{70.0,60.0,50.0};
        duration = new double[]{40.0,50.0,60.0};
        fade_time = 0;
        health_regen_rate_scepter = 3;
        localizedName = "Vendetta";
        mana_regen_rate_scepter = 3;
        movement_speed = new int[]{16,18,20};
        ownerKey = "npc_dota_hero_nyx_assassin";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static NyxAssassinVendetta instance() {
        if( instance == null ){
            instance = new NyxAssassinVendetta();
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

    public double[] getCooldownScepter() {
        return cooldown_scepter;
    }

    public double[] getDuration() {
        return duration;
    }

    public int getFadeTime() {
        return fade_time;
    }

    public int getHealthRegenRateScepter() {
        return health_regen_rate_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getManaRegenRateScepter() {
        return mana_regen_rate_scepter;
    }

    public int[] getMovementSpeed() {
        return movement_speed;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NyxAssassinVendetta))
            return false;
        if (object == this)
            return true;
        NyxAssassinVendetta otherObject = (NyxAssassinVendetta) object;
        return otherObject.getKey().equals(getKey());
    }

}
