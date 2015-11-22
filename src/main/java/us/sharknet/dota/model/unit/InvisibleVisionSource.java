package us.sharknet.dota.model.unit;

import us.sharknet.dota.model.NpcUnit;
import us.sharknet.dota.model.ability.*;

public final class InvisibleVisionSource extends NpcUnit {

    private static InvisibleVisionSource instance;

    private final String baseClass;
    private final String key;
    private final String model;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final int soundSet;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String localizedName;

    private InvisibleVisionSource() {
        baseClass = "npc_dota_base_additive";
        key = "npc_dota_invisible_vision_source";
        model = "models/development/invisiblebox.vmdl";
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_NONE";
        movementSpeed = 0;
        soundSet = 0;
        visionDaytimeRange = 2;
        visionNighttimeRange = 2;
        localizedName = "Invisible Vision Source";
    }

    public static InvisibleVisionSource instance() {
        if( instance == null ){
            instance = new InvisibleVisionSource();
        }
        return instance;
    }

    public String getBaseClass() {
        return baseClass;
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

    public int getMovementSpeed() {
        return movementSpeed;
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
        if (!(object instanceof InvisibleVisionSource))
            return false;
        if (object == this)
            return true;
        InvisibleVisionSource otherObject = (InvisibleVisionSource) object;
        return otherObject.getKey().equals(getKey());
    }

}
