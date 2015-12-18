package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Riki extends Hero {

    private static Riki instance;

    private final RikiSmokeScreen ability1;
    private final RikiBlinkStrike ability2;
    private final RikiPermanentInvisibility ability3;
    private final RikiTricksOfTheTrade ability4;
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
    private final double statusHealthRegen;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Riki() {
        ability1 = RikiSmokeScreen.instance();
        ability2 = RikiBlinkStrike.instance();
        ability3 = RikiPermanentInvisibility.instance();
        ability4 = RikiTricksOfTheTrade.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 8;
        attackDamageMin = 4;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.2;
        attributeBaseAgility = 34;
        attributeBaseIntelligence = 14;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 1.3;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.6;
        banSound = "riki_riki_anger_04";
        botImplemented = 0;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 0;
        enabled = 1;
        healthBarOffset = 115;
        heroGlowColor = new int[]{170,112,194};
        heroID = 32;
        heroSelectSoundEffect = "Hero_Riki.Pick";
        heroUnlockOrder = 3;
        idleExpression = "scenes/riki/riki_exp_idle_01.vcd";
        key = "npc_dota_hero_riki";
        lastHitChallengeRival = "npc_dota_hero_bounty_hunter";
        loadoutScale = 1.1;
        model = "models/heroes/rikimaru/rikimaru.vmdl";
        modelScale = .87;
        movementSpeed = 290;
        movementTurnRate = .6;
        pickSound = "riki_riki_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_riki";
        role = new String[]{"Carry","Escape","Disabler"};
        rolelevels = new int[]{2,2,1};
        soundSet = "Hero_Riki";
        statusHealthRegen = .25;
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_riki.vsndevts";
        active = true;
        localizedName = "Riki";
        shortKey = "riki";
        url = "Riki";
    }

    public static Riki instance() {
        if( instance == null ){
            instance = new Riki();
        }
        return instance;
    }

    public RikiSmokeScreen getAbility1() {
        return ability1;
    }

    public RikiBlinkStrike getAbility2() {
        return ability2;
    }

    public RikiPermanentInvisibility getAbility3() {
        return ability3;
    }

    public RikiTricksOfTheTrade getAbility4() {
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
        if (!(object instanceof Riki))
            return false;
        if (object == this)
            return true;
        Riki otherObject = (Riki) object;
        return otherObject.getKey().equals(getKey());
    }

}
