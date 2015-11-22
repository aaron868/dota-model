package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class ShadowShaman extends Hero {

    private static ShadowShaman instance;

    private final ShadowShamanEtherShock ability1;
    private final ShadowShamanVoodoo ability2;
    private final ShadowShamanShackles ability3;
    private final ShadowShamanMassSerpentWard ability4;
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
    private final int heroPool2;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
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
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private ShadowShaman() {
        ability1 = ShadowShamanEtherShock.instance();
        ability2 = ShadowShamanVoodoo.instance();
        ability3 = ShadowShamanShackles.instance();
        ability4 = ShadowShamanMassSerpentWard.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 26;
        attackRange = 500;
        attackRate = 1.7;
        attributeAgilityGain = 1.6;
        attributeBaseAgility = 16;
        attributeBaseIntelligence = 21;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 3;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.8;
        banSound = "shadowshaman_shad_anger_01";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 130;
        heroGlowColor = new int[]{255,167,38};
        heroID = 27;
        heroPool2 = 1;
        heroSelectSoundEffect = "Hero_ShadowShaman.Pick";
        heroUnlockOrder = 0;
        idleExpression = "scenes/shadowshaman/shadowshaman_exp_idle_01.vcd";
        key = "npc_dota_hero_shadow_shaman";
        lastHitChallengeRival = "npc_dota_hero_witch_doctor";
        model = "models/heroes/shadowshaman/shadowshaman.vmdl";
        modelScale = .91;
        movementSpeed = 285;
        movementTurnRate = .4;
        nameAliases = "ss";
        pickSound = "shadowshaman_shad_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_shadow_shaman";
        projectileModel = "particles/units/heroes/hero_shadowshaman/shadowshaman_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Support","Pusher","Disabler","Nuker","Initiator"};
        rolelevels = new int[]{2,3,3,2,1};
        soundSet = "Hero_ShadowShaman";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_shadowshaman.vsndevts";
        active = true;
        localizedName = "Shadow Shaman";
        shortKey = "shadow_shaman";
        url = "Shadow_Shaman";
    }

    public static ShadowShaman instance() {
        if( instance == null ){
            instance = new ShadowShaman();
        }
        return instance;
    }

    public ShadowShamanEtherShock getAbility1() {
        return ability1;
    }

    public ShadowShamanVoodoo getAbility2() {
        return ability2;
    }

    public ShadowShamanShackles getAbility3() {
        return ability3;
    }

    public ShadowShamanMassSerpentWard getAbility4() {
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
        if (!(object instanceof ShadowShaman))
            return false;
        if (object == this)
            return true;
        ShadowShaman otherObject = (ShadowShaman) object;
        return otherObject.getKey().equals(getKey());
    }

}
