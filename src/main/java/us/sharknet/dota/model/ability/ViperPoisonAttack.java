package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ViperPoisonAttack extends Ability {

    private static ViperPoisonAttack instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_attack_speed;
    private final int[] bonus_movement_speed;
    private final int[] damage;
    private final double[] duration;
    private final String localizedName;
    private final String owningHeroShortKey;

    private ViperPoisonAttack() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AUTOCAST","DOTA_ABILITY_BEHAVIOR_ATTACK"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 6;
        abilityCooldown = 0;
        abilityDamage = new int[]{0,0,0,0};
        abilityManaCost = new int[]{20,20,20,20};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5218;
        key = "viper_poison_attack";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        bonus_attack_speed = new int[]{-10,-20,-30,-40};
        bonus_movement_speed = new int[]{-10,-20,-30,-40};
        damage = new int[]{10,16,22,28};
        duration = new double[]{2.0,2.0,2.0,2.0};
        localizedName = "Poison Attack";
        owningHeroShortKey = "viper";
    }

    public static ViperPoisonAttack instance() {
        if( instance == null ){
            instance = new ViperPoisonAttack();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int[] getBonusAttackSpeed() {
        return bonus_attack_speed;
    }

    public int[] getBonusMovementSpeed() {
        return bonus_movement_speed;
    }

    public int[] getDamage() {
        return damage;
    }

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ViperPoisonAttack))
            return false;
        if (object == this)
            return true;
        ViperPoisonAttack otherObject = (ViperPoisonAttack) object;
        return otherObject.getKey().equals(getKey());
    }

}
