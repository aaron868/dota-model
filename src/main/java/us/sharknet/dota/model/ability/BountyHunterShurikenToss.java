package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BountyHunterShurikenToss extends Ability {

    private static BountyHunterShurikenToss instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_damage;
    private final int bounce_aoe;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] speed;

    private BountyHunterShurikenToss() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{400,400,400,400};
        abilityCooldown = new double[]{10,10,10,10};
        abilityManaCost = new int[]{120,130,140,150};
        abilityModifierSupportValue = .1;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5285;
        key = "bounty_hunter_shuriken_toss";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_damage = new int[]{150,225,300,375};
        bounce_aoe = 1200;
        localizedName = "Shuriken Toss";
        ownerKey = "npc_dota_hero_bounty_hunter";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        speed = new int[]{1000,1000,1000,1000};
    }

    public static BountyHunterShurikenToss instance() {
        if( instance == null ){
            instance = new BountyHunterShurikenToss();
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int[] getBonusDamage() {
        return bonus_damage;
    }

    public int getBounceAoe() {
        return bounce_aoe;
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

    public int[] getSpeed() {
        return speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BountyHunterShurikenToss))
            return false;
        if (object == this)
            return true;
        BountyHunterShurikenToss otherObject = (BountyHunterShurikenToss) object;
        return otherObject.getKey().equals(getKey());
    }

}
