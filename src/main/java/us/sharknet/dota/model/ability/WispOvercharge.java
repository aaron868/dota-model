package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class WispOvercharge extends Ability {

    private static WispOvercharge instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastPoint;
    private final int abilityCooldown;
    private final int iD;
    private final String key;
    private final int[] bonus_attack_speed;
    private final int[] bonus_damage_pct;
    private final double[] drain_interval;
    private final double[] drain_pct;
    private final double[] drain_pct_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;

    private WispOvercharge() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE"};
        abilityCastPoint = new int[]{0,0,0,0};
        abilityCooldown = 2;
        iD = 5487;
        key = "wisp_overcharge";
        bonus_attack_speed = new int[]{40,50,60,70};
        bonus_damage_pct = new int[]{-5,-10,-15,-20};
        drain_interval = new double[]{0.2,0.2,0.2,0.2};
        drain_pct = new double[]{0.045,0.045,0.045,0.045};
        drain_pct_tooltip = new double[]{4.5,4.5,4.5,4.5};
        localizedName = "Overcharge";
        owningHeroShortKey = "wisp";
    }

    public static WispOvercharge instance() {
        if( instance == null ){
            instance = new WispOvercharge();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastPoint() {
        return abilityCastPoint;
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

    public int[] getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int[] getBonusDamagePct() {
        return bonus_damage_pct;
    }

    public double[] getDrainInterval() {
        return drain_interval;
    }

    public double[] getDrainPct() {
        return drain_pct;
    }

    public double[] getDrainPctTooltip() {
        return drain_pct_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof WispOvercharge))
            return false;
        if (object == this)
            return true;
        WispOvercharge otherObject = (WispOvercharge) object;
        return otherObject.getKey().equals(getKey());
    }

}
