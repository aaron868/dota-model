package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ShadowShamanVoodoo extends Ability {

    private static ShadowShamanVoodoo instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final String localizedName;
    private final int movespeed;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private ShadowShamanVoodoo() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{500,500,500,500};
        abilityCooldown = new double[]{13,13,13,13};
        abilityManaCost = new int[]{110,140,170,200};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5079;
        key = "shadow_shaman_voodoo";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = new double[]{1.25,2.0,2.75,3.5};
        localizedName = "Voodoo";
        movespeed = 100;
        ownerKey = "npc_dota_hero_shadow_shaman";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static ShadowShamanVoodoo instance() {
        if( instance == null ){
            instance = new ShadowShamanVoodoo();
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

    public double[] getDuration() {
        return duration;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovespeed() {
        return movespeed;
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
        if (!(object instanceof ShadowShamanVoodoo))
            return false;
        if (object == this)
            return true;
        ShadowShamanVoodoo otherObject = (ShadowShamanVoodoo) object;
        return otherObject.getKey().equals(getKey());
    }

}
