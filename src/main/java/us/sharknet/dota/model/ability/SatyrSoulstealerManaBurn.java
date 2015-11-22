package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SatyrSoulstealerManaBurn extends Ability {

    private static SatyrSoulstealerManaBurn instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final double modelscale;
    private final int burn_amount;
    private final String localizedName;
    private final String owningHeroShortKey;

    private SatyrSoulstealerManaBurn() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = .5;
        abilityCastRange = 600;
        abilityCooldown = 18;
        abilityManaCost = 50;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5315;
        key = "satyr_soulstealer_mana_burn";
        maxLevel = 1;
        modelscale = .85;
        burn_amount = 100;
        localizedName = "Mana Burn";
        owningHeroShortKey = "satyr_soulstealer";
    }

    public static SatyrSoulstealerManaBurn instance() {
        if( instance == null ){
            instance = new SatyrSoulstealerManaBurn();
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

    public int getAbilityManaCost() {
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public double getModelscale() {
        return modelscale;
    }

    public int getBurnAmount() {
        return burn_amount;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SatyrSoulstealerManaBurn))
            return false;
        if (object == this)
            return true;
        SatyrSoulstealerManaBurn otherObject = (SatyrSoulstealerManaBurn) object;
        return otherObject.getKey().equals(getKey());
    }

}
