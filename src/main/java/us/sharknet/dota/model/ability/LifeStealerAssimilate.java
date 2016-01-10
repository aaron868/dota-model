package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class LifeStealerAssimilate extends Ability {

    private static LifeStealerAssimilate instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String[] abilityUnitTargetFlags;
    private final String[] abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int iD;
    private final boolean isGrantedByScepter;
    private final String key;
    private final int damage;
    private final String localizedName;
    private final int order_lock_duration;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;

    private LifeStealerAssimilate() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN"};
        abilityCastPoint = new double[]{.2,.2,.2,.2};
        abilityCastRange = new int[]{150,150,150,150};
        abilityCooldown = new double[]{50,50,50,50};
        abilityManaCost = new int[]{50,50,50,50};
        abilityUnitTargetFlags = new String[]{"DOTA_UNIT_TARGET_FLAG_NOT_CREEP_HERO"};
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_FRIENDLY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO"};
        iD = 5671;
        isGrantedByScepter = true;
        key = "life_stealer_assimilate";
        damage = 300;
        localizedName = "Assimilate";
        order_lock_duration = 2;
        ownerKey = "npc_dota_hero_life_stealer";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{700,700,700};
    }

    public static LifeStealerAssimilate instance() {
        if( instance == null ){
            instance = new LifeStealerAssimilate();
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

    public String[] getAbilityUnitTargetFlags() {
        return abilityUnitTargetFlags;
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

    public boolean getIsGrantedByScepter() {
        return isGrantedByScepter;
    }

    public String getKey() {
        return key;
    }

    public int getDamage() {
        return damage;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int getOrderLockDuration() {
        return order_lock_duration;
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

    public int[] getRadius() {
        return radius;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LifeStealerAssimilate))
            return false;
        if (object == this)
            return true;
        LifeStealerAssimilate otherObject = (LifeStealerAssimilate) object;
        return otherObject.getKey().equals(getKey());
    }

}
