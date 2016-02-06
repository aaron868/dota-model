package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class Companion extends NpcUnit {

    private static Companion instance;

    private final String attackCapabilities;
    private final String baseClass;
    private final String boundsHullName;
    private final String key;
    private final int modelScale;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int soundSet;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String localizedName;

    private Companion() {
        attackCapabilities = "DOTA_UNIT_CAP_NO_ATTACK";
        baseClass = "npc_dota_companion";
        boundsHullName = "DOTA_HULL_SIZE_SMALL";
        key = "npc_dota_companion";
        modelScale = 1;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 325;
        movementTurnRate = 1;
        soundSet = 0;
        visionDaytimeRange = 0;
        visionNighttimeRange = 0;
        localizedName = "Companion";
    }

    public static Companion instance() {
        if( instance == null ){
            instance = new Companion();
        }
        return instance;
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

    public String getKey() {
        return key;
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

    public int getSoundSet() {
        return soundSet;
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
        if (!(object instanceof Companion))
            return false;
        if (object == this)
            return true;
        Companion otherObject = (Companion) object;
        return otherObject.getKey().equals(getKey());
    }

}
