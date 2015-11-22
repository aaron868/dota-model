package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Weaver extends Hero {

    private static Weaver instance;

    private final WeaverTheSwarm ability1;
    private final WeaverShukuchi ability2;
    private final WeaverGeminateAttack ability3;
    private final WeaverTimeLapse ability4;
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
    private final int newHero;
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

    private Weaver() {
        ability1 = WeaverTheSwarm.instance();
        ability2 = WeaverShukuchi.instance();
        ability3 = WeaverGeminateAttack.instance();
        ability4 = WeaverTimeLapse.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 8;
        attackAnimationPoint = .64;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 46;
        attackDamageMin = 36;
        attackRange = 425;
        attackRate = 1.8;
        attributeAgilityGain = 2.5;
        attributeBaseAgility = 14;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 15;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.5;
        banSound = "weaver_weav_anger_01";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 11;
        heroID = 63;
        heroSelectSoundEffect = "Hero_Weaver.Pick";
        heroUnlockOrder = 3;
        key = "npc_dota_hero_weaver";
        lastHitChallengeRival = "npc_dota_hero_viper";
        loadoutScale = .9;
        model = "models/heroes/weaver/weaver.vmdl";
        modelScale = .74;
        movementSpeed = 29;
        movementTurnRate = .5;
        newHero = 1;
        pickSound = "weaver_weav_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_weaver";
        projectileModel = "particles/units/heroes/hero_weaver/weaver_base_attack.vpcf";
        projectileSpeed = 9;
        role = new String[]{"Carry","Escape"};
        rolelevels = new int[]{2,3};
        soundSet = "Hero_Weaver";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_weaver.vsndevts";
        active = true;
        localizedName = "Weaver";
        shortKey = "weaver";
        url = "Weaver";
    }

    public static Weaver instance() {
        if( instance == null ){
            instance = new Weaver();
        }
        return instance;
    }

    public WeaverTheSwarm getAbility1() {
        return ability1;
    }

    public WeaverShukuchi getAbility2() {
        return ability2;
    }

    public WeaverGeminateAttack getAbility3() {
        return ability3;
    }

    public WeaverTimeLapse getAbility4() {
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

    public int getNewHero() {
        return newHero;
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
        if (!(object instanceof Weaver))
            return false;
        if (object == this)
            return true;
        Weaver otherObject = (Weaver) object;
        return otherObject.getKey().equals(getKey());
    }

}
