package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Dazzle extends Hero {

    private static Dazzle instance;

    private final DazzlePoisonTouch ability1;
    private final DazzleShallowGrave ability2;
    private final DazzleShadowWave ability3;
    private final DazzleWeave ability4;
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
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
    private final double loadoutScale;
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

    private Dazzle() {
        ability1 = DazzlePoisonTouch.instance();
        ability2 = DazzleShallowGrave.instance();
        ability3 = DazzleShadowWave.instance();
        ability4 = DazzleWeave.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 8;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 32;
        attackDamageMin = 14;
        attackRange = 55;
        attackRate = 1.7;
        attributeAgilityGain = 1.7;
        attributeBaseAgility = 21;
        attributeBaseIntelligence = 27;
        attributeBaseStrength = 16;
        attributeIntelligenceGain = 3.4;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.85;
        banSound = "dazzle_dazz_anger_05";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 16;
        heroGlowColor = new int[]{222,60,236};
        heroID = 5;
        heroSelectSoundEffect = "Hero_Dazzle.Pick";
        heroUnlockOrder = 3;
        idleExpression = "scenes/dazzle/dazzle_exp_idle_01.vcd";
        key = "npc_dota_hero_dazzle";
        lastHitChallengeRival = "npc_dota_hero_witch_doctor";
        loadoutScale = .85;
        model = "models/heroes/dazzle/dazzle.vmdl";
        modelScale = .79;
        movementSpeed = 35;
        movementTurnRate = .6;
        pickSound = "dazzle_dazz_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_dazzle";
        projectileModel = "particles/units/heroes/hero_dazzle/dazzle_base_attack.vpcf";
        projectileSpeed = 12;
        role = new String[]{"Support","Nuker","Disabler"};
        rolelevels = new int[]{3,1,1};
        soundSet = "Hero_Dazzle";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_dazzle.vsndevts";
        active = true;
        localizedName = "Dazzle";
        shortKey = "dazzle";
        url = "Dazzle";
    }

    public static Dazzle instance() {
        if( instance == null ){
            instance = new Dazzle();
        }
        return instance;
    }

    public DazzlePoisonTouch getAbility1() {
        return ability1;
    }

    public DazzleShallowGrave getAbility2() {
        return ability2;
    }

    public DazzleShadowWave getAbility3() {
        return ability3;
    }

    public DazzleWeave getAbility4() {
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

    public double getLoadoutScale() {
        return loadoutScale;
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
        if (!(object instanceof Dazzle))
            return false;
        if (object == this)
            return true;
        Dazzle otherObject = (Dazzle) object;
        return otherObject.getKey().equals(getKey());
    }

}
