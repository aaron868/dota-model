package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class BrewmasterFire2 extends NpcUnit {

    private static BrewmasterFire2 instance;

    private final BrewmasterFirePermanentImmolation ability1;
    private final BrewmasterDrunkenBrawler ability2;
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
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int consideredHero;
    private final int healthBarOffset;
    private final String idleExpression;
    private final String idleSoundLoop;
    private final int ignoreAddSummonedToSelection;
    private final int isAncient;
    private final int isSummoned;
    private final String key;
    private final int level;
    private final String model;
    private final double modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final String soundSet;
    private final int statusHealth;
    private final double statusHealthRegen;
    private final String teamName;
    private final String unitLabel;
    private final String unitRelationshipClass;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String localizedName;

    private BrewmasterFire2() {
        ability1 = BrewmasterFirePermanentImmolation.instance();
        ability2 = BrewmasterDrunkenBrawler.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 130;
        attackDamageMin = 115;
        attackRange = 128;
        attackRate = 1.35;
        baseClass = "npc_dota_brewmaster_fire";
        boundsHullName = "DOTA_HULL_SIZE_SMALL";
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_HERO";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRONG";
        consideredHero = 1;
        healthBarOffset = 165;
        idleExpression = "scenes/brewmaster/brewmaster_spirits_exp_idle_01.vcd";
        idleSoundLoop = "Brewmaster_Fire.Move_Loop";
        ignoreAddSummonedToSelection = 1;
        isAncient = 1;
        isSummoned = 0;
        key = "npc_dota_brewmaster_fire_2";
        level = 8;
        model = "models/heroes/brewmaster/brewmaster_firespirit.vmdl";
        modelScale = .9;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 522;
        soundSet = "Brewmaster_Fire";
        statusHealth = 1200;
        statusHealthRegen = 4;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitLabel = "brewmaster_fire";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 1800;
        visionNighttimeRange = 800;
        localizedName = "Brewmaster Fire Spirit Level 2";
    }

    public static BrewmasterFire2 instance() {
        if( instance == null ){
            instance = new BrewmasterFire2();
        }
        return instance;
    }

    public BrewmasterFirePermanentImmolation getAbility1() {
        return ability1;
    }

    public BrewmasterDrunkenBrawler getAbility2() {
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

    public String getCombatClassAttack() {
        return combatClassAttack;
    }

    public String getCombatClassDefend() {
        return combatClassDefend;
    }

    public int getConsideredHero() {
        return consideredHero;
    }

    public int getHealthBarOffset() {
        return healthBarOffset;
    }

    public String getIdleExpression() {
        return idleExpression;
    }

    public String getIdleSoundLoop() {
        return idleSoundLoop;
    }

    public int getIgnoreAddSummonedToSelection() {
        return ignoreAddSummonedToSelection;
    }

    public int getIsAncient() {
        return isAncient;
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

    public String getSoundSet() {
        return soundSet;
    }

    public int getStatusHealth() {
        return statusHealth;
    }

    public double getStatusHealthRegen() {
        return statusHealthRegen;
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
        if (!(object instanceof BrewmasterFire2))
            return false;
        if (object == this)
            return true;
        BrewmasterFire2 otherObject = (BrewmasterFire2) object;
        return otherObject.getKey().equals(getKey());
    }

}
