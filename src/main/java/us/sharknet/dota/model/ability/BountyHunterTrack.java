package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BountyHunterTrack extends Ability {

    private static BountyHunterTrack instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] aura_radius;
    private final int[] bonus_gold;
    private final int[] bonus_gold_radius;
    private final int[] bonus_gold_self;
    private final int[] bonus_move_speed_pct;
    private final int cast_range_tooltip;
    private final double[] duration;
    private final double[] gold_steal;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private BountyHunterTrack() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = new int[]{1200,1200,1200,1200};
        abilityCooldown = new double[]{4,4,4,4};
        abilityManaCost = new int[]{50,50,50,50};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES","DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5288;
        key = "bounty_hunter_track";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        aura_radius = new int[]{900,900,900};
        bonus_gold = new int[]{40,80,120};
        bonus_gold_radius = new int[]{925,925,925};
        bonus_gold_self = new int[]{200,275,350};
        bonus_move_speed_pct = new int[]{20,20,20};
        cast_range_tooltip = 1200;
        duration = new double[]{30.0,30.0,30.0};
        gold_steal = new double[]{0.3,0.4,0.5};
        localizedName = "Track";
        ownerKey = "npc_dota_hero_bounty_hunter";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static BountyHunterTrack instance() {
        if( instance == null ){
            instance = new BountyHunterTrack();
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

    public int[] getAuraRadius() {
        return aura_radius;
    }

    public int[] getBonusGold() {
        return bonus_gold;
    }

    public int[] getBonusGoldRadius() {
        return bonus_gold_radius;
    }

    public int[] getBonusGoldSelf() {
        return bonus_gold_self;
    }

    public int[] getBonusMoveSpeedPct() {
        return bonus_move_speed_pct;
    }

    public int getCastRangeTooltip() {
        return cast_range_tooltip;
    }

    public double[] getDuration() {
        return duration;
    }

    public double[] getGoldSteal() {
        return gold_steal;
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
        if (!(object instanceof BountyHunterTrack))
            return false;
        if (object == this)
            return true;
        BountyHunterTrack otherObject = (BountyHunterTrack) object;
        return otherObject.getKey().equals(getKey());
    }

}
