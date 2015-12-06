package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class NightStalker extends Hero {

    private static NightStalker instance;

    private final NightStalkerVoid ability1;
    private final NightStalkerCripplingFear ability2;
    private final NightStalkerHunterInTheNight ability3;
    private final NightStalkerDarkness ability4;
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
    private final double statusHealthRegen;
    private final String team;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private NightStalker() {
        ability1 = NightStalkerVoid.instance();
        ability2 = NightStalkerCripplingFear.instance();
        ability3 = NightStalkerHunterInTheNight.instance();
        ability4 = NightStalkerDarkness.instance();
        armorPhysical = 3;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .55;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 42;
        attackDamageMin = 38;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.25;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 1.6;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.8;
        banSound = "night_stalker_nstalk_anger_07";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 165;
        heroGlowColor = new int[]{70,105,255};
        heroID = 60;
        heroSelectSoundEffect = "Hero_NightStalker.Pick";
        heroUnlockOrder = 2;
        iD = 60;
        key = "npc_dota_hero_night_stalker";
        lastHitChallengeRival = "npc_dota_hero_juggernaut";
        loadoutScale = .84;
        model = "models/heroes/nightstalker/nightstalker.vmdl";
        modelScale = .74;
        movementSpeed = 295;
        movementTurnRate = .5;
        nameAliases = "ns";
        pickSound = "night_stalker_nstalk_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_night_stalker";
        role = new String[]{"Carry","Initiator","Durable","Disabler","Nuker"};
        rolelevels = new int[]{1,2,2,2,1};
        soundSet = "Hero_NightStalker";
        statusHealthRegen = 2;
        team = "Bad";
        visionDaytimeRange = 1200;
        visionNighttimeRange = 1800;
        voiceFile = "soundevents/voscripts/game_sounds_vo_night_stalker.vsndevts";
        active = true;
        localizedName = "Night Stalker";
        shortKey = "night_stalker";
        url = "Night_Stalker";
    }

    public static NightStalker instance() {
        if( instance == null ){
            instance = new NightStalker();
        }
        return instance;
    }

    public NightStalkerVoid getAbility1() {
        return ability1;
    }

    public NightStalkerCripplingFear getAbility2() {
        return ability2;
    }

    public NightStalkerHunterInTheNight getAbility3() {
        return ability3;
    }

    public NightStalkerDarkness getAbility4() {
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

    public double getStatusHealthRegen() {
        return statusHealthRegen;
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
        if (!(object instanceof NightStalker))
            return false;
        if (object == this)
            return true;
        NightStalker otherObject = (NightStalker) object;
        return otherObject.getKey().equals(getKey());
    }

}
