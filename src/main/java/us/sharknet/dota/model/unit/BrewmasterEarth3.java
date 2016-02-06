package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class BrewmasterEarth3 extends NpcUnit {

    private static BrewmasterEarth3 instance;

    private final BrewmasterEarthHurlBoulder ability1;
    private final BrewmasterEarthSpellImmunity ability2;
    private final BrewmasterEarthPulverize ability3;
    private final BrewmasterThunderClap ability4;
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
    private final int ignoreAddSummonedToSelection;
    private final int isAncient;
    private final int isSummoned;
    private final String key;
    private final int level;
    private final double modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
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

    private BrewmasterEarth3() {
        ability1 = BrewmasterEarthHurlBoulder.instance();
        ability2 = BrewmasterEarthSpellImmunity.instance();
        ability3 = BrewmasterEarthPulverize.instance();
        ability4 = BrewmasterThunderClap.instance();
        armorPhysical = 5;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 171;
        attackDamageMin = 159;
        attackRange = 128;
        attackRate = 1.35;
        baseClass = "npc_dota_brewmaster_earth";
        boundsHullName = "DOTA_HULL_SIZE_SMALL";
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_PIERCE";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRONG";
        consideredHero = 1;
        healthBarOffset = 175;
        idleExpression = "scenes/brewmaster/brewmaster_spirits_exp_idle_01.vcd";
        ignoreAddSummonedToSelection = 1;
        isAncient = 1;
        isSummoned = 0;
        key = "npc_dota_brewmaster_earth_3";
        level = 8;
        modelScale = .95;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 325;
        soundSet = "Brewmaster_Earth";
        statusHealth = 3000;
        statusHealthRegen = 2;
        statusMana = 600;
        statusManaRegen = 2;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitLabel = "brewmaster_earth";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 1800;
        visionNighttimeRange = 800;
        localizedName = "Brewmaster Earth Spirit Level 3";
    }

    public static BrewmasterEarth3 instance() {
        if( instance == null ){
            instance = new BrewmasterEarth3();
        }
        return instance;
    }

    public BrewmasterEarthHurlBoulder getAbility1() {
        return ability1;
    }

    public BrewmasterEarthSpellImmunity getAbility2() {
        return ability2;
    }

    public BrewmasterEarthPulverize getAbility3() {
        return ability3;
    }

    public BrewmasterThunderClap getAbility4() {
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
        if (!(object instanceof BrewmasterEarth3))
            return false;
        if (object == this)
            return true;
        BrewmasterEarth3 otherObject = (BrewmasterEarth3) object;
        return otherObject.getKey().equals(getKey());
    }

}
