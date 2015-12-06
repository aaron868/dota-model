package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Tinker extends Hero {

    private static Tinker instance;

    private final TinkerLaser ability1;
    private final TinkerHeatSeekingMissile ability2;
    private final TinkerMarchOfTheMachines ability3;
    private final TinkerRearm ability4;
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
    private final int attributeStrengthGain;
    private final String banSound;
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
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

    private Tinker() {
        ability1 = TinkerLaser.instance();
        ability2 = TinkerHeatSeekingMissile.instance();
        ability3 = TinkerMarchOfTheMachines.instance();
        ability4 = TinkerRearm.instance();
        armorPhysical = 2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .35;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 28;
        attackDamageMin = 22;
        attackRange = 500;
        attackRate = 1.7;
        attributeAgilityGain = 1.2;
        attributeBaseAgility = 13;
        attributeBaseIntelligence = 27;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 2.2;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2;
        banSound = "tinker_tink_anger_10";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 150;
        heroGlowColor = new int[]{220,194,8};
        heroID = 34;
        heroSelectSoundEffect = "Hero_Tinker.Pick";
        heroUnlockOrder = 1;
        key = "npc_dota_hero_tinker";
        lastHitChallengeRival = "npc_dota_hero_lina";
        model = "models/heroes/tinker/tinker.vmdl";
        modelScale = .8;
        movementSpeed = 305;
        movementTurnRate = .6;
        pickSound = "tinker_tink_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_tinker";
        projectileModel = "particles/units/heroes/hero_tinker/tinker_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Carry","Nuker","Pusher"};
        rolelevels = new int[]{1,3,2};
        soundSet = "Hero_Tinker";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_tinker.vsndevts";
        active = true;
        localizedName = "Tinker";
        shortKey = "tinker";
        url = "Tinker";
    }

    public static Tinker instance() {
        if( instance == null ){
            instance = new Tinker();
        }
        return instance;
    }

    public TinkerLaser getAbility1() {
        return ability1;
    }

    public TinkerHeatSeekingMissile getAbility2() {
        return ability2;
    }

    public TinkerMarchOfTheMachines getAbility3() {
        return ability3;
    }

    public TinkerRearm getAbility4() {
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

    public int getAttributeStrengthGain() {
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
        if (!(object instanceof Tinker))
            return false;
        if (object == this)
            return true;
        Tinker otherObject = (Tinker) object;
        return otherObject.getKey().equals(getKey());
    }

}
