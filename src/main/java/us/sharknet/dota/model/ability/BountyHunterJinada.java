package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BountyHunterJinada extends Ability {

    private static BountyHunterJinada instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int iD;
    private final String key;
    private final int[] bonus_attackspeed;
    private final int[] bonus_movespeed;
    private final int[] crit_multiplier;
    private final double[] duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private BountyHunterJinada() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityCooldown = new double[]{12.0,10.0,8.0,6.0};
        iD = 5286;
        key = "bounty_hunter_jinada";
        bonus_attackspeed = new int[]{-25,-27,-29,-31};
        bonus_movespeed = new int[]{-25,-27,-29,-31};
        crit_multiplier = new int[]{150,175,200,225};
        duration = new double[]{3.0,3.0,3.0,3.0};
        localizedName = "Jinada";
        ownerKey = "npc_dota_hero_bounty_hunter";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static BountyHunterJinada instance() {
        if( instance == null ){
            instance = new BountyHunterJinada();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getBonusAttackspeed() {
        return bonus_attackspeed;
    }

    public int[] getBonusMovespeed() {
        return bonus_movespeed;
    }

    public int[] getCritMultiplier() {
        return crit_multiplier;
    }

    public double[] getDuration() {
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
        if (!(object instanceof BountyHunterJinada))
            return false;
        if (object == this)
            return true;
        BountyHunterJinada otherObject = (BountyHunterJinada) object;
        return otherObject.getKey().equals(getKey());
    }

}
