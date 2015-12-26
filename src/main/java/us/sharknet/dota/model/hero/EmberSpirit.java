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
    private final int cMEnabled;
    private final int enabled;
    private final int heroID;
    private final String key;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final double statusHealthRegen;
    private final String team;
    private final int visionDaytimeRange;
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
        cMEnabled = 1;
        enabled = 1;
        heroID = 106;
        key = "npc_dota_hero_ember_spirit";
        movementSpeed = 310;
        movementTurnRate = .5;
        statusHealthRegen = .75;
        team = "Good";
        visionDaytimeRange = 1800;
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

    public int getCMEnabled() {
        return cMEnabled;
    }

    public int getEnabled() {
        return enabled;
    }

    public int getHeroID() {
        return heroID;
    }

    public String getKey() {
        return key;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public double getMovementTurnRate() {
        return movementTurnRate;
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
