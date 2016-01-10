package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class TrollWarlordWhirlingAxesRanged extends Ability {

    private static TrollWarlordWhirlingAxesRanged instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int axe_count;
    private final int axe_damage;
    private final int axe_range;
    private final double[] axe_slow_duration;
    private final int axe_speed;
    private final int axe_spread;
    private final int axe_width;
    private final String localizedName;
    private final int movement_speed;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private TrollWarlordWhirlingAxesRanged() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.2,0.2,0.2,0.2};
        abilityCastRange = new int[]{900,900,900,900};
        abilityCooldown = new double[]{20,18,16,14};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5509;
        key = "troll_warlord_whirling_axes_ranged";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        axe_count = 5;
        axe_damage = 75;
        axe_range = 945;
        axe_slow_duration = new double[]{3.0,3.75,4.5,5.25};
        axe_speed = 15;
        axe_spread = 25;
        axe_width = 100;
        localizedName = "Whirling Axes Ranged";
        movement_speed = 30;
        ownerKey = "npc_dota_hero_troll_warlord";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static TrollWarlordWhirlingAxesRanged instance() {
        if( instance == null ){
            instance = new TrollWarlordWhirlingAxesRanged();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int[] getAbilityCastRange() {
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

    public String[] getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
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

    public int getAxeCount() {
        return axe_count;
    }

    public int getAxeDamage() {
        return axe_damage;
    }

    public int getAxeRange() {
        return axe_range;
    }

    public double[] getAxeSlowDuration() {
        return axe_slow_duration;
    }

    public int getAxeSpeed() {
        return axe_speed;
    }

    public int getAxeSpread() {
        return axe_spread;
    }

    public int getAxeWidth() {
        return axe_width;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getMovementSpeed() {
        return movement_speed;
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


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TrollWarlordWhirlingAxesRanged))
            return false;
        if (object == this)
            return true;
        TrollWarlordWhirlingAxesRanged otherObject = (TrollWarlordWhirlingAxesRanged) object;
        return otherObject.getKey().equals(getKey());
    }

}
