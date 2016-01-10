package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KeeperOfTheLightRecall extends Ability {

    private static KeeperOfTheLightRecall instance;

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
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] teleport_delay;

    private KeeperOfTheLightRecall() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_CHANNELLED","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_DONT_RESUME_ATTACK","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE"};
        abilityCastPoint = new double[]{0.3,0.3,0.3};
        abilityCastRange = new int[]{0,0,0,0};
        abilityCooldown = new double[]{15.0,15.0,15.0};
        abilityManaCost = new int[]{100,100,100};
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_INVULNERABLE"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_CUSTOM"};
        iD = 5475;
        key = "keeper_of_the_light_recall";
        spellImmunityType = "SPELL_IMMUNITY_ALLIES_YES";
        localizedName = "Recall";
        ownerKey = "npc_dota_hero_keeper_of_the_light";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        teleport_delay = new double[]{5.0,4.0,3.0};
    }

    public static KeeperOfTheLightRecall instance() {
        if( instance == null ){
            instance = new KeeperOfTheLightRecall();
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

    public double[] getTeleportDelay() {
        return teleport_delay;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof KeeperOfTheLightRecall))
            return false;
        if (object == this)
            return true;
        KeeperOfTheLightRecall otherObject = (KeeperOfTheLightRecall) object;
        return otherObject.getKey().equals(getKey());
    }

}
