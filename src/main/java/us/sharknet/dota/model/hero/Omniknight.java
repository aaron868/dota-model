package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Omniknight extends Hero {

    private static Omniknight instance;

    private final OmniknightPurification ability1;
    private final OmniknightRepel ability2;
    private final OmniknightDegenAura ability3;
    private final OmniknightGuardianAngel ability4;
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
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final int heroPool1;
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
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Omniknight() {
        ability1 = OmniknightPurification.instance();
        ability2 = OmniknightRepel.instance();
        ability3 = OmniknightDegenAura.instance();
        ability4 = OmniknightGuardianAngel.instance();
        armorPhysical = 3;
        attackAcquisitionRange = 6;
        attackAnimationPoint = .433;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 41;
        attackDamageMin = 31;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.75;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 17;
        attributeBaseStrength = 2;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.65;
        banSound = "omniknight_omni_anger_04";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 145;
        heroGlowColor = new int[]{120,205,255};
        heroID = 57;
        heroPool1 = 1;
        heroSelectSoundEffect = "Hero_Omniknight.Pick";
        heroUnlockOrder = 3;
        idleExpression = "scenes/omniknight/omniknight_exp_idle_01.vcd";
        key = "npc_dota_hero_omniknight";
        lastHitChallengeRival = "npc_dota_hero_dragon_knight";
        loadoutScale = .81;
        model = "models/heroes/omniknight/omniknight.vmdl";
        modelScale = .74;
        movementSpeed = 35;
        movementTurnRate = .6;
        pickSound = "omniknight_omni_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_omniknight";
        role = new String[]{"Support","Durable","Nuker"};
        rolelevels = new int[]{2,1,1};
        soundSet = "Hero_Omniknight";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_omniknight.vsndevts";
        active = true;
        localizedName = "Omniknight";
        shortKey = "omniknight";
        url = "Omniknight";
    }

    public static Omniknight instance() {
        if( instance == null ){
            instance = new Omniknight();
        }
        return instance;
    }

    public OmniknightPurification getAbility1() {
        return ability1;
    }

    public OmniknightRepel getAbility2() {
        return ability2;
    }

    public OmniknightDegenAura getAbility3() {
        return ability3;
    }

    public OmniknightGuardianAngel getAbility4() {
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

    public int getHealthBarOffset() {
        return healthBarOffset;
    }

    public int[] getHeroGlowColor() {
        return heroGlowColor;
    }

    public int getHeroID() {
        return heroID;
    }

    public int getHeroPool1() {
        return heroPool1;
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
        if (!(object instanceof Omniknight))
            return false;
        if (object == this)
            return true;
        Omniknight otherObject = (Omniknight) object;
        return otherObject.getKey().equals(getKey());
    }

}
