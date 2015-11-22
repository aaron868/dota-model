package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BroodmotherSpinWeb extends Ability {

    private static BroodmotherSpinWeb instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final int iD;
    private final String key;
    private final int[] bonus_movespeed;
    private final int charge_restore_time;
    private final int[] count;
    private final int damage_time;
    private final int fade_delay;
    private final int[] heath_regen;
    private final int[] invis_movespeed_tooltip;
    private final String localizedName;
    private final int[] max_charges;
    private final String owningHeroShortKey;
    private final int radius;

    private BroodmotherSpinWeb() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = .4;
        abilityCastRange = 1000;
        abilityCooldown = 0;
        abilityManaCost = 50;
        iD = 5280;
        key = "broodmother_spin_web";
        bonus_movespeed = new int[]{20,25,30,35};
        charge_restore_time = 4;
        count = new int[]{2,4,6,8};
        damage_time = 6;
        fade_delay = 2;
        heath_regen = new int[]{2,4,6,8};
        invis_movespeed_tooltip = new int[]{40,50,60,70};
        localizedName = "Spin Web";
        max_charges = new int[]{1,2,3,4};
        owningHeroShortKey = "broodmother";
        radius = 900;
    }

    public static BroodmotherSpinWeb instance() {
        if( instance == null ){
            instance = new BroodmotherSpinWeb();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int[] getBonusMovespeed() {
        return bonus_movespeed;
    }

    public int getChargeRestoreTime() {
        return charge_restore_time;
    }

    public int[] getCount() {
        return count;
    }

    public int getDamageTime() {
        return damage_time;
    }

    public int getFadeDelay() {
        return fade_delay;
    }

    public int[] getHeathRegen() {
        return heath_regen;
    }

    public int[] getInvisMovespeedTooltip() {
        return invis_movespeed_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxCharges() {
        return max_charges;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BroodmotherSpinWeb))
            return false;
        if (object == this)
            return true;
        BroodmotherSpinWeb otherObject = (BroodmotherSpinWeb) object;
        return otherObject.getKey().equals(getKey());
    }

}
