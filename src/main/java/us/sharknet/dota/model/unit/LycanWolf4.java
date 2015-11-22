package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class LycanWolf4 extends NpcUnit {

    private static LycanWolf4 instance;

    private final LycanSummonWolvesCriticalStrike ability1;
    private final LycanSummonWolvesInvisibility ability2;
    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final int attackRange;
    private final double attackRate;
    private final String baseClass;
    private final String boundsHullName;
    private final int bountyGoldMax;
    private final int bountyGoldMin;
    private final int bountyXP;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int healthBarOffset;
    private final int isSummoned;
    private final String key;
    private final int level;
    private final int magicalResistance;
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
    private final String unitLabel;
    private final String unitRelationshipClass;
    private final int useNeutralCreepBehavior;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String localizedName;

    private LycanWolf4() {
        ability1 = LycanSummonWolvesCriticalStrike.instance();
        ability2 = LycanSummonWolvesInvisibility.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 5;
        attackAnimationPoint = .33;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 49;
        attackDamageMin = 43;
        attackRange = 9;
        attackRate = 1.1;
        baseClass = "npc_dota_creep_neutral";
        boundsHullName = "DOTA_HULL_SIZE_SMALL";
        bountyGoldMax = 41;
        bountyGoldMin = 41;
        bountyXP = 2;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_BASIC";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRONG";
        healthBarOffset = 16;
        isSummoned = 1;
        key = "npc_dota_lycan_wolf4";
        level = 3;
        magicalResistance = 8;
        model = "models/heroes/lycan/summon_wolves.vmdl";
        modelScale = .99;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 46;
        projectileSpeed = 0;
        ringRadius = 7;
        soundSet = "Lycan_Wolf";
        statusHealth = 32;
        statusHealthRegen = 15;
        statusMana = 0;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitLabel = "lycan_wolf";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        useNeutralCreepBehavior = 0;
        visionDaytimeRange = 12;
        visionNighttimeRange = 8;
        localizedName = "Lycan Wolf Level 4";
    }

    public static LycanWolf4 instance() {
        if( instance == null ){
            instance = new LycanWolf4();
        }
        return instance;
    }

    public LycanSummonWolvesCriticalStrike getAbility1() {
        return ability1;
    }

    public LycanSummonWolvesInvisibility getAbility2() {
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

    public int getMagicalResistance() {
        return magicalResistance;
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

    public String getUnitLabel() {
        return unitLabel;
    }

    public String getUnitRelationshipClass() {
        return unitRelationshipClass;
    }

    public int getUseNeutralCreepBehavior() {
        return useNeutralCreepBehavior;
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
        if (!(object instanceof LycanWolf4))
            return false;
        if (object == this)
            return true;
        LycanWolf4 otherObject = (LycanWolf4) object;
        return otherObject.getKey().equals(getKey());
    }

}
