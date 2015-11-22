package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class VisageFamiliar3 extends NpcUnit {

    private static VisageFamiliar3 instance;

    private final VisageSummonFamiliarsStoneForm ability1;
    private final NeutralSpellImmunity ability2;
    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final String attackDamageType;
    private final int attackRange;
    private final double attackRate;
    private final int autoAttacksByDefault;
    private final String baseClass;
    private final String boundsHullName;
    private final int bountyGoldMax;
    private final int bountyGoldMin;
    private final int bountyXP;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int consideredHero;
    private final int healthBarOffset;
    private final int isAncient;
    private final int isSummoned;
    private final String key;
    private final int level;
    private final int magicalResistance;
    private final String model;
    private final double modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String projectileModel;
    private final int projectileSpeed;
    private final int selectOnSpawn;
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
    private final int wearable;

    private VisageFamiliar3() {
        ability1 = VisageSummonFamiliarsStoneForm.instance();
        ability2 = NeutralSpellImmunity.instance();
        armorPhysical = 2;
        attackAcquisitionRange = 250;
        attackAnimationPoint = .33;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 10;
        attackDamageMin = 10;
        attackDamageType = "DAMAGE_TYPE_ArmorPhysical";
        attackRange = 160;
        attackRate = .4;
        autoAttacksByDefault = 0;
        baseClass = "npc_dota_visage_familiar";
        boundsHullName = "DOTA_HULL_SIZE_REGULAR";
        bountyGoldMax = 100;
        bountyGoldMin = 100;
        bountyXP = 41;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_HERO";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_HERO";
        consideredHero = 1;
        healthBarOffset = 130;
        isAncient = 0;
        isSummoned = 0;
        key = "npc_dota_visage_familiar3";
        level = 2;
        magicalResistance = 0;
        model = "models/heroes/visage/visage_familiar.vmdl";
        modelScale = .66;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 400;
        movementTurnRate = .5;
        projectileModel = "particles/units/heroes/hero_visage/visage_familiar_base_attack.vpcf";
        projectileSpeed = 900;
        selectOnSpawn = 1;
        soundSet = "Visage_Familiar";
        statusHealth = 12;
        statusHealthRegen = 0;
        statusMana = 0;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_NEUTRALS";
        unitLabel = "visage_familiars";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_WARD";
        visionDaytimeRange = 390;
        visionNighttimeRange = 390;
        localizedName = "Familiar 3";
        wearable = 600;
    }

    public static VisageFamiliar3 instance() {
        if( instance == null ){
            instance = new VisageFamiliar3();
        }
        return instance;
    }

    public VisageSummonFamiliarsStoneForm getAbility1() {
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

    public String getAttackDamageType() {
        return attackDamageType;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public double getAttackRate() {
        return attackRate;
    }

    public int getAutoAttacksByDefault() {
        return autoAttacksByDefault;
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

    public int getConsideredHero() {
        return consideredHero;
    }

    public int getHealthBarOffset() {
        return healthBarOffset;
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

    public String getProjectileModel() {
        return projectileModel;
    }

    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    public int getSelectOnSpawn() {
        return selectOnSpawn;
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

    public int getWearable() {
        return wearable;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VisageFamiliar3))
            return false;
        if (object == this)
            return true;
        VisageFamiliar3 otherObject = (VisageFamiliar3) object;
        return otherObject.getKey().equals(getKey());
    }

}
