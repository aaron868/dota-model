package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class FlyingCourier extends NpcUnit {

    private static FlyingCourier instance;

    private final CourierReturnToBase ability1;
    private final CourierReturnStashItems ability2;
    private final CourierTakeStashItems ability3;
    private final CourierTransferItems ability4;
    private final CourierGoToSecretshop ability5;
    private final CourierBurst ability6;
    private final int abilityLayout;
    private final int armorPhysical;
    private final double attackDesire;
    private final String baseClass;
    private final String boundsHullName;
    private final int bountyGoldMax;
    private final int bountyGoldMin;
    private final int bountyXP;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int hasInventory;
    private final int healthBarOffset;
    private final String idleExpression;
    private final int isAncient;
    private final String key;
    private final int level;
    private final int magicalResistance;
    private final String model;
    private final int modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int statusHealth;
    private final double statusHealthRegen;
    private final int statusMana;
    private final int statusManaRegen;
    private final String teamName;
    private final String unitLabel;
    private final String unitRelationshipClass;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final int wakesNeutrals;
    private final String localizedName;

    private FlyingCourier() {
        ability1 = CourierReturnToBase.instance();
        ability2 = CourierReturnStashItems.instance();
        ability3 = CourierTakeStashItems.instance();
        ability4 = CourierTransferItems.instance();
        ability5 = CourierGoToSecretshop.instance();
        ability6 = CourierBurst.instance();
        abilityLayout = 6;
        armorPhysical = 1;
        attackDesire = 1.5;
        baseClass = "npc_dota_flying_courier";
        boundsHullName = "DOTA_HULL_SIZE_SMALL";
        bountyGoldMax = 175;
        bountyGoldMin = 175;
        bountyXP = 349;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_BASIC";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_SOFT";
        hasInventory = 1;
        healthBarOffset = 14;
        idleExpression = "scenes/default_idle.vcd";
        isAncient = 1;
        key = "npc_dota_flying_courier";
        level = 1;
        magicalResistance = 0;
        model = "models/props_gameplay/donkey_wings.vmdl";
        modelScale = 1;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_FLY";
        movementSpeed = 35;
        movementTurnRate = .5;
        statusHealth = 15;
        statusHealthRegen = 0;
        statusMana = 0;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_GOODGUYS";
        unitLabel = "courier";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_COURIER";
        visionDaytimeRange = 4;
        visionNighttimeRange = 4;
        wakesNeutrals = 0;
        localizedName = "Flying Courier";
    }

    public static FlyingCourier instance() {
        if( instance == null ){
            instance = new FlyingCourier();
        }
        return instance;
    }

    public CourierReturnToBase getAbility1() {
        return ability1;
    }

    public CourierReturnStashItems getAbility2() {
        return ability2;
    }

    public CourierTakeStashItems getAbility3() {
        return ability3;
    }

    public CourierTransferItems getAbility4() {
        return ability4;
    }

    public CourierGoToSecretshop getAbility5() {
        return ability5;
    }

    public CourierBurst getAbility6() {
        return ability6;
    }

    public int getAbilityLayout() {
        return abilityLayout;
    }

    public int getArmorPhysical() {
        return armorPhysical;
    }

    public double getAttackDesire() {
        return attackDesire;
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

    public String getIdleExpression() {
        return idleExpression;
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

    public int getWakesNeutrals() {
        return wakesNeutrals;
    }

    public String getLocalizedName() {
        return localizedName;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof FlyingCourier))
            return false;
        if (object == this)
            return true;
        FlyingCourier otherObject = (FlyingCourier) object;
        return otherObject.getKey().equals(getKey());
    }

}
