package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class BrewmasterStorm3 extends NpcUnit {

    private static BrewmasterStorm3 instance;

    private final BrewmasterStormDispelMagic ability1;
    private final BrewmasterStormCyclone ability2;
    private final BrewmasterStormWindWalk ability3;
    private final BrewmasterDrunkenHaze ability4;
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
    private final String projectileModel;
    private final int projectileSpeed;
    private final String soundSet;
    private final int statusHealth;
    private final double statusHealthRegen;
    private final int statusMana;
    private final double statusManaRegen;
    private final String teamName;
    private final String unitLabel;
    private final String unitRelationshipClass;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String localizedName;

    private BrewmasterStorm3() {
        ability1 = BrewmasterStormDispelMagic.instance();
        ability2 = BrewmasterStormCyclone.instance();
        ability3 = BrewmasterStormWindWalk.instance();
        ability4 = BrewmasterDrunkenHaze.instance();
        armorPhysical = 2;
        attackAcquisitionRange = 6;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 171;
        attackDamageMin = 159;
        attackRange = 6;
        attackRate = 1.5;
        baseClass = "npc_dota_brewmaster_storm";
        boundsHullName = "DOTA_HULL_SIZE_SMALL";
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_PIERCE";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRONG";
        consideredHero = 1;
        healthBarOffset = 175;
        idleExpression = "scenes/brewmaster/brewmaster_spirits_exp_idle_01.vcd";
        idleSoundLoop = "Brewmaster_Storm.Move_Loop";
        ignoreAddSummonedToSelection = 1;
        isAncient = 1;
        isSummoned = 0;
        key = "npc_dota_brewmaster_storm_3";
        level = 8;
        model = "models/heroes/brewmaster/brewmaster_windspirit.vmdl";
        modelScale = .95;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 35;
        projectileModel = "particles/units/heroes/hero_brewmaster/brewmaster_storm_attack.vpcf";
        projectileSpeed = 12;
        soundSet = "Brewmaster_Storm";
        statusHealth = 19;
        statusHealthRegen = 2;
        statusMana = 75;
        statusManaRegen = 1.5;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitLabel = "brewmaster_storm";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 18;
        visionNighttimeRange = 8;
        localizedName = "Brewmaster Strom Spirit Level 3";
    }

    public static BrewmasterStorm3 instance() {
        if( instance == null ){
            instance = new BrewmasterStorm3();
        }
        return instance;
    }

    public BrewmasterStormDispelMagic getAbility1() {
        return ability1;
    }

    public BrewmasterStormCyclone getAbility2() {
        return ability2;
    }

    public BrewmasterStormWindWalk getAbility3() {
        return ability3;
    }

    public BrewmasterDrunkenHaze getAbility4() {
        return ability4;
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

    public String getProjectileModel() {
        return projectileModel;
    }

    public int getProjectileSpeed() {
        return projectileSpeed;
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

    public double getStatusManaRegen() {
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
        if (!(object instanceof BrewmasterStorm3))
            return false;
        if (object == this)
            return true;
        BrewmasterStorm3 otherObject = (BrewmasterStorm3) object;
        return otherObject.getKey().equals(getKey());
    }

}
