package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LichChainFrost extends Ability {

    private static LichChainFrost instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] cast_range_scepter;
    private final int[] damage;
    private final int[] damage_scepter;
    private final int[] jump_range;
    private final int[] jumps;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int projectile_speed;
    private final int slow_attack_speed;
    private final double[] slow_duration;
    private final int slow_movement_speed;
    private final int[] vision_radius;

    private LichChainFrost() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = new int[]{750,750,750,750};
        abilityCooldown = new double[]{120.0,90.0,60.0};
        abilityManaCost = new int[]{200,325,500};
        abilityModifierSupportValue = 0;
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5137;
        key = "lich_chain_frost";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        cast_range_scepter = new int[]{850,850,850};
        damage = new int[]{280,370,460};
        damage_scepter = new int[]{370,460,550};
        jump_range = new int[]{575,575,575};
        jumps = new int[]{10,10,10};
        localizedName = "Chain Frost";
        ownerKey = "npc_dota_hero_lich";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        projectile_speed = 850;
        slow_attack_speed = -30;
        slow_duration = new double[]{4.0,4.0,4.0};
        slow_movement_speed = -30;
        vision_radius = new int[]{1000,1000,1000};
    }

    public static LichChainFrost instance() {
        if( instance == null ){
            instance = new LichChainFrost();
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

    public String getAbilityType() {
        return abilityType;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int[] getCastRangeScepter() {
        return cast_range_scepter;
    }

    public int[] getDamage() {
        return damage;
    }

    public int[] getDamageScepter() {
        return damage_scepter;
    }

    public int[] getJumpRange() {
        return jump_range;
    }

    public int[] getJumps() {
        return jumps;
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

    public int getSlowAttackSpeed() {
        return slow_attack_speed;
    }

    public double[] getSlowDuration() {
        return slow_duration;
    }

    public int getSlowMovementSpeed() {
        return slow_movement_speed;
    }

    public int[] getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LichChainFrost))
            return false;
        if (object == this)
            return true;
        LichChainFrost otherObject = (LichChainFrost) object;
        return otherObject.getKey().equals(getKey());
    }

}
