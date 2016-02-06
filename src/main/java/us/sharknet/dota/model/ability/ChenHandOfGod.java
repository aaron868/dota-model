package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ChenHandOfGod extends Ability {

    private static ChenHandOfGod instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] ancient_creeps_scepter;
    private final int[] heal_amount;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private ChenHandOfGod() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCooldown = new double[]{160.0,140.0,120.0};
        abilityManaCost = new int[]{200,300,400};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5331;
        key = "chen_hand_of_god";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        ancient_creeps_scepter = new int[]{1,2,3};
        heal_amount = new int[]{200,300,400};
        localizedName = "Hand Of God";
        ownerKey = "npc_dota_hero_chen";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static ChenHandOfGod instance() {
        if( instance == null ){
            instance = new ChenHandOfGod();
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

    public String getAbilityType() {
        return abilityType;
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

    public int[] getAncientCreepsScepter() {
        return ancient_creeps_scepter;
    }

    public int[] getHealAmount() {
        return heal_amount;
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
        if (!(object instanceof ChenHandOfGod))
            return false;
        if (object == this)
            return true;
        ChenHandOfGod otherObject = (ChenHandOfGod) object;
        return otherObject.getKey().equals(getKey());
    }

}
