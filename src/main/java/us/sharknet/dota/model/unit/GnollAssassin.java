package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class GnollAssassin extends NpcUnit {

    private static GnollAssassin instance;

    private final GnollAssassinEnvenomedWeapon ability1;
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
    private final int isNeutralUnitType;
    private final String key;
    private final int level;
    private final double modelScale;
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

    private GnollAssassin() {
        ability1 = GnollAssassinEnvenomedWeapon.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 36;
        attackDamageMin = 30;
        attackRange = 500;
        attackRate = 1.6;
        baseClass = "npc_dota_creep_neutral";
        bountyGoldMax = 29;
        bountyGoldMin = 21;
        bountyXP = 41;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_PIERCE";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRONG";
        healthBarOffset = 170;
        isNeutralUnitType = 1;
        key = "npc_dota_neutral_gnoll_assassin";
        level = 2;
        modelScale = .9;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 270;
        projectileModel = "particles/neutral_fx/gnoll_base_attack.vpcf";
        projectileSpeed = 1500;
        ringRadius = 40;
        soundSet = "n_creep_Ranged";
        statusHealth = 370;
        statusHealthRegen = .5;
        statusMana = 0;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 400;
        visionNighttimeRange = 400;
        localizedName = "Vhoul Assassin";
    }

    public static GnollAssassin instance() {
        if( instance == null ){
            instance = new GnollAssassin();
        }
        return instance;
    }

    public GnollAssassinEnvenomedWeapon getAbility1() {
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

    public int getIsNeutralUnitType() {
        return isNeutralUnitType;
    }

    public String getKey() {
        return key;
    }

    public int getLevel() {
        return level;
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
        if (!(object instanceof GnollAssassin))
            return false;
        if (object == this)
            return true;
        GnollAssassin otherObject = (GnollAssassin) object;
        return otherObject.getKey().equals(getKey());
    }

}
