package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class FurionSprout extends Ability {

    private static FurionSprout instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int[] abilityCastRange;
    private final int[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final int[] cast_range_tooltip;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int vision_range;

    private FurionSprout() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = .35;
        abilityCastRange = new int[]{625,700,775,850};
        abilityCooldown = new int[]{11,10,9,8};
        abilityManaCost = new int[]{70,90,110,130};
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_NOT_ANCIENTS";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_BOTH";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5245;
        key = "furion_sprout";
        cast_range_tooltip = new int[]{625,700,775,850};
        duration = new double[]{3.0,4.0,5.0,6.0};
        localizedName = "Sprout";
        owningHeroShortKey = "furion";
        vision_range = 1;
    }

    public static FurionSprout instance() {
        if( instance == null ){
            instance = new FurionSprout();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int[] getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getVisionRange() {
        return vision_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof FurionSprout))
            return false;
        if (object == this)
            return true;
        FurionSprout otherObject = (FurionSprout) object;
        return otherObject.getKey().equals(getKey());
    }

}
