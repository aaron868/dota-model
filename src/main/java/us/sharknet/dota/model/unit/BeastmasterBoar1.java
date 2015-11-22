package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class BeastmasterBoar1 extends NpcUnit {

    private static BeastmasterBoar1 instance;

    private final BeastmasterBoarPoison ability1;
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
    private final int isSummoned;
    private final String key;
    private final int level;
    private final String model;
    private final double modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String projectileModel;
    private final int projectileSpeed;
    private final String soundSet;
    private final int statusHealth;
    private final double statusHealthRegen;
    private final String teamName;
    private final String unitLabel;
    private final String unitRelationshipClass;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String localizedName;

    private BeastmasterBoar1() {
        ability1 = BeastmasterBoarPoison.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 6;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 15;
        attackDamageMin = 15;
        attackRange = 55;
        attackRate = 1.25;
        baseClass = "npc_dota_beastmaster_boar";
        bountyGoldMax = 38;
        bountyGoldMin = 26;
        bountyXP = 59;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_PIERCE";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_BASIC";
        healthBarOffset = 125;
        isSummoned = 1;
        key = "npc_dota_beastmaster_boar_1";
        level = 5;
        model = "models/heroes/beastmaster/beastmaster_beast.vmdl";
        modelScale = .65;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 35;
        movementTurnRate = .6;
        projectileModel = "particles/units/heroes/hero_beastmaster/beastmaster_boar_attack.vpcf";
        projectileSpeed = 15;
        soundSet = "Beastmaster_Boar";
        statusHealth = 2;
        statusHealthRegen = 1.5;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitLabel = "boar";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 14;
        visionNighttimeRange = 8;
        localizedName = "Boar Level 1";
    }

    public static BeastmasterBoar1 instance() {
        if( instance == null ){
            instance = new BeastmasterBoar1();
        }
        return instance;
    }

    public BeastmasterBoarPoison getAbility1() {
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

    public String getProjectileModel() {
        return projectileModel;
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

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BeastmasterBoar1))
            return false;
        if (object == this)
            return true;
        BeastmasterBoar1 otherObject = (BeastmasterBoar1) object;
        return otherObject.getKey().equals(getKey());
    }

}
