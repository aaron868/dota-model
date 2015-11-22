package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MorphlingWaveform extends Ability {

    private static MorphlingWaveform instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int speed;
    private final int width;

    private MorphlingWaveform() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = .25;
        abilityCastRange = 1;
        abilityCooldown = new double[]{11.0,11.0,11.0,11.0};
        abilityDamage = new int[]{100,175,250,325};
        abilityManaCost = new int[]{140,155,160,165};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 552;
        key = "morphling_waveform";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Waveform";
        owningHeroShortKey = "morphling";
        speed = 125;
        width = 2;
    }

    public static MorphlingWaveform instance() {
        if( instance == null ){
            instance = new MorphlingWaveform();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
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

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWidth() {
        return width;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MorphlingWaveform))
            return false;
        if (object == this)
            return true;
        MorphlingWaveform otherObject = (MorphlingWaveform) object;
        return otherObject.getKey().equals(getKey());
    }

}
