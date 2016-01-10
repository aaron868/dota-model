package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BatriderFlamebreak extends Ability {

    private static BatriderFlamebreak instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] collision_radius;
    private final double[] damage_duration;
    private final int[] damage_per_second;
    private final double[] damage_total_tooltip;
    private final int[] explosion_radius;
    private final double[] knockback_duration;
    private final int[] knockback_height;
    private final int knockback_max_distance;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] speed;
    private final double[] stun_duration;

    private BatriderFlamebreak() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.2,0.2,0.2,0.2};
        abilityCastRange = new int[]{1500,1500,1500,1500};
        abilityCooldown = new double[]{14,14,14,14};
        abilityManaCost = new int[]{110,120,130,140};
        abilityModifierSupportValue = 1;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5321;
        key = "batrider_flamebreak";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        collision_radius = new int[]{100,100,100,100};
        damage_duration = new double[]{3.0,4.0,5.0,6.0};
        damage_per_second = new int[]{25,30,35,40};
        damage_total_tooltip = new double[]{75.0,120.0,175.0,240.0};
        explosion_radius = new int[]{375,375,375,375};
        knockback_duration = new double[]{0.25,0.25,0.25,0.25};
        knockback_height = new int[]{100,100,100,100};
        knockback_max_distance = 4;
        localizedName = "Flamebreak";
        ownerKey = "npc_dota_hero_batrider";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        speed = new int[]{900,900,900,900};
        stun_duration = new double[]{0.5,0.5,0.5,0.5};
    }

    public static BatriderFlamebreak instance() {
        if( instance == null ){
            instance = new BatriderFlamebreak();
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
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

    public int[] getCollisionRadius() {
        return collision_radius;
    }

    public double[] getDamageDuration() {
        return damage_duration;
    }

    public int[] getDamagePerSecond() {
        return damage_per_second;
    }

    public double[] getDamageTotalTooltip() {
        return damage_total_tooltip;
    }

    public int[] getExplosionRadius() {
        return explosion_radius;
    }

    public double[] getKnockbackDuration() {
        return knockback_duration;
    }

    public int[] getKnockbackHeight() {
        return knockback_height;
    }

    public int getKnockbackMaxDistance() {
        return knockback_max_distance;
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

    public int[] getSpeed() {
        return speed;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BatriderFlamebreak))
            return false;
        if (object == this)
            return true;
        BatriderFlamebreak otherObject = (BatriderFlamebreak) object;
        return otherObject.getKey().equals(getKey());
    }

}
