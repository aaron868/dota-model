package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerForgeSpirit extends Ability {

    private static InvokerForgeSpirit instance;

    private final String[] abilityBehavior;
    private final int abilityCooldown;
    private final int abilityManaCost;
    private final String hotKeyOverride;
    private final int iD;
    private final String key;
    private final int maxLevel;
    private final String spellImmunityType;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] spirit_armor;
    private final double[] spirit_attack_range;
    private final double[] spirit_damage;
    private final double[] spirit_duration;
    private final int[] spirit_hp;
    private final int[] spirit_mana;

    private InvokerForgeSpirit() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCooldown = 3;
        abilityManaCost = 75;
        hotKeyOverride = "F";
        iD = 5387;
        key = "invoker_forge_spirit";
        maxLevel = 1;
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Forge Spirit";
        owningHeroShortKey = "invoker";
        spirit_armor = new int[]{0,1,2,3,4,5,6,7};
        spirit_attack_range = new double[]{300.0,365.0,430.0,495.0,560.0,625.0,690.0,755.0};
        spirit_damage = new double[]{29.0,38.0,47.0,56.0,65.0,74.0,83.0,92.0};
        spirit_duration = new double[]{20.0,30.0,40.0,50.0,60.0,70.0,80.0,90.0};
        spirit_hp = new int[]{300,400,500,600,700,800,900,1000};
        spirit_mana = new int[]{100,150,200,250,300,350,400,450};
    }

    public static InvokerForgeSpirit instance() {
        if( instance == null ){
            instance = new InvokerForgeSpirit();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public int getAbilityCooldown() {
        return abilityCooldown;
    }

    public int getAbilityManaCost() {
        return abilityManaCost;
    }

    public String getHotKeyOverride() {
        return hotKeyOverride;
    }

    public int getID() {
        return iD;
    }

    public String getKey() {
        return key;
    }

    public int getMaxLevel() {
        return maxLevel;
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

    public int[] getSpiritArmor() {
        return spirit_armor;
    }

    public double[] getSpiritAttackRange() {
        return spirit_attack_range;
    }

    public double[] getSpiritDamage() {
        return spirit_damage;
    }

    public double[] getSpiritDuration() {
        return spirit_duration;
    }

    public int[] getSpiritHp() {
        return spirit_hp;
    }

    public int[] getSpiritMana() {
        return spirit_mana;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof InvokerForgeSpirit))
            return false;
        if (object == this)
            return true;
        InvokerForgeSpirit otherObject = (InvokerForgeSpirit) object;
        return otherObject.getKey().equals(getKey());
    }

}
