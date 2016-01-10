package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShadowShamanShackles extends Ability {

    private static ShadowShamanShackles instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityChannelTime;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] channel_time;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] tick_interval;
    private final double[] total_damage;

    private ShadowShamanShackles() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_CHANNELLED"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{400,400,400,400};
        abilityChannelTime = new double[]{2.75,3.5,4.25,5.0};
        abilityCooldown = new double[]{10,10,10,10};
        abilityManaCost = new int[]{140,150,160,170};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5080;
        key = "shadow_shaman_shackles";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        channel_time = new double[]{2.75,3.5,4.25,5.0};
        localizedName = "Shackles";
        ownerKey = "npc_dota_hero_shadow_shaman";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        tick_interval = new double[]{0.1,0.1,0.1,0.1};
        total_damage = new double[]{120.0,200.0,280.0,360.0};
    }

    public static ShadowShamanShackles instance() {
        if( instance == null ){
            instance = new ShadowShamanShackles();
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

    public double[] getAbilityChannelTime() {
        return abilityChannelTime;
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

    public double[] getChannelTime() {
        return channel_time;
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

    public double[] getTickInterval() {
        return tick_interval;
    }

    public double[] getTotalDamage() {
        return total_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShadowShamanShackles))
            return false;
        if (object == this)
            return true;
        ShadowShamanShackles otherObject = (ShadowShamanShackles) object;
        return otherObject.getKey().equals(getKey());
    }

}
