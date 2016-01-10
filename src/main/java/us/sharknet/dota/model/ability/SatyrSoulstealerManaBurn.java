package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class SatyrSoulstealerManaBurn extends Ability {

    private static SatyrSoulstealerManaBurn instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final int burn_amount;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private SatyrSoulstealerManaBurn() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.5,.5,.5,.5};
        abilityCastRange = new int[]{600,600,600,600};
        abilityCooldown = new double[]{18,18,18,18};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5315;
        key = "satyr_soulstealer_mana_burn";
        burn_amount = 100;
        localizedName = "Mana Burn";
        ownerKey = "npc_dota_neutral_satyr_soulstealer";
        ownerType = AbilityOwnerType.Neutral;
        passive = false;
        placeholder = false;
    }

    public static SatyrSoulstealerManaBurn instance() {
        if( instance == null ){
            instance = new SatyrSoulstealerManaBurn();
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

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getBurnAmount() {
        return burn_amount;
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
        if (!(object instanceof SatyrSoulstealerManaBurn))
            return false;
        if (object == this)
            return true;
        SatyrSoulstealerManaBurn otherObject = (SatyrSoulstealerManaBurn) object;
        return otherObject.getKey().equals(getKey());
    }

}
