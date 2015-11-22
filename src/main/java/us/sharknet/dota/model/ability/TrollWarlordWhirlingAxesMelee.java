package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TrollWarlordWhirlingAxesMelee extends Ability {

    private static TrollWarlordWhirlingAxesMelee instance;

    private final String[] abilityBehavior;
    private final int abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int axe_movement_speed;
    private final double[] blind_duration;
    private final int blind_pct;
    private final int[] damage;
    private final int hit_radius;
    private final String localizedName;
    private final int max_range;
    private final String owningHeroShortKey;
    private final int whirl_duration;

    private TrollWarlordWhirlingAxesMelee() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = 0;
        abilityCooldown = new double[]{12.0,12.0,12.0,12.0};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 551;
        key = "troll_warlord_whirling_axes_melee";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        axe_movement_speed = 125;
        blind_duration = new double[]{4.0,5.0,6.0,7.0};
        blind_pct = 6;
        damage = new int[]{75,125,175,225};
        hit_radius = 1;
        localizedName = "Whirling Axes Melee";
        max_range = 45;
        owningHeroShortKey = "troll_warlord";
        whirl_duration = 3;
    }

    public static TrollWarlordWhirlingAxesMelee instance() {
        if( instance == null ){
            instance = new TrollWarlordWhirlingAxesMelee();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getAxeMovementSpeed() {
        return axe_movement_speed;
    }

    public double[] getBlindDuration() {
        return blind_duration;
    }

    public int getBlindPct() {
        return blind_pct;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getHitRadius() {
        return hit_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxRange() {
        return max_range;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getWhirlDuration() {
        return whirl_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TrollWarlordWhirlingAxesMelee))
            return false;
        if (object == this)
            return true;
        TrollWarlordWhirlingAxesMelee otherObject = (TrollWarlordWhirlingAxesMelee) object;
        return otherObject.getKey().equals(getKey());
    }

}