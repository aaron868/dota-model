package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class ShadowDemon extends Hero {

    private static ShadowDemon instance;

    private final ShadowDemonDisruption ability1;
    private final ShadowDemonSoulCatcher ability2;
    private final ShadowDemonShadowPoison ability3;
    private final ShadowDemonShadowPoisonRelease ability4;
    private final ShadowDemonDemonicPurge ability5;
    private final AttributeBonus ability6;
    private final int abilityDraftDisabled;
    private final int abilityLayout;
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
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
    private final double loadoutScale;
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

    private ShadowDemon() {
        ability1 = ShadowDemonDisruption.instance();
        ability2 = ShadowDemonSoulCatcher.instance();
        ability3 = ShadowDemonShadowPoison.instance();
        ability4 = ShadowDemonShadowPoisonRelease.instance();
        ability5 = ShadowDemonDemonicPurge.instance();
        ability6 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        abilityLayout = 5;
        armorPhysical = 0;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .35;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 31;
        attackDamageMin = 27;
        attackRange = 500;
        attackRate = 1.7;
        attributeAgilityGain = 2.2;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 23;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 2.7;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.9;
        banSound = "shadow_demon_shadow_demon_anger_03";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 175;
        heroGlowColor = new int[]{242,200,198};
        heroID = 79;
        heroSelectSoundEffect = "Hero_ShadowDemon.Pick";
        heroUnlockOrder = 3;
        idleExpression = "scenes/shadow_demon/shadow_demon_exp_idle_01.vcd";
        key = "npc_dota_hero_shadow_demon";
        lastHitChallengeRival = "npc_dota_hero_bane";
        loadoutScale = .77;
        model = "models/heroes/shadow_demon/shadow_demon.vmdl";
        modelScale = .84;
        movementSpeed = 295;
        movementTurnRate = .6;
        nameAliases = "sd";
        pickSound = "shadow_demon_shadow_demon_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_shadow_demon";
        projectileModel = "particles/units/heroes/hero_shadow_demon/shadow_demon_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Support","Disabler","Initiator","Nuker"};
        rolelevels = new int[]{2,2,1,1};
        soundSet = "Hero_ShadowDemon";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_shadow_demon.vsndevts";
        active = true;
        localizedName = "Shadow Demon";
        shortKey = "shadow_demon";
        url = "Shadow_Demon";
    }

    public static ShadowDemon instance() {
        if( instance == null ){
            instance = new ShadowDemon();
        }
        return instance;
    }

    public ShadowDemonDisruption getAbility1() {
        return ability1;
    }

    public ShadowDemonSoulCatcher getAbility2() {
        return ability2;
    }

    public ShadowDemonShadowPoison getAbility3() {
        return ability3;
    }

    public ShadowDemonShadowPoisonRelease getAbility4() {
        return ability4;
    }

    public ShadowDemonDemonicPurge getAbility5() {
        return ability5;
    }

    public AttributeBonus getAbility6() {
        return ability6;
    }

    public int getAbilityDraftDisabled() {
        return abilityDraftDisabled;
    }

    public int getAbilityLayout() {
        return abilityLayout;
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
        if (!(object instanceof ShadowDemon))
            return false;
        if (object == this)
            return true;
        ShadowDemon otherObject = (ShadowDemon) object;
        return otherObject.getKey().equals(getKey());
    }

}
