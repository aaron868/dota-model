package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class PlasmaField extends NpcUnit {

    private static PlasmaField instance;

    private final String attackCapabilities;
    private final String baseClass;
    private final String boundsHullName;
    private final String key;
    private final String model;
    private final String movementCapabilities;
    private final int soundSet;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String localizedName;

    private PlasmaField() {
        attackCapabilities = "DOTA_UNIT_CAP_NO_ATTACK";
        baseClass = "npc_dota_base";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        key = "npc_dota_plasma_field";
        model = "models/development/invisiblebox.vmdl";
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_FLY";
        soundSet = 0;
        visionDaytimeRange = 800;
        visionNighttimeRange = 800;
        localizedName = "Plasma Field";
    }

    public static PlasmaField instance() {
        if( instance == null ){
            instance = new PlasmaField();
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

    public String getModel() {
        return model;
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
        if (!(object instanceof PlasmaField))
            return false;
        if (object == this)
            return true;
        PlasmaField otherObject = (PlasmaField) object;
        return otherObject.getKey().equals(getKey());
    }

}
