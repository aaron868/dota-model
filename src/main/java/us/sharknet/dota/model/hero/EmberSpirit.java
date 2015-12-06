package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class EmberSpirit extends Hero {

    private static EmberSpirit instance;

    private final EmberSpiritSearingChains ability1;
    private final EmberSpiritSleightOfFist ability2;
    private final EmberSpiritFlameGuard ability3;
    private final EmberSpiritActivateFireRemnant ability4;
    private final EmberSpiritFireRemnant ability5;
    private final AttributeBonus ability6;
    private final int abilityDraftDisabled;
    private final int abilityLayout;
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
    private final int attributeStrengthGain;
    private final String banSound;
    private final int cMEnabled;
    private final int enabled;
    private final int hasAggressiveStance;
    private final int healthBarOffset;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int iD;
    private final String idleSoundLoop;
    private final String key;
    private final double loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String[] nameAliases;
    private final String pickSound;
    private final String portrait;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final double statusHealthRegen;
    private final String team;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private EmberSpirit() {
        ability1 = EmberSpiritSearingChains.instance();
        ability2 = EmberSpiritSleightOfFist.instance();
        ability3 = EmberSpiritFlameGuard.instance();
        ability4 = EmberSpiritActivateFireRemnant.instance();
        ability5 = EmberSpiritFireRemnant.instance();
        ability6 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        abilityLayout = 5;
        armorPhysical = -2;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 34;
        attackDamageMin = 30;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.8;
        attributeBaseAgility = 22;
        attributeBaseIntelligence = 20;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2;
        banSound = "ember_spirit_embr_anger_04";
        cMEnabled = 1;
        enabled = 1;
        hasAggressiveStance = 1;
        healthBarOffset = 200;
        heroID = 106;
        heroSelectSoundEffect = "Hero_EmberSpirit.Pick";
        iD = 106;
        idleSoundLoop = "Hero_EmberSpirit.IdleLoop";
        key = "npc_dota_hero_ember_spirit";
        loadoutScale = 1.1;
        model = "models/heroes/ember_spirit/ember_spirit.vmdl";
        modelScale = 1.2;
        movementSpeed = 310;
        movementTurnRate = .5;
        nameAliases = new String[]{"Xin","Ember"};
        pickSound = "ember_spirit_embr_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_ember_spirit";
        role = new String[]{"Carry","Escape","Nuker","Disabler","Initiator"};
        rolelevels = new int[]{2,3,1,1,1};
        soundSet = "Hero_EmberSpirit";
        statusHealthRegen = .75;
        team = "Good";
        visionDaytimeRange = 1800;
        visionNighttimeRange = 800;
        voiceFile = "soundevents/voscripts/game_sounds_vo_ember_spirit.vsndevts";
        active = true;
        localizedName = "Ember Spirit";
        shortKey = "ember_spirit";
        url = "Ember_Spirit";
    }

    public static EmberSpirit instance() {
        if( instance == null ){
            instance = new EmberSpirit();
        }
        return instance;
    }

    public EmberSpiritSearingChains getAbility1() {
        return ability1;
    }

    public EmberSpiritSleightOfFist getAbility2() {
        return ability2;
    }

    public EmberSpiritFlameGuard getAbility3() {
        return ability3;
    }

    public EmberSpiritActivateFireRemnant getAbility4() {
        return ability4;
    }

    public EmberSpiritFireRemnant getAbility5() {
        return ability5;
    }

    public AttributeBonus getAbility6() {
        return ability6;
    }

    public int getAbilityDraftDisabled() {
        return abilityDraftDisabled;
    }

    public int getAbilityLayout() {
        return abilityLayout;
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

    public int getAttributeStrengthGain() {
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

    public int getHeroID() {
        return heroID;
    }

    public String getHeroSelectSoundEffect() {
        return heroSelectSoundEffect;
    }

    public int getID() {
        return iD;
    }

    public String getIdleSoundLoop() {
        return idleSoundLoop;
    }

    public String getKey() {
        return key;
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

    public String[] getNameAliases() {
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
        if (!(object instanceof EmberSpirit))
            return false;
        if (object == this)
            return true;
        EmberSpirit otherObject = (EmberSpirit) object;
        return otherObject.getKey().equals(getKey());
    }

}
