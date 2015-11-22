package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class TechiesMinefieldSign extends NpcUnit {

    private static TechiesMinefieldSign instance;

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
    private final int hasInventory;
    private final int healthBarOffset;
    private final String key;
    private final int level;
    private final int magicalResistance;
    private final String model;
    private final int modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int projectileSpeed;
    private final String selectionGroup;
    private final int statusHealth;
    private final double statusHealthRegen;
    private final int statusMana;
    private final int statusManaRegen;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String localizedName;
    private final int wearable;

    private TechiesMinefieldSign() {
        armorPhysical = 0;
        attackAcquisitionRange = 0;
        attackAnimationPoint = 0;
        attackCapabilities = "DOTA_UNIT_CAP_NO_ATTACK";
        attackDamageMax = 0;
        attackDamageMin = 0;
        attackRange = 0;
        attackRate = 1;
        baseClass = "npc_dota_techies_minefield_sign";
        boundsHullName = "DOTA_HULL_SIZE_REGULAR";
        bountyGoldMax = 0;
        bountyGoldMin = 0;
        bountyXP = 0;
        hasInventory = 0;
        healthBarOffset = 17;
        key = "npc_dota_techies_minefield_sign";
        level = 1;
        magicalResistance = 0;
        model = "models/heroes/techies/techies_sign.vmdl";
        modelScale = 1;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_NONE";
        movementSpeed = 0;
        movementTurnRate = 0;
        projectileSpeed = 0;
        selectionGroup = "Techies_minefield_sign";
        statusHealth = 1;
        statusHealthRegen = .25;
        statusMana = 0;
        statusManaRegen = 0;
        visionDaytimeRange = 0;
        visionNighttimeRange = 0;
        localizedName = "Minefield Sign";
        wearable = 8646;
    }

    public static TechiesMinefieldSign instance() {
        if( instance == null ){
            instance = new TechiesMinefieldSign();
        }
        return instance;
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

    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    public String getSelectionGroup() {
        return selectionGroup;
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
        if (!(object instanceof TechiesMinefieldSign))
            return false;
        if (object == this)
            return true;
        TechiesMinefieldSign otherObject = (TechiesMinefieldSign) object;
        return otherObject.getKey().equals(getKey());
    }

}