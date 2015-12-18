package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class UnitUndyingZombieTorso extends NpcUnit {

    private static UnitUndyingZombieTorso instance;

    private final UndyingTombstoneZombieDeathstrike ability1;
    private final NeutralSpellImmunity ability2;
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
    private final int canBeDominated;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int healthBarOffset;
    private final String key;
    private final int level;
    private final int magicalResistance;
    private final String model;
    private final double modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
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
    private final int wearable;

    private UnitUndyingZombieTorso() {
        ability1 = UndyingTombstoneZombieDeathstrike.instance();
        ability2 = NeutralSpellImmunity.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 36;
        attackDamageMin = 30;
        attackRange = 128;
        attackRate = 1.6;
        baseClass = "npc_dota_unit_undying_zombie";
        boundsHullName = "DOTA_HULL_SIZE_SMALL";
        bountyGoldMax = 0;
        bountyGoldMin = 0;
        bountyXP = 0;
        canBeDominated = 0;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_PIERCE";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_SOFT";
        healthBarOffset = 160;
        key = "npc_dota_unit_undying_zombie_torso";
        level = 1;
        magicalResistance = 33;
        model = "models/heroes/undying/undying_minion_torso.vmdl";
        modelScale = 1.5;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 375;
        movementTurnRate = .5;
        ringRadius = 70;
        soundSet = "Undying_Zombie";
        statusHealth = 2;
        statusHealthRegen = 0;
        statusMana = 0;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_BADGUYS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 1400;
        visionNighttimeRange = 1400;
        localizedName = "Undying Zombie";
        wearable = 8630;
    }

    public static UnitUndyingZombieTorso instance() {
        if( instance == null ){
            instance = new UnitUndyingZombieTorso();
        }
        return instance;
    }

    public UndyingTombstoneZombieDeathstrike getAbility1() {
        return ability1;
    }

    public NeutralSpellImmunity getAbility2() {
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

    public int getCanBeDominated() {
        return canBeDominated;
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

    public double getMovementTurnRate() {
        return movementTurnRate;
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

    public int getWearable() {
        return wearable;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof UnitUndyingZombieTorso))
            return false;
        if (object == this)
            return true;
        UnitUndyingZombieTorso otherObject = (UnitUndyingZombieTorso) object;
        return otherObject.getKey().equals(getKey());
    }

}
