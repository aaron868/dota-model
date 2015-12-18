package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class Roshan extends NpcUnit {

    private static Roshan instance;

    private final RoshanSpellBlock ability1;
    private final RoshanBash ability2;
    private final RoshanSlam ability3;
    private final RoshanInherentBuffs ability4;
    private final RoshanDevotion ability5;
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
    private final int isAncient;
    private final String key;
    private final int level;
    private final int magicalResistance;
    private final String model;
    private final int modelScale;
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

    private Roshan() {
        ability1 = RoshanSpellBlock.instance();
        ability2 = RoshanBash.instance();
        ability3 = RoshanSlam.instance();
        ability4 = RoshanInherentBuffs.instance();
        ability5 = RoshanDevotion.instance();
        armorPhysical = 5;
        attackAcquisitionRange = 150;
        attackAnimationPoint = .6;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 65;
        attackDamageMin = 65;
        attackDamageType = "DAMAGE_TYPE_ArmorPhysical";
        attackRange = 128;
        attackRate = 2;
        baseClass = "npc_dota_roshan";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        bountyGoldMax = 400;
        bountyGoldMin = 150;
        bountyXP = 1789;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_HERO";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRONG";
        hasInventory = 1;
        healthBarOffset = 400;
        isAncient = 1;
        key = "npc_dota_roshan";
        level = 30;
        magicalResistance = 75;
        model = "models/creeps/roshan/roshan.vmdl";
        modelScale = 1;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 270;
        movementTurnRate = 1;
        projectileModel = "particles/base_attacks/ranged_goodguy.vpcf";
        projectileSpeed = 1000;
        ringRadius = 110;
        soundSet = "Roshan";
        statusHealth = 7500;
        statusHealthRegen = 20;
        statusMana = 0;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 1400;
        visionNighttimeRange = 1400;
        localizedName = "Roshan";
    }

    public static Roshan instance() {
        if( instance == null ){
            instance = new Roshan();
        }
        return instance;
    }

    public RoshanSpellBlock getAbility1() {
        return ability1;
    }

    public RoshanBash getAbility2() {
        return ability2;
    }

    public RoshanSlam getAbility3() {
        return ability3;
    }

    public RoshanInherentBuffs getAbility4() {
        return ability4;
    }

    public RoshanDevotion getAbility5() {
        return ability5;
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

    public int getIsAncient() {
        return isAncient;
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

    public int getModelScale() {
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
        if (!(object instanceof Roshan))
            return false;
        if (object == this)
            return true;
        Roshan otherObject = (Roshan) object;
        return otherObject.getKey().equals(getKey());
    }

}
