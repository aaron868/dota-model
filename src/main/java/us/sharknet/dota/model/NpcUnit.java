package us.sharknet.dota.model;

public abstract class NpcUnit {


    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final String attackDamageType;
    private final double attackDesire;
    private final int attackRange;
    private final int attackRangeBuffer;
    private final double attackRate;
    private final String attributePrimary;
    private final int autoAttacksByDefault;
    private final String baseClass;
    private final String boundsHullName;
    private final int canBeDominated;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int followRange;
    private final int healthBarOffset;
    private final int level;
    private final String model;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int projectileSpeed;
    private final int ringRadius;
    private final int statusHealth;
    private final int statusStartingMana;
    private final String teamName;
    private final String unitRelationshipClass;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final int wakesNeutrals;

    public NpcUnit(){
        attackAcquisitionRange = 8;
        attackAnimationPoint = .75;
        attackCapabilities = "DOTA_UNIT_CAP_NO_ATTACK";
        attackDamageMax = 1;
        attackDamageMin = 1;
        attackDamageType = "DAMAGE_TYPE_ArmorPhysical";
        attackDesire = 1;
        attackRange = 6;
        attackRangeBuffer = 25;
        attackRate = 1.7;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        autoAttacksByDefault = 1;
        baseClass = "npc_dota_base";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        canBeDominated = 1;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_HERO";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_HERO";
        followRange = 1;
        healthBarOffset = -1;
        level = 1;
        model = "models/development/invisiblebox.vmdl";
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_NONE";
        movementSpeed = 3;
        movementTurnRate = .5;
        projectileSpeed = 9;
        ringRadius = 5;
        statusHealth = 15;
        statusStartingMana = -1;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 575;
        visionNighttimeRange = 575;
        wakesNeutrals = 1;
    }

    public abstract String getLocalizedName();
    public abstract String getKey();

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

    public String getAttackDamageType() {
        return attackDamageType;
    }

    public double getAttackDesire() {
        return attackDesire;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public int getAttackRangeBuffer() {
        return attackRangeBuffer;
    }

    public double getAttackRate() {
        return attackRate;
    }

    public String getAttributePrimary() {
        return attributePrimary;
    }

    public int getAutoAttacksByDefault() {
        return autoAttacksByDefault;
    }

    public String getBaseClass() {
        return baseClass;
    }

    public String getBoundsHullName() {
        return boundsHullName;
    }

    public int getCanBeDominated() {
        return canBeDominated;
    }

    public String getCombatClassAttack() {
        return combatClassAttack;
    }

    public String getCombatClassDefend() {
        return combatClassDefend;
    }

    public int getFollowRange() {
        return followRange;
    }

    public int getHealthBarOffset() {
        return healthBarOffset;
    }

    public int getLevel() {
        return level;
    }

    public String getModel() {
        return model;
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

    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    public int getRingRadius() {
        return ringRadius;
    }

    public int getStatusHealth() {
        return statusHealth;
    }

    public int getStatusStartingMana() {
        return statusStartingMana;
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

    public int getWakesNeutrals() {
        return wakesNeutrals;
    }


    public boolean isBuilding() {
        return getUnitRelationshipClass().equals("DOTA_NPC_UNIT_RELATIONSHIP_TYPE_BUILDING");
    }

    public boolean isNeutralCreep() {
        return getKey().startsWith("npc_dota_neutral");
    }


    @Override
    public int hashCode() {
        return getKey().hashCode();
    }

    @Override
    public String toString() {
        return getLocalizedName();
    }

}
