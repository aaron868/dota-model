package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerEmp extends Ability {

    private static InvokerEmp instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final int[] abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int area_of_effect;
    private final int damage_per_mana_pct;
    private final double delay;
    private final String localizedName;
    private final int[] mana_burned;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;

    private InvokerEmp() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_AOE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0,0,0,0};
        abilityCastRange = new int[]{950,950,950,950};
        abilityCooldown = new double[]{30,30,30,30};
        abilityManaCost = new int[]{125,125,125,125};
        abilityUnitDamageType = "DAMAGE_TYPE_PURE";
        iD = 5383;
        key = "invoker_emp";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        area_of_effect = 675;
        damage_per_mana_pct = 50;
        delay = 2.9;
        localizedName = "Emp";
        mana_burned = new int[]{100,175,250,325,400,475,550,625};
        ownerKey = "npc_dota_hero_invoker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
    }

    public static InvokerEmp instance() {
        if( instance == null ){
            instance = new InvokerEmp();
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

    public int getDamagePerManaPct() {
        return damage_per_mana_pct;
    }

    public double getDelay() {
        return delay;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getManaBurned() {
        return mana_burned;
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
        if (!(object instanceof InvokerEmp))
            return false;
        if (object == this)
            return true;
        InvokerEmp otherObject = (InvokerEmp) object;
        return otherObject.getKey().equals(getKey());
    }

}
