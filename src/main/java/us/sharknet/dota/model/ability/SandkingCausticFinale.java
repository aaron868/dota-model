package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SandkingCausticFinale extends Ability {

    private static SandkingCausticFinale instance;

    private final String[] abilityBehavior;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] caustic_finale_damage;
    private final int[] caustic_finale_damage_expire_tooltip;
    private final int caustic_finale_damage_reduced;
    private final int caustic_finale_duration;
    private final int caustic_finale_expire_dmg_pct_tooltip;
    private final int caustic_finale_radius;
    private final int caustic_finale_slow;
    private final int caustic_finale_slow_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private SandkingCausticFinale() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE"};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5104;
        key = "sandking_caustic_finale";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        caustic_finale_damage = new int[]{90,130,170,220};
        caustic_finale_damage_expire_tooltip = new int[]{45,65,85,110};
        caustic_finale_damage_reduced = 5;
        caustic_finale_duration = 6;
        caustic_finale_expire_dmg_pct_tooltip = 50;
        caustic_finale_radius = 400;
        caustic_finale_slow = -30;
        caustic_finale_slow_duration = 3;
        localizedName = "Caustic Finale";
        ownerKey = "npc_dota_hero_sand_king";
        ownerType = AbilityOwnerType.Hero;
        passive = true;
        placeholder = false;
    }

    public static SandkingCausticFinale instance() {
        if( instance == null ){
            instance = new SandkingCausticFinale();
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

    public int[] getCausticFinaleDamage() {
        return caustic_finale_damage;
    }

    public int[] getCausticFinaleDamageExpireTooltip() {
        return caustic_finale_damage_expire_tooltip;
    }

    public int getCausticFinaleDamageReduced() {
        return caustic_finale_damage_reduced;
    }

    public int getCausticFinaleDuration() {
        return caustic_finale_duration;
    }

    public int getCausticFinaleExpireDmgPctTooltip() {
        return caustic_finale_expire_dmg_pct_tooltip;
    }

    public int getCausticFinaleRadius() {
        return caustic_finale_radius;
    }

    public int getCausticFinaleSlow() {
        return caustic_finale_slow;
    }

    public int getCausticFinaleSlowDuration() {
        return caustic_finale_slow_duration;
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
        if (!(object instanceof SandkingCausticFinale))
            return false;
        if (object == this)
            return true;
        SandkingCausticFinale otherObject = (SandkingCausticFinale) object;
        return otherObject.getKey().equals(getKey());
    }

}
