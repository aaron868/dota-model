package us.sharknet.dota.model;

public abstract class Hero {


    private final int abilityLayout;
    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final String attackDamageType;
    private final int attackRange;
    private final double attackRate;
    private final String attributePrimary;
    private final String baseClass;
    private final String boundsHullName;
    private final int bountyXP;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int hasInventory;
    private final int healthBarOffset;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final int level;
    private final int magicalResistance;
    private final String model;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String projectileModel;
    private final int projectileSpeed;
    private final int ringRadius;
    private final int statusHealth;
    private final double statusHealthRegen;
    private final double statusManaRegen;
    private final String teamName;
    private final String unitRelationshipClass;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;

    public Hero(){
        abilityLayout = 4;
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .75;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 1;
        attackDamageMin = 1;
        attackDamageType = "DAMAGE_TYPE_ArmorPhysical";
        attackRange = 600;
        attackRate = 1.7;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        baseClass = "npc_dota_hero";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        bountyXP = 62;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_HERO";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_HERO";
        hasInventory = 1;
        healthBarOffset = -1;
        heroUnlockOrder = 1;
        idleExpression = "scenes/default_idle.vcd";
        level = 1;
        magicalResistance = 25;
        model = "models/error.vmdl";
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 300;
        movementTurnRate = .5;
        projectileModel = "particles/base_attacks/ranged_hero.vpcf";
        projectileSpeed = 900;
        ringRadius = 70;
        statusHealth = 180;
        statusHealthRegen = .25;
        statusManaRegen = .1;
        teamName = "DOTA_TEAM_GOODGUYS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_HERO";
        visionDaytimeRange = 1800;
        visionNighttimeRange = 800;
    }

    public abstract int getHeroID();
    public abstract String getLocalizedName();
    public abstract String getKey();

    public int getAbilityLayout() {
        return abilityLayout;
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

    public String getAttackDamageType() {
        return attackDamageType;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public double getAttackRate() {
        return attackRate;
    }

    public String getAttributePrimary() {
        return attributePrimary;
    }

    public String getBaseClass() {
        return baseClass;
    }

    public String getBoundsHullName() {
        return boundsHullName;
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

    public int getHasInventory() {
        return hasInventory;
    }

    public int getHealthBarOffset() {
        return healthBarOffset;
    }

    public int getHeroUnlockOrder() {
        return heroUnlockOrder;
    }

    public String getIdleExpression() {
        return idleExpression;
    }

    public int getLevel() {
        return level;
    }

    public int getMagicalResistance() {
        return magicalResistance;
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

    public String getProjectileModel() {
        return projectileModel;
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

    public double getStatusHealthRegen() {
        return statusHealthRegen;
    }

    public double getStatusManaRegen() {
        return statusManaRegen;
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


    @Override
    public int hashCode() {
        return getKey().hashCode();
    }

    @Override
    public String toString() {
        return getLocalizedName();
    }

}
