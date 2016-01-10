package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class RazorStaticLink extends Ability {

    private static RazorStaticLink instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] drain_duration;
    private final double[] drain_length;
    private final int drain_range_buffer;
    private final int[] drain_rate;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final int[] speed;
    private final double[] vision_duration;
    private final int[] vision_radius;

    private RazorStaticLink() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{32,30,28,26};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5083;
        key = "razor_static_link";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        drain_duration = new double[]{18.0,18.0,18.0,18.0};
        drain_length = new double[]{8.0,8.0,8.0,8.0};
        drain_range_buffer = 100;
        drain_rate = new int[]{7,14,21,28};
        localizedName = "Static Link";
        ownerKey = "npc_dota_hero_razor";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
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

    public int[] getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public double[] getDrainDuration() {
        return drain_duration;
    }

    public double[] getDrainLength() {
        return drain_length;
    }

    public int getDrainRangeBuffer() {
        return drain_range_buffer;
    }

    public int[] getDrainRate() {
        return drain_rate;
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
