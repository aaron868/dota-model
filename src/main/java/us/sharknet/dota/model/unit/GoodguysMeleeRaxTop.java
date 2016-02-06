package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class GoodguysMeleeRaxTop extends NpcUnit {

    private static GoodguysMeleeRaxTop instance;

    private final BackdoorProtectionInBase ability1;
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
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int healthBarOffset;
    private final String key;
    private final int magicalResistance;
    private final String minimapIcon;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
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

    private GoodguysMeleeRaxTop() {
        ability1 = BackdoorProtectionInBase.instance();
        armorPhysical = 15;
        attackAcquisitionRange = 0;
        attackAnimationPoint = 0;
        attackCapabilities = "DOTA_UNIT_CAP_NO_ATTACK";
        attackDamageMax = 0;
        attackDamageMin = 0;
        attackDamageType = "DAMAGE_TYPE_ArmorPhysical";
        attackRange = 0;
        attackRate = 0;
        attributeAgilityGain = 0;
        attributeBaseAgility = 0;
        attributeBaseIntelligence = 0;
        attributeBaseStrength = 0;
        attributeIntelligenceGain = 0;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 0;
        baseClass = "npc_dota_building";
        boundsHullName = "DOTA_HULL_SIZE_BARRACKS";
        bountyGoldMax = 0;
        bountyGoldMin = 0;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_SIEGE";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRUCTURE";
        healthBarOffset = 250;
        key = "npc_dota_goodguys_melee_rax_top";
        magicalResistance = 0;
        minimapIcon = "minimap_racks90";
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_NONE";
        movementSpeed = 0;
        movementTurnRate = 0;
        projectileSpeed = 0;
        ringRadius = 220;
        soundSet = "Creep_Good_Melee";
        statusHealth = 1500;
        statusHealthRegen = 5;
        statusMana = 0;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_GOODGUYS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_BARRACKS";
        visionDaytimeRange = 900;
        visionNighttimeRange = 600;
        localizedName = "Radiant Top Melee Barracks";
    }

    public static GoodguysMeleeRaxTop instance() {
        if( instance == null ){
            instance = new GoodguysMeleeRaxTop();
        }
        return instance;
    }

    public BackdoorProtectionInBase getAbility1() {
        return ability1;
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

    public int getMagicalResistance() {
        return magicalResistance;
    }

    public String getMinimapIcon() {
        return minimapIcon;
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
        if (!(object instanceof GoodguysMeleeRaxTop))
            return false;
        if (object == this)
            return true;
        GoodguysMeleeRaxTop otherObject = (GoodguysMeleeRaxTop) object;
        return otherObject.getKey().equals(getKey());
    }

}
