package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Sven extends Hero {

    private static Sven instance;

    private final SvenStormBolt ability1;
    private final SvenGreatCleave ability2;
    private final SvenWarcry ability3;
    private final SvenGodsStrength ability4;
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
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final int heroPool1;
    private final int heroPool2;
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

    private Sven() {
        ability1 = SvenStormBolt.instance();
        ability2 = SvenGreatCleave.instance();
        ability3 = SvenWarcry.instance();
        ability4 = SvenGodsStrength.instance();
        armorPhysical = 2;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 43;
        attackDamageMin = 41;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2;
        attributeBaseAgility = 21;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 1.3;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.7;
        banSound = "sven_sven_anger_03";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 150;
        heroGlowColor = new int[]{0,50,247};
        heroID = 18;
        heroPool1 = 1;
        heroPool2 = 1;
        heroSelectSoundEffect = "Hero_Sven.Pick";
        heroUnlockOrder = 0;
        key = "npc_dota_hero_sven";
        lastHitChallengeRival = "npc_dota_hero_omniknight";
        loadoutScale = .9;
        model = "models/heroes/sven/sven.vmdl";
        modelScale = .84;
        movementSpeed = 295;
        movementTurnRate = .6;
        pickSound = "sven_sven_spawn_04";
        portrait = "vgui/hud/heroportraits/portrait_sven";
        projectileSpeed = 0;
        role = new String[]{"Carry","Disabler","Initiator","Durable","Nuker"};
        rolelevels = new int[]{2,2,2,2,1};
        soundSet = "Hero_Sven";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_sven.vsndevts";
        active = true;
        localizedName = "Sven";
        new_player_enable = 1;
        shortKey = "sven";
        url = "Sven";
    }

    public static Sven instance() {
        if( instance == null ){
            instance = new Sven();
        }
        return instance;
    }

    public SvenStormBolt getAbility1() {
        return ability1;
    }

    public SvenGreatCleave getAbility2() {
        return ability2;
    }

    public SvenWarcry getAbility3() {
        return ability3;
    }

    public SvenGodsStrength getAbility4() {
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
        if (!(object instanceof Sven))
            return false;
        if (object == this)
            return true;
        Sven otherObject = (Sven) object;
        return otherObject.getKey().equals(getKey());
    }

}
