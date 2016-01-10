package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class CentaurHoofStomp extends Ability {

    private static CentaurHoofStomp instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
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
    private final int radius;
    private final int[] stomp_damage;
    private final double[] stun_duration;

    private CentaurHoofStomp() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCooldown = new double[]{13.0,13.0,13.0,13.0};
        abilityManaCost = new int[]{130,130,130,130};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5514;
        key = "centaur_hoof_stomp";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Hoof Stomp";
        ownerKey = "npc_dota_hero_centaur";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 315;
        stomp_damage = new int[]{100,150,200,250};
        stun_duration = new double[]{2.0,2.25,2.5,2.75};
    }

    public static CentaurHoofStomp instance() {
        if( instance == null ){
            instance = new CentaurHoofStomp();
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

    public int getRadius() {
        return radius;
    }

    public int[] getStompDamage() {
        return stomp_damage;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof CentaurHoofStomp))
            return false;
        if (object == this)
            return true;
        CentaurHoofStomp otherObject = (CentaurHoofStomp) object;
        return otherObject.getKey().equals(getKey());
    }

}
