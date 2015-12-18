package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class Courier extends NpcUnit {

    private static Courier instance;

    private final CourierReturnToBase ability1;
    private final CourierGoToSecretshop ability2;
    private final CourierReturnStashItems ability3;
    private final CourierTakeStashItems ability4;
    private final CourierTransferItems ability5;
    private final CourierBurst ability6;
    private final CourierMorph ability7;
    private final CourierTakeStashAndTransferItems ability8;
    private final int abilityLayout;
    private final double attackDesire;
    private final String baseClass;
    private final String boundsHullName;
    private final int bountyGoldMax;
    private final int bountyGoldMin;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int hasInventory;
    private final int healthBarOffset;
    private final String idleExpression;
    private final int isAncient;
    private final String key;
    private final int level;
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

    private Courier() {
        ability1 = CourierReturnToBase.instance();
        ability2 = CourierGoToSecretshop.instance();
        ability3 = CourierReturnStashItems.instance();
        ability4 = CourierTakeStashItems.instance();
        ability5 = CourierTransferItems.instance();
        ability6 = CourierBurst.instance();
        ability7 = CourierMorph.instance();
        ability8 = CourierTakeStashAndTransferItems.instance();
        abilityLayout = 6;
        attackDesire = 1.5;
        baseClass = "npc_dota_courier";
        boundsHullName = "DOTA_HULL_SIZE_SMALL";
        bountyGoldMax = 150;
        bountyGoldMin = 150;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_BASIC";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_SOFT";
        hasInventory = 1;
        healthBarOffset = 120;
        idleExpression = "scenes/default_idle.vcd";
        isAncient = 1;
        key = "npc_dota_courier";
        level = 0;
        model = "models/props_gameplay/donkey.vmdl";
        modelScale = 1;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 350;
        movementTurnRate = .5;
        statusHealth = 75;
        statusHealthRegen = .5;
        statusMana = 0;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_GOODGUYS";
        unitLabel = "courier";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_COURIER";
        visionDaytimeRange = 350;
        visionNighttimeRange = 350;
        wakesNeutrals = 0;
        localizedName = "Courier";
    }

    public static Courier instance() {
        if( instance == null ){
            instance = new Courier();
        }
        return instance;
    }

    public CourierReturnToBase getAbility1() {
        return ability1;
    }

    public CourierGoToSecretshop getAbility2() {
        return ability2;
    }

    public CourierReturnStashItems getAbility3() {
        return ability3;
    }

    public CourierTakeStashItems getAbility4() {
        return ability4;
    }

    public CourierTransferItems getAbility5() {
        return ability5;
    }

    public CourierBurst getAbility6() {
        return ability6;
    }

    public CourierMorph getAbility7() {
        return ability7;
    }

    public CourierTakeStashAndTransferItems getAbility8() {
        return ability8;
    }

    public int getAbilityLayout() {
        return abilityLayout;
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
        if (!(object instanceof Courier))
            return false;
        if (object == this)
            return true;
        Courier otherObject = (Courier) object;
        return otherObject.getKey().equals(getKey());
    }

}
