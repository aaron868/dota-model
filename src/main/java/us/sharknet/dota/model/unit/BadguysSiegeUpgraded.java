package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class BadguysSiegeUpgraded extends NpcUnit {

    private static BadguysSiegeUpgraded instance;

    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final String attackDamageType;
    private final int attackRange;
    private final double attackRate;
    private final int attributeAgilityGain;
    private final int attributeBaseAgility;
    private final int attributeBaseIntelligence;
    private final int attributeBaseStrength;
    private final int attributeIntelligenceGain;
    private final String attributePrimary;
    private final int attributeStrengthGain;
    private final String baseClass;
    private final String boundsHullName;
    private final int bountyGoldMax;
    private final int bountyGoldMin;
    private final int bountyXP;
    private final int canBeDominated;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int healthBarOffset;
    private final String key;
    private final int level;
    private final int magicalResistance;
    private final String minimapIcon;
    private final int minimapIconSize;
    private final double modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String projectileModel;
    private final int projectileSpeed;
    private final int ringRadius;
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

    private BadguysSiegeUpgraded() {
        armorPhysical = 0;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .7;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 62;
        attackDamageMin = 51;
        attackDamageType = "DAMAGE_TYPE_ArmorPhysical";
        attackRange = 690;
        attackRate = 2.7;
        attributeAgilityGain = 0;
        attributeBaseAgility = 0;
        attributeBaseIntelligence = 0;
        attributeBaseStrength = 0;
        attributeIntelligenceGain = 0;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 0;
        baseClass = "npc_dota_creep_siege";
        boundsHullName = "DOTA_HULL_SIZE_SIEGE";
        bountyGoldMax = 80;
        bountyGoldMin = 66;
        bountyXP = 88;
        canBeDominated = 1;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_SIEGE";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRUCTURE";
        healthBarOffset = 160;
        key = "npc_dota_badguys_siege_upgraded";
        level = 4;
        magicalResistance = 80;
        minimapIcon = "minimap_siege";
        minimapIconSize = 250;
        modelScale = .8;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 325;
        movementTurnRate = .5;
        projectileModel = "particles/base_attacks/ranged_siege_bad.vpcf";
        projectileSpeed = 1100;
        ringRadius = 80;
        soundSet = "Creep_Bad_Engine";
        statusHealth = 550;
        statusHealthRegen = 0;
        statusMana = 0;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_BADGUYS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_SIEGE";
        visionDaytimeRange = 850;
        visionNighttimeRange = 850;
        localizedName = "Dire Super Siege Creep";
    }

    public static BadguysSiegeUpgraded instance() {
        if( instance == null ){
            instance = new BadguysSiegeUpgraded();
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

    public int getAttributeAgilityGain() {
        return attributeAgilityGain;
    }

    public int getAttributeBaseAgility() {
        return attributeBaseAgility;
    }

    public int getAttributeBaseIntelligence() {
        return attributeBaseIntelligence;
    }

    public int getAttributeBaseStrength() {
        return attributeBaseStrength;
    }

    public int getAttributeIntelligenceGain() {
        return attributeIntelligenceGain;
    }

    public String getAttributePrimary() {
        return attributePrimary;
    }

    public int getAttributeStrengthGain() {
        return attributeStrengthGain;
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

    public int getCanBeDominated() {
        return canBeDominated;
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

    public int getMagicalResistance() {
        return magicalResistance;
    }

    public String getMinimapIcon() {
        return minimapIcon;
    }

    public int getMinimapIconSize() {
        return minimapIconSize;
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

    public int getRingRadius() {
        return ringRadius;
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
        if (!(object instanceof BadguysSiegeUpgraded))
            return false;
        if (object == this)
            return true;
        BadguysSiegeUpgraded otherObject = (BadguysSiegeUpgraded) object;
        return otherObject.getKey().equals(getKey());
    }

}
