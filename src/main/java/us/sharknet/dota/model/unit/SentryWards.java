package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class SentryWards extends NpcUnit {

    private static SentryWards instance;

    private final String baseClass;
    private final String boundsHullName;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int healthBarOffset;
    private final String key;
    private final int level;
    private final String minimapIcon;
    private final int minimapIconSize;
    private final int modelScale;
    private final String movementCapabilities;
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

    private SentryWards() {
        baseClass = "npc_dota_ward_base_truesight";
        boundsHullName = "DOTA_HULL_SIZE_SMALL";
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_PIERCE";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_SOFT";
        healthBarOffset = 140;
        key = "npc_dota_sentry_wards";
        level = 0;
        minimapIcon = "minimap_ward_invis";
        minimapIconSize = 300;
        modelScale = 1;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        statusHealth = 200;
        statusHealthRegen = 0;
        statusMana = 0;
        statusManaRegen = 0;
        teamName = "DOTA_TEAM_GOODGUYS";
        unitRelationshipClass = "DOTA_NPC_UNIT_RELATIONSHIP_TYPE_WARD";
        visionDaytimeRange = 0;
        visionNighttimeRange = 0;
        localizedName = "Sentry Ward";
        wearable = 7556;
    }

    public static SentryWards instance() {
        if( instance == null ){
            instance = new SentryWards();
        }
        return instance;
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

    public int getHealthBarOffset() {
        return healthBarOffset;
    }

    public String getKey() {
        return key;
    }

    public int getLevel() {
        return level;
    }

    public String getMinimapIcon() {
        return minimapIcon;
    }

    public int getMinimapIconSize() {
        return minimapIconSize;
    }

    public int getModelScale() {
        return modelScale;
    }

    public String getMovementCapabilities() {
        return movementCapabilities;
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
        if (!(object instanceof SentryWards))
            return false;
        if (object == this)
            return true;
        SentryWards otherObject = (SentryWards) object;
        return otherObject.getKey().equals(getKey());
    }

}
