package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class BlackDragon extends NpcUnit {

    private static BlackDragon instance;

    private final BlackDragonDragonhideAura ability1;
    private final BlackDragonSplashAttack ability2;
    private final NeutralSpellImmunity ability3;
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
    private final int modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
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

    private BlackDragon() {
        ability1 = BlackDragonDragonhideAura.instance();
        ability2 = BlackDragonSplashAttack.instance();
        ability3 = NeutralSpellImmunity.instance();
        armorPhysical = 4;
        attackAcquisitionRange = 300;
        attackAnimationPoint = .94;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 81;
        attackDamageMin = 48;
        attackRange = 300;
        attackRate = 1.5;
        baseClass = "npc_dota_creep_neutral";
        bountyGoldMax = 190;
        bountyGoldMin = 150;
        bountyXP = 155;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_LIGHT";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRONG";
        healthBarOffset = 300;
        isAncient = 1;
        isNeutralUnitType = 1;
        key = "npc_dota_neutral_black_dragon";
        level = 6;
        model = "models/creeps/neutral_creeps/n_creep_black_dragon/n_creep_black_dragon.vmdl";
        modelScale = 1;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 300;
        projectileModel = "particles/neutral_fx/black_dragon_attack.vpcf";
        projectileSpeed = 1500;
        ringRadius = 70;
        soundSet = "n_creep_Ranged";
        statusHealth = 2000;
        statusHealthRegen = 2;
        statusMana = 0;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 800;
        visionNighttimeRange = 800;
        localizedName = "Ancient Black Dragon";
    }

    public static BlackDragon instance() {
        if( instance == null ){
            instance = new BlackDragon();
        }
        return instance;
    }

    public BlackDragonDragonhideAura getAbility1() {
        return ability1;
    }

    public BlackDragonSplashAttack getAbility2() {
        return ability2;
    }

    public NeutralSpellImmunity getAbility3() {
        return ability3;
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

    public int getModelScale() {
        return modelScale;
    }

    public String getMovementCapabilities() {
        return movementCapabilities;
    }

    public int getMovementSpeed() {
        return movementSpeed;
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
        if (!(object instanceof BlackDragon))
            return false;
        if (object == this)
            return true;
        BlackDragon otherObject = (BlackDragon) object;
        return otherObject.getKey().equals(getKey());
    }

}
