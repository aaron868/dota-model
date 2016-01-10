package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ZuusArcLightning extends Ability {

    private static ZuusArcLightning instance;

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
    private final int[] jump_count;
    private final double[] jump_delay;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;

    private ZuusArcLightning() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.2,.2,.2,.2};
        abilityCastRange = new int[]{850,850,850,850};
        abilityCooldown = new double[]{1.75,1.75,1.75,1.75};
        abilityDamage = new int[]{85,100,115,145};
        abilityManaCost = new int[]{65,70,75,80};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5110;
        key = "zuus_arc_lightning";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        jump_count = new int[]{5,7,9,15};
        jump_delay = new double[]{0.25,0.25,0.25,0.25};
        localizedName = "Arc Lightning";
        ownerKey = "npc_dota_hero_zuus";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{500,500,500,500};
    }

    public static ZuusArcLightning instance() {
        if( instance == null ){
            instance = new ZuusArcLightning();
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

    public int[] getJumpCount() {
        return jump_count;
    }

    public double[] getJumpDelay() {
        return jump_delay;
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

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ZuusArcLightning))
            return false;
        if (object == this)
            return true;
        ZuusArcLightning otherObject = (ZuusArcLightning) object;
        return otherObject.getKey().equals(getKey());
    }

}
