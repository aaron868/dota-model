package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TemplarAssassinPsionicTrap extends Ability {

    private static TemplarAssassinPsionicTrap instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final int[] max_traps;
    private final int movement_speed_max_tooltip;
    private final int movement_speed_min_tooltip;
    private final String owningHeroShortKey;
    private final int trap_duration_tooltip;
    private final double[] trap_fade_time;

    private TemplarAssassinPsionicTrap() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCastPoint = new double[]{0.3,0.3,0.3,0.3};
        abilityCastRange = 2;
        abilityCooldown = new double[]{11.0,8.0,5.0};
        abilityManaCost = new int[]{15,15,15};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        iD = 5197;
        key = "templar_assassin_psionic_trap";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Psionic Trap";
        max_traps = new int[]{5,8,11};
        movement_speed_max_tooltip = 5;
        movement_speed_min_tooltip = 3;
        owningHeroShortKey = "templar_assassin";
        trap_duration_tooltip = 5;
        trap_fade_time = new double[]{2.0,2.0,2.0};
    }

    public static TemplarAssassinPsionicTrap instance() {
        if( instance == null ){
            instance = new TemplarAssassinPsionicTrap();
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

    public String getAbilityType() {
        return abilityType;
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

    public int[] getMaxTraps() {
        return max_traps;
    }

    public int getMovementSpeedMaxTooltip() {
        return movement_speed_max_tooltip;
    }

    public int getMovementSpeedMinTooltip() {
        return movement_speed_min_tooltip;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int getTrapDurationTooltip() {
        return trap_duration_tooltip;
    }

    public double[] getTrapFadeTime() {
        return trap_fade_time;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TemplarAssassinPsionicTrap))
            return false;
        if (object == this)
            return true;
        TemplarAssassinPsionicTrap otherObject = (TemplarAssassinPsionicTrap) object;
        return otherObject.getKey().equals(getKey());
    }

}
