package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class FacelessVoid extends Hero {

    private static FacelessVoid instance;

    private final FacelessVoidTimeWalk ability1;
    private final FacelessVoidBacktrack ability2;
    private final FacelessVoidTimeLock ability3;
    private final FacelessVoidChronosphere ability4;
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
    private final double statusHealthRegen;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private FacelessVoid() {
        ability1 = FacelessVoidTimeWalk.instance();
        ability2 = FacelessVoidBacktrack.instance();
        ability3 = FacelessVoidTimeLock.instance();
        ability4 = FacelessVoidChronosphere.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 6;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 43;
        attackDamageMin = 37;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.65;
        attributeBaseAgility = 23;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 1.5;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.6;
        banSound = "faceless_void_face_anger_02";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 15;
        heroGlowColor = new int[]{217,160,255};
        heroID = 41;
        heroSelectSoundEffect = "Hero_FacelessVoid.Pick";
        heroUnlockOrder = 0;
        idleExpression = "scenes/faceless_void/faceless_void_exp_idle_01.vcd";
        key = "npc_dota_hero_faceless_void";
        lastHitChallengeRival = "npc_dota_hero_bounty_hunter";
        loadoutScale = .95;
        model = "models/heroes/faceless_void/faceless_void.vmdl";
        modelScale = .84;
        movementSpeed = 3;
        movementTurnRate = 1;
        nameAliases = "fv";
        pickSound = "faceless_void_face_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_faceless_void";
        role = new String[]{"Carry","Initiator","Disabler","Escape","Durable"};
        rolelevels = new int[]{2,3,2,1,1};
        soundSet = "Hero_FacelessVoid";
        statusHealthRegen = .75;
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_faceless_void.vsndevts";
        active = true;
        localizedName = "Faceless Void";
        shortKey = "faceless_void";
        url = "Faceless_Void";
    }

    public static FacelessVoid instance() {
        if( instance == null ){
            instance = new FacelessVoid();
        }
        return instance;
    }

    public FacelessVoidTimeWalk getAbility1() {
        return ability1;
    }

    public FacelessVoidBacktrack getAbility2() {
        return ability2;
    }

    public FacelessVoidTimeLock getAbility3() {
        return ability3;
    }

    public FacelessVoidChronosphere getAbility4() {
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

    public double getStatusHealthRegen() {
        return statusHealthRegen;
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
        if (!(object instanceof FacelessVoid))
            return false;
        if (object == this)
            return true;
        FacelessVoid otherObject = (FacelessVoid) object;
        return otherObject.getKey().equals(getKey());
    }

}
