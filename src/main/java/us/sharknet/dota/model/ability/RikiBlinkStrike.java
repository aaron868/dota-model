package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RikiBlinkStrike extends Ability {

    private static RikiBlinkStrike instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int tooltip_range;

    private RikiBlinkStrike() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = .4;
        abilityCastRange = 700;
        abilityCooldown = new int[]{16,12,8,4};
        abilityManaCost = 50;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_CUSTOM";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_CUSTOM";
        iD = 5143;
        key = "riki_blink_strike";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_damage = new int[]{20,40,60,80};
        localizedName = "Blink Strike";
        owningHeroShortKey = "riki";
        tooltip_range = 700;
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

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public String getLocalizedName() {
        return localizedName;
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
