package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LeshracPulseNova extends Ability {

    private static LeshracPulseNova instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] damage;
    private final int[] damage_scepter;
    private final String localizedName;
    private final int[] mana_cost_per_second;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private LeshracPulseNova() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCooldown = new double[]{1.0,1.0,1.0,1.0};
        abilityManaCost = new int[]{70,90,110};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5244;
        key = "leshrac_pulse_nova";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = new int[]{100,130,160};
        damage_scepter = new int[]{160,190,220};
        localizedName = "Pulse Nova";
        mana_cost_per_second = new int[]{20,40,60};
        ownerKey = "npc_dota_hero_leshrac";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 450;
    }

    public static LeshracPulseNova instance() {
        if( instance == null ){
            instance = new LeshracPulseNova();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityType() {
        return abilityType;
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

    public int[] getDamage() {
        return damage;
    }

    public int[] getDamageScepter() {
        return damage_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getManaCostPerSecond() {
        return mana_cost_per_second;
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

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LeshracPulseNova))
            return false;
        if (object == this)
            return true;
        LeshracPulseNova otherObject = (LeshracPulseNova) object;
        return otherObject.getKey().equals(getKey());
    }

}
