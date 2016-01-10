package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DoomBringerDoom extends Ability {

    private static DoomBringerDoom instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final int[] damage_scepter;
    private final int[] deniable_pct;
    private final int duration;
    private final int duration_scepter;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private DoomBringerDoom() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.5,.5,.5,.5};
        abilityCastRange = new int[]{550,550,550};
        abilityCooldown = new double[]{125,125,125,125};
        abilityManaCost = new int[]{150,200,250};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES","DOTA_UNIT_TARGET_FLAG_NOT_ANCIENTS"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5342;
        key = "doom_bringer_doom";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        damage = new int[]{20,35,50};
        damage_scepter = new int[]{20,35,50};
        deniable_pct = new int[]{25,25,25};
        duration = 15;
        duration_scepter = 16;
        localizedName = "Doom";
        ownerKey = "npc_dota_hero_doom_bringer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static DoomBringerDoom instance() {
        if( instance == null ){
            instance = new DoomBringerDoom();
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

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
    }

    public String[] getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
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

    public int[] getDamageScepter() {
        return damage_scepter;
    }

    public int[] getDeniablePct() {
        return deniable_pct;
    }

    public int getDuration() {
        return duration;
    }

    public int getDurationScepter() {
        return duration_scepter;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DoomBringerDoom))
            return false;
        if (object == this)
            return true;
        DoomBringerDoom otherObject = (DoomBringerDoom) object;
        return otherObject.getKey().equals(getKey());
    }

}
