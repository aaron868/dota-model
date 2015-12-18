package us.sharknet.dota.model.ability;

import us.sharknet.dota.model.Ability;

public final class KunkkaGhostship extends Ability {

    private static KunkkaGhostship instance;

    private final String[] abilityBehavior;
    private final double abilityCastPoint;
    private final int abilityCastRange;
    private final double[] abilityCooldown;
    private final int[] abilityDamage;
    private final int[] abilityManaCost;
    private final String abilityType;
    private final String abilityUnitDamageType;
    private final int fightRecapLevel;
    private final int iD;
    private final String key;
    private final String spellImmunityType;
    private final int buff_duration;
    private final int[] ghostship_distance;
    private final int ghostship_speed;
    private final int ghostship_speed_scepter;
    private final int[] ghostship_width;
    private final int ghostship_width_scepter;
    private final String localizedName;
    private final int[] movespeed_bonus;
    private final String owningHeroShortKey;
    private final double[] stun_duration;
    private final double tooltip_delay;

    private KunkkaGhostship() {
        abilityBehavior = new String[]{"DOTA_ABILITY_BEHAVIOR_DIRECTIONAL","DOTA_ABILITY_BEHAVIOR_POINT","DOTA_ABILITY_BEHAVIOR_IGNORE_BACKSWING"};
        abilityCastPoint = .3;
        abilityCastRange = 1000;
        abilityCooldown = new double[]{60.0,50.0,40.0};
        abilityDamage = new int[]{400,500,600};
        abilityManaCost = new int[]{125,175,225};
        abilityType = "DOTA_ABILITY_TYPE_ULTIMATE";
        abilityUnitDamageType = "DAMAGE_TYPE_MAGICAL";
        fightRecapLevel = 2;
        iD = 5035;
        key = "kunkka_ghostship";
        spellImmunityType = "SPELL_IMMUNITY_ENEMIES_NO";
        buff_duration = 1;
        ghostship_distance = new int[]{1000,1000,1000};
        ghostship_speed = 650;
        ghostship_speed_scepter = 650;
        ghostship_width = new int[]{425,425,425};
        ghostship_width_scepter = 200;
        localizedName = "Ghostship";
        movespeed_bonus = new int[]{10,10,10};
        owningHeroShortKey = "kunkka";
        stun_duration = new double[]{1.4,1.4,1.4};
        tooltip_delay = 2.7;
    }

    public static KunkkaGhostship instance() {
        if( instance == null ){
            instance = new KunkkaGhostship();
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

    public double[] getAbilityCooldown() {
        return abilityCooldown;
    }

    public int[] getAbilityDamage() {
        return abilityDamage;
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

    public int getBuffDuration() {
        return buff_duration;
    }

    public int[] getGhostshipDistance() {
        return ghostship_distance;
    }

    public int getGhostshipSpeed() {
        return ghostship_speed;
    }

    public int getGhostshipSpeedScepter() {
        return ghostship_speed_scepter;
    }

    public int[] getGhostshipWidth() {
        return ghostship_width;
    }

    public int getGhostshipWidthScepter() {
        return ghostship_width_scepter;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public int[] getMovespeedBonus() {
        return movespeed_bonus;
    }

    public String getOwningHeroShortKey() {
        return owningHeroShortKey;
    }

    public double[] getStunDuration() {
        return stun_duration;
    }

    public double getTooltipDelay() {
        return tooltip_delay;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof KunkkaGhostship))
            return false;
        if (object == this)
            return true;
        KunkkaGhostship otherObject = (KunkkaGhostship) object;
        return otherObject.getKey().equals(getKey());
    }

}
