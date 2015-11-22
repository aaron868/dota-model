package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class DarkTrollWarlord extends NpcUnit {

    private static DarkTrollWarlord instance;

    private final DarkTrollWarlordEnsnare ability1;
    private final DarkTrollWarlordRaiseDead ability2;
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
    private final String model;
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

    private DarkTrollWarlord() {
        ability1 = DarkTrollWarlordEnsnare.instance();
        ability2 = DarkTrollWarlordRaiseDead.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 300;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 54;
        attackDamageMin = 49;
        attackRange = 500;
        attackRate = 1.35;
        baseClass = "npc_dota_creep_neutral";
        bountyGoldMax = 62;
        bountyGoldMin = 54;
        bountyXP = 119;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_PIERCE";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRONG";
        healthBarOffset = 190;
        isNeutralUnitType = 1;
        key = "npc_dota_neutral_dark_troll_warlord";
        level = 6;
        model = "models/creeps/neutral_creeps/n_creep_troll_dark_b/n_creep_troll_dark_b.vmdl";
        modelScale = .9;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 320;
        projectileModel = "particles/base_attacks/ranged_badguy.vpcf";
        projectileSpeed = 1200;
        ringRadius = 60;
        soundSet = "n_creep_Ranged";
        statusHealth = 1100;
        statusHealthRegen = .5;
        statusMana = 550;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 800;
        visionNighttimeRange = 800;
        localizedName = "Dark Troll Summoner";
    }

    public static DarkTrollWarlord instance() {
        if( instance == null ){
            instance = new DarkTrollWarlord();
        }
        return instance;
    }

    public DarkTrollWarlordEnsnare getAbility1() {
        return ability1;
    }

    public DarkTrollWarlordRaiseDead getAbility2() {
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
        if (!(object instanceof DarkTrollWarlord))
            return false;
        if (object == this)
            return true;
        DarkTrollWarlord otherObject = (DarkTrollWarlord) object;
        return otherObject.getKey().equals(getKey());
    }

}
