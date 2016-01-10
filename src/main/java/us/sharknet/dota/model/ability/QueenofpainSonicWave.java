package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class QueenofpainSonicWave extends Ability {

    private static QueenofpainSonicWave instance;

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
    private final int cooldown_scepter;
    private final int[] damage;
    private final int[] damage_scepter;
    private final int distance;
    private final int final_aoe;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int speed;
    private final int starting_aoe;

    private QueenofpainSonicWave() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_DIRECTIONAL","DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.452,0.452,0.452};
        abilityCastRange = new int[]{700,700,700,700};
        abilityCooldown = new double[]{135,135,135};
        abilityManaCost = new int[]{250,360,500};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        iD = 5176;
        key = "queenofpain_sonic_wave";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        cooldown_scepter = 4;
        damage = new int[]{290,380,470};
        damage_scepter = new int[]{325,440,555};
        distance = 900;
        final_aoe = 450;
        localizedName = "Sonic Wave";
        ownerKey = "npc_dota_hero_queenofpain";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        speed = 900;
        starting_aoe = 100;
    }

    public static QueenofpainSonicWave instance() {
        if( instance == null ){
            instance = new QueenofpainSonicWave();
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

    public int getCooldownScepter() {
        return cooldown_scepter;
    }

    public int[] getDamage() {
        return damage;
    }

    public int[] getDamageScepter() {
        return damage_scepter;
    }

    public int getDistance() {
        return distance;
    }

    public int getFinalAoe() {
        return final_aoe;
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

    public int getSpeed() {
        return speed;
    }

    public int getStartingAoe() {
        return starting_aoe;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof QueenofpainSonicWave))
            return false;
        if (object == this)
            return true;
        QueenofpainSonicWave otherObject = (QueenofpainSonicWave) object;
        return otherObject.getKey().equals(getKey());
    }

}
