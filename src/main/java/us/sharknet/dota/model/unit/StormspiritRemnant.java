package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class StormspiritRemnant extends NpcUnit {

    private static StormspiritRemnant instance;

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
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final String key;
    private final int level;
    private final String model;
    private final int modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final int projectileSpeed;
    private final int soundSet;
    private final int statusHealth;
    private final double statusHealthRegen;
    private final String teamName;
    private final String unitRelationshipClass;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String localizedName;

    private StormspiritRemnant() {
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
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_BASIC";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_SOFT";
        key = "npc_dota_stormspirit_remnant";
        level = 1;
        model = "models/development/invisiblebox.vmdl";
        modelScale = 1;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_FLY";
        movementSpeed = 0;
        projectileSpeed = 0;
        soundSet = 0;
        statusHealth = 100;
        statusHealthRegen = 0;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 600;
        visionNighttimeRange = 600;
        localizedName = "Storm Spirit Remnant";
    }

    public static StormspiritRemnant instance() {
        if( instance == null ){
            instance = new StormspiritRemnant();
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

    public String getCombatClassAttack() {
        return combatClassAttack;
    }

    public String getCombatClassDefend() {
        return combatClassDefend;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof StormspiritRemnant))
            return false;
        if (object == this)
            return true;
        StormspiritRemnant otherObject = (StormspiritRemnant) object;
        return otherObject.getKey().equals(getKey());
    }

}
