package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class LoneDruidBear2 extends NpcUnit {

    private static LoneDruidBear2 instance;

    private final LoneDruidSpiritBearReturn ability1;
    private final BearEmpty ability2;
    private final LoneDruidSavageRoarBear ability3;
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
    private final int consideredHero;
    private final int hasInventory;
    private final int healthBarOffset;
    private final String key;
    private final int level;
    private final double modelScale;
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
    private final String unitLabel;
    private final String unitRelationshipClass;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String localizedName;

    private LoneDruidBear2() {
        ability1 = LoneDruidSpiritBearReturn.instance();
        ability2 = BearEmpty.instance();
        ability3 = LoneDruidSavageRoarBear.instance();
        armorPhysical = 4;
        attackAcquisitionRange = 500;
        attackAnimationPoint = .43;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 45;
        attackDamageMin = 45;
        attackRange = 128;
        attackRate = 1.65;
        baseClass = "npc_dota_lone_druid_bear";
        bountyGoldMax = 300;
        bountyGoldMin = 300;
        bountyXP = 300;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_BASIC";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRONG";
        consideredHero = 1;
        hasInventory = 1;
        healthBarOffset = 215;
        key = "npc_dota_lone_druid_bear2";
        level = 7;
        modelScale = .72;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 330;
        movementTurnRate = .6;
        projectileSpeed = 0;
        ringRadius = 70;
        soundSet = "LoneDruid_SpiritBear";
        statusHealth = 1800;
        statusHealthRegen = 3;
        statusMana = 300;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitLabel = "spirit_bear";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 1400;
        visionNighttimeRange = 800;
        localizedName = "Spirit Bear Level 2";
    }

    public static LoneDruidBear2 instance() {
        if( instance == null ){
            instance = new LoneDruidBear2();
        }
        return instance;
    }

    public LoneDruidSpiritBearReturn getAbility1() {
        return ability1;
    }

    public BearEmpty getAbility2() {
        return ability2;
    }

    public LoneDruidSavageRoarBear getAbility3() {
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

    public int getConsideredHero() {
        return consideredHero;
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
        if (!(object instanceof LoneDruidBear2))
            return false;
        if (object == this)
            return true;
        LoneDruidBear2 otherObject = (LoneDruidBear2) object;
        return otherObject.getKey().equals(getKey());
    }

}
