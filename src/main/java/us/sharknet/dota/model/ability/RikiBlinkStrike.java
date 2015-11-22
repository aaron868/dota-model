package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RikiBlinkStrike extends Ability {

    private static RikiBlinkStrike instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage;
    private final int charge_restore_time;
    private final String localizedName;
    private final int[] max_charges;
    private final String owningHeroShortKey;
    private final int tooltip_range;

    private RikiBlinkStrike() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = .4;
        abilityCastRange = 800;
        abilityCooldown = 0;
        abilityManaCost = 40;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CUSTOM";
        iD = 5143;
        key = "riki_blink_strike";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_damage = new int[]{40,70,100};
        charge_restore_time = 35;
        localizedName = "Blink Strike";
        max_charges = new int[]{4,5,6};
        owningHeroShortKey = "riki";
        tooltip_range = 800;
    }

    public static RikiBlinkStrike instance() {
        if( instance == null ){
            instance = new RikiBlinkStrike();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
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

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public int getChargeRestoreTime() {
        return charge_restore_time;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxCharges() {
        return max_charges;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getTooltipRange() {
        return tooltip_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RikiBlinkStrike))
            return false;
        if (object == this)
            return true;
        RikiBlinkStrike otherObject = (RikiBlinkStrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
