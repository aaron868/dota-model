package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class Thinker extends NpcUnit {

    private static Thinker instance;

    private final String attackCapabilities;
    private final String baseClass;
    private final String boundsHullName;
    private final String key;
    private final String movementCapabilities;
    private final int soundSet;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String localizedName;

    private Thinker() {
        attackCapabilities = "DOTA_UNIT_CAP_NO_ATTACK";
        baseClass = "npc_dota_thinker";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        key = "npc_dota_thinker";
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_NONE";
        soundSet = 0;
        visionDaytimeRange = 0;
        visionNighttimeRange = 0;
        localizedName = "Thinker";
    }

    public static Thinker instance() {
        if( instance == null ){
            instance = new Thinker();
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

    public String getMovementCapabilities() {
        return movementCapabilities;
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
        if (!(object instanceof Thinker))
            return false;
        if (object == this)
            return true;
        Thinker otherObject = (Thinker) object;
        return otherObject.getKey().equals(getKey());
    }

}
