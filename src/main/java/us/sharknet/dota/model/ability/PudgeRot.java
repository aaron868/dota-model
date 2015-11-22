package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class PudgeRot extends Ability {

    private static PudgeRot instance;

    private final String[] abilityBehavior;
    private final int[] abilityCastPoint;
    private final int[] abilityDamage;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int rot_radius;
    private final int rot_slow;
    private final double rot_tick;

    private PudgeRot() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new int[]{0,0,0,0};
        abilityDamage = new int[]{30,60,90,120};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 1;
        iD = 576;
        key = "pudge_rot";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Rot";
        owningHeroShortKey = "pudge";
        rot_radius = 25;
        rot_slow = -27;
        rot_tick = .2;
    }

    public static PudgeRot instance() {
        if( instance == null ){
            instance = new PudgeRot();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
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

    public int getRotRadius() {
        return rot_radius;
    }

    public int getRotSlow() {
        return rot_slow;
    }

    public double getRotTick() {
        return rot_tick;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof PudgeRot))
            return false;
        if (object == this)
            return true;
        PudgeRot otherObject = (PudgeRot) object;
        return otherObject.getKey().equals(getKey());
    }

}
