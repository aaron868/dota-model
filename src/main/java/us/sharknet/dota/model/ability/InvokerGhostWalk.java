package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class InvokerGhostWalk extends Ability {

    private static InvokerGhostWalk instance;

    private final String[] abilityBehavior;
    private final double[] abilityCooldown;
    private final int[] abilityManaCost;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int area_of_effect;
    private final int aura_fade_time;
    private final int duration;
    private final int[] enemy_slow;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final double[] self_slow;

    private InvokerGhostWalk() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IMMEDIATE","DOTA_ABILITY_BEHAVIOR_HIDDEN","DOTA_ABILITY_BEHAVIOR_NOT_LEARNABLE","DOTA_ABILITY_BEHAVIOR_IGNORE_CHANNEL"};
        abilityCooldown = new double[]{35,35,35,35};
        abilityManaCost = new int[]{200,200,200,200};
        iD = 5381;
        key = "invoker_ghost_walk";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        area_of_effect = 400;
        aura_fade_time = 2;
        duration = 1;
        enemy_slow = new int[]{-20,-25,-30,-35,-40,-45,-50,-55};
        localizedName = "Ghost Walk";
        ownerKey = "npc_dota_hero_invoker";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        self_slow = new double[]{30.0,20.0,10.0,0.0,10.0,20.0,30.0,40.0};
    }

    public static InvokerGhostWalk instance() {
        if( instance == null ){
            instance = new InvokerGhostWalk();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityManaCost() {
        return abilityManaCost;
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

    public int getAuraFadeTime() {
        return aura_fade_time;
    }

    public int getDuration() {
        return duration;
    }

    public int[] getEnemySlow() {
        return enemy_slow;
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

    public double[] getSelfSlow() {
        return self_slow;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof InvokerGhostWalk))
            return false;
        if (object == this)
            return true;
        InvokerGhostWalk otherObject = (InvokerGhostWalk) object;
        return otherObject.getKey().equals(getKey());
    }

}
