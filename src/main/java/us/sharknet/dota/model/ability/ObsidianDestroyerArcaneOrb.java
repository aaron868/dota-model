package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ObsidianDestroyerArcaneOrb extends Ability {

    private static ObsidianDestroyerArcaneOrb instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] illusion_damage;
    private final int[] int_steal;
    private final int int_steal_duration;
    private final String localizedName;
    private final double[] mana_pool_damage_pct;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private ObsidianDestroyerArcaneOrb() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_AUTOCAST","DOTA_ABILITY_BEHAVIOR_ATTACK"};
        abilityCastRange = new int[]{450,450,450,450};
        abilityCooldown = new double[]{0,0,0,0};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5391;
        key = "obsidian_destroyer_arcane_orb";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        illusion_damage = new int[]{100,200,300,400};
        int_steal = new int[]{2,3,4,5};
        int_steal_duration = 5;
        localizedName = "Arcane Orb";
        mana_pool_damage_pct = new double[]{6.0,7.0,8.0,9.0};
        ownerKey = "npc_dota_hero_obsidian_destroyer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static ObsidianDestroyerArcaneOrb instance() {
        if( instance == null ){
            instance = new ObsidianDestroyerArcaneOrb();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public int[] getIllusionDamage() {
        return illusion_damage;
    }

    public int[] getIntSteal() {
        return int_steal;
    }

    public int getIntStealDuration() {
        return int_steal_duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double[] getManaPoolDamagePct() {
        return mana_pool_damage_pct;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ObsidianDestroyerArcaneOrb))
            return false;
        if (object == this)
            return true;
        ObsidianDestroyerArcaneOrb otherObject = (ObsidianDestroyerArcaneOrb) object;
        return otherObject.getKey().equals(getKey());
    }

}
