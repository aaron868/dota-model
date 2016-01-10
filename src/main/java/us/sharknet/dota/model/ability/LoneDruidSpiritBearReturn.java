package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LoneDruidSpiritBearReturn extends Ability {

    private static LoneDruidSpiritBearReturn instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int return_damage_cooldown;

    private LoneDruidSpiritBearReturn() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCooldown = new double[]{5,5,5,5};
        abilityManaCost = new int[]{0,0,0,0};
        iD = 5418;
        key = "lone_druid_spirit_bear_return";
        localizedName = "Spirit Bear Return";
        ownerKey = "npc_dota_lone_druid_bear";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
        return_damage_cooldown = 3;
    }

    public static LoneDruidSpiritBearReturn instance() {
        if( instance == null ){
            instance = new LoneDruidSpiritBearReturn();
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

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
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

    public int getReturnDamageCooldown() {
        return return_damage_cooldown;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LoneDruidSpiritBearReturn))
            return false;
        if (object == this)
            return true;
        LoneDruidSpiritBearReturn otherObject = (LoneDruidSpiritBearReturn) object;
        return otherObject.getKey().equals(getKey());
    }

}
