package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class VengefulspiritNetherSwap extends Ability {

    private static VengefulspiritNetherSwap instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int illusion_damage_in_pct;
    private final int illusion_damage_out_pct;
    private final String localizedName;
    private final int nether_swap_cooldown_scepter;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] tooltip_range;

    private VengefulspiritNetherSwap() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = new int[]{700,950,1200};
        abilityCooldown = new double[]{45,45,45,45};
        abilityManaCost = new int[]{100,150,200};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_CUSTOM"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_CUSTOM"};
        iD = 5125;
        key = "vengefulspirit_nether_swap";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        illusion_damage_in_pct = 50;
        illusion_damage_out_pct = 5;
        localizedName = "Nether Swap";
        nether_swap_cooldown_scepter = 1;
        ownerKey = "npc_dota_hero_vengefulspirit";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        tooltip_range = new int[]{700,950,1200};
    }

    public static VengefulspiritNetherSwap instance() {
        if( instance == null ){
            instance = new VengefulspiritNetherSwap();
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

    public int getIllusionDamageInPct() {
        return illusion_damage_in_pct;
    }

    public int getIllusionDamageOutPct() {
        return illusion_damage_out_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getNetherSwapCooldownScepter() {
        return nether_swap_cooldown_scepter;
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

    public int[] getTooltipRange() {
        return tooltip_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VengefulspiritNetherSwap))
            return false;
        if (object == this)
            return true;
        VengefulspiritNetherSwap otherObject = (VengefulspiritNetherSwap) object;
        return otherObject.getKey().equals(getKey());
    }

}
