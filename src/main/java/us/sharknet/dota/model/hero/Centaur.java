package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Centaur extends Hero {

    private static Centaur instance;

    private final CentaurHoofStomp ability1;
    private final CentaurDoubleEdge ability2;
    private final CentaurReturn ability3;
    private final CentaurStampede ability4;
    private final AttributeBonus ability5;
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
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
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

    private Centaur() {
        ability1 = CentaurHoofStomp.instance();
        ability2 = CentaurDoubleEdge.instance();
        ability3 = CentaurReturn.instance();
        ability4 = CentaurStampede.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 34;
        attackDamageMin = 32;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 1.6;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 3.8;
        banSound = "centaur_cent_anger_03";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 220;
        heroID = 96;
        heroPool2 = 1;
        heroSelectSoundEffect = "Hero_Centaur.Pick";
        heroUnlockOrder = 0;
        idleExpression = "scenes/centaur/centaur_exp_idle_01.vcd";
        key = "npc_dota_hero_centaur";
        lastHitChallengeRival = "npc_dota_hero_chaos_knight";
        loadoutScale = .63;
        model = "models/heroes/centaur/centaur.vmdl";
        modelScale = .74;
        movementSpeed = 300;
        movementTurnRate = .5;
        nameAliases = "centaur";
        pickSound = "centaur_cent_spawn_03";
        portrait = "vgui/hud/heroportraits/portrait_centaur";
        role = new String[]{"Durable","Initiator","Disabler","Nuker","Escape"};
        rolelevels = new int[]{3,3,1,1,1};
        soundSet = "Hero_Centaur";
        team = "Good";
        visionDaytimeRange = 1800;
        visionNighttimeRange = 800;
        voiceFile = "soundevents/voscripts/game_sounds_vo_centaur.vsndevts";
        active = true;
        localizedName = "Centaur Warrunner";
        shortKey = "centaur";
        url = "Centaur_Warrunner";
    }

    public static Centaur instance() {
        if( instance == null ){
            instance = new Centaur();
        }
        return instance;
    }

    public CentaurHoofStomp getAbility1() {
        return ability1;
    }

    public CentaurDoubleEdge getAbility2() {
        return ability2;
    }

    public CentaurReturn getAbility3() {
        return ability3;
    }

    public CentaurStampede getAbility4() {
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
        if (!(object instanceof Centaur))
            return false;
        if (object == this)
            return true;
        Centaur otherObject = (Centaur) object;
        return otherObject.getKey().equals(getKey());
    }

}
