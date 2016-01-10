package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SkywrathMageMysticFlare extends Ability {

    private static SkywrathMageMysticFlare instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final double damage_interval;
    private final double duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final double[] scepter_cooldown;

    private SkywrathMageMysticFlare() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.1,0.1,0.1,0.1};
        abilityCastRange = new int[]{1200,1200,1200,1200};
        abilityCooldown = new double[]{60.0,40.0,20.0};
        abilityManaCost = new int[]{350,575,800};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5584;
        key = "skywrath_mage_mystic_flare";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{600,1000,1400};
        damage_interval = .1;
        duration = 2.4;
        localizedName = "Mystic Flare";
        ownerKey = "npc_dota_hero_skywrath_mage";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 170;
        scepter_cooldown = new double[]{20.0,10.0,0.0};
    }

    public static SkywrathMageMysticFlare instance() {
        if( instance == null ){
            instance = new SkywrathMageMysticFlare();
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

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public double getDamageInterval() {
        return damage_interval;
    }

    public double getDuration() {
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

    public int getRadius() {
        return radius;
    }

    public double[] getScepterCooldown() {
        return scepter_cooldown;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof SkywrathMageMysticFlare))
            return false;
        if (object == this)
            return true;
        SkywrathMageMysticFlare otherObject = (SkywrathMageMysticFlare) object;
        return otherObject.getKey().equals(getKey());
    }

}
