package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BatriderStickyNapalm extends Ability {

    private static BatriderStickyNapalm instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final double[] duration;
    private final String localizedName;
    private final int[] max_stacks;
    private final int[] movement_speed_pct;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int[] turn_rate_pct;

    private BatriderStickyNapalm() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.2,0.2,0.2,0.2};
        abilityCastRange = 7;
        abilityCooldown = new double[]{3.0,3.0,3.0,3.0};
        abilityManaCost = new int[]{20,20,20,20};
        abilityModifierSupportValue = .5;
        iD = 532;
        key = "batrider_sticky_napalm";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{10,15,20,25};
        duration = new double[]{8.0,8.0,8.0,8.0};
        localizedName = "Sticky Napalm";
        max_stacks = new int[]{10,10,10,10};
        movement_speed_pct = new int[]{-3,-5,-7,-9};
        owningHeroShortKey = "batrider";
        radius = new int[]{375,375,375,375};
        turn_rate_pct = new int[]{-70,-70,-70,-70};
    }

    public static BatriderStickyNapalm instance() {
        if( instance == null ){
            instance = new BatriderStickyNapalm();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getDamage() {
        return damage;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxStacks() {
        return max_stacks;
    }

    public int[] getMovementSpeedPct() {
        return movement_speed_pct;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRadius() {
        return radius;
    }

    public int[] getTurnRatePct() {
        return turn_rate_pct;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BatriderStickyNapalm))
            return false;
        if (object == this)
            return true;
        BatriderStickyNapalm otherObject = (BatriderStickyNapalm) object;
        return otherObject.getKey().equals(getKey());
    }

}
