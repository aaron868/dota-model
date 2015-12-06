package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Lion extends Hero {

    private static Lion instance;

    private final LionImpale ability1;
    private final LionVoodoo ability2;
    private final LionManaDrain ability3;
    private final LionFingerOfDeath ability4;
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
    private final int iD;
    private final String idleExpression;
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

    private Lion() {
        ability1 = LionImpale.instance();
        ability2 = LionVoodoo.instance();
        ability3 = LionManaDrain.instance();
        ability4 = LionFingerOfDeath.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .43;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 27;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1.5;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 22;
        attributeBaseStrength = 16;
        attributeIntelligenceGain = 3;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.7;
        banSound = "lion_lion_anger_03";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 170;
        heroGlowColor = new int[]{110,50,165};
        heroID = 26;
        heroPool1 = 1;
        heroSelectSoundEffect = "Hero_Lion.Pick";
        heroUnlockOrder = 0;
        iD = 26;
        idleExpression = "scenes/lion/lion_exp_idle_01.vcd";
        key = "npc_dota_hero_lion";
        lastHitChallengeRival = "npc_dota_hero_witch_doctor";
        loadoutScale = .82;
        model = "models/heroes/lion/lion.vmdl";
        modelScale = .7;
        movementSpeed = 290;
        movementTurnRate = .5;
        pickSound = "lion_lion_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_lion";
        projectileModel = "particles/units/heroes/hero_lion/lion_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Support","Disabler","Nuker","Initiator"};
        rolelevels = new int[]{2,3,3,2};
        soundSet = "Hero_Lion";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_lion.vsndevts";
        active = true;
        localizedName = "Lion";
        new_player_enable = 1;
        shortKey = "lion";
        url = "Lion";
    }

    public static Lion instance() {
        if( instance == null ){
            instance = new Lion();
        }
        return instance;
    }

    public LionImpale getAbility1() {
        return ability1;
    }

    public LionVoodoo getAbility2() {
        return ability2;
    }

    public LionManaDrain getAbility3() {
        return ability3;
    }

    public LionFingerOfDeath getAbility4() {
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

    public int getID() {
        return iD;
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
        if (!(object instanceof Lion))
            return false;
        if (object == this)
            return true;
        Lion otherObject = (Lion) object;
        return otherObject.getKey().equals(getKey());
    }

}
