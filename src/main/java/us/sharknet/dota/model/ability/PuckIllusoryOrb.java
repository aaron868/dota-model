package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PuckIllusoryOrb extends Ability {

    private static PuckIllusoryOrb instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final int max_distance;
    private final int orb_speed;
    private final int[] orb_vision;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;
    private final double[] vision_duration;

    private PuckIllusoryOrb() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.1,0.1,0.1,0.1};
        abilityCastRange = new int[]{3000,3000,3000,3000};
        abilityCooldown = new double[]{14,13,12,11};
        abilityDamage = new int[]{70,140,210,280};
        abilityManaCost = new int[]{80,100,120,140};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5069;
        key = "puck_illusory_orb";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Illusory Orb";
        max_distance = 1950;
        orb_speed = 650;
        orb_vision = new int[]{800,800,800,800};
        ownerKey = "npc_dota_hero_puck";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 225;
        vision_duration = new double[]{3.34,3.34,3.34,3.34};
    }

    public static PuckIllusoryOrb instance() {
        if( instance == null ){
            instance = new PuckIllusoryOrb();
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public String getSpellImmunityType() {
        return spellImmunityType;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxDistance() {
        return max_distance;
    }

    public int getOrbSpeed() {
        return orb_speed;
    }

    public int[] getOrbVision() {
        return orb_vision;
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

    public int getRadius() {
        return radius;
    }

    public double[] getVisionDuration() {
        return vision_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PuckIllusoryOrb))
            return false;
        if (object == this)
            return true;
        PuckIllusoryOrb otherObject = (PuckIllusoryOrb) object;
        return otherObject.getKey().equals(getKey());
    }

}
