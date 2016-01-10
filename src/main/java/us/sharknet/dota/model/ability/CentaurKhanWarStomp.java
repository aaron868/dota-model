package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CentaurKhanWarStomp extends Ability {

    private static CentaurKhanWarStomp instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int hero_stun_duration;
    private final String localizedName;
    private final int non_hero_stun_duration;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private CentaurKhanWarStomp() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{.5,.5,.5,.5};
        abilityCooldown = new double[]{2,2,2,2};
        abilityDamage = new int[]{25,25,25,25};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5295;
        key = "centaur_khan_war_stomp";
        hero_stun_duration = 2;
        localizedName = "War Stomp";
        non_hero_stun_duration = 3;
        ownerKey = "npc_dota_neutral_centaur_khan";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
        radius = 250;
    }

    public static CentaurKhanWarStomp instance() {
        if( instance == null ){
            instance = new CentaurKhanWarStomp();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getHeroStunDuration() {
        return hero_stun_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getNonHeroStunDuration() {
        return non_hero_stun_duration;
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
        if (!(object instanceof CentaurKhanWarStomp))
            return false;
        if (object == this)
            return true;
        CentaurKhanWarStomp otherObject = (CentaurKhanWarStomp) object;
        return otherObject.getKey().equals(getKey());
    }

}
