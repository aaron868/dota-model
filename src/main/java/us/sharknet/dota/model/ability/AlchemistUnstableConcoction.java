package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class AlchemistUnstableConcoction extends Ability {

    private static AlchemistUnstableConcoction instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double brew_explosion;
    private final int brew_time;
    private final String localizedName;
    private final int[] max_damage;
    private final double[] max_stun;
    private final int min_damage;
    private final double min_stun;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int radius;

    private AlchemistUnstableConcoction() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCooldown = new double[]{16,16,16,16};
        abilityManaCost = new int[]{120,120,120,120};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        iD = 5366;
        key = "alchemist_unstable_concoction";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        brew_explosion = 5.5;
        brew_time = 5;
        localizedName = "Unstable Concoction";
        max_damage = new int[]{150,220,290,360};
        max_stun = new double[]{1.75,2.5,3.25,4.0};
        min_damage = 0;
        min_stun = .25;
        ownerKey = "npc_dota_hero_alchemist";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = 175;
    }

    public static AlchemistUnstableConcoction instance() {
        if( instance == null ){
            instance = new AlchemistUnstableConcoction();
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

    public double getBrewExplosion() {
        return brew_explosion;
    }

    public int getBrewTime() {
        return brew_time;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMaxDamage() {
        return max_damage;
    }

    public double[] getMaxStun() {
        return max_stun;
    }

    public int getMinDamage() {
        return min_damage;
    }

    public double getMinStun() {
        return min_stun;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof AlchemistUnstableConcoction))
            return false;
        if (object == this)
            return true;
        AlchemistUnstableConcoction otherObject = (AlchemistUnstableConcoction) object;
        return otherObject.getKey().equals(getKey());
    }

}
