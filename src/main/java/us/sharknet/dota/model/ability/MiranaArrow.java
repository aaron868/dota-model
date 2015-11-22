package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MiranaArrow extends Ability {

    private static MiranaArrow instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityDamage;
    private final double[] abilityDuration;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int arrow_bonus_damage;
    private final int arrow_max_stun;
    private final int arrow_max_stunrange;
    private final double arrow_min_stun;
    private final int arrow_range;
    private final int arrow_speed;
    private final int arrow_vision;
    private final int arrow_width;
    private final String localizedName;
    private final String owningHeroShortKey;

    private MiranaArrow() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_DIRECTIONAL","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.5,0.5,0.5,0.5};
        abilityCastRange = 3000;
        abilityCooldown = 17;
        abilityDamage = new int[]{50,140,230,320};
        abilityDuration = new double[]{3.11,3.11,3.11,3.11};
        abilityManaCost = new int[]{100,100,100,100};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 5048;
        key = "mirana_arrow";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        arrow_bonus_damage = 140;
        arrow_max_stun = 5;
        arrow_max_stunrange = 1500;
        arrow_min_stun = .1;
        arrow_range = 3000;
        arrow_speed = 857;
        arrow_vision = 650;
        arrow_width = 115;
        localizedName = "Sacred Arrow";
        owningHeroShortKey = "mirana";
    }

    public static MiranaArrow instance() {
        if( instance == null ){
            instance = new MiranaArrow();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
    }

    public double[] getAbilityDuration() {
        return abilityDuration;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public int getArrowBonusDamage() {
        return arrow_bonus_damage;
    }

    public int getArrowMaxStun() {
        return arrow_max_stun;
    }

    public int getArrowMaxStunrange() {
        return arrow_max_stunrange;
    }

    public double getArrowMinStun() {
        return arrow_min_stun;
    }

    public int getArrowRange() {
        return arrow_range;
    }

    public int getArrowSpeed() {
        return arrow_speed;
    }

    public int getArrowVision() {
        return arrow_vision;
    }

    public int getArrowWidth() {
        return arrow_width;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MiranaArrow))
            return false;
        if (object == this)
            return true;
        MiranaArrow otherObject = (MiranaArrow) object;
        return otherObject.getKey().equals(getKey());
    }

}
