package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NagaSirenEnsnare extends Ability {

    private static NagaSirenEnsnare instance;

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
    private final double[] duration;
    private final int[] fake_ensnare_distance;
    private final String localizedName;
    private final int[] net_speed;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private NagaSirenEnsnare() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.65,.65,.65,.65};
        abilityCastRange = new int[]{650,650,650,650};
        abilityCooldown = new double[]{12,12,12,12};
        abilityManaCost = new int[]{90,100,110,120};
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5468;
        key = "naga_siren_ensnare";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        duration = new double[]{2.0,3.0,4.0,5.0};
        fake_ensnare_distance = new int[]{900,900,900,900};
        localizedName = "Ensnare";
        net_speed = new int[]{1500,1500,1500,1500};
        ownerKey = "npc_dota_hero_naga_siren";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static NagaSirenEnsnare instance() {
        if( instance == null ){
            instance = new NagaSirenEnsnare();
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

    public double[] getDuration() {
        return duration;
    }

    public int[] getFakeEnsnareDistance() {
        return fake_ensnare_distance;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getNetSpeed() {
        return net_speed;
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
        if (!(object instanceof NagaSirenEnsnare))
            return false;
        if (object == this)
            return true;
        NagaSirenEnsnare otherObject = (NagaSirenEnsnare) object;
        return otherObject.getKey().equals(getKey());
    }

}
