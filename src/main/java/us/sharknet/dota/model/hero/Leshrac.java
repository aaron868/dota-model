package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Leshrac extends Hero {

    private static Leshrac instance;

    private final LeshracSplitEarth ability1;
    private final LeshracDiabolicEdict ability2;
    private final LeshracLightningStorm ability3;
    private final LeshracPulseNova ability4;
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
    private final int visionNighttimeRange;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Leshrac() {
        ability1 = LeshracSplitEarth.instance();
        ability2 = LeshracDiabolicEdict.instance();
        ability3 = LeshracLightningStorm.instance();
        ability4 = LeshracPulseNova.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 19;
        attackDamageMin = 15;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1.7;
        attributeBaseAgility = 23;
        attributeBaseIntelligence = 26;
        attributeBaseStrength = 16;
        attributeIntelligenceGain = 3;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.5;
        banSound = "leshrac_lesh_anger_06";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 170;
        heroGlowColor = new int[]{12,157,179};
        heroID = 52;
        heroSelectSoundEffect = "Hero_Leshrac.Pick";
        heroUnlockOrder = 1;
        key = "npc_dota_hero_leshrac";
        lastHitChallengeRival = "npc_dota_hero_lion";
        loadoutScale = .75;
        model = "models/heroes/leshrac/leshrac.vmdl";
        modelScale = .84;
        movementSpeed = 320;
        movementTurnRate = .5;
        pickSound = "leshrac_lesh_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_leshrac";
        projectileModel = "particles/units/heroes/hero_leshrac/leshrac_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Carry","Support","Nuker","Pusher","Disabler"};
        rolelevels = new int[]{1,1,3,3,1};
        soundSet = "Hero_Leshrac";
        team = "Bad";
        visionNighttimeRange = 800;
        voiceFile = "soundevents/voscripts/game_sounds_vo_leshrac.vsndevts";
        active = true;
        localizedName = "Leshrac";
        shortKey = "leshrac";
        url = "Leshrac";
    }

    public static Leshrac instance() {
        if( instance == null ){
            instance = new Leshrac();
        }
        return instance;
    }

    public LeshracSplitEarth getAbility1() {
        return ability1;
    }

    public LeshracDiabolicEdict getAbility2() {
        return ability2;
    }

    public LeshracLightningStorm getAbility3() {
        return ability3;
    }

    public LeshracPulseNova getAbility4() {
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
        if (!(object instanceof Leshrac))
            return false;
        if (object == this)
            return true;
        Leshrac otherObject = (Leshrac) object;
        return otherObject.getKey().equals(getKey());
    }

}
