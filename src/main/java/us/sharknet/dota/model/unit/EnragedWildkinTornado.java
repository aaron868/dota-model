package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class EnragedWildkinTornado extends NpcUnit {

    private static EnragedWildkinTornado instance;

    private final TornadoTempest ability1;
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
    private final int isSummoned;
    private final String key;
    private final int level;
    private final int magicalResistance;
    private final String model;
    private final int modelScale;
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

    private EnragedWildkinTornado() {
        ability1 = TornadoTempest.instance();
        armorPhysical = 0;
        attackCapabilities = "DOTA_UNIT_CAP_NO_ATTACK";
        baseClass = "npc_dota_base_additive";
        boundsHullName = "DOTA_HULL_SIZE_REGULAR";
        bountyGoldMax = 0;
        bountyGoldMin = 0;
        bountyXP = 0;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_BASIC";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_STRONG";
        healthBarOffset = 140;
        isSummoned = 1;
        key = "npc_dota_enraged_wildkin_tornado";
        level = 4;
        magicalResistance = 0;
        model = "models/heroes/attachto_ghost/attachto_ghost.vmdl";
        modelScale = 16;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_FLY";
        movementSpeed = 125;
        movementTurnRate = .5;
        soundSet = "Creep_Good_Melee";
        statusHealth = 500;
        statusHealthRegen = .5;
        statusMana = 0;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_GOODGUYS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_WARD";
        visionDaytimeRange = 300;
        visionNighttimeRange = 300;
        localizedName = "Tornado";
    }

    public static EnragedWildkinTornado instance() {
        if( instance == null ){
            instance = new EnragedWildkinTornado();
        }
        return instance;
    }

    public TornadoTempest getAbility1() {
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof EnragedWildkinTornado))
            return false;
        if (object == this)
            return true;
        EnragedWildkinTornado otherObject = (EnragedWildkinTornado) object;
        return otherObject.getKey().equals(getKey());
    }

}
