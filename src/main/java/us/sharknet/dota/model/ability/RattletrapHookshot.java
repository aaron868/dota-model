package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RattletrapHookshot extends Ability {

    private static RattletrapHookshot instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] cooldown_scepter;
    private final int[] damage;
    private final double[] duration;
    private final int[] latch_radius;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] speed;
    private final int[] stun_radius;
    private final int[] tooltip_range;

    private RattletrapHookshot() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{2000,2500,3000};
        abilityCooldown = new double[]{70.0,55.0,40.0};
        abilityManaCost = new int[]{150,150,150};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 2;
        iD = 524;
        key = "rattletrap_hookshot";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cooldown_scepter = new double[]{12.0,12.0,12.0};
        damage = new int[]{100,200,300};
        duration = new double[]{1.0,1.5,2.0};
        latch_radius = new int[]{125,125,125};
        localizedName = "Hookshot";
        owningHeroShortKey = "rattletrap";
        speed = new int[]{4000,5000,6000};
        stun_radius = new int[]{175,175,175};
        tooltip_range = new int[]{2000,2500,3000};
    }

    public static RattletrapHookshot instance() {
        if( instance == null ){
            instance = new RattletrapHookshot();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public double[] getCooldownScepter() {
        return cooldown_scepter;
    }

    public int[] getDamage() {
        return damage;
    }

    public double[] getDuration() {
        return duration;
    }

    public int[] getLatchRadius() {
        return latch_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getSpeed() {
        return speed;
    }

    public int[] getStunRadius() {
        return stun_radius;
    }

    public int[] getTooltipRange() {
        return tooltip_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RattletrapHookshot))
            return false;
        if (object == this)
            return true;
        RattletrapHookshot otherObject = (RattletrapHookshot) object;
        return otherObject.getKey().equals(getKey());
    }

}
