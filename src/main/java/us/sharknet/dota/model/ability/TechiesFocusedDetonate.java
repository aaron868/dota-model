package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TechiesFocusedDetonate extends Ability {

    private static TechiesFocusedDetonate instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private TechiesFocusedDetonate() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_UNRESTRICTED","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{1.0,1.0,1.0};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5635;
        key = "techies_focused_detonate";
        localizedName = "Focused Detonate";
        ownerKey = "npc_dota_hero_techies";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 700;
    }

    public static TechiesFocusedDetonate instance() {
        if( instance == null ){
            instance = new TechiesFocusedDetonate();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwnerKey() {
        return ownerKey;
    }

    public AbilityOwnerType getOwnerType() {
        return ownerType;
    }

    public boolean isPassive() {
        return passive;
    }

    public boolean isPlaceholder() {
        return placeholder;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TechiesFocusedDetonate))
            return false;
        if (object == this)
            return true;
        TechiesFocusedDetonate otherObject = (TechiesFocusedDetonate) object;
        return otherObject.getKey().equals(getKey());
    }

}
