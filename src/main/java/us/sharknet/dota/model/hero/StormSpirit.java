package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class StormSpirit extends Hero {

    private static StormSpirit instance;

    private final StormSpiritStaticRemnant ability1;
    private final StormSpiritElectricVortex ability2;
    private final StormSpiritOverload ability3;
    private final StormSpiritBallLightning ability4;
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
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final int iD;
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String nameAliases;
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

    private StormSpirit() {
        ability1 = StormSpiritStaticRemnant.instance();
        ability2 = StormSpiritElectricVortex.instance();
        ability3 = StormSpiritOverload.instance();
        ability4 = StormSpiritBallLightning.instance();
        armorPhysical = 2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 32;
        attackDamageMin = 22;
        attackRange = 480;
        attackRate = 1.7;
        attributeAgilityGain = 1.8;
        attributeBaseAgility = 22;
        attributeBaseIntelligence = 23;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 2.6;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.5;
        banSound = "stormspirit_ss_anger_03";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 170;
        heroGlowColor = new int[]{0,250,227};
        heroID = 17;
        heroSelectSoundEffect = "Hero_StormSpirit.Pick";
        heroUnlockOrder = 1;
        iD = 17;
        idleExpression = "scenes/stormspirit/stormspirit_exp_idle_01.vcd";
        key = "npc_dota_hero_storm_spirit";
        lastHitChallengeRival = "npc_dota_hero_kunkka";
        model = "models/heroes/storm_spirit/storm_spirit.vmdl";
        modelScale = 1.15;
        movementSpeed = 285;
        movementTurnRate = .8;
        nameAliases = "ss";
        pickSound = "stormspirit_ss_spawn_09";
        portrait = "vgui/hud/heroportraits/portrait_stormspirit";
        projectileModel = "particles/units/heroes/hero_stormspirit/stormspirit_base_attack.vpcf";
        projectileSpeed = 1100;
        role = new String[]{"Carry","Escape","Nuker","Initiator","Disabler"};
        rolelevels = new int[]{2,3,2,1,1};
        soundSet = "Hero_StormSpirit";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_stormspirit.vsndevts";
        active = true;
        localizedName = "Storm Spirit";
        shortKey = "storm_spirit";
        url = "Storm_Spirit";
    }

    public static StormSpirit instance() {
        if( instance == null ){
            instance = new StormSpirit();
        }
        return instance;
    }

    public StormSpiritStaticRemnant getAbility1() {
        return ability1;
    }

    public StormSpiritElectricVortex getAbility2() {
        return ability2;
    }

    public StormSpiritOverload getAbility3() {
        return ability3;
    }

    public StormSpiritBallLightning getAbility4() {
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

    public int getID() {
        return iD;
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

    public String getNameAliases() {
        return nameAliases;
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
        if (!(object instanceof StormSpirit))
            return false;
        if (object == this)
            return true;
        StormSpirit otherObject = (StormSpirit) object;
        return otherObject.getKey().equals(getKey());
    }

}
