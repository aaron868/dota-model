package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class DeathProphet extends Hero {

    private static DeathProphet instance;

    private final DeathProphetCarrionSwarm ability1;
    private final DeathProphetSilence ability2;
    private final DeathProphetSpiritSiphon ability3;
    private final DeathProphetExorcism ability4;
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
    private final int attributeIntelligenceGain;
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
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleSoundLoop;
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
    private final double statusHealthRegen;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final int new_player_enable;
    private final String shortKey;
    private final String url;

    private DeathProphet() {
        ability1 = DeathProphetCarrionSwarm.instance();
        ability2 = DeathProphetSilence.instance();
        ability3 = DeathProphetSpiritSiphon.instance();
        ability4 = DeathProphetExorcism.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .56;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 36;
        attackDamageMin = 24;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1.4;
        attributeBaseAgility = 14;
        attributeBaseIntelligence = 20;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 3;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.9;
        banSound = "death_prophet_dpro_anger_01";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 0;
        enabled = 1;
        healthBarOffset = 200;
        heroGlowColor = new int[]{15,241,28};
        heroID = 43;
        heroPool1 = 1;
        heroSelectSoundEffect = "Hero_DeathProphet.Pick";
        heroUnlockOrder = 1;
        idleSoundLoop = "Hero_DeathProphet.IdleLoop";
        key = "npc_dota_hero_death_prophet";
        lastHitChallengeRival = "npc_dota_hero_dazzle";
        model = "models/heroes/death_prophet/death_prophet.vmdl";
        modelScale = .93;
        movementSpeed = 310;
        movementTurnRate = .5;
        nameAliases = "dp";
        pickSound = "death_prophet_dpro_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_death_prophet";
        projectileModel = "particles/units/heroes/hero_death_prophet/death_prophet_base_attack.vpcf";
        projectileSpeed = 1000;
        role = new String[]{"Carry","Pusher","Nuker","Disabler"};
        rolelevels = new int[]{1,3,1,1};
        soundSet = "Hero_DeathProphet";
        statusHealthRegen = .75;
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_death_prophet.vsndevts";
        active = true;
        localizedName = "Death Prophet";
        new_player_enable = 1;
        shortKey = "death_prophet";
        url = "Death_Prophet";
    }

    public static DeathProphet instance() {
        if( instance == null ){
            instance = new DeathProphet();
        }
        return instance;
    }

    public DeathProphetCarrionSwarm getAbility1() {
        return ability1;
    }

    public DeathProphetSilence getAbility2() {
        return ability2;
    }

    public DeathProphetSpiritSiphon getAbility3() {
        return ability3;
    }

    public DeathProphetExorcism getAbility4() {
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

    public int getAttributeIntelligenceGain() {
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

    public String getHeroSelectSoundEffect() {
        return heroSelectSoundEffect;
    }

    public int getHeroUnlockOrder() {
        return heroUnlockOrder;
    }

    public String getIdleSoundLoop() {
        return idleSoundLoop;
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

    public double getStatusHealthRegen() {
        return statusHealthRegen;
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
        if (!(object instanceof DeathProphet))
            return false;
        if (object == this)
            return true;
        DeathProphet otherObject = (DeathProphet) object;
        return otherObject.getKey().equals(getKey());
    }

}
