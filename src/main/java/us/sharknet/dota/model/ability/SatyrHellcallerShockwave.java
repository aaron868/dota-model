package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SatyrHellcallerShockwave extends Ability {

    private static SatyrHellcallerShockwave instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int distance;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius_end;
    private final int radius_start;
    private final int speed;

    private SatyrHellcallerShockwave() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{.5,.5,.5,.5};
        abilityCastRange = new int[]{700,700,700,700};
        abilityCooldown = new double[]{8,8,8,8};
        abilityDamage = new int[]{160,160,160,160};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5316;
        key = "satyr_hellcaller_shockwave";
        distance = 1380;
        localizedName = "Shockwave";
        ownerKey = "npc_dota_neutral_satyr_hellcaller";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
        radius_end = 200;
        radius_start = 180;
        speed = 900;
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

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
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

    public int getDistance() {
        return distance;
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
