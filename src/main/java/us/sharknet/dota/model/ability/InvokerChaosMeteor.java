package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerChaosMeteor extends Ability {

    private static InvokerChaosMeteor instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final double abilityModifierSupportValue;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int area_of_effect;
    private final double[] burn_dps;
    private final int burn_duration;
    private final double damage_interval;
    private final int end_vision_duration;
    private final double land_time;
    private final String localizedName;
    private final double[] main_damage;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] travel_distance;
    private final int travel_speed;
    private final int vision_distance;

    private InvokerChaosMeteor() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{700,700,700,700};
        abilityCooldown = new double[]{55,55,55,55};
        abilityManaCost = new int[]{200,200,200,200};
        abilityModifierSupportValue = 0;
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5385;
        key = "invoker_chaos_meteor";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        area_of_effect = 275;
        burn_dps = new double[]{11.5,15.0,18.5,22.0,25.5,29.0,32.5,36.0};
        burn_duration = 3;
        damage_interval = .5;
        end_vision_duration = 3;
        land_time = 1.3;
        localizedName = "Chaos Meteor";
        main_damage = new double[]{57.5,75.0,92.5,110.0,127.5,145.0,162.5,180.0};
        ownerKey = "npc_dota_hero_invoker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        travel_distance = new int[]{465,615,780,930,1095,1245,1410,1575};
        travel_speed = 300;
        vision_distance = 500;
    }

    public static InvokerChaosMeteor instance() {
        if( instance == null ){
            instance = new InvokerChaosMeteor();
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

    public double getAbilityModifierSupportValue() {
        return abilityModifierSupportValue;
    }

    public String getAbilityUnitDamageType() {
        return abilityUnitDamageType;
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

    public int getAreaOfEffect() {
        return area_of_effect;
    }

    public double[] getBurnDps() {
        return burn_dps;
    }

    public int getBurnDuration() {
        return burn_duration;
    }

    public double getDamageInterval() {
        return damage_interval;
    }

    public int getEndVisionDuration() {
        return end_vision_duration;
    }

    public double getLandTime() {
        return land_time;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public double[] getMainDamage() {
        return main_damage;
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

    public int[] getTravelDistance() {
        return travel_distance;
    }

    public int getTravelSpeed() {
        return travel_speed;
    }

    public int getVisionDistance() {
        return vision_distance;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof InvokerChaosMeteor))
            return false;
        if (object == this)
            return true;
        InvokerChaosMeteor otherObject = (InvokerChaosMeteor) object;
        return otherObject.getKey().equals(getKey());
    }

}
