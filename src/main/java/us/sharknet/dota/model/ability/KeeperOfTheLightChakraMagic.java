package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KeeperOfTheLightChakraMagic extends Ability {

    private static KeeperOfTheLightChakraMagic instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int abilityModifierSupportValue;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] cooldown_reduction;
    private final int duration;
    private final String localizedName;
    private final int[] mana_restore;
    private final String owningHeroShortKey;

    private KeeperOfTheLightChakraMagic() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{900,900,900,900};
        abilityCooldown = new double[]{19.0,18.0,17.0,16.0};
        abilityManaCost = new int[]{25,35,45,55};
        abilityModifierSupportValue = 3;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5473;
        key = "keeper_of_the_light_chakra_magic";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        cooldown_reduction = new double[]{2.0,3.0,4.0,5.0};
        duration = 12;
        localizedName = "Chakra Magic";
        mana_restore = new int[]{75,150,225,300};
        owningHeroShortKey = "keeper_of_the_light";
    }

    public static KeeperOfTheLightChakraMagic instance() {
        if( instance == null ){
            instance = new KeeperOfTheLightChakraMagic();
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

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public int getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitTargetTeam() {
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

    public double[] getCooldownReduction() {
        return cooldown_reduction;
    }

    public int getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getManaRestore() {
        return mana_restore;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof KeeperOfTheLightChakraMagic))
            return false;
        if (object == this)
            return true;
        KeeperOfTheLightChakraMagic otherObject = (KeeperOfTheLightChakraMagic) object;
        return otherObject.getKey().equals(getKey());
    }

}
