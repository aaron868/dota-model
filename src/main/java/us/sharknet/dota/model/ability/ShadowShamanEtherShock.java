package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShadowShamanEtherShock extends Ability {

    private static ShadowShamanEtherShock instance;

    private final String abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final int[] end_distance;
    private final int[] end_radius;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] start_radius;
    private final int[] targets;

    private ShadowShamanEtherShock() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 600;
        abilityCooldown = new double[]{8.0,8.0,8.0,8.0};
        abilityManaCost = new int[]{95,105,135,160};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5078;
        key = "shadow_shaman_ether_shock";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{140,200,260,320};
        end_distance = new int[]{500,500,500,500};
        end_radius = new int[]{300,300,300,300};
        localizedName = "Ether Shock";
        owningHeroShortKey = "shadow_shaman";
        start_radius = new int[]{200,200,200,200};
        targets = new int[]{1,3,5,7};
    }

    public static ShadowShamanEtherShock instance() {
        if( instance == null ){
            instance = new ShadowShamanEtherShock();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
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

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public int[] getEndDistance() {
        return end_distance;
    }

    public int[] getEndRadius() {
        return end_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getStartRadius() {
        return start_radius;
    }

    public int[] getTargets() {
        return targets;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShadowShamanEtherShock))
            return false;
        if (object == this)
            return true;
        ShadowShamanEtherShock otherObject = (ShadowShamanEtherShock) object;
        return otherObject.getKey().equals(getKey());
    }

}
