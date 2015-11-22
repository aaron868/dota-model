package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SatyrHellcallerShockwave extends Ability {

    private static SatyrHellcallerShockwave instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityDamage;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final int distance;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius_end;
    private final int radius_start;
    private final int speed;

    private SatyrHellcallerShockwave() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = .5;
        abilityCastRange = 700;
        abilityCooldown = 8;
        abilityDamage = 125;
        abilityManaCost = 100;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5316;
        key = "satyr_hellcaller_shockwave";
        maxLevel = 1;
        distance = 980;
        localizedName = "Shockwave";
        owningHeroShortKey = "satyr_hellcaller";
        radius_end = 200;
        radius_start = 180;
        speed = 1050;
    }

    public static SatyrHellcallerShockwave instance() {
        if( instance == null ){
            instance = new SatyrHellcallerShockwave();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
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

    public int getAbilityDamage() {
        return abilityDamage;
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

    public int getDistance() {
        return distance;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadiusEnd() {
        return radius_end;
    }

    public int getRadiusStart() {
        return radius_start;
    }

    public int getSpeed() {
        return speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SatyrHellcallerShockwave))
            return false;
        if (object == this)
            return true;
        SatyrHellcallerShockwave otherObject = (SatyrHellcallerShockwave) object;
        return otherObject.getKey().equals(getKey());
    }

}
