package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class BristlebackQuillSpray extends Ability {

    private static BristlebackQuillSpray instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final int max_damage;
    private final String owningHeroShortKey;
    private final double[] quill_base_damage;
    private final double[] quill_stack_damage;
    private final int quill_stack_duration;
    private final int radius;

    private BristlebackQuillSpray() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.0,0.0,0.0,0.0};
        abilityCastRange = 625;
        abilityCooldown = new double[]{3.0,3.0,3.0,3.0};
        abilityManaCost = new int[]{35,35,35,35};
        abilityUnitDamageType = "DAMAGE_TYPE_PHYSICAL";
        fightRecapLevel = 1;
        iD = 5549;
        key = "bristleback_quill_spray";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        localizedName = "Quill Spray";
        max_damage = 4;
        owningHeroShortKey = "bristleback";
        quill_base_damage = new double[]{20.0,40.0,60.0,80.0};
        quill_stack_damage = new double[]{30.0,32.0,34.0,36.0};
        quill_stack_duration = 14;
        radius = 625;
    }

    public static BristlebackQuillSpray instance() {
        if( instance == null ){
            instance = new BristlebackQuillSpray();
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

    public int getMaxDamage() {
        return max_damage;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getQuillBaseDamage() {
        return quill_base_damage;
    }

    public double[] getQuillStackDamage() {
        return quill_stack_damage;
    }

    public int getQuillStackDuration() {
        return quill_stack_duration;
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BristlebackQuillSpray))
            return false;
        if (object == this)
            return true;
        BristlebackQuillSpray otherObject = (BristlebackQuillSpray) object;
        return otherObject.getKey().equals(getKey());
    }

}
