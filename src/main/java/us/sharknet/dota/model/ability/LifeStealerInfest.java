package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LifeStealerInfest extends Ability {

    private static LifeStealerInfest instance;

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
    private final int cast_range_scepter;
    private final int cooldown_scepter;
    private final int[] damage;
    private final int damage_increase_pct;
    private final int infest_scepter_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;

    private LifeStealerInfest() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK"};
        abilityCastPoint = new double[]{.2,.2,.2,.2};
        abilityCastRange = new int[]{150,150,150,150};
        abilityCooldown = new double[]{100,75,50};
        abilityManaCost = new int[]{50,50,50};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_CUSTOM"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_CUSTOM"};
        iD = 5252;
        key = "life_stealer_infest";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        cast_range_scepter = 500;
        cooldown_scepter = 25;
        damage = new int[]{150,275,400};
        damage_increase_pct = 5;
        infest_scepter_duration = 8;
        localizedName = "Infest";
        ownerKey = "npc_dota_hero_life_stealer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{700,700,700};
    }

    public static LifeStealerInfest instance() {
        if( instance == null ){
            instance = new LifeStealerInfest();
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

    public int getCastRangeScepter() {
        return cast_range_scepter;
    }

    public int getCooldownScepter() {
        return cooldown_scepter;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getDamageIncreasePct() {
        return damage_increase_pct;
    }

    public int getInfestScepterDuration() {
        return infest_scepter_duration;
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

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LifeStealerInfest))
            return false;
        if (object == this)
            return true;
        LifeStealerInfest otherObject = (LifeStealerInfest) object;
        return otherObject.getKey().equals(getKey());
    }

}
