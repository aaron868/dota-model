package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AncientGolemRockslide extends Ability {

    private static AncientGolemRockslide instance;

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
    private final double stun_duration;

    private AncientGolemRockslide() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = .5;
        abilityCastRange = 700;
        abilityCooldown = 16;
        abilityDamage = 200;
        abilityManaCost = 100;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5686;
        key = "ancient_golem_rockslide";
        maxLevel = 1;
        distance = 980;
        localizedName = " Rockslide";
        owningHeroShortKey = "ancient_golem";
        radius_end = 200;
        radius_start = 180;
        speed = 1050;
        stun_duration = 1.5;
    }

    public static AncientGolemRockslide instance() {
        if( instance == null ){
            instance = new AncientGolemRockslide();
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

    public double getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AncientGolemRockslide))
            return false;
        if (object == this)
            return true;
        AncientGolemRockslide otherObject = (AncientGolemRockslide) object;
        return otherObject.getKey().equals(getKey());
    }

}
