package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DeathProphetSpiritSiphon extends Ability {

    private static DeathProphetSpiritSiphon instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int charge_restore_time;
    private final int damage;
    private final double[] damage_pct;
    private final int haunt_duration;
    private final String localizedName;
    private final int[] max_charges;
    private final int[] movement_slow;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int siphon_buffer;

    private DeathProphetSpiritSiphon() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{.1,.1,.1,.1};
        abilityCastRange = new int[]{500,500,500,500};
        abilityCooldown = new double[]{0,0,0,0};
        abilityManaCost = new int[]{70,65,60,55};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5685;
        key = "death_prophet_spirit_siphon";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        charge_restore_time = 45;
        damage = 2;
        damage_pct = new double[]{1.0,2.0,3.0,4.0};
        haunt_duration = 5;
        localizedName = "Spirit Siphon";
        max_charges = new int[]{1,2,3,4};
        movement_slow = new int[]{5,10,15,20};
        ownerKey = "npc_dota_hero_death_prophet";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        siphon_buffer = 300;
    }

    public static DeathProphetSpiritSiphon instance() {
        if( instance == null ){
            instance = new DeathProphetSpiritSiphon();
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

    public int getChargeRestoreTime() {
        return charge_restore_time;
    }

    public int getDamage() {
        return damage;
    }

    public double[] getDamagePct() {
        return damage_pct;
    }

    public int getHauntDuration() {
        return haunt_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxCharges() {
        return max_charges;
    }

    public int[] getMovementSlow() {
        return movement_slow;
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

    public int getSiphonBuffer() {
        return siphon_buffer;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DeathProphetSpiritSiphon))
            return false;
        if (object == this)
            return true;
        DeathProphetSpiritSiphon otherObject = (DeathProphetSpiritSiphon) object;
        return otherObject.getKey().equals(getKey());
    }

}
