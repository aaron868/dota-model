package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PudgeFleshHeap extends Ability {

    private static PudgeFleshHeap instance;

    private final String abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] flesh_heap_magic_resist;
    private final int flesh_heap_range;
    private final double[] flesh_heap_strength_buff_amount;
    private final String localizedName;
    private final String owningHeroShortKey;

    private PudgeFleshHeap() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_PASSIVE";
        iD = 574;
        key = "pudge_flesh_heap";
        flesh_heap_magic_resist = new int[]{6,8,10,12};
        flesh_heap_range = 45;
        flesh_heap_strength_buff_amount = new double[]{1.0,1.5,2.0,2.5};
        localizedName = "Flesh Heap";
        owningHeroShortKey = "pudge";
    }

    public static PudgeFleshHeap instance() {
        if( instance == null ){
            instance = new PudgeFleshHeap();
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

    public int[] getFleshHeapMagicResist() {
        return flesh_heap_magic_resist;
    }

    public int getFleshHeapRange() {
        return flesh_heap_range;
    }

    public double[] getFleshHeapStrengthBuffAmount() {
        return flesh_heap_strength_buff_amount;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PudgeFleshHeap))
            return false;
        if (object == this)
            return true;
        PudgeFleshHeap otherObject = (PudgeFleshHeap) object;
        return otherObject.getKey().equals(getKey());
    }

}
