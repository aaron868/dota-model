package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MorphlingMorphAgi extends Ability {

    private static MorphlingMorphAgi instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int iD;
    private final String key;
    private final int[] bonus_attributes;
    private final String localizedName;
    private final int[] mana_cost;
    private final double[] morph_cooldown;
    private final String owningHeroShortKey;
    private final int[] points_per_tick;

    private MorphlingMorphAgi() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_IGNORE_PSEUDO_QUEUE"};
        abilityCooldown = 0;
        iD = 555;
        key = "morphling_morph_agi";
        bonus_attributes = new int[]{3,4,5,6};
        localizedName = "Morph Agi";
        mana_cost = new int[]{30,30,30,30};
        morph_cooldown = new double[]{1.0,0.5,0.33,0.2};
        owningHeroShortKey = "morphling";
        points_per_tick = new int[]{2,2,2,2};
    }

    public static MorphlingMorphAgi instance() {
        if( instance == null ){
            instance = new MorphlingMorphAgi();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getBonusAttributes() {
        return bonus_attributes;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getManaCost() {
        return mana_cost;
    }

    public double[] getMorphCooldown() {
        return morph_cooldown;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getPointsPerTick() {
        return points_per_tick;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MorphlingMorphAgi))
            return false;
        if (object == this)
            return true;
        MorphlingMorphAgi otherObject = (MorphlingMorphAgi) object;
        return otherObject.getKey().equals(getKey());
    }

}
