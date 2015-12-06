package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class CrystalMaiden extends Hero {

    private static CrystalMaiden instance;

    private final CrystalMaidenCrystalNova ability1;
    private final CrystalMaidenFrostbite ability2;
    private final CrystalMaidenBrillianceAura ability3;
    private final CrystalMaidenFreezingField ability4;
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
    private final int heroPool2;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
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

    private CrystalMaiden() {
        ability1 = CrystalMaidenCrystalNova.instance();
        ability2 = CrystalMaidenFrostbite.instance();
        ability3 = CrystalMaidenBrillianceAura.instance();
        ability4 = CrystalMaidenFreezingField.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .55;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 25;
        attackDamageMin = 19;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1.6;
        attributeBaseAgility = 16;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 16;
        attributeIntelligenceGain = 2.9;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.7;
        banSound = "crystalmaiden_cm_anger_08";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        hasAggressiveStance = 1;
        healthBarOffset = 135;
        heroGlowColor = new int[]{82,236,255};
        heroID = 5;
        heroPool2 = 1;
        heroSelectSoundEffect = "Hero_CrystalMaiden.Pick";
        heroUnlockOrder = 0;
        idleExpression = "scenes/crystalmaiden/crystalmaiden_exp_idle_05.vcd";
        key = "npc_dota_hero_crystal_maiden";
        lastHitChallengeRival = "npc_dota_hero_lina";
        loadoutScale = .93;
        model = "models/heroes/crystal_maiden/crystal_maiden.vmdl";
        modelScale = .81;
        movementSpeed = 280;
        movementTurnRate = .5;
        nameAliases = "cm";
        pickSound = "crystalmaiden_cm_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_crystal_maiden";
        projectileModel = "particles/units/heroes/hero_crystalmaiden/maiden_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Support","Disabler","Nuker","Jungler"};
        rolelevels = new int[]{3,2,2,1};
        soundSet = "hero_Crystal";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_crystalmaiden.vsndevts";
        active = true;
        localizedName = "Crystal Maiden";
        shortKey = "crystal_maiden";
        url = "Crystal_Maiden";
    }

    public static CrystalMaiden instance() {
        if( instance == null ){
            instance = new CrystalMaiden();
        }
        return instance;
    }

    public CrystalMaidenCrystalNova getAbility1() {
        return ability1;
    }

    public CrystalMaidenFrostbite getAbility2() {
        return ability2;
    }

    public CrystalMaidenBrillianceAura getAbility3() {
        return ability3;
    }

    public CrystalMaidenFreezingField getAbility4() {
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

    public int getHeroPool2() {
        return heroPool2;
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
        if (!(object instanceof CrystalMaiden))
            return false;
        if (object == this)
            return true;
        CrystalMaiden otherObject = (CrystalMaiden) object;
        return otherObject.getKey().equals(getKey());
    }

}
