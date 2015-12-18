package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class ElderTitanAncestralSpirit extends NpcUnit {

    private static ElderTitanAncestralSpirit instance;

    private final ElderTitanEchoStompSpirit ability1;
    private final ElderTitanReturnSpirit ability2;
    private final ElderTitanNaturalOrder ability3;
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
    private final int isAncient;
    private final String key;
    private final int level;
    private final String model;
    private final int modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int projectileSpeed;
    private final int soundSet;
    private final int statusHealth;
    private final double statusHealthRegen;
    private final String teamName;
    private final String unitRelationshipClass;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String localizedName;

    private ElderTitanAncestralSpirit() {
        ability1 = ElderTitanEchoStompSpirit.instance();
        ability2 = ElderTitanReturnSpirit.instance();
        ability3 = ElderTitanNaturalOrder.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 0;
        attackAnimationPoint = 0;
        attackCapabilities = "DOTA_UNIT_CAP_NO_ATTACK";
        attackDamageMax = 0;
        attackDamageMin = 0;
        attackRange = 0;
        attackRate = 1;
        baseClass = "npc_dota_elder_titan_ancestral_spirit";
        boundsHullName = "DOTA_HULL_SIZE_SMALL";
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_BASIC";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_SOFT";
        consideredHero = 1;
        isAncient = 1;
        key = "npc_dota_elder_titan_ancestral_spirit";
        level = 1;
        model = "models/heroes/elder_titan/ancestral_spirit.vmdl";
        modelScale = 1;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 315;
        movementTurnRate = .5;
        projectileSpeed = 0;
        soundSet = 0;
        statusHealth = 100;
        statusHealthRegen = 0;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_DEFAULT";
        visionDaytimeRange = 0;
        visionNighttimeRange = 0;
        localizedName = "Astral Spirit";
    }

    public static ElderTitanAncestralSpirit instance() {
        if( instance == null ){
            instance = new ElderTitanAncestralSpirit();
        }
        return instance;
    }

    public ElderTitanEchoStompSpirit getAbility1() {
        return ability1;
    }

    public ElderTitanReturnSpirit getAbility2() {
        return ability2;
    }

    public ElderTitanNaturalOrder getAbility3() {
        return ability3;
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

    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    public int getSoundSet() {
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
        if (!(object instanceof ElderTitanAncestralSpirit))
            return false;
        if (object == this)
            return true;
        ElderTitanAncestralSpirit otherObject = (ElderTitanAncestralSpirit) object;
        return otherObject.getKey().equals(getKey());
    }

}
