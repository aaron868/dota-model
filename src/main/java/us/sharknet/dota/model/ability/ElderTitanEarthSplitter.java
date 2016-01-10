package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class ElderTitanEarthSplitter extends Ability {

    private static ElderTitanEarthSplitter instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int crack_distance;
    private final double crack_time;
    private final int crack_width;
    private final int[] damage_pct;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] slow_duration;
    private final double[] slow_duration_scepter;
    private final int[] slow_pct;
    private final int speed;
    private final int total_steps;
    private final int vision_duration;
    private final double vision_interval;
    private final int vision_step;
    private final int vision_width;

    private ElderTitanEarthSplitter() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT"};
        abilityCastPoint = new double[]{0.4,0.4,0.4};
        abilityCastRange = new int[]{2400,2400,2400,2400};
        abilityCooldown = new double[]{100.0,100.0,100.0};
        abilityManaCost = new int[]{125,175,225};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5594;
        key = "elder_titan_earth_splitter";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_YES";
        crack_distance = 2400;
        crack_time = 3.14;
        crack_width = 300;
        damage_pct = new int[]{30,40,50};
        localizedName = "Earth Splitter";
        ownerKey = "npc_dota_hero_elder_titan";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        slow_duration = new double[]{3.0,4.0,5.0};
        slow_duration_scepter = new double[]{4.0,5.0,6.0};
        slow_pct = new int[]{30,40,50};
        speed = 910;
        total_steps = 12;
        vision_duration = 4;
        vision_interval = .22;
        vision_step = 200;
        vision_width = 500;
    }

    public static ElderTitanEarthSplitter instance() {
        if( instance == null ){
            instance = new ElderTitanEarthSplitter();
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

    public String getAbilityType() {
        return abilityType;
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

    public int getCrackDistance() {
        return crack_distance;
    }

    public double getCrackTime() {
        return crack_time;
    }

    public int getCrackWidth() {
        return crack_width;
    }

    public int[] getDamagePct() {
        return damage_pct;
    }

    public String getLocalizedName() {
        return localizedName;
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

    public double[] getSlowDuration() {
        return slow_duration;
    }

    public double[] getSlowDurationScepter() {
        return slow_duration_scepter;
    }

    public int[] getSlowPct() {
        return slow_pct;
    }

    public int getSpeed() {
        return speed;
    }

    public int getTotalSteps() {
        return total_steps;
    }

    public int getVisionDuration() {
        return vision_duration;
    }

    public double getVisionInterval() {
        return vision_interval;
    }

    public int getVisionStep() {
        return vision_step;
    }

    public int getVisionWidth() {
        return vision_width;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ElderTitanEarthSplitter))
            return false;
        if (object == this)
            return true;
        ElderTitanEarthSplitter otherObject = (ElderTitanEarthSplitter) object;
        return otherObject.getKey().equals(getKey());
    }

}
