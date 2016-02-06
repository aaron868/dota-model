package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class UnitTombstone1 extends NpcUnit {

    private static UnitTombstone1 instance;

    private final NeutralSpellImmunity ability1;
    private final int armorPhysical;
    private final String attackCapabilities;
    private final String baseClass;
    private final String boundsHullName;
    private final int bountyGoldMax;
    private final int bountyGoldMin;
    private final int bountyXP;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int healthBarOffset;
    private final int isAncient;
    private final int isOther;
    private final int isSummoned;
    private final String key;
    private final int level;
    private final int magicalResistance;
    private final double modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
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

    private UnitTombstone1() {
        ability1 = NeutralSpellImmunity.instance();
        armorPhysical = 5;
        attackCapabilities = "DOTA_UNIT_CAP_NO_ATTACK";
        baseClass = "npc_dota_unit_undying_tombstone";
        boundsHullName = "DOTA_HULL_SIZE_REGULAR";
        bountyGoldMax = 125;
        bountyGoldMin = 125;
        bountyXP = 0;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_BASIC";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRONG";
        healthBarOffset = 250;
        isAncient = 1;
        isOther = 1;
        isSummoned = 1;
        key = "npc_dota_unit_tombstone1";
        level = 4;
        magicalResistance = 33;
        modelScale = .8;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_NONE";
        movementSpeed = 0;
        movementTurnRate = 0;
        soundSet = "Undying_Tombstone";
        statusHealth = 6;
        statusHealthRegen = 0;
        statusMana = 0;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_BADGUYS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_WARD";
        visionDaytimeRange = 1800;
        visionNighttimeRange = 1800;
        localizedName = "Tombstone Level 1";
        wearable = 8630;
    }

    public static UnitTombstone1 instance() {
        if( instance == null ){
            instance = new UnitTombstone1();
        }
        return instance;
    }

    public NeutralSpellImmunity getAbility1() {
        return ability1;
    }

    public int getArmorPhysical() {
        return armorPhysical;
    }

    public String getAttackCapabilities() {
        return attackCapabilities;
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

    public int getIsAncient() {
        return isAncient;
    }

    public int getIsOther() {
        return isOther;
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
        if (!(object instanceof UnitTombstone1))
            return false;
        if (object == this)
            return true;
        UnitTombstone1 otherObject = (UnitTombstone1) object;
        return otherObject.getKey().equals(getKey());
    }

}
