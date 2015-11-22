package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class BeastmasterHawk2 extends NpcUnit {

    private static BeastmasterHawk2 instance;

    private final int armorPhysical;
    private final String attackCapabilities;
    private final String baseClass;
    private final int bountyGoldMax;
    private final int bountyGoldMin;
    private final int bountyXP;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int healthBarOffset;
    private final int isSummoned;
    private final String key;
    private final int level;
    private final String model;
    private final double modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int soundSet;
    private final int statusHealth;
    private final double statusHealthRegen;
    private final String teamName;
    private final String unitLabel;
    private final String unitRelationshipClass;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final int wakesNeutrals;
    private final String localizedName;

    private BeastmasterHawk2() {
        armorPhysical = 5;
        attackCapabilities = "DOTA_UNIT_CAP_NO_ATTACK";
        baseClass = "npc_dota_beastmaster_hawk";
        bountyGoldMax = 40;
        bountyGoldMin = 40;
        bountyXP = 77;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_BASIC";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_WEAK";
        healthBarOffset = 165;
        isSummoned = 1;
        key = "npc_dota_beastmaster_hawk_2";
        level = 6;
        model = "models/heroes/beastmaster/beastmaster_bird.vmdl";
        modelScale = 1.2;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_FLY";
        movementSpeed = 275;
        movementTurnRate = .6;
        soundSet = 0;
        statusHealth = 60;
        statusHealthRegen = 1.5;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitLabel = "hawk";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 1000;
        visionNighttimeRange = 800;
        wakesNeutrals = 0;
        localizedName = "Hawk Level 2";
    }

    public static BeastmasterHawk2 instance() {
        if( instance == null ){
            instance = new BeastmasterHawk2();
        }
        return instance;
    }

    public int getArmorPhysical() {
        return armorPhysical;
    }

    public String getAttackCapabilities() {
        return attackCapabilities;
    }

    public String getBaseClass() {
        return baseClass;
    }

    public int getBountyGoldMax() {
        return bountyGoldMax;
    }

    public int getBountyGoldMin() {
        return bountyGoldMin;
    }

    public int getBountyXP() {
        return bountyXP;
    }

    public String getCombatClassAttack() {
        return combatClassAttack;
    }

    public String getCombatClassDefend() {
        return combatClassDefend;
    }

    public int getHealthBarOffset() {
        return healthBarOffset;
    }

    public int getIsSummoned() {
        return isSummoned;
    }

    public String getKey() {
        return key;
    }

    public int getLevel() {
        return level;
    }

    public String getModel() {
        return model;
    }

    public double getModelScale() {
        return modelScale;
    }

    public String getMovementCapabilities() {
        return movementCapabilities;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public double getMovementTurnRate() {
        return movementTurnRate;
    }

    public int getSoundSet() {
        return soundSet;
    }

    public int getStatusHealth() {
        return statusHealth;
    }

    public double getStatusHealthRegen() {
        return statusHealthRegen;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getUnitLabel() {
        return unitLabel;
    }

    public String getUnitRelationshipClass() {
        return unitRelationshipClass;
    }

    public int getVisionDaytimeRange() {
        return visionDaytimeRange;
    }

    public int getVisionNighttimeRange() {
        return visionNighttimeRange;
    }

    public int getWakesNeutrals() {
        return wakesNeutrals;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BeastmasterHawk2))
            return false;
        if (object == this)
            return true;
        BeastmasterHawk2 otherObject = (BeastmasterHawk2) object;
        return otherObject.getKey().equals(getKey());
    }

}
