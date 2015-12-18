package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LionImpale extends Ability {

    private static LionImpale instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final double[] duration;
    private final int length_buffer;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] speed;
    private final int[] width;

    private LionImpale() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 500;
        abilityCooldown = new double[]{12.0,12.0,12.0,12.0};
        abilityDamage = new int[]{80,140,200,260};
        abilityManaCost = new int[]{100,120,140,160};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5044;
        key = "lion_impale";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = new double[]{1.1,1.6,2.1,2.6};
        length_buffer = 325;
        localizedName = "Impale";
        owningHeroShortKey = "lion";
        speed = new int[]{1600,1600,1600,1600};
        width = new int[]{125,125,125,125};
    }

    public static LionImpale instance() {
        if( instance == null ){
            instance = new LionImpale();
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

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public double[] getDuration() {
        return duration;
    }

    public int getLengthBuffer() {
        return length_buffer;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getSpeed() {
        return speed;
    }

    public int[] getWidth() {
        return width;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LionImpale))
            return false;
        if (object == this)
            return true;
        LionImpale otherObject = (LionImpale) object;
        return otherObject.getKey().equals(getKey());
    }

}
