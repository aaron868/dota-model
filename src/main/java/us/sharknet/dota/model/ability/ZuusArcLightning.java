package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ZuusArcLightning extends Ability {

    private static ZuusArcLightning instance;

    private final String abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] jump_count;
    private final double[] jump_delay;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;

    private ZuusArcLightning() {
        abilityBehavior = "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET";
        abilityCastPoint = .2;
        abilityCastRange = 85;
        abilityCooldown = new double[]{1.75,1.75,1.75,1.75};
        abilityDamage = new int[]{85,100,115,145};
        abilityManaCost = new int[]{65,70,75,80};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 511;
        key = "zuus_arc_lightning";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        jump_count = new int[]{5,7,9,15};
        jump_delay = new double[]{0.25,0.25,0.25,0.25};
        localizedName = "Arc Lightning";
        owningHeroShortKey = "zuus";
        radius = new int[]{500,500,500,500};
    }

    public static ZuusArcLightning instance() {
        if( instance == null ){
            instance = new ZuusArcLightning();
        }
        return instance;
    }

    public String getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
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

    public String getAbilityUnitTargetTeam() {
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

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
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
