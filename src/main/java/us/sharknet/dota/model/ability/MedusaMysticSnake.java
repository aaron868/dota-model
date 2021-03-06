package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MedusaMysticSnake extends Ability {

    private static MedusaMysticSnake instance;

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
    private final int initial_speed;
    private final double[] jump_delay;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int[] radius;
    private final int return_speed;
    private final int[] snake_damage;
    private final int[] snake_jumps;
    private final int[] snake_mana_steal;
    private final int snake_scale;

    private MedusaMysticSnake() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{0.4,0.4,0.4,0.4};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{11,11,11,11};
        abilityManaCost = new int[]{140,150,160,170};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        iD = 5505;
        key = "medusa_mystic_snake";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        initial_speed = 800;
        jump_delay = new double[]{0.25,0.25,0.25,0.25};
        localizedName = "Mystic Snake";
        ownerKey = "npc_dota_hero_medusa";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        radius = new int[]{475,475,475,475};
        return_speed = 800;
        snake_damage = new int[]{80,120,160,200};
        snake_jumps = new int[]{3,4,5,6};
        snake_mana_steal = new int[]{11,14,17,20};
        snake_scale = 35;
    }

    public static MedusaMysticSnake instance() {
        if( instance == null ){
            instance = new MedusaMysticSnake();
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

    public int getInitialSpeed() {
        return initial_speed;
    }

    public double[] getJumpDelay() {
        return jump_delay;
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

    public int[] getRadius() {
        return radius;
    }

    public int getReturnSpeed() {
        return return_speed;
    }

    public int[] getSnakeDamage() {
        return snake_damage;
    }

    public int[] getSnakeJumps() {
        return snake_jumps;
    }

    public int[] getSnakeManaSteal() {
        return snake_mana_steal;
    }

    public int getSnakeScale() {
        return snake_scale;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MedusaMysticSnake))
            return false;
        if (object == this)
            return true;
        MedusaMysticSnake otherObject = (MedusaMysticSnake) object;
        return otherObject.getKey().equals(getKey());
    }

}
