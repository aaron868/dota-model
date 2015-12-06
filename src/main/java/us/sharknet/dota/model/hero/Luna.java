package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Luna extends Hero {

    private static Luna instance;

    private final LunaLucentBeam ability1;
    private final LunaMoonGlaive ability2;
    private final LunaLunarBlessing ability3;
    private final LunaEclipse ability4;
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
    private final int heroID;
    private final int heroPool1;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final int iD;
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
    private final String projectileModel;
    private final int projectileSpeed;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Luna() {
        ability1 = LunaLucentBeam.instance();
        ability2 = LunaMoonGlaive.instance();
        ability3 = LunaLunarBlessing.instance();
        ability4 = LunaEclipse.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .46;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 32;
        attackDamageMin = 26;
        attackRange = 330;
        attackRate = 1.7;
        attributeAgilityGain = 2.8;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 15;
        attributeIntelligenceGain = 1.85;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.2;
        banSound = "luna_luna_anger_02";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 185;
        heroID = 48;
        heroPool1 = 1;
        heroSelectSoundEffect = "Hero_Luna.Pick";
        heroUnlockOrder = 0;
        iD = 48;
        idleExpression = "scenes/luna/luna_exp_idle_01.vcd";
        key = "npc_dota_hero_luna";
        lastHitChallengeRival = "npc_dota_hero_lina";
        model = "models/heroes/luna/luna.vmdl";
        modelScale = .74;
        movementSpeed = 330;
        movementTurnRate = .4;
        noCombine = 0;
        pickSound = "luna_luna_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_luna";
        projectileModel = "particles/units/heroes/hero_luna/luna_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Carry","Nuker","Pusher"};
        rolelevels = new int[]{2,2,1};
        soundSet = "Hero_Luna";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_luna.vsndevts";
        active = true;
        localizedName = "Luna";
        shortKey = "luna";
        url = "Luna";
    }

    public static Luna instance() {
        if( instance == null ){
            instance = new Luna();
        }
        return instance;
    }

    public LunaLucentBeam getAbility1() {
        return ability1;
    }

    public LunaMoonGlaive getAbility2() {
        return ability2;
    }

    public LunaLunarBlessing getAbility3() {
        return ability3;
    }

    public LunaEclipse getAbility4() {
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Luna))
            return false;
        if (object == this)
            return true;
        Luna otherObject = (Luna) object;
        return otherObject.getKey().equals(getKey());
    }

}
