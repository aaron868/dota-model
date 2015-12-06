package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Treant extends Hero {

    private static Treant instance;

    private final TreantNaturesGuise ability1;
    private final TreantLeechSeed ability2;
    private final TreantLivingArmor ability3;
    private final TreantEyesInTheForest ability4;
    private final TreantOvergrowth ability5;
    private final AttributeBonus ability6;
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
    private final String pickSound;
    private final String portrait;
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

    private Treant() {
        ability1 = TreantNaturesGuise.instance();
        ability2 = TreantLeechSeed.instance();
        ability3 = TreantLivingArmor.instance();
        ability4 = TreantEyesInTheForest.instance();
        ability5 = TreantOvergrowth.instance();
        ability6 = AttributeBonus.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .6;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 64;
        attackDamageMin = 56;
        attackRange = 128;
        attackRate = 1.9;
        attributeAgilityGain = 2;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 17;
        attributeBaseStrength = 25;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 3.3;
        banSound = "treant_treant_anger_11";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 260;
        heroID = 83;
        heroSelectSoundEffect = "Hero_Treant.Pick";
        iD = 83;
        key = "npc_dota_hero_treant";
        lastHitChallengeRival = "npc_dota_hero_tiny";
        loadoutScale = .75;
        model = "models/heroes/treant_protector/treant_protector.vmdl";
        modelScale = .84;
        movementSpeed = 300;
        movementTurnRate = .5;
        pickSound = "treant_treant_spawn_02";
        portrait = "vgui/hud/heroportraits/portrait_treant";
        role = new String[]{"Support","Initiator","Durable","Disabler","Escape"};
        rolelevels = new int[]{3,2,1,1,1};
        soundSet = "Hero_Treant";
        team = "Good";
        visionDaytimeRange = 1800;
        visionNighttimeRange = 800;
        voiceFile = "soundevents/voscripts/game_sounds_vo_treant.vsndevts";
        active = true;
        localizedName = "Treant Protector";
        shortKey = "treant";
        url = "Treant_Protector";
    }

    public static Treant instance() {
        if( instance == null ){
            instance = new Treant();
        }
        return instance;
    }

    public TreantNaturesGuise getAbility1() {
        return ability1;
    }

    public TreantLeechSeed getAbility2() {
        return ability2;
    }

    public TreantLivingArmor getAbility3() {
        return ability3;
    }

    public TreantEyesInTheForest getAbility4() {
        return ability4;
    }

    public TreantOvergrowth getAbility5() {
        return ability5;
    }

    public AttributeBonus getAbility6() {
        return ability6;
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

    public String getPickSound() {
        return pickSound;
    }

    public String getPortrait() {
        return portrait;
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
        if (!(object instanceof Treant))
            return false;
        if (object == this)
            return true;
        Treant otherObject = (Treant) object;
        return otherObject.getKey().equals(getKey());
    }

}
