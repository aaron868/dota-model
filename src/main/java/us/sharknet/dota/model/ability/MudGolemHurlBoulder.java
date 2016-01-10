package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class MudGolemHurlBoulder extends Ability {

    private static MudGolemHurlBoulder instance;

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
    private final int damage;
    private final double duration;
    private final String localizedName;
    private final String ownerKey;
    private final AbilityOwnerType ownerType;
    private final boolean passive;
    private final boolean placeholder;
    private final int speed;

    private MudGolemHurlBoulder() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_UNIT_TARGET"};
        abilityCastPoint = new double[]{.3,.3,.3,.3};
        abilityCastRange = new int[]{800,800,800,800};
        abilityCooldown = new double[]{30,30,30,30};
        abilityManaCost = new int[]{0,0,0,0};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = new String[]{"DOTA_UNIT_TARGET_TEAM_ENEMY"};
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_CREEP"};
        iD = 5670;
        key = "mud_golem_hurl_boulder";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        damage = 125;
        duration = .6;
        localizedName = "Hurl Boulder";
        ownerKey = "npc_dota_neutral_mud_golem";
        ownerType = AbilityOwnerType.Summoned;
        passive = false;
        placeholder = false;
        speed = 800;
    }

    public static MudGolemHurlBoulder instance() {
        if( instance == null ){
            instance = new MudGolemHurlBoulder();
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

    public int getDamage() {
        return damage;
    }

    public double getDuration() {
        return duration;
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

    public int getSpeed() {
        return speed;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof MudGolemHurlBoulder))
            return false;
        if (object == this)
            return true;
        MudGolemHurlBoulder otherObject = (MudGolemHurlBoulder) object;
        return otherObject.getKey().equals(getKey());
    }

}
