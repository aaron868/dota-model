package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class NyxAssassinImpale extends Ability {

    private static NyxAssassinImpale instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final int abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityUnitDamageType;
    private final String abilityUnitTargetTeam;
    private final String[] abilityUnitTargetType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int cooldown_upgrade;
    private final double[] duration;
    private final int length;
    private final String localizedName;
    private final String owningHeroShortKey;
    private final int[] speed;
    private final int[] width;

    private NyxAssassinImpale() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = .4;
        abilityCastRange = 7;
        abilityCooldown = 13;
        abilityDamage = new int[]{80,140,200,260};
        abilityManaCost = new int[]{95,115,135,155};
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        abilityUnitTargetTeam = "DOTA_UNIT_TARGET_TEAM_ENEMY";
        abilityUnitTargetType = new String[]{"DOTA_UNIT_TARGET_HERO","DOTA_UNIT_TARGET_BASIC"};
        fightRecapLevel = 1;
        iD = 5462;
        key = "nyx_assassin_impale";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        cooldown_upgrade = 7;
        duration = new double[]{1.27,1.77,2.27,2.77};
        length = 7;
        localizedName = "Impale";
        owningHeroShortKey = "nyx_assassin";
        speed = new int[]{1600,1600,1600,1600};
        width = new int[]{125,125,125,125};
    }

    public static NyxAssassinImpale instance() {
        if( instance == null ){
            instance = new NyxAssassinImpale();
        }
        return instance;
    }

    public String[] getAbilityBehavior() {
        return abilityBehavior;
    }

    public double getAbilityCastPoint() {
        return abilityCastPoint;
    }

    public int getAbilityCastRange() {
        return abilityCastRange;
    }

    public int getAbilityCooldown() {
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

    public String getAbilityUnitTargetTeam() {
        return abilityUnitTargetTeam;
    }

    public String[] getAbilityUnitTargetType() {
        return abilityUnitTargetType;
    }

    public int getFightRecapLevel() {
        return fightRecapLevel;
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

    public int getCooldownUpgrade() {
        return cooldown_upgrade;
    }

    public double[] getDuration() {
        return duration;
    }

    public int getLength() {
        return length;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public int[] getSpeed() {
        return speed;
    }

    public int[] getWidth() {
        return width;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof NyxAssassinImpale))
            return false;
        if (object == this)
            return true;
        NyxAssassinImpale otherObject = (NyxAssassinImpale) object;
        return otherObject.getKey().equals(getKey());
    }

}
