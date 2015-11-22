package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MorphlingMorphStr extends Ability {

    private static MorphlingMorphStr instance;

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

    private MorphlingMorphStr() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_IGNORE_PSEUDO_QUEUE"};
        abilityCooldown = 0;
        iD = 556;
        key = "morphling_morph_str";
        bonus_attributes = new int[]{3,4,5,6};
        localizedName = "Morph Str";
        mana_cost = new int[]{30,30,30,30};
        morph_cooldown = new double[]{1.0,0.5,0.33,0.2};
        owningHeroShortKey = "morphling";
        points_per_tick = new int[]{2,2,2,2};
    }

    public static MorphlingMorphStr instance() {
        if( instance == null ){
            instance = new MorphlingMorphStr();
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
        if (!(object instanceof MorphlingMorphStr))
            return false;
        if (object == this)
            return true;
        MorphlingMorphStr otherObject = (MorphlingMorphStr) object;
        return otherObject.getKey().equals(getKey());
    }

}
