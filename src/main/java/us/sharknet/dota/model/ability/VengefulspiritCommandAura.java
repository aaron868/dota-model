package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class VengefulspiritCommandAura extends Ability {

    private static VengefulspiritCommandAura instance;

    private final String[] abilityBehavior;
    private final int abilityCastRange;
    private final String abilityUnitTargetTeam;
    private final int iD;
    private final String key;
    private final int aura_radius;
    private final int[] bonus_damage_pct;
    private final String localizedName;
    private final String owningHeroShortKey;

    private VengefulspiritCommandAura() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_PASSIVE","DOTA_ABILITY_BEHAVIOR_AURA"};
        abilityCastRange = 900;
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_FRIENDLY";
        iD = 5123;
        key = "vengefulspirit_command_aura";
        aura_radius = 900;
        bonus_damage_pct = new int[]{12,20,28,36};
        localizedName = "Command Aura";
        owningHeroShortKey = "vengefulspirit";
    }

    public static VengefulspiritCommandAura instance() {
        if( instance == null ){
            instance = new VengefulspiritCommandAura();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getAuraRadius() {
        return aura_radius;
    }

    public int[] getBonusDamagePct() {
        return bonus_damage_pct;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof VengefulspiritCommandAura))
            return false;
        if (object == this)
            return true;
        VengefulspiritCommandAura otherObject = (VengefulspiritCommandAura) object;
        return otherObject.getKey().equals(getKey());
    }

}
