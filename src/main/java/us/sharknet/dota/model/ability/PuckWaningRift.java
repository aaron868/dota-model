package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PuckWaningRift extends Ability {

    private static PuckWaningRift instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final double[] silence_duration;

    private PuckWaningRift() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.1,0.1,0.1,0.1};
        abilityCooldown = new double[]{16,15,14,13};
        abilityDamage = new int[]{100,160,220,280};
        abilityManaCost = new int[]{100,110,120,130};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5071;
        key = "puck_waning_rift";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Waning Rift";
        ownerKey = "npc_dota_hero_puck";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{400,400,400,400};
        silence_duration = new double[]{0.75,1.5,2.25,3.0};
    }

    public static PuckWaningRift instance() {
        if( instance == null ){
            instance = new PuckWaningRift();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
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

    public double[] getSilenceDuration() {
        return silence_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PuckWaningRift))
            return false;
        if (object == this)
            return true;
        PuckWaningRift otherObject = (PuckWaningRift) object;
        return otherObject.getKey().equals(getKey());
    }

}
