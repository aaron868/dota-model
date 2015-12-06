package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Sniper extends Hero {

    private static Sniper instance;

    private final SniperShrapnel ability1;
    private final SniperHeadshot ability2;
    private final SniperTakeAim ability3;
    private final SniperAssassinate ability4;
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
    private final int heroPool1;
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
    private final String pickSound;
    private final String portrait;
    private final String projectileModel;
    private final int projectileSpeed;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final int visionNighttimeRange;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final int new_player_enable;
    private final String shortKey;
    private final String url;

    private Sniper() {
        ability1 = SniperShrapnel.instance();
        ability2 = SniperHeadshot.instance();
        ability3 = SniperTakeAim.instance();
        ability4 = SniperAssassinate.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 950;
        attackAnimationPoint = .17;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 21;
        attackDamageMin = 15;
        attackRange = 550;
        attackRate = 1.7;
        attributeAgilityGain = 2.5;
        attributeBaseAgility = 21;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 16;
        attributeIntelligenceGain = 2.6;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.7;
        banSound = "sniper_snip_anger_01";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        hasAggressiveStance = 1;
        healthBarOffset = 110;
        heroGlowColor = new int[]{237,154,15};
        heroID = 35;
        heroPool1 = 1;
        heroSelectSoundEffect = "Hero_Sniper.Pick";
        heroUnlockOrder = 0;
        idleExpression = "scenes/sniper/sniper_exp_idle_01.vcd";
        key = "npc_dota_hero_sniper";
        lastHitChallengeRival = "npc_dota_hero_drow_ranger";
        loadoutScale = 1;
        model = "models/heroes/sniper/sniper.vmdl";
        modelScale = .84;
        movementSpeed = 290;
        movementTurnRate = .6;
        pickSound = "sniper_snip_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_sniper";
        projectileModel = "particles/units/heroes/hero_sniper/sniper_base_attack.vpcf";
        projectileSpeed = 3000;
        role = new String[]{"Carry","Nuker"};
        rolelevels = new int[]{3,1};
        soundSet = "Hero_Sniper";
        team = "Good";
        visionNighttimeRange = 1000;
        voiceFile = "soundevents/voscripts/game_sounds_vo_sniper.vsndevts";
        active = true;
        localizedName = "Sniper";
        new_player_enable = 1;
        shortKey = "sniper";
        url = "Sniper";
    }

    public static Sniper instance() {
        if( instance == null ){
            instance = new Sniper();
        }
        return instance;
    }

    public SniperShrapnel getAbility1() {
        return ability1;
    }

    public SniperHeadshot getAbility2() {
        return ability2;
    }

    public SniperTakeAim getAbility3() {
        return ability3;
    }

    public SniperAssassinate getAbility4() {
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

    public int getHeroPool1() {
        return heroPool1;
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
        if (!(object instanceof Sniper))
            return false;
        if (object == this)
            return true;
        Sniper otherObject = (Sniper) object;
        return otherObject.getKey().equals(getKey());
    }

}
