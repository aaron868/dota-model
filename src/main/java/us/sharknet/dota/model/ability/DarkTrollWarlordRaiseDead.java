package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DarkTrollWarlordRaiseDead extends Ability {

    private static DarkTrollWarlordRaiseDead instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final int duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private DarkTrollWarlordRaiseDead() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{.5,.5,.5,.5};
        abilityCooldown = new double[]{25,25,25,25};
        abilityManaCost = new int[]{50,50,50,50};
        iD = 5306;
        key = "dark_troll_warlord_raise_dead";
        duration = 4;
        localizedName = "Raise Dead";
        ownerKey = "npc_dota_neutral_dark_troll_warlord";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
    }

    public static DarkTrollWarlordRaiseDead instance() {
        if( instance == null ){
            instance = new DarkTrollWarlordRaiseDead();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getDuration() {
        return duration;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DarkTrollWarlordRaiseDead))
            return false;
        if (object == this)
            return true;
        DarkTrollWarlordRaiseDead otherObject = (DarkTrollWarlordRaiseDead) object;
        return otherObject.getKey().equals(getKey());
    }

}
