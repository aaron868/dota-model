package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OraclePurifyingFlames extends Ability {

    private static OraclePurifyingFlames instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final int duration;
    private final double[] heal_per_second;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int tick_rate;
    private final int[] total_heal_tooltip;

    private OraclePurifyingFlames() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.3,.3,.3,.3};
        abilityCastRange = new int[]{750,750,750,750};
        abilityCooldown = new double[]{2.25,2.25,2.25,2.25};
        abilityManaCost = new int[]{50,60,70,80};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_MAGIC_IMMUNE_ALLIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY","DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5639;
        key = "oracle_purifying_flames";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{90,180,270,360};
        duration = 9;
        heal_per_second = new double[]{11.0,22.0,33.0,44.0};
        localizedName = "Purifying Flames";
        ownerKey = "npc_dota_hero_oracle";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        tick_rate = 1;
        total_heal_tooltip = new int[]{99,198,297,396};
    }

    public static OraclePurifyingFlames instance() {
        if( instance == null ){
            instance = new OraclePurifyingFlames();
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

    public int getDuration() {
        return duration;
    }

    public double[] getHealPerSecond() {
        return heal_per_second;
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

    public int getTickRate() {
        return tick_rate;
    }

    public int[] getTotalHealTooltip() {
        return total_heal_tooltip;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OraclePurifyingFlames))
            return false;
        if (object == this)
            return true;
        OraclePurifyingFlames otherObject = (OraclePurifyingFlames) object;
        return otherObject.getKey().equals(getKey());
    }

}
