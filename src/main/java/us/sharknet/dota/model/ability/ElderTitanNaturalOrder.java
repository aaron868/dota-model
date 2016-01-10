package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ElderTitanNaturalOrder extends Ability {

    private static ElderTitanNaturalOrder instance;

    private final String[] abilityBehavior;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] armor_reduction_pct;
    private final String localizedName;
    private final int[] magic_resistance_pct;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;

    private ElderTitanNaturalOrder() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_AURA"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5593;
        key = "elder_titan_natural_order";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        armor_reduction_pct = new int[]{40,60,80,100};
        localizedName = "Natural Order";
        magic_resistance_pct = new int[]{12,19,26,33};
        ownerKey = "npc_dota_hero_elder_titan";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
        radius = new int[]{275,275,275,275};
    }

    public static ElderTitanNaturalOrder instance() {
        if( instance == null ){
            instance = new ElderTitanNaturalOrder();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public int[] getArmorReductionPct() {
        return armor_reduction_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMagicResistancePct() {
        return magic_resistance_pct;
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

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ElderTitanNaturalOrder))
            return false;
        if (object == this)
            return true;
        ElderTitanNaturalOrder otherObject = (ElderTitanNaturalOrder) object;
        return otherObject.getKey().equals(getKey());
    }

}
