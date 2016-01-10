package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PhantomAssassinPhantomStrike extends Ability {

    private static PhantomAssassinPhantomStrike instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int bonus_attack_speed;
    private final int bonus_max_attack_count;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] tooltip_range;

    private PhantomAssassinPhantomStrike() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{1000,1000,1000,1000};
        abilityCooldown = new double[]{14,11,8,5};
        abilityDuration = new double[]{3,3,3,3};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_CUSTOM"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_CUSTOM"};
        iD = 5191;
        key = "phantom_assassin_phantom_strike";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_attack_speed = 130;
        bonus_max_attack_count = 4;
        localizedName = "Phantom Strike";
        ownerKey = "npc_dota_hero_phantom_assassin";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        tooltip_range = new int[]{1000,1000,1000,1000};
    }

    public static PhantomAssassinPhantomStrike instance() {
        if( instance == null ){
            instance = new PhantomAssassinPhantomStrike();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int getBonusMaxAttackCount() {
        return bonus_max_attack_count;
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

    public int[] getTooltipRange() {
        return tooltip_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PhantomAssassinPhantomStrike))
            return false;
        if (object == this)
            return true;
        PhantomAssassinPhantomStrike otherObject = (PhantomAssassinPhantomStrike) object;
        return otherObject.getKey().equals(getKey());
    }

}
