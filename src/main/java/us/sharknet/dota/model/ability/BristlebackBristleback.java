package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BristlebackBristleback extends Ability {

    private static BristlebackBristleback instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int back_angle;
    private final int[] back_damage_reduction;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int quill_release_threshold;
    private final int side_angle;
    private final int[] side_damage_reduction;

    private BristlebackBristleback() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 5550;
        key = "bristleback_bristleback";
        back_angle = 70;
        back_damage_reduction = new int[]{16,24,32,40};
        localizedName = "Bristleback";
        owningHeroShortKey = "bristleback";
        quill_release_threshold = 230;
        side_angle = 110;
        side_damage_reduction = new int[]{8,12,16,20};
    }

    public static BristlebackBristleback instance() {
        if( instance == null ){
            instance = new BristlebackBristleback();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getBackAngle() {
        return back_angle;
    }

    public int[] getBackDamageReduction() {
        return back_damage_reduction;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getQuillReleaseThreshold() {
        return quill_release_threshold;
    }

    public int getSideAngle() {
        return side_angle;
    }

    public int[] getSideDamageReduction() {
        return side_damage_reduction;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BristlebackBristleback))
            return false;
        if (object == this)
            return true;
        BristlebackBristleback otherObject = (BristlebackBristleback) object;
        return otherObject.getKey().equals(getKey());
    }

}
