package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OmniknightPurification extends Ability {

    private static OmniknightPurification instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] heal;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;

    private OmniknightPurification() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = .25;
        abilityCastRange = 7;
        abilityCooldown = 1;
        abilityManaCost = new int[]{100,120,140,160};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_MAGIC_IMMUNE_ALLIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5263;
        key = "omniknight_purification";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_NO";
        heal = new int[]{90,180,270,360};
        localizedName = "Purification";
        owningHeroShortKey = "omniknight";
        radius = 26;
    }

    public static OmniknightPurification instance() {
        if( instance == null ){
            instance = new OmniknightPurification();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
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

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public int[] getHeal() {
        return heal;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OmniknightPurification))
            return false;
        if (object == this)
            return true;
        OmniknightPurification otherObject = (OmniknightPurification) object;
        return otherObject.getKey().equals(getKey());
    }

}
