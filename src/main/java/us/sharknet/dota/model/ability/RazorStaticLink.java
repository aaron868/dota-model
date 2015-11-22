package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RazorStaticLink extends Ability {

    private static RazorStaticLink instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int[] abilityCooldown;
    private final int abilityManaCost;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] drain_duration;
    private final double[] drain_length;
    private final int[] drain_range;
    private final int[] drain_rate;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] radius;
    private final int[] speed;
    private final double[] vision_duration;
    private final int[] vision_radius;

    private RazorStaticLink() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 6;
        abilityCooldown = new int[]{32,30,28,26};
        abilityManaCost = 5;
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = "DOTA_UNIT_TARGET_HERO";
        iD = 583;
        key = "razor_static_link";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        drain_duration = new double[]{18.0,18.0,18.0,18.0};
        drain_length = new double[]{8.0,8.0,8.0,8.0};
        drain_range = new int[]{700,700,700,700};
        drain_rate = new int[]{7,14,21,28};
        localizedName = "Static Link";
        owningHeroShortKey = "razor";
        radius = new int[]{200,200,200,200};
        speed = new int[]{900,900,900,900};
        vision_duration = new double[]{3.34,3.34,3.34,3.34};
        vision_radius = new int[]{800,800,800,800};
    }

    public static RazorStaticLink instance() {
        if( instance == null ){
            instance = new RazorStaticLink();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String getAbilityUnitTargetType() {
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

    public double[] getDrainDuration() {
        return drain_duration;
    }

    public double[] getDrainLength() {
        return drain_length;
    }

    public int[] getDrainRange() {
        return drain_range;
    }

    public int[] getDrainRate() {
        return drain_rate;
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

    public int[] getSpeed() {
        return speed;
    }

    public double[] getVisionDuration() {
        return vision_duration;
    }

    public int[] getVisionRadius() {
        return vision_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof RazorStaticLink))
            return false;
        if (object == this)
            return true;
        RazorStaticLink otherObject = (RazorStaticLink) object;
        return otherObject.getKey().equals(getKey());
    }

}
