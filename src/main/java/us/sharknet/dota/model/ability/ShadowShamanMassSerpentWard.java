package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShadowShamanMassSerpentWard extends Ability {

    private static ShadowShamanMassSerpentWard instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage_max;
    private final int[] damage_max_scepter;
    private final int[] damage_min;
    private final int[] damage_min_scepter;
    private final double[] duration;
    private final int[] full_splash_radius;
    private final String localizedName;
    private final int[] mid_splash_radius;
    private final int[] min_splash_radius;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int ward_count;

    private ShadowShamanMassSerpentWard() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{.3,.3,.3,.3};
        abilityCastRange = new int[]{550,550,550,550};
        abilityCooldown = new double[]{120,120,120,120};
        abilityManaCost = new int[]{200,350,600};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5081;
        key = "shadow_shaman_mass_serpent_ward";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        damage_max = new int[]{45,60,75};
        damage_max_scepter = new int[]{90,110,130};
        damage_min = new int[]{40,55,70};
        damage_min_scepter = new int[]{85,105,125};
        duration = new double[]{45.0,45.0,45.0};
        full_splash_radius = new int[]{50,75,85};
        localizedName = "Mass Serpent Ward";
        mid_splash_radius = new int[]{75,100,110};
        min_splash_radius = new int[]{150,200,220};
        ownerKey = "npc_dota_hero_shadow_shaman";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        ward_count = 10;
    }

    public static ShadowShamanMassSerpentWard instance() {
        if( instance == null ){
            instance = new ShadowShamanMassSerpentWard();
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public int[] getDamageMax() {
        return damage_max;
    }

    public int[] getDamageMaxScepter() {
        return damage_max_scepter;
    }

    public int[] getDamageMin() {
        return damage_min;
    }

    public int[] getDamageMinScepter() {
        return damage_min_scepter;
    }

    public double[] getDuration() {
        return duration;
    }

    public int[] getFullSplashRadius() {
        return full_splash_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMidSplashRadius() {
        return mid_splash_radius;
    }

    public int[] getMinSplashRadius() {
        return min_splash_radius;
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

    public int getWardCount() {
        return ward_count;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShadowShamanMassSerpentWard))
            return false;
        if (object == this)
            return true;
        ShadowShamanMassSerpentWard otherObject = (ShadowShamanMassSerpentWard) object;
        return otherObject.getKey().equals(getKey());
    }

}
