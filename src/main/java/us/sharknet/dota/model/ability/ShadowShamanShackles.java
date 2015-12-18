package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShadowShamanShackles extends Ability {

    private static ShadowShamanShackles instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityChannelTime;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] channel_time;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final double[] tick_interval;
    private final double[] total_damage;

    private ShadowShamanShackles() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_CHANNELLED"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 400;
        abilityChannelTime = new double[]{2.75,3.5,4.25,5.0};
        abilityCooldown = 10;
        abilityManaCost = new int[]{140,150,160,170};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5080;
        key = "shadow_shaman_shackles";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        channel_time = new double[]{2.75,3.5,4.25,5.0};
        localizedName = "Shackles";
        owningHeroShortKey = "shadow_shaman";
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

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityChannelTime() {
        return abilityChannelTime;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
