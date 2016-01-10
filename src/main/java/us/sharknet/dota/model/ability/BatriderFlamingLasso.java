package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BatriderFlamingLasso extends Ability {

    private static BatriderFlamingLasso instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int break_distance;
    private final int[] drag_distance;
    private final double[] duration;
    private final int grab_radius;
    private final int grab_radius_scepter;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int scepter_damage;

    private BatriderFlamingLasso() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.2,0.2,0.2,0.2};
        abilityCastRange = new int[]{100,100,100,100};
        abilityCooldown = new double[]{90.0,75.0,60.0};
        abilityManaCost = new int[]{225,225,225,225};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5323;
        key = "batrider_flaming_lasso";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        break_distance = 425;
        drag_distance = new int[]{300,300,300};
        duration = new double[]{3.0,3.5,4.0};
        grab_radius = 400;
        grab_radius_scepter = 400;
        localizedName = "Flaming Lasso";
        ownerKey = "npc_dota_hero_batrider";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        scepter_damage = 1;
    }

    public static BatriderFlamingLasso instance() {
        if( instance == null ){
            instance = new BatriderFlamingLasso();
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

    public String getAbilityType() {
        return abilityType;
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

    public int getBreakDistance() {
        return break_distance;
    }

    public int[] getDragDistance() {
        return drag_distance;
    }

    public double[] getDuration() {
        return duration;
    }

    public int getGrabRadius() {
        return grab_radius;
    }

    public int getGrabRadiusScepter() {
        return grab_radius_scepter;
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

    public int getScepterDamage() {
        return scepter_damage;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BatriderFlamingLasso))
            return false;
        if (object == this)
            return true;
        BatriderFlamingLasso otherObject = (BatriderFlamingLasso) object;
        return otherObject.getKey().equals(getKey());
    }

}
