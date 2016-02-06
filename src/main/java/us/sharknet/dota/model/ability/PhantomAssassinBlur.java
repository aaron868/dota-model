package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhantomAssassinBlur extends Ability {

    private static PhantomAssassinBlur instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] bonus_evasion;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final int transparency_fade;

    private PhantomAssassinBlur() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5192;
        key = "phantom_assassin_blur";
        bonus_evasion = new int[]{20,30,40,50};
        localizedName = "Blur";
        ownerKey = "npc_dota_hero_phantom_assassin";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        radius = new int[]{1600,1600,1600,1600};
        transparency_fade = 0;
    }

    public static PhantomAssassinBlur instance() {
        if( instance == null ){
            instance = new PhantomAssassinBlur();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getBonusEvasion() {
        return bonus_evasion;
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

    public int[] getRadius() {
        return radius;
    }

    public int getTransparencyFade() {
        return transparency_fade;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PhantomAssassinBlur))
            return false;
        if (object == this)
            return true;
        PhantomAssassinBlur otherObject = (PhantomAssassinBlur) object;
        return otherObject.getKey().equals(getKey());
    }

}
