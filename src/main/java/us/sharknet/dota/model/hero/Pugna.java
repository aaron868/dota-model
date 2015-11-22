package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Pugna extends Hero {

    private static Pugna instance;

    private final PugnaNetherBlast ability1;
    private final PugnaDecrepify ability2;
    private final PugnaNetherWard ability3;
    private final PugnaLifeDrain ability4;
    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final int attackRange;
    private final double attackRate;
    private final int attributeAgilityGain;
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
    private final String shortKey;
    private final String url;

    private Pugna() {
        ability1 = PugnaNetherBlast.instance();
        ability2 = PugnaDecrepify.instance();
        ability3 = PugnaNetherWard.instance();
        ability4 = PugnaLifeDrain.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 8;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 27;
        attackDamageMin = 19;
        attackRange = 6;
        attackRate = 1.7;
        attributeAgilityGain = 1;
        attributeBaseAgility = 16;
        attributeBaseIntelligence = 26;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 4;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.2;
        banSound = "pugna_pugna_anger_01";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 14;
        heroGlowColor = new int[]{194,80,163};
        heroID = 45;
        heroSelectSoundEffect = "Hero_Pugna.Pick";
        heroUnlockOrder = 3;
        idleExpression = "scenes/pugna/pugna_exp_idle_01.vcd";
        key = "npc_dota_hero_pugna";
        lastHitChallengeRival = "npc_dota_hero_viper";
        loadoutScale = .85;
        model = "models/heroes/pugna/pugna.vmdl";
        modelScale = .74;
        movementSpeed = 33;
        movementTurnRate = .5;
        pickSound = "pugna_pugna_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_pugna";
        projectileModel = "particles/units/heroes/hero_pugna/pugna_base_attack.vpcf";
        projectileSpeed = 9;
        role = new String[]{"Nuker","Pusher"};
        rolelevels = new int[]{2,2};
        soundSet = "Hero_Pugna";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_pugna.vsndevts";
        active = true;
        localizedName = "Pugna";
        shortKey = "pugna";
        url = "Pugna";
    }

    public static Pugna instance() {
        if( instance == null ){
            instance = new Pugna();
        }
        return instance;
    }

    public PugnaNetherBlast getAbility1() {
        return ability1;
    }

    public PugnaDecrepify getAbility2() {
        return ability2;
    }

    public PugnaNetherWard getAbility3() {
        return ability3;
    }

    public PugnaLifeDrain getAbility4() {
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

    public int getAttributeAgilityGain() {
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Pugna))
            return false;
        if (object == this)
            return true;
        Pugna otherObject = (Pugna) object;
        return otherObject.getKey().equals(getKey());
    }

}
