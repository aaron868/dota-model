package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BigThunderLizardSlam extends Ability {

    private static BigThunderLizardSlam instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final int attack_slow_tooltip;
    private final int hero_duration;
    private final String localizedName;
    private final int movespeed_slow;
    private final int non_hero_duration;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private BigThunderLizardSlam() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCooldown = new double[]{6,6,6,6};
        abilityDamage = new int[]{70,70,70,70};
        abilityManaCost = new int[]{90,90,90,90};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5332;
        key = "big_thunder_lizard_slam";
        attack_slow_tooltip = -25;
        hero_duration = 2;
        localizedName = "Slam";
        movespeed_slow = -25;
        non_hero_duration = 4;
        ownerKey = "npc_dota_neutral_big_thunder_lizard";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
        radius = 250;
    }

    public static BigThunderLizardSlam instance() {
        if( instance == null ){
            instance = new BigThunderLizardSlam();
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

    public int getAttackSlowTooltip() {
        return attack_slow_tooltip;
    }

    public int getHeroDuration() {
        return hero_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeedSlow() {
        return movespeed_slow;
    }

    public int getNonHeroDuration() {
        return non_hero_duration;
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
        if (!(object instanceof BigThunderLizardSlam))
            return false;
        if (object == this)
            return true;
        BigThunderLizardSlam otherObject = (BigThunderLizardSlam) object;
        return otherObject.getKey().equals(getKey());
    }

}
