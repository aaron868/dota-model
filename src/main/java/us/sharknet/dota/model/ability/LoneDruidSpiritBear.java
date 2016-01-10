package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LoneDruidSpiritBear extends Ability {

    private static LoneDruidSpiritBear instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int backlash_damage;
    private final int[] bear_armor;
    private final double[] bear_bat;
    private final int[] bear_hp;
    private final int[] bear_regen_tooltip;
    private final int cooldown_scepter;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private LoneDruidSpiritBear() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCooldown = new double[]{12,12,12,12};
        abilityManaCost = new int[]{75,75,75,75};
        iD = 5412;
        key = "lone_druid_spirit_bear";
        backlash_damage = 1;
        bear_armor = new int[]{3,4,5,6};
        bear_bat = new double[]{1.75,1.65,1.55,1.45};
        bear_hp = new int[]{1400,1800,2300,2700};
        bear_regen_tooltip = new int[]{2,3,4,5};
        cooldown_scepter = 12;
        localizedName = "Spirit Bear";
        ownerKey = "npc_dota_hero_lone_druid";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static LoneDruidSpiritBear instance() {
        if( instance == null ){
            instance = new LoneDruidSpiritBear();
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

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getBacklashDamage() {
        return backlash_damage;
    }

    public int[] getBearArmor() {
        return bear_armor;
    }

    public double[] getBearBat() {
        return bear_bat;
    }

    public int[] getBearHp() {
        return bear_hp;
    }

    public int[] getBearRegenTooltip() {
        return bear_regen_tooltip;
    }

    public int getCooldownScepter() {
        return cooldown_scepter;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LoneDruidSpiritBear))
            return false;
        if (object == this)
            return true;
        LoneDruidSpiritBear otherObject = (LoneDruidSpiritBear) object;
        return otherObject.getKey().equals(getKey());
    }

}
