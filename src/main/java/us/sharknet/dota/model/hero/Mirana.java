package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Mirana extends Hero {

    private static Mirana instance;

    private final MiranaStarfall ability1;
    private final MiranaArrow ability2;
    private final MiranaLeap ability3;
    private final MiranaInvis ability4;
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

    private Mirana() {
        ability1 = MiranaStarfall.instance();
        ability2 = MiranaArrow.instance();
        ability3 = MiranaLeap.instance();
        ability4 = MiranaInvis.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 8;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 29;
        attackDamageMin = 18;
        attackRange = 6;
        attackRate = 1.7;
        attributeAgilityGain = 3.3;
        attributeBaseAgility = 2;
        attributeBaseIntelligence = 17;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 1.65;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.85;
        banSound = "mirana_mir_anger_01";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 155;
        heroGlowColor = new int[]{220,194,248};
        heroID = 9;
        heroSelectSoundEffect = "Hero_Mirana.Pick";
        heroUnlockOrder = 1;
        idleExpression = "scenes/mirana/mirana_exp_idle_01.vcd";
        key = "npc_dota_hero_mirana";
        lastHitChallengeRival = "npc_dota_hero_luna";
        model = "models/heroes/mirana/mirana.vmdl";
        modelScale = .79;
        movementSpeed = 3;
        movementTurnRate = .4;
        pickSound = "mirana_mir_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_mirana";
        projectileModel = "particles/units/heroes/hero_mirana/mirana_base_attack.vpcf";
        projectileSpeed = 9;
        role = new String[]{"Carry","Support","Escape","Nuker","Disabler"};
        rolelevels = new int[]{1,1,2,1,1};
        soundSet = "Hero_Mirana";
        team = "Good";
        visionNighttimeRange = 8;
        voiceFile = "soundevents/voscripts/game_sounds_vo_mirana.vsndevts";
        active = true;
        localizedName = "Mirana";
        shortKey = "mirana";
        url = "Mirana";
    }

    public static Mirana instance() {
        if( instance == null ){
            instance = new Mirana();
        }
        return instance;
    }

    public MiranaStarfall getAbility1() {
        return ability1;
    }

    public MiranaArrow getAbility2() {
        return ability2;
    }

    public MiranaLeap getAbility3() {
        return ability3;
    }

    public MiranaInvis getAbility4() {
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
        if (!(object instanceof Mirana))
            return false;
        if (object == this)
            return true;
        Mirana otherObject = (Mirana) object;
        return otherObject.getKey().equals(getKey());
    }

}
