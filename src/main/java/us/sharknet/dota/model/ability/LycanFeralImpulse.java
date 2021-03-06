package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LycanFeralImpulse extends Ability {

    private static LycanFeralImpulse instance;

    private final String[] abilityBehavior;
    private final int iD;
    private final String key;
    private final int[] bonus_attack_speed;
    private final int[] bonus_damage;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;

    private LycanFeralImpulse() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        iD = 5397;
        key = "lycan_feral_impulse";
        bonus_attack_speed = new int[]{15,20,25,30};
        bonus_damage = new int[]{15,20,25,30};
        localizedName = "Feral Impulse";
        ownerKey = "npc_dota_hero_lycan";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        radius = new int[]{900,900,900,900};
    }

    public static LycanFeralImpulse instance() {
        if( instance == null ){
            instance = new LycanFeralImpulse();
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

    public int[] getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int[] getBonusDamage() {
        return bonus_damage;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LycanFeralImpulse))
            return false;
        if (object == this)
            return true;
        LycanFeralImpulse otherObject = (LycanFeralImpulse) object;
        return otherObject.getKey().equals(getKey());
    }

}
