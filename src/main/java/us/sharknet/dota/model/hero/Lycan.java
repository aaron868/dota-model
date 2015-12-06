package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Lycan extends Hero {

    private static Lycan instance;

    private final LycanSummonWolves ability1;
    private final LycanHowl ability2;
    private final LycanFeralImpulse ability3;
    private final LycanShapeshift ability4;
    private final AttributeBonus ability5;
    private final double alternateLoadoutScale;
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
    private final int iD;
    private final String key;
    private final String lastHitChallengeRival;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String pickSound;
    private final String portrait;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Lycan() {
        ability1 = LycanSummonWolves.instance();
        ability2 = LycanHowl.instance();
        ability3 = LycanFeralImpulse.instance();
        ability4 = LycanShapeshift.instance();
        ability5 = AttributeBonus.instance();
        alternateLoadoutScale = .6;
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .55;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 41;
        attackDamageMin = 36;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.9;
        attributeBaseAgility = 16;
        attributeBaseIntelligence = 17;
        attributeBaseStrength = 22;
        attributeIntelligenceGain = 1.55;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 3;
        banSound = "lycan_lycan_anger_03";
        boundsHullName = "DOTA_HULL_SIZE_SMALL";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 220;
        heroGlowColor = new int[]{139,1,1};
        heroID = 77;
        heroSelectSoundEffect = "Hero_Lycan.Pick";
        heroUnlockOrder = 0;
        iD = 77;
        key = "npc_dota_hero_lycan";
        lastHitChallengeRival = "npc_dota_hero_skeleton_king";
        model = "models/heroes/lycan/lycan.vmdl";
        modelScale = .85;
        movementSpeed = 305;
        movementTurnRate = .5;
        pickSound = "lycan_lycan_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_lycan";
        role = new String[]{"Carry","Pusher","Jungler","Durable","Escape"};
        rolelevels = new int[]{2,3,1,1,1};
        soundSet = "Hero_Lycan";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_lycan.vsndevts";
        active = true;
        localizedName = "Lycan";
        shortKey = "lycan";
        url = "Lycan";
    }

    public static Lycan instance() {
        if( instance == null ){
            instance = new Lycan();
        }
        return instance;
    }

    public LycanSummonWolves getAbility1() {
        return ability1;
    }

    public LycanHowl getAbility2() {
        return ability2;
    }

    public LycanFeralImpulse getAbility3() {
        return ability3;
    }

    public LycanShapeshift getAbility4() {
        return ability4;
    }

    public AttributeBonus getAbility5() {
        return ability5;
    }

    public double getAlternateLoadoutScale() {
        return alternateLoadoutScale;
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

    public int getID() {
        return iD;
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
        if (!(object instanceof Lycan))
            return false;
        if (object == this)
            return true;
        Lycan otherObject = (Lycan) object;
        return otherObject.getKey().equals(getKey());
    }

}
