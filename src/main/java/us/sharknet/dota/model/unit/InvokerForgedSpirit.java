package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class InvokerForgedSpirit extends NpcUnit {

    private static InvokerForgedSpirit instance;

    private final ForgedSpiritMeltingStrike ability1;
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
    private final int healthBarOffset;
    private final int isSummoned;
    private final String key;
    private final int level;
    private final int magicalResistance;
    private final int modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String projectileModel;
    private final int projectileSpeed;
    private final String selectionGroup;
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
    private final int wearable;

    private InvokerForgedSpirit() {
        ability1 = ForgedSpiritMeltingStrike.instance();
        armorPhysical = 2;
        attackAcquisitionRange = 900;
        attackAnimationPoint = .2;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 0;
        attackDamageMin = 0;
        attackDamageType = "DAMAGE_TYPE_ArmorPhysical";
        attackRange = 0;
        attackRate = 1.5;
        baseClass = "npc_dota_invoker_forged_spirit";
        boundsHullName = "DOTA_HULL_SIZE_REGULAR";
        bountyGoldMax = 46;
        bountyGoldMin = 32;
        bountyXP = 31;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_HERO";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRONG";
        healthBarOffset = 270;
        isSummoned = 1;
        key = "npc_dota_invoker_forged_spirit";
        level = 3;
        magicalResistance = 0;
        modelScale = 1;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 320;
        movementTurnRate = .5;
        projectileModel = "particles/units/heroes/hero_invoker/invoker_forged_spirit_projectile.vpcf";
        projectileSpeed = 1000;
        selectionGroup = "Invoker_Forged_Spirits";
        soundSet = "Creep_Good_Range";
        statusHealth = 5;
        statusHealthRegen = .25;
        statusMana = 5;
        statusManaRegen = 4;
        teamName = "DOTA_TEAM_GOODGUYS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 1200;
        visionNighttimeRange = 800;
        localizedName = "Forged Spirit";
        wearable = 8625;
    }

    public static InvokerForgedSpirit instance() {
        if( instance == null ){
            instance = new InvokerForgedSpirit();
        }
        return instance;
    }

    public ForgedSpiritMeltingStrike getAbility1() {
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

    public String getSelectionGroup() {
        return selectionGroup;
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

    public int getWearable() {
        return wearable;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof InvokerForgedSpirit))
            return false;
        if (object == this)
            return true;
        InvokerForgedSpirit otherObject = (InvokerForgedSpirit) object;
        return otherObject.getKey().equals(getKey());
    }

}
