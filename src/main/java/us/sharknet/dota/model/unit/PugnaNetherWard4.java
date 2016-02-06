package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class PugnaNetherWard4 extends NpcUnit {

    private static PugnaNetherWard4 instance;

    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final int attackRange;
    private final double attackRate;
    private final String baseClass;
    private final String boundsHullName;
    private final int bountyGoldMax;
    private final int bountyGoldMin;
    private final int bountyXP;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int healthBarOffset;
    private final String key;
    private final int level;
    private final int modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final int projectileSpeed;
    private final String soundSet;
    private final int statusHealth;
    private final double statusHealthRegen;
    private final String teamName;
    private final String unitRelationshipClass;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String localizedName;
    private final int wearable;

    private PugnaNetherWard4() {
        armorPhysical = 0;
        attackAcquisitionRange = 0;
        attackAnimationPoint = 0;
        attackCapabilities = "DOTA_UNIT_CAP_NO_ATTACK";
        attackDamageMax = 0;
        attackDamageMin = 0;
        attackRange = 0;
        attackRate = 1;
        baseClass = "npc_dota_base_additive";
        boundsHullName = "DOTA_HULL_SIZE_SMALL";
        bountyGoldMax = 80;
        bountyGoldMin = 80;
        bountyXP = 0;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_BASIC";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRONG";
        healthBarOffset = 145;
        key = "npc_dota_pugna_nether_ward_4";
        level = 0;
        modelScale = 1;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_NONE";
        movementSpeed = 0;
        projectileSpeed = 0;
        soundSet = "Pugna_NetherWard";
        statusHealth = 16;
        statusHealthRegen = 0;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_WARD";
        visionDaytimeRange = 600;
        visionNighttimeRange = 600;
        localizedName = "Nether Ward Level 4";
        wearable = 8627;
    }

    public static PugnaNetherWard4 instance() {
        if( instance == null ){
            instance = new PugnaNetherWard4();
        }
        return instance;
    }

    public int getArmorPhysical() {
        return armorPhysical;
    }

    public int getAttackAcquisitionRange() {
        return attackAcquisitionRange;
    }

    public double getAttackAnimationPoint() {
        return attackAnimationPoint;
    }

    public String getAttackCapabilities() {
        return attackCapabilities;
    }

    public int getAttackDamageMax() {
        return attackDamageMax;
    }

    public int getAttackDamageMin() {
        return attackDamageMin;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public double getAttackRate() {
        return attackRate;
    }

    public String getBaseClass() {
        return baseClass;
    }

    public String getBoundsHullName() {
        return boundsHullName;
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

    public String getKey() {
        return key;
    }

    public int getLevel() {
        return level;
    }

    public int getModelScale() {
        return modelScale;
    }

    public String getMovementCapabilities() {
        return movementCapabilities;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    public String getSoundSet() {
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

    public String getUnitRelationshipClass() {
        return unitRelationshipClass;
    }

    public int getVisionDaytimeRange() {
        return visionDaytimeRange;
    }

    public int getVisionNighttimeRange() {
        return visionNighttimeRange;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getWearable() {
        return wearable;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PugnaNetherWard4))
            return false;
        if (object == this)
            return true;
        PugnaNetherWard4 otherObject = (PugnaNetherWard4) object;
        return otherObject.getKey().equals(getKey());
    }

}
