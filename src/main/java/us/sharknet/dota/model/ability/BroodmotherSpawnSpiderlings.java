package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BroodmotherSpawnSpiderlings extends Ability {

    private static BroodmotherSpawnSpiderlings instance;

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
    private final double[] buff_duration;
    private final int[] count;
    private final int[] damage;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int projectile_speed;
    private final double[] spiderling_duration;

    private BroodmotherSpawnSpiderlings() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.2,0.2,0.2,0.2};
        abilityCastRange = new int[]{700,700,700,700};
        abilityCooldown = new double[]{10.0,10.0,10.0,10.0};
        abilityManaCost = new int[]{120,120,120,120};
        abilityModifierSupportValue = 0;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5279;
        key = "broodmother_spawn_spiderlings";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        buff_duration = new double[]{2.0,2.0,2.0,2.0};
        count = new int[]{1,2,3,4};
        damage = new int[]{70,140,210,280};
        localizedName = "Spawn Spiderlings";
        ownerKey = "npc_dota_hero_broodmother";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        projectile_speed = 1200;
        spiderling_duration = new double[]{60.0,60.0,60.0,60.0};
    }

    public static BroodmotherSpawnSpiderlings instance() {
        if( instance == null ){
            instance = new BroodmotherSpawnSpiderlings();
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

    public double[] getBuffDuration() {
        return buff_duration;
    }

    public int[] getCount() {
        return count;
    }

    public int[] getDamage() {
        return damage;
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

    public int getProjectileSpeed() {
        return projectile_speed;
    }

    public double[] getSpiderlingDuration() {
        return spiderling_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BroodmotherSpawnSpiderlings))
            return false;
        if (object == this)
            return true;
        BroodmotherSpawnSpiderlings otherObject = (BroodmotherSpawnSpiderlings) object;
        return otherObject.getKey().equals(getKey());
    }

}
