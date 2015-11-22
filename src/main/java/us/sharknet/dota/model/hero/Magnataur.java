package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Magnataur extends Hero {

    private static Magnataur instance;

    private final MagnataurShockwave ability1;
    private final MagnataurEmpower ability2;
    private final MagnataurSkewer ability3;
    private final MagnataurReversePolarity ability4;
    private final AttributeBonus ability5;
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
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
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
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Magnataur() {
        ability1 = MagnataurShockwave.instance();
        ability2 = MagnataurEmpower.instance();
        ability3 = MagnataurSkewer.instance();
        ability4 = MagnataurReversePolarity.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = 2;
        attackAcquisitionRange = 6;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 4;
        attackDamageMin = 28;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.5;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 19;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 1.65;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.75;
        banSound = "magnataur_magn_anger_07";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 22;
        heroID = 97;
        heroSelectSoundEffect = "Hero_Magnataur.Pick";
        heroUnlockOrder = 0;
        key = "npc_dota_hero_magnataur";
        lastHitChallengeRival = "npc_dota_hero_tidehunter";
        loadoutScale = .9;
        model = "models/heroes/magnataur/magnataur.vmdl";
        modelScale = .92;
        movementSpeed = 315;
        movementTurnRate = .8;
        nameAliases = "magnataur, magnus";
        pickSound = "magnataur_magn_spawn_06";
        portrait = "vgui/hud/heroportraits/portrait_centaur";
        role = new String[]{"Initiator","Disabler","Nuker","Escape"};
        rolelevels = new int[]{3,2,1,1};
        soundSet = "Hero_Magnataur";
        team = "Bad";
        visionDaytimeRange = 18;
        visionNighttimeRange = 8;
        voiceFile = "soundevents/voscripts/game_sounds_vo_magnataur.vsndevts";
        active = true;
        localizedName = "Magnus";
        shortKey = "magnataur";
        url = "Magnus";
    }

    public static Magnataur instance() {
        if( instance == null ){
            instance = new Magnataur();
        }
        return instance;
    }

    public MagnataurShockwave getAbility1() {
        return ability1;
    }

    public MagnataurEmpower getAbility2() {
        return ability2;
    }

    public MagnataurSkewer getAbility3() {
        return ability3;
    }

    public MagnataurReversePolarity getAbility4() {
        return ability4;
    }

    public AttributeBonus getAbility5() {
        return ability5;
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

    public int getVisionDaytimeRange() {
        return visionDaytimeRange;
    }

    public int getVisionNighttimeRange() {
        return visionNighttimeRange;
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
        if (!(object instanceof Magnataur))
            return false;
        if (object == this)
            return true;
        Magnataur otherObject = (Magnataur) object;
        return otherObject.getKey().equals(getKey());
    }

}
