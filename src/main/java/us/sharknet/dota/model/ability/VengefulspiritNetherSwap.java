package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class VengefulspiritNetherSwap extends Ability {

    private static VengefulspiritNetherSwap instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final int nether_swap_cooldown_scepter;
    private final String owningHeroShortKey;
    private final int[] tooltip_range;

    private VengefulspiritNetherSwap() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = new int[]{700,950,1200};
        abilityCooldown = 45;
        abilityManaCost = new int[]{100,150,200};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CUSTOM";
        fightRecapLevel = 2;
        iD = 5125;
        key = "vengefulspirit_nether_swap";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        localizedName = "Nether Swap";
        nether_swap_cooldown_scepter = 1;
        owningHeroShortKey = "vengefulspirit";
        tooltip_range = new int[]{700,950,1200};
    }

    public static VengefulspiritNetherSwap instance() {
        if( instance == null ){
            instance = new VengefulspiritNetherSwap();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public int getNetherSwapCooldownScepter() {
        return nether_swap_cooldown_scepter;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
