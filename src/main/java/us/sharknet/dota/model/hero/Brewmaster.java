package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Brewmaster extends Hero {

    private static Brewmaster instance;

    private final BrewmasterThunderClap ability1;
    private final BrewmasterDrunkenHaze ability2;
    private final BrewmasterDrunkenBrawler ability3;
    private final BrewmasterPrimalSplit ability4;
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
    private final int hasAggressiveStance;
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

    private Brewmaster() {
        ability1 = BrewmasterThunderClap.instance();
        ability2 = BrewmasterDrunkenHaze.instance();
        ability3 = BrewmasterDrunkenBrawler.instance();
        ability4 = BrewmasterPrimalSplit.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .35;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 36;
        attackDamageMin = 29;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.95;
        attributeBaseAgility = 22;
        attributeBaseIntelligence = 14;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 1.25;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.9;
        banSound = "brewmaster_brew_anger_01";
        cMEnabled = 1;
        enabled = 1;
        hasAggressiveStance = 1;
        healthBarOffset = 140;
        heroGlowColor = new int[]{139,1,1};
        heroID = 78;
        heroSelectSoundEffect = "Hero_Brewmaster.Pick";
        heroUnlockOrder = 2;
        idleExpression = "scenes/brewmaster/brewmaster_exp_idle_01.vcd";
        key = "npc_dota_hero_brewmaster";
        lastHitChallengeRival = "npc_dota_hero_kunkka";
        loadoutScale = .85;
        model = "models/heroes/brewmaster/brewmaster.vmdl";
        modelScale = .79;
        movementSpeed = 300;
        movementTurnRate = .6;
        nameAliases = "bm";
        pickSound = "brewmaster_brew_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_brewmaster";
        role = new String[]{"Carry","Initiator","Durable","Disabler","Nuker"};
        rolelevels = new int[]{1,3,2,2,1};
        soundSet = "Hero_Brewmaster";
        statusHealthRegen = .75;
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_brewmaster.vsndevts";
        active = true;
        localizedName = "Brewmaster";
        shortKey = "brewmaster";
        url = "Brewmaster";
    }

    public static Brewmaster instance() {
        if( instance == null ){
            instance = new Brewmaster();
        }
        return instance;
    }

    public BrewmasterThunderClap getAbility1() {
        return ability1;
    }

    public BrewmasterDrunkenHaze getAbility2() {
        return ability2;
    }

    public BrewmasterDrunkenBrawler getAbility3() {
        return ability3;
    }

    public BrewmasterPrimalSplit getAbility4() {
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

    public int getHasAggressiveStance() {
        return hasAggressiveStance;
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
        if (!(object instanceof Brewmaster))
            return false;
        if (object == this)
            return true;
        Brewmaster otherObject = (Brewmaster) object;
        return otherObject.getKey().equals(getKey());
    }

}
