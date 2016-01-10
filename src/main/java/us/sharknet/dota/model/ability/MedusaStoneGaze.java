package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MedusaStoneGaze extends Ability {

    private static MedusaStoneGaze instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] bonus_physical_damage;
    private final double[] duration;
    private final double[] face_duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final int slow;
    private final double[] stone_duration;
    private final double vision_cone;

    private MedusaStoneGaze() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.4,0.4,0.4};
        abilityCastRange = new int[]{1000,1000,1000};
        abilityCooldown = new double[]{90.0,90.0,90.0};
        abilityManaCost = new int[]{200,200,200};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5507;
        key = "medusa_stone_gaze";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        bonus_physical_damage = new int[]{30,40,50};
        duration = new double[]{6.0,6.0,6.0};
        face_duration = new double[]{2.0,2.0,2.0};
        localizedName = "Stone Gaze";
        ownerKey = "npc_dota_hero_medusa";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{1000,1000,1000};
        slow = 50;
        stone_duration = new double[]{3.0,3.0,3.0};
        vision_cone = .8715;
    }

    public static MedusaStoneGaze instance() {
        if( instance == null ){
            instance = new MedusaStoneGaze();
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

    public int[] getBonusPhysicalDamage() {
        return bonus_physical_damage;
    }

    public double[] getDuration() {
        return duration;
    }

    public double[] getFaceDuration() {
        return face_duration;
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

    public int getSlow() {
        return slow;
    }

    public double[] getStoneDuration() {
        return stone_duration;
    }

    public double getVisionCone() {
        return vision_cone;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MedusaStoneGaze))
            return false;
        if (object == this)
            return true;
        MedusaStoneGaze otherObject = (MedusaStoneGaze) object;
        return otherObject.getKey().equals(getKey());
    }

}
