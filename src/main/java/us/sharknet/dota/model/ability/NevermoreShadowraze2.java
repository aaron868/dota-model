package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NevermoreShadowraze2 extends Ability {

    private static NevermoreShadowraze2 instance;

    private final String[] abilityBehavior;
    private final double[] abilityCastPoint;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int shadowraze_cooldown;
    private final int shadowraze_radius;
    private final int shadowraze_range;

    private NevermoreShadowraze2() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_NO_TARGET","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = new double[]{0.67,0.67,0.67,0.67};
        abilityCooldown = new double[]{10.0,10.0,10.0,10.0};
        abilityDamage = new int[]{100,175,250,325};
        abilityManaCost = new int[]{90,90,90,90};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        iD = 5060;
        key = "nevermore_shadowraze2";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        localizedName = "Shadowraze 2";
        ownerKey = "npc_dota_hero_nevermore";
        ownerType = AbilityOwnerType.Hero;
        passive = false;
        placeholder = false;
        shadowraze_cooldown = 3;
        shadowraze_radius = 250;
        shadowraze_range = 450;
    }

    public static NevermoreShadowraze2 instance() {
        if( instance == null ){
            instance = new NevermoreShadowraze2();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double[] getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
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

    public int getShadowrazeCooldown() {
        return shadowraze_cooldown;
    }

    public int getShadowrazeRadius() {
        return shadowraze_radius;
    }

    public int getShadowrazeRange() {
        return shadowraze_range;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NevermoreShadowraze2))
            return false;
        if (object == this)
            return true;
        NevermoreShadowraze2 otherObject = (NevermoreShadowraze2) object;
        return otherObject.getKey().equals(getKey());
    }

}
