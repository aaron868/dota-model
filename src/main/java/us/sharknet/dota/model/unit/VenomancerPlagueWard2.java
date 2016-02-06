package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class VenomancerPlagueWard2 extends NpcUnit {

    private static VenomancerPlagueWard2 instance;

    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final String attackDamageType;
    private final int attackRange;
    private final double attackRate;
    private final String baseClass;
    private final String boundsHullName;
    private final int bountyGoldMax;
    private final int bountyGoldMin;
    private final int bountyXP;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int hasInventory;
    private final int healthBarOffset;
    private final String key;
    private final int level;
    private final int magicalResistance;
    private final double modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String projectileModel;
    private final int projectileSpeed;
    private final String selectionGroup;
    private final String soundSet;
    private final int statusHealth;
    private final double statusHealthRegen;
    private final int statusMana;
    private final int statusManaRegen;
    private final String teamName;
    private final String unitRelationshipClass;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String localizedName;

    private VenomancerPlagueWard2() {
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 21;
        attackDamageMin = 17;
        attackDamageType = "DAMAGE_TYPE_ArmorPhysical";
        attackRange = 600;
        attackRate = 1.5;
        baseClass = "npc_dota_venomancer_plagueward";
        boundsHullName = "DOTA_HULL_SIZE_REGULAR";
        bountyGoldMax = 17;
        bountyGoldMin = 14;
        bountyXP = 25;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_PIERCE";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRONG";
        hasInventory = 0;
        healthBarOffset = 170;
        key = "npc_dota_venomancer_plague_ward_2";
        level = 1;
        magicalResistance = 0;
        modelScale = .8;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_NONE";
        movementSpeed = 0;
        movementTurnRate = .5;
        projectileModel = "particles/units/heroes/hero_venomancer/venomancer_plague_ward_projectile.vpcf";
        projectileSpeed = 1900;
        selectionGroup = "Venomancer_Wards";
        soundSet = "Hero_VenomancerWard";
        statusHealth = 200;
        statusHealthRegen = .25;
        statusMana = 0;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_GOODGUYS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_WARD";
        visionDaytimeRange = 1200;
        visionNighttimeRange = 800;
        localizedName = "Plague Ward Level 2";
    }

    public static VenomancerPlagueWard2 instance() {
        if( instance == null ){
            instance = new VenomancerPlagueWard2();
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

    public String getAttackDamageType() {
        return attackDamageType;
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

    public int getHasInventory() {
        return hasInventory;
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

    public int getMagicalResistance() {
        return magicalResistance;
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

    public String getProjectileModel() {
        return projectileModel;
    }

    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    public String getSelectionGroup() {
        return selectionGroup;
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

    public int getStatusMana() {
        return statusMana;
    }

    public int getStatusManaRegen() {
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

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VenomancerPlagueWard2))
            return false;
        if (object == this)
            return true;
        VenomancerPlagueWard2 otherObject = (VenomancerPlagueWard2) object;
        return otherObject.getKey().equals(getKey());
    }

}
