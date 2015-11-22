package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Earthshaker extends Hero {

    private static Earthshaker instance;

    private final EarthshakerFissure ability1;
    private final EarthshakerEnchantTotem ability2;
    private final EarthshakerAftershock ability3;
    private final EarthshakerEchoSlam ability4;
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
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int noCombine;
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

    private Earthshaker() {
        ability1 = EarthshakerFissure.instance();
        ability2 = EarthshakerEnchantTotem.instance();
        ability3 = EarthshakerAftershock.instance();
        ability4 = EarthshakerEchoSlam.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 6;
        attackAnimationPoint = .467;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 34;
        attackDamageMin = 24;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.4;
        attributeBaseAgility = 12;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 22;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.9;
        banSound = "earthshaker_erth_anger_02";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 155;
        heroGlowColor = new int[]{255,160,0};
        heroID = 7;
        heroSelectSoundEffect = "Hero_Earthshaker.Pick";
        heroUnlockOrder = 1;
        idleExpression = "scenes/earthshaker/earthshaker_exp_idle_01.vcd";
        key = "npc_dota_hero_earthshaker";
        lastHitChallengeRival = "npc_dota_hero_tiny";
        model = "models/heroes/earthshaker/earthshaker.vmdl";
        modelScale = .93;
        movementSpeed = 31;
        movementTurnRate = .9;
        noCombine = 0;
        pickSound = "earthshaker_erth_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_earthshaker";
        projectileSpeed = 0;
        role = new String[]{"Support","Initiator","Disabler","Nuker"};
        rolelevels = new int[]{1,3,2,1};
        soundSet = "Hero_Earthshaker";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_earthshaker.vsndevts";
        active = true;
        localizedName = "Earthshaker";
        new_player_enable = 1;
        shortKey = "earthshaker";
        url = "Earthshaker";
    }

    public static Earthshaker instance() {
        if( instance == null ){
            instance = new Earthshaker();
        }
        return instance;
    }

    public EarthshakerFissure getAbility1() {
        return ability1;
    }

    public EarthshakerEnchantTotem getAbility2() {
        return ability2;
    }

    public EarthshakerAftershock getAbility3() {
        return ability3;
    }

    public EarthshakerEchoSlam getAbility4() {
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
        if (!(object instanceof Earthshaker))
            return false;
        if (object == this)
            return true;
        Earthshaker otherObject = (Earthshaker) object;
        return otherObject.getKey().equals(getKey());
    }

}
