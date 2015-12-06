package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Tiny extends Hero {

    private static Tiny instance;

    private final TinyAvalanche ability1;
    private final TinyToss ability2;
    private final TinyCraggyExterior ability3;
    private final TinyGrow ability4;
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
    private final int botImplemented;
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
    private final int loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int noCombine;
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

    private Tiny() {
        ability1 = TinyAvalanche.instance();
        ability2 = TinyToss.instance();
        ability3 = TinyCraggyExterior.instance();
        ability4 = TinyGrow.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .49;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 43;
        attackDamageMin = 37;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = .9;
        attributeBaseAgility = 9;
        attributeBaseIntelligence = 17;
        attributeBaseStrength = 26;
        attributeIntelligenceGain = 1.6;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 3;
        banSound = "tiny_tiny_anger_01";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 165;
        heroGlowColor = new int[]{254,242,200};
        heroID = 19;
        heroSelectSoundEffect = "Hero_Tiny.Pick";
        heroUnlockOrder = 1;
        key = "npc_dota_hero_tiny";
        lastHitChallengeRival = "npc_dota_hero_earthshaker";
        loadoutScale = 1;
        model = "models/heroes/tiny_01/tiny_01.vmdl";
        modelScale = .93;
        movementSpeed = 285;
        movementTurnRate = .5;
        noCombine = 0;
        pickSound = "tiny_tiny_spawn_09";
        portrait = "vgui/hud/heroportraits/portrait_tiny";
        role = new String[]{"Carry","Nuker","Pusher","Initiator","Durable","Disabler"};
        rolelevels = new int[]{3,2,2,2,2,1};
        soundSet = "Hero_Tiny";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_tiny.vsndevts";
        active = true;
        localizedName = "Tiny";
        shortKey = "tiny";
        url = "Tiny";
    }

    public static Tiny instance() {
        if( instance == null ){
            instance = new Tiny();
        }
        return instance;
    }

    public TinyAvalanche getAbility1() {
        return ability1;
    }

    public TinyToss getAbility2() {
        return ability2;
    }

    public TinyCraggyExterior getAbility3() {
        return ability3;
    }

    public TinyGrow getAbility4() {
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
        if (!(object instanceof Tiny))
            return false;
        if (object == this)
            return true;
        Tiny otherObject = (Tiny) object;
        return otherObject.getKey().equals(getKey());
    }

}
