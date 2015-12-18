package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Zuus extends Hero {

    private static Zuus instance;

    private final ZuusArcLightning ability1;
    private final ZuusLightningBolt ability2;
    private final ZuusStaticField ability3;
    private final ZuusThundergodsWrath ability4;
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
    private final int botImplemented;
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final int heroPool1;
    private final int heroPool2;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
    private final int loadoutScale;
    private final String model;
    private final int modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int noCombine;
    private final String pickSound;
    private final String portrait;
    private final String projectileModel;
    private final int projectileSpeed;
    private final String role;
    private final int rolelevels;
    private final String soundSet;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final int new_player_enable;
    private final String shortKey;
    private final String url;

    private Zuus() {
        ability1 = ZuusArcLightning.instance();
        ability2 = ZuusLightningBolt.instance();
        ability3 = ZuusStaticField.instance();
        ability4 = ZuusThundergodsWrath.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .633;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 29;
        attackDamageMin = 21;
        attackRange = 350;
        attackRate = 1.7;
        attributeAgilityGain = 1.2;
        attributeBaseAgility = 11;
        attributeBaseIntelligence = 20;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 2.7;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.3;
        banSound = "zuus_zuus_anger_03";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 130;
        heroGlowColor = new int[]{64,166,234};
        heroID = 22;
        heroPool1 = 1;
        heroPool2 = 1;
        heroSelectSoundEffect = "Hero_Zuus.Pick";
        heroUnlockOrder = 0;
        idleExpression = "scenes/zuus/zuus_exp_idle_01.vcd";
        key = "npc_dota_hero_zuus";
        lastHitChallengeRival = "npc_dota_hero_razor";
        loadoutScale = 1;
        model = "models/heroes/zeus/zeus.vmdl";
        modelScale = 1;
        movementSpeed = 295;
        movementTurnRate = .6;
        noCombine = 1;
        pickSound = "zuus_zuus_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_zuus";
        projectileModel = "particles/units/heroes/hero_zuus/zuus_base_attack.vpcf";
        projectileSpeed = 1100;
        role = "Nuker";
        rolelevels = 3;
        soundSet = "Hero_zuus";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_zuus.vsndevts";
        active = true;
        localizedName = "Zeus";
        new_player_enable = 1;
        shortKey = "zuus";
        url = "Zeus";
    }

    public static Zuus instance() {
        if( instance == null ){
            instance = new Zuus();
        }
        return instance;
    }

    public ZuusArcLightning getAbility1() {
        return ability1;
    }

    public ZuusLightningBolt getAbility2() {
        return ability2;
    }

    public ZuusStaticField getAbility3() {
        return ability3;
    }

    public ZuusThundergodsWrath getAbility4() {
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

    public int getBotImplemented() {
        return botImplemented;
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

    public int getHealthBarOffset() {
        return healthBarOffset;
    }

    public int[] getHeroGlowColor() {
        return heroGlowColor;
    }

    public int getHeroID() {
        return heroID;
    }

    public int getHeroPool1() {
        return heroPool1;
    }

    public int getHeroPool2() {
        return heroPool2;
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

    public int getLoadoutScale() {
        return loadoutScale;
    }

    public String getModel() {
        return model;
    }

    public int getModelScale() {
        return modelScale;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public double getMovementTurnRate() {
        return movementTurnRate;
    }

    public int getNoCombine() {
        return noCombine;
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

    public String getRole() {
        return role;
    }

    public int getRolelevels() {
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

    public int getNewPlayerEnable() {
        return new_player_enable;
    }

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Zuus))
            return false;
        if (object == this)
            return true;
        Zuus otherObject = (Zuus) object;
        return otherObject.getKey().equals(getKey());
    }

}
