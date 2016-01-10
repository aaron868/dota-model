package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NyxAssassinImpale extends Ability {

    private static NyxAssassinImpale instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int cooldown_upgrade;
    private final double[] duration;
    private final int length;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] speed;
    private final int[] width;

    private NyxAssassinImpale() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{.4,.4,.4,.4};
        abilityCastRange = new int[]{700,700,700,700};
        abilityCooldown = new double[]{13,13,13,13};
        abilityDamage = new int[]{80,140,200,260};
        abilityManaCost = new int[]{95,115,135,155};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5462;
        key = "nyx_assassin_impale";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        cooldown_upgrade = 7;
        duration = new double[]{1.6,2.0,2.4,2.8};
        length = 700;
        localizedName = "Impale";
        ownerKey = "npc_dota_hero_nyx_assassin";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        speed = new int[]{1600,1600,1600,1600};
        width = new int[]{125,125,125,125};
    }

    public static NyxAssassinImpale instance() {
        if( instance == null ){
            instance = new NyxAssassinImpale();
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

    public int[] getAbilityDamage() {
        return abilityDamage;
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

    public int getCooldownUpgrade() {
        return cooldown_upgrade;
    }

    public double[] getDuration() {
        return duration;
    }

    public int getLength() {
        return length;
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

    public int[] getSpeed() {
        return speed;
    }

    public int[] getWidth() {
        return width;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NyxAssassinImpale))
            return false;
        if (object == this)
            return true;
        NyxAssassinImpale otherObject = (NyxAssassinImpale) object;
        return otherObject.getKey().equals(getKey());
    }

}
