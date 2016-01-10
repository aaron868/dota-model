package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TemplarAssassinPsiBlades extends Ability {

    private static TemplarAssassinPsiBlades instance;

    private final String[] abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] attack_spill_range;
    private final int[] attack_spill_width;
    private final int[] bonus_attack_range;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private TemplarAssassinPsiBlades() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        iD = 5196;
        key = "templar_assassin_psi_blades";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        attack_spill_range = new int[]{590,630,670,710};
        attack_spill_width = new int[]{68,68,68,68};
        bonus_attack_range = new int[]{60,120,180,240};
        localizedName = "Psi Blades";
        ownerKey = "npc_dota_hero_templar_assassin";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static TemplarAssassinPsiBlades instance() {
        if( instance == null ){
            instance = new TemplarAssassinPsiBlades();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
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

    public int[] getAttackSpillRange() {
        return attack_spill_range;
    }

    public int[] getAttackSpillWidth() {
        return attack_spill_width;
    }

    public int[] getBonusAttackRange() {
        return bonus_attack_range;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TemplarAssassinPsiBlades))
            return false;
        if (object == this)
            return true;
        TemplarAssassinPsiBlades otherObject = (TemplarAssassinPsiBlades) object;
        return otherObject.getKey().equals(getKey());
    }

}
