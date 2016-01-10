package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DeathProphetExorcism extends Ability {

    private static DeathProphetExorcism instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] average_damage;
    private final double ghost_spawn_rate;
    private final int[] give_up_distance;
    private final int[] heal_percent;
    private final String localizedName;
    private final int max_damage;
    private final int[] max_distance;
    private final int min_damage;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final int[] spirit_speed;
    private final int[] spirits;

    private DeathProphetExorcism() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET"};
        abilityCastPoint = new double[]{0.5,0.5,0.5};
        abilityCooldown = new double[]{145,145,145,145};
        abilityDuration = new double[]{35,35,35,35};
        abilityManaCost = new int[]{200,300,400};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5093;
        key = "death_prophet_exorcism";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        average_damage = new int[]{55,55,55};
        ghost_spawn_rate = .3;
        give_up_distance = new int[]{1200,1200,1200};
        heal_percent = new int[]{25,25,25};
        localizedName = "Exorcism";
        max_damage = 58;
        max_distance = new int[]{2000,2000,2000};
        min_damage = 53;
        ownerKey = "npc_dota_hero_death_prophet";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{700,700,700};
        spirit_speed = new int[]{500,500,500};
        spirits = new int[]{8,16,24};
    }

    public static DeathProphetExorcism instance() {
        if( instance == null ){
            instance = new DeathProphetExorcism();
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

    public double[] getAbilityDuration() {
        return abilityDuration;
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

    public int[] getAverageDamage() {
        return average_damage;
    }

    public double getGhostSpawnRate() {
        return ghost_spawn_rate;
    }

    public int[] getGiveUpDistance() {
        return give_up_distance;
    }

    public int[] getHealPercent() {
        return heal_percent;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMaxDamage() {
        return max_damage;
    }

    public int[] getMaxDistance() {
        return max_distance;
    }

    public int getMinDamage() {
        return min_damage;
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

    public int[] getSpiritSpeed() {
        return spirit_speed;
    }

    public int[] getSpirits() {
        return spirits;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DeathProphetExorcism))
            return false;
        if (object == this)
            return true;
        DeathProphetExorcism otherObject = (DeathProphetExorcism) object;
        return otherObject.getKey().equals(getKey());
    }

}
