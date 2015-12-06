package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Disruptor extends Hero {

    private static Disruptor instance;

    private final DisruptorThunderStrike ability1;
    private final DisruptorGlimpse ability2;
    private final DisruptorKineticField ability3;
    private final DisruptorStaticStorm ability4;
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
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int iD;
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

    private Disruptor() {
        ability1 = DisruptorThunderStrike.instance();
        ability2 = DisruptorGlimpse.instance();
        ability3 = DisruptorKineticField.instance();
        ability4 = DisruptorStaticStorm.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 31;
        attackDamageMin = 27;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1.4;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 22;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 2.5;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.9;
        banSound = "disruptor_dis_anger_06";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 200;
        heroID = 87;
        heroSelectSoundEffect = "Hero_Disruptor.Pick";
        iD = 87;
        key = "npc_dota_hero_disruptor";
        lastHitChallengeRival = "npc_dota_hero_warlock";
        loadoutScale = .71;
        model = "models/heroes/disruptor/disruptor.vmdl";
        modelScale = .79;
        movementSpeed = 300;
        movementTurnRate = .5;
        nameAliases = "disruptor";
        pickSound = "disruptor_dis_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_disruptor";
        projectileModel = "particles/units/heroes/hero_disruptor/disruptor_base_attack.vpcf";
        projectileSpeed = 1200;
        role = new String[]{"Support","Disabler","Nuker","Initiator"};
        rolelevels = new int[]{2,2,1,1};
        soundSet = "Hero_Disruptor";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_disruptor.vsndevts";
        active = true;
        localizedName = "Disruptor";
        shortKey = "disruptor";
        url = "Disruptor";
    }

    public static Disruptor instance() {
        if( instance == null ){
            instance = new Disruptor();
        }
        return instance;
    }

    public DisruptorThunderStrike getAbility1() {
        return ability1;
    }

    public DisruptorGlimpse getAbility2() {
        return ability2;
    }

    public DisruptorKineticField getAbility3() {
        return ability3;
    }

    public DisruptorStaticStorm getAbility4() {
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

    public int getID() {
        return iD;
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
        if (!(object instanceof Disruptor))
            return false;
        if (object == this)
            return true;
        Disruptor otherObject = (Disruptor) object;
        return otherObject.getKey().equals(getKey());
    }

}
