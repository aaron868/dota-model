package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class OmniknightDegenAura extends Ability {

    private static OmniknightDegenAura instance;

    private final String[] abilityBehavior;
    private final int abilityCastRange;
    private final String abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] attack_bonus_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int radius;
    private final int[] speed_bonus;

    private OmniknightDegenAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_AURA"};
        abilityCastRange = 350;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        iD = 5265;
        key = "omniknight_degen_aura";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        attack_bonus_tooltip = new int[]{-10,-18,-26,-34};
        localizedName = "Degen Aura";
        owningHeroShortKey = "omniknight";
        radius = 350;
        speed_bonus = new int[]{-10,-18,-26,-34};
    }

    public static OmniknightDegenAura instance() {
        if( instance == null ){
            instance = new OmniknightDegenAura();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
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

    public int[] getAttackBonusTooltip() {
        return attack_bonus_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getRadius() {
        return radius;
    }

    public int[] getSpeedBonus() {
        return speed_bonus;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof OmniknightDegenAura))
            return false;
        if (object == this)
            return true;
        OmniknightDegenAura otherObject = (OmniknightDegenAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
