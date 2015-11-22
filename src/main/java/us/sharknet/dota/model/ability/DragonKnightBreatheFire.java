package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class DragonKnightBreatheFire extends Ability {

    private static DragonKnightBreatheFire instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetFlags;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int duration;
    private final int[] end_radius;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] range;
    private final int[] reduction;
    private final int speed;
    private final int[] start_radius;

    private DragonKnightBreatheFire() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_DIRECTIONAL","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 5;
        abilityCooldown = new double[]{12.0,12.0,12.0,12.0};
        abilityDamage = new int[]{90,170,240,300};
        abilityManaCost = new int[]{100,110,120,130};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetFlags = "DOTA_UNIT_TARGET_FLAG_MAGIC_IMMUNE_ENEMIES";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5226;
        key = "dragon_knight_breathe_fire";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        duration = 11;
        end_radius = new int[]{250,250,250,250};
        localizedName = "Breathe Fire";
        owningHeroShortKey = "dragon_knight";
        range = new int[]{650,650,650,650};
        reduction = new int[]{-20,-25,-30,-35};
        speed = 15;
        start_radius = new int[]{150,150,150,150};
    }

    public static DragonKnightBreatheFire instance() {
        if( instance == null ){
            instance = new DragonKnightBreatheFire();
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

    public String getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public int getDuration() {
        return duration;
    }

    public int[] getEndRadius() {
        return end_radius;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getRange() {
        return range;
    }

    public int[] getReduction() {
        return reduction;
    }

    public int getSpeed() {
        return speed;
    }

    public int[] getStartRadius() {
        return start_radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof DragonKnightBreatheFire))
            return false;
        if (object == this)
            return true;
        DragonKnightBreatheFire otherObject = (DragonKnightBreatheFire) object;
        return otherObject.getKey().equals(getKey());
    }

}
