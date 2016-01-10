package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SpiritBreakerGreaterBash extends Ability {

    private static SpiritBreakerGreaterBash instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int abilityModifierSupportBonus;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_movespeed_pct;
    private final int[] chance_pct;
    private final double[] damage;
    private final double[] duration;
    private final int[] knockback_distance;
    private final double[] knockback_duration;
    private final int[] knockback_height;
    private final String localizedName;
    private final double[] movespeed_duration;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private SpiritBreakerGreaterBash() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityCooldown = new double[]{1.5,1.5,1.5,1.5};
        abilityModifierSupportBonus = 40;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5355;
        key = "spirit_breaker_greater_bash";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_movespeed_pct = new int[]{15,15,15,15};
        chance_pct = new int[]{17,17,17,17};
        damage = new double[]{22.0,28.0,34.0,40.0};
        duration = new double[]{1.0,1.2,1.4,1.6};
        knockback_distance = new int[]{143,152,158,162};
        knockback_duration = new double[]{0.5,0.5,0.5,0.5};
        knockback_height = new int[]{50,50,50,50};
        localizedName = "Greater Bash";
        movespeed_duration = new double[]{3.0,3.0,3.0,3.0};
        ownerKey = "npc_dota_hero_spirit_breaker";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static SpiritBreakerGreaterBash instance() {
        if( instance == null ){
            instance = new SpiritBreakerGreaterBash();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityModifierSupportBonus() {
        return abilityModifierSupportBonus;
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

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getBonusMovespeedPct() {
        return bonus_movespeed_pct;
    }

    public int[] getChancePct() {
        return chance_pct;
    }

    public double[] getDamage() {
        return damage;
    }

    public double[] getDuration() {
        return duration;
    }

    public int[] getKnockbackDistance() {
        return knockback_distance;
    }

    public double[] getKnockbackDuration() {
        return knockback_duration;
    }

    public int[] getKnockbackHeight() {
        return knockback_height;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double[] getMovespeedDuration() {
        return movespeed_duration;
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
        if (!(object instanceof SpiritBreakerGreaterBash))
            return false;
        if (object == this)
            return true;
        SpiritBreakerGreaterBash otherObject = (SpiritBreakerGreaterBash) object;
        return otherObject.getKey().equals(getKey());
    }

}
