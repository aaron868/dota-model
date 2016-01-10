package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MedusaManaShield extends Ability {

    private static MedusaManaShield instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final int absorption_tooltip;
    private final double[] damage_per_mana;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private MedusaManaShield() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        iD = 5506;
        key = "medusa_mana_shield";
        absorption_tooltip = 6;
        damage_per_mana = new double[]{1.6,1.9,2.2,2.5};
        localizedName = "Mana Shield";
        ownerKey = "npc_dota_hero_medusa";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static MedusaManaShield instance() {
        if( instance == null ){
            instance = new MedusaManaShield();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getAbsorptionTooltip() {
        return absorption_tooltip;
    }

    public double[] getDamagePerMana() {
        return damage_per_mana;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MedusaManaShield))
            return false;
        if (object == this)
            return true;
        MedusaManaShield otherObject = (MedusaManaShield) object;
        return otherObject.getKey().equals(getKey());
    }

}
