package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Warlock extends Hero {

    private static Warlock instance;

    private final WarlockFatalBonds ability1;
    private final WarlockShadowWord ability2;
    private final WarlockUpheaval ability3;
    private final WarlockRainOfChaos ability4;
    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final int attackRange;
    private final double attackRate;
    private final int attributeAgilityGain;
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
    private final int heroPool1;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
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
    private final int new_player_enable;
    private final String shortKey;
    private final String url;

    private Warlock() {
        ability1 = WarlockFatalBonds.instance();
        ability2 = WarlockShadowWord.instance();
        ability3 = WarlockUpheaval.instance();
        ability4 = WarlockRainOfChaos.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 32;
        attackDamageMin = 22;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1;
        attributeBaseAgility = 10;
        attributeBaseIntelligence = 24;
        attributeBaseStrength = 22;
        attributeIntelligenceGain = 2.7;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.5;
        banSound = "warlock_warl_anger_04";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        hasAggressiveStance = 1;
        healthBarOffset = 195;
        heroGlowColor = new int[]{249,54,47};
        heroID = 37;
        heroPool1 = 1;
        heroSelectSoundEffect = "Hero_Warlock.Pick";
        heroUnlockOrder = 2;
        key = "npc_dota_hero_warlock";
        lastHitChallengeRival = "npc_dota_hero_lion";
        loadoutScale = .87;
        model = "models/heroes/warlock/warlock.vmdl";
        modelScale = .93;
        movementSpeed = 295;
        movementTurnRate = .4;
        pickSound = "warlock_warl_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_warlock";
        projectileModel = "particles/units/heroes/hero_warlock/warlock_base_attack.vpcf";
        projectileSpeed = 1200;
        role = new String[]{"Support","Initiator","Disabler"};
        rolelevels = new int[]{1,2,1};
        soundSet = "Hero_Warlock";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_warlock.vsndevts";
        active = true;
        localizedName = "Warlock";
        new_player_enable = 1;
        shortKey = "warlock";
        url = "Warlock";
    }

    public static Warlock instance() {
        if( instance == null ){
            instance = new Warlock();
        }
        return instance;
    }

    public WarlockFatalBonds getAbility1() {
        return ability1;
    }

    public WarlockShadowWord getAbility2() {
        return ability2;
    }

    public WarlockUpheaval getAbility3() {
        return ability3;
    }

    public WarlockRainOfChaos getAbility4() {
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

    public int getAttributeAgilityGain() {
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

    public int getHeroPool1() {
        return heroPool1;
    }

    public String getHeroSelectSoundEffect() {
        return heroSelectSoundEffect;
    }

    public int getHeroUnlockOrder() {
        return heroUnlockOrder;
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
        if (!(object instanceof Warlock))
            return false;
        if (object == this)
            return true;
        Warlock otherObject = (Warlock) object;
        return otherObject.getKey().equals(getKey());
    }

}
