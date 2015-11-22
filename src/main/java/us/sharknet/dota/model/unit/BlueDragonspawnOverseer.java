package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class BlueDragonspawnOverseer extends NpcUnit {

    private static BlueDragonspawnOverseer instance;

    private final BlueDragonspawnOverseerEvasion ability1;
    private final BlueDragonspawnOverseerDevotionAura ability2;
    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final int attackRange;
    private final double attackRate;
    private final String baseClass;
    private final int bountyGoldMax;
    private final int bountyGoldMin;
    private final int bountyXP;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int healthBarOffset;
    private final int isAncient;
    private final int isNeutralUnitType;
    private final String key;
    private final int level;
    private final String model;
    private final double modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
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

    private BlueDragonspawnOverseer() {
        ability1 = BlueDragonspawnOverseerEvasion.instance();
        ability2 = BlueDragonspawnOverseerDevotionAura.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 500;
        attackAnimationPoint = .83;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 65;
        attackDamageMin = 59;
        attackRange = 100;
        attackRate = 1.35;
        baseClass = "npc_dota_creep_neutral";
        bountyGoldMax = 98;
        bountyGoldMin = 86;
        bountyXP = 119;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_LIGHT";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRONG";
        healthBarOffset = 220;
        isAncient = 1;
        isNeutralUnitType = 1;
        key = "npc_dota_neutral_blue_dragonspawn_overseer";
        level = 5;
        model = "models/creeps/neutral_creeps/n_creep_dragonspawn_b/n_creep_dragonspawn_b.vmdl";
        modelScale = .85;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 300;
        projectileSpeed = 0;
        ringRadius = 80;
        soundSet = "n_creep_Melee";
        statusHealth = 1200;
        statusHealthRegen = .5;
        statusMana = 400;
        statusManaRegen = 1;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 800;
        visionNighttimeRange = 800;
        localizedName = "Ancient Drakken Armorer";
    }

    public static BlueDragonspawnOverseer instance() {
        if( instance == null ){
            instance = new BlueDragonspawnOverseer();
        }
        return instance;
    }

    public BlueDragonspawnOverseerEvasion getAbility1() {
        return ability1;
    }

    public BlueDragonspawnOverseerDevotionAura getAbility2() {
        return ability2;
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

    public int getIsAncient() {
        return isAncient;
    }

    public int getIsNeutralUnitType() {
        return isNeutralUnitType;
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
        if (!(object instanceof BlueDragonspawnOverseer))
            return false;
        if (object == this)
            return true;
        BlueDragonspawnOverseer otherObject = (BlueDragonspawnOverseer) object;
        return otherObject.getKey().equals(getKey());
    }

}
