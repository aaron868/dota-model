package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class SkywrathMage extends Hero {

    private static SkywrathMage instance;

    private final SkywrathMageArcaneBolt ability1;
    private final SkywrathMageConcussiveShot ability2;
    private final SkywrathMageAncientSeal ability3;
    private final SkywrathMageMysticFlare ability4;
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
    private final int hasAggressiveStance;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
    private final int loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int noCombine;
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

    private SkywrathMage() {
        ability1 = SkywrathMageArcaneBolt.instance();
        ability2 = SkywrathMageConcussiveShot.instance();
        ability3 = SkywrathMageAncientSeal.instance();
        ability4 = SkywrathMageMysticFlare.instance();
        armorPhysical = -2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 22;
        attackDamageMin = 12;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = .8;
        attributeBaseAgility = 13;
        attributeBaseIntelligence = 27;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 3.6;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.5;
        banSound = "skywrath_mage_drag_anger_13";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        hasAggressiveStance = 1;
        healthBarOffset = 300;
        heroGlowColor = new int[]{194,80,163};
        heroID = 101;
        heroSelectSoundEffect = "Hero_SkywrathMage.Pick";
        heroUnlockOrder = 3;
        idleExpression = "scenes/skywrath_mage/skywrath_mage_exp_idle_01.vcd";
        key = "npc_dota_hero_skywrath_mage";
        lastHitChallengeRival = "npc_dota_hero_vengefulspirit";
        loadoutScale = 1;
        model = "models/heroes/skywrath_mage/skywrath_mage.vmdl";
        modelScale = .75;
        movementSpeed = 325;
        movementTurnRate = .5;
        noCombine = 1;
        pickSound = "skywrath_mage_drag_spawn_02";
        portrait = "vgui/hud/heroportraits/portrait_skywrath_mage";
        projectileModel = "particles/units/heroes/hero_skywrath_mage/skywrath_mage_base_attack.vpcf";
        projectileSpeed = 1000;
        role = new String[]{"Support","Nuker","Disabler"};
        rolelevels = new int[]{2,3,1};
        soundSet = "Hero_SkywrathMage";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_skywrath_mage.vsndevts";
        active = true;
        localizedName = "Skywrath Mage";
        shortKey = "skywrath_mage";
        url = "Skywrath_Mage";
    }

    public static SkywrathMage instance() {
        if( instance == null ){
            instance = new SkywrathMage();
        }
        return instance;
    }

    public SkywrathMageArcaneBolt getAbility1() {
        return ability1;
    }

    public SkywrathMageConcussiveShot getAbility2() {
        return ability2;
    }

    public SkywrathMageAncientSeal getAbility3() {
        return ability3;
    }

    public SkywrathMageMysticFlare getAbility4() {
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

    public int getLoadoutScale() {
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
        if (!(object instanceof SkywrathMage))
            return false;
        if (object == this)
            return true;
        SkywrathMage otherObject = (SkywrathMage) object;
        return otherObject.getKey().equals(getKey());
    }

}
