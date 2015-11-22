package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Huskar extends Hero {

    private static Huskar instance;

    private final HuskarInnerVitality ability1;
    private final HuskarBurningSpear ability2;
    private final HuskarBerserkersBlood ability3;
    private final HuskarLifeBreak ability4;
    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final int attackRange;
    private final double attackRate;
    private final double attributeAgilityGain;
    private final int attributeBaseAgility;
    private final int attributeBaseIntelligence;
    private final int attributeBaseStrength;
    private final double attributeIntelligenceGain;
    private final String attributePrimary;
    private final double attributeStrengthGain;
    private final String banSound;
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int hasAggressiveStance;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String pickSound;
    private final String portrait;
    private final String projectileModel;
    private final int projectileSpeed;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Huskar() {
        ability1 = HuskarInnerVitality.instance();
        ability2 = HuskarBurningSpear.instance();
        ability3 = HuskarBerserkersBlood.instance();
        ability4 = HuskarLifeBreak.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 8;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 3;
        attackDamageMin = 21;
        attackRange = 4;
        attackRate = 1.6;
        attributeAgilityGain = 1.4;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 1.5;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.4;
        banSound = "huskar_husk_anger_03";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        hasAggressiveStance = 1;
        healthBarOffset = 17;
        heroGlowColor = new int[]{73,155,153};
        heroID = 59;
        heroSelectSoundEffect = "Hero_Huskar.Pick";
        heroUnlockOrder = 1;
        idleExpression = "scenes/huskar/huskar_exp_idle_01.vcd";
        key = "npc_dota_hero_huskar";
        lastHitChallengeRival = "npc_dota_hero_dazzle";
        model = "models/heroes/huskar/huskar.vmdl";
        modelScale = .79;
        movementSpeed = 3;
        movementTurnRate = .5;
        pickSound = "huskar_husk_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_huskar";
        projectileModel = "particles/units/heroes/hero_huskar/huskar_base_attack.vpcf";
        projectileSpeed = 14;
        role = new String[]{"Carry","Durable","Initiator"};
        rolelevels = new int[]{2,2,1};
        soundSet = "Hero_Huskar";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_huskar.vsndevts";
        active = true;
        localizedName = "Huskar";
        shortKey = "huskar";
        url = "Huskar";
    }

    public static Huskar instance() {
        if( instance == null ){
            instance = new Huskar();
        }
        return instance;
    }

    public HuskarInnerVitality getAbility1() {
        return ability1;
    }

    public HuskarBurningSpear getAbility2() {
        return ability2;
    }

    public HuskarBerserkersBlood getAbility3() {
        return ability3;
    }

    public HuskarLifeBreak getAbility4() {
        return ability4;
    }

    public int getArmorPhysical() {
        return armorPhysical;
    }

    public int getAttackAcquisitionRange() {
        return attackAcquisitionRange;
    }

    public double getAttackAnimationPoint() {
        return attackAnimationPoint;
    }

    public String getAttackCapabilities() {
        return attackCapabilities;
    }

    public int getAttackDamageMax() {
        return attackDamageMax;
    }

    public int getAttackDamageMin() {
        return attackDamageMin;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public double getAttackRate() {
        return attackRate;
    }

    public double getAttributeAgilityGain() {
        return attributeAgilityGain;
    }

    public int getAttributeBaseAgility() {
        return attributeBaseAgility;
    }

    public int getAttributeBaseIntelligence() {
        return attributeBaseIntelligence;
    }

    public int getAttributeBaseStrength() {
        return attributeBaseStrength;
    }

    public double getAttributeIntelligenceGain() {
        return attributeIntelligenceGain;
    }

    public String getAttributePrimary() {
        return attributePrimary;
    }

    public double getAttributeStrengthGain() {
        return attributeStrengthGain;
    }

    public String getBanSound() {
        return banSound;
    }

    public String getBoundsHullName() {
        return boundsHullName;
    }

    public int getCMEnabled() {
        return cMEnabled;
    }

    public int getEnabled() {
        return enabled;
    }

    public int getHasAggressiveStance() {
        return hasAggressiveStance;
    }

    public int getHealthBarOffset() {
        return healthBarOffset;
    }

    public int[] getHeroGlowColor() {
        return heroGlowColor;
    }

    public int getHeroID() {
        return heroID;
    }

    public String getHeroSelectSoundEffect() {
        return heroSelectSoundEffect;
    }

    public int getHeroUnlockOrder() {
        return heroUnlockOrder;
    }

    public String getIdleExpression() {
        return idleExpression;
    }

    public String getKey() {
        return key;
    }

    public String getLastHitChallengeRival() {
        return lastHitChallengeRival;
    }

    public String getModel() {
        return model;
    }

    public double getModelScale() {
        return modelScale;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public double getMovementTurnRate() {
        return movementTurnRate;
    }

    public String getPickSound() {
        return pickSound;
    }

    public String getPortrait() {
        return portrait;
    }

    public String getProjectileModel() {
        return projectileModel;
    }

    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    public String[] getRole() {
        return role;
    }

    public int[] getRolelevels() {
        return rolelevels;
    }

    public String getSoundSet() {
        return soundSet;
    }

    public String getTeam() {
        return team;
    }

    public String getVoiceFile() {
        return voiceFile;
    }

    public boolean isActive() {
        return active;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Huskar))
            return false;
        if (object == this)
            return true;
        Huskar otherObject = (Huskar) object;
        return otherObject.getKey().equals(getKey());
    }

}
