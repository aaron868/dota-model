package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Medusa extends Hero {

    private static Medusa instance;

    private final MedusaSplitShot ability1;
    private final MedusaMysticSnake ability2;
    private final MedusaManaShield ability3;
    private final MedusaStoneGaze ability4;
    private final AttributeBonus ability5;
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
    private final int hasAggressiveStance;
    private final int healthBarOffset;
    private final int heroID;
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
    private final String[] nameAliases;
    private final int noCombine;
    private final String pickSound;
    private final String portrait;
    private final String projectileModel;
    private final int projectileSpeed;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Medusa() {
        ability1 = MedusaSplitShot.instance();
        ability2 = MedusaMysticSnake.instance();
        ability3 = MedusaManaShield.instance();
        ability4 = MedusaStoneGaze.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 30;
        attackDamageMin = 24;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 2.5;
        attributeBaseAgility = 20;
        attributeBaseIntelligence = 19;
        attributeBaseStrength = 14;
        attributeIntelligenceGain = 1.85;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.65;
        banSound = "medusa_medus_anger_13";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        hasAggressiveStance = 1;
        healthBarOffset = 200;
        heroID = 94;
        heroSelectSoundEffect = "Hero_Medusa.Pick";
        heroUnlockOrder = 0;
        iD = 94;
        idleExpression = "scenes/medusa/medusa_exp_idle_01.vcd";
        key = "npc_dota_hero_medusa";
        lastHitChallengeRival = "npc_dota_hero_zuus";
        model = "models/heroes/medusa/medusa.vmdl";
        modelScale = .85;
        movementSpeed = 290;
        movementTurnRate = .5;
        nameAliases = new String[]{"medusa","gorgon"};
        noCombine = 1;
        pickSound = "medusa_medus_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_medusa";
        projectileModel = "particles/units/heroes/hero_medusa/medusa_base_attack.vpcf";
        projectileSpeed = 1200;
        role = new String[]{"Carry","Disabler","Durable"};
        rolelevels = new int[]{3,1,1};
        soundSet = "Hero_Medusa";
        team = "Bad";
        visionDaytimeRange = 1800;
        visionNighttimeRange = 800;
        voiceFile = "soundevents/voscripts/game_sounds_vo_medusa.vsndevts";
        active = true;
        localizedName = "Medusa";
        shortKey = "medusa";
        url = "Medusa";
    }

    public static Medusa instance() {
        if( instance == null ){
            instance = new Medusa();
        }
        return instance;
    }

    public MedusaSplitShot getAbility1() {
        return ability1;
    }

    public MedusaMysticSnake getAbility2() {
        return ability2;
    }

    public MedusaManaShield getAbility3() {
        return ability3;
    }

    public MedusaStoneGaze getAbility4() {
        return ability4;
    }

    public AttributeBonus getAbility5() {
        return ability5;
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

    public int getHasAggressiveStance() {
        return hasAggressiveStance;
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

    public String[] getNameAliases() {
        return nameAliases;
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

    public int getVisionDaytimeRange() {
        return visionDaytimeRange;
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
        if (!(object instanceof Medusa))
            return false;
        if (object == this)
            return true;
        Medusa otherObject = (Medusa) object;
        return otherObject.getKey().equals(getKey());
    }

}
