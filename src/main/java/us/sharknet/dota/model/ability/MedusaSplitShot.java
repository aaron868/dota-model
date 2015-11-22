package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MedusaSplitShot extends Ability {

    private static MedusaSplitShot instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int[] arrow_count;
    private final int damage_modifier;
    private final int damage_modifier_tooltip;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int projectile_speed;
    private final int range;
    private final int[] total_arrow_count;

    private MedusaSplitShot() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_TOGGLE","DOTA_ABILITY_BEHAVIOR_IMMEDIATE"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        iD = 5504;
        key = "medusa_split_shot";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        arrow_count = new int[]{1,2,3,4};
        damage_modifier = -20;
        damage_modifier_tooltip = 80;
        localizedName = "Split Shot";
        owningHeroShortKey = "medusa";
        projectile_speed = 1200;
        range = 700;
        total_arrow_count = new int[]{2,3,4,5};
    }

    public static MedusaSplitShot instance() {
        if( instance == null ){
            instance = new MedusaSplitShot();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
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

    public int[] getArrowCount() {
        return arrow_count;
    }

    public int getDamageModifier() {
        return damage_modifier;
    }

    public int getDamageModifierTooltip() {
        return damage_modifier_tooltip;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getProjectileSpeed() {
        return projectile_speed;
    }

    public int getRange() {
        return range;
    }

    public int[] getTotalArrowCount() {
        return total_arrow_count;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MedusaSplitShot))
            return false;
        if (object == this)
            return true;
        MedusaSplitShot otherObject = (MedusaSplitShot) object;
        return otherObject.getKey().equals(getKey());
    }

}
