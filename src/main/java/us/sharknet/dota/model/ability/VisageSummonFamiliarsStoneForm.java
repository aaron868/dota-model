package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class VisageSummonFamiliarsStoneForm extends Ability {

    private static VisageSummonFamiliarsStoneForm instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] hp_regen;
    private final String localizedName;
    private final int max_damage_charges;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int stone_duration;
    private final int[] stun_damage;
    private final int stun_delay;
    private final double[] stun_duration;
    private final int stun_radius;

    private VisageSummonFamiliarsStoneForm() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_AOE"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{160,160,160,160};
        abilityCooldown = new double[]{26,26,26,26};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5484;
        key = "visage_summon_familiars_stone_form";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        hp_regen = new double[]{50.0,68.7,87.5};
        localizedName = "Summon Familiars Stone Form";
        max_damage_charges = 7;
        ownerKey = "npc_dota_hero_visage";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        stone_duration = 8;
        stun_damage = new int[]{60,100,140};
        stun_delay = 1;
        stun_duration = new double[]{1.0,1.25,1.5};
        stun_radius = 350;
    }

    public static VisageSummonFamiliarsStoneForm instance() {
        if( instance == null ){
            instance = new VisageSummonFamiliarsStoneForm();
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

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public double[] getHpRegen() {
        return hp_regen;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxDamageCharges() {
        return max_damage_charges;
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

    public int getStoneDuration() {
        return stone_duration;
    }

    public int[] getStunDamage() {
        return stun_damage;
    }

    public int getStunDelay() {
        return stun_delay;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }

    public int getStunRadius() {
        return stun_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VisageSummonFamiliarsStoneForm))
            return false;
        if (object == this)
            return true;
        VisageSummonFamiliarsStoneForm otherObject = (VisageSummonFamiliarsStoneForm) object;
        return otherObject.getKey().equals(getKey());
    }

}
