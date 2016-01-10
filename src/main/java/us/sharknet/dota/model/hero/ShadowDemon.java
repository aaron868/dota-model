package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class ShadowDemon extends Hero {

    private static ShadowDemon instance;

    private final ShadowDemonDisruption ability1;
    private final ShadowDemonSoulCatcher ability2;
    private final ShadowDemonShadowPoison ability3;
    private final ShadowDemonShadowPoisonRelease ability4;
    private final ShadowDemonDemonicPurge ability5;
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
    private final int projectileSpeed;
    private final String team;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private ShadowDemon() {
        ability1 = ShadowDemonDisruption.instance();
        ability2 = ShadowDemonSoulCatcher.instance();
        ability3 = ShadowDemonShadowPoison.instance();
        ability4 = ShadowDemonShadowPoisonRelease.instance();
        ability5 = ShadowDemonDemonicPurge.instance();
        ability6 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        armorPhysical = 0;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .35;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 31;
        attackDamageMin = 27;
        attackRange = 500;
        attackRate = 1.7;
        attributeAgilityGain = 2.2;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 23;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 2.7;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.9;
        cMEnabled = 1;
        enabled = 1;
        heroID = 79;
        key = "npc_dota_hero_shadow_demon";
        movementSpeed = 295;
        movementTurnRate = .6;
        projectileSpeed = 900;
        team = "Bad";
        active = true;
        localizedName = "Shadow Demon";
        url = "Shadow_Demon";
    }

    public static ShadowDemon instance() {
        if( instance == null ){
            instance = new ShadowDemon();
        }
        return instance;
    }

    public ShadowDemonDisruption getAbility1() {
        return ability1;
    }

    public ShadowDemonSoulCatcher getAbility2() {
        return ability2;
    }

    public ShadowDemonShadowPoison getAbility3() {
        return ability3;
    }

    public ShadowDemonShadowPoisonRelease getAbility4() {
        return ability4;
    }

    public ShadowDemonDemonicPurge getAbility5() {
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

    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    public String getTeam() {
        return team;
    }

    public boolean isActive() {
        return active;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ShadowDemon))
            return false;
        if (object == this)
            return true;
        ShadowDemon otherObject = (ShadowDemon) object;
        return otherObject.getKey().equals(getKey());
    }

}
