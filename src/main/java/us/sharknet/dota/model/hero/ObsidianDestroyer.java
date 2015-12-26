package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class ObsidianDestroyer extends Hero {

    private static ObsidianDestroyer instance;

    private final ObsidianDestroyerArcaneOrb ability1;
    private final ObsidianDestroyerAstralImprisonment ability2;
    private final ObsidianDestroyerEssenceAura ability3;
    private final ObsidianDestroyerSanityEclipse ability4;
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
    private final String shortKey;
    private final String url;

    private ObsidianDestroyer() {
        ability1 = ObsidianDestroyerArcaneOrb.instance();
        ability2 = ObsidianDestroyerAstralImprisonment.instance();
        ability3 = ObsidianDestroyerEssenceAura.instance();
        ability4 = ObsidianDestroyerSanityEclipse.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = 2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .46;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 35;
        attackDamageMin = 20;
        attackRange = 450;
        attackRate = 1.7;
        attributeAgilityGain = 2;
        attributeBaseAgility = 24;
        attributeBaseIntelligence = 26;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 2.7;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.3;
        cMEnabled = 1;
        enabled = 1;
        heroID = 76;
        key = "npc_dota_hero_obsidian_destroyer";
        movementSpeed = 315;
        movementTurnRate = .5;
        projectileSpeed = 900;
        team = "Bad";
        active = true;
        localizedName = "Outworld Devourer";
        shortKey = "obsidian_destroyer";
        url = "Outworld_Devourer";
    }

    public static ObsidianDestroyer instance() {
        if( instance == null ){
            instance = new ObsidianDestroyer();
        }
        return instance;
    }

    public ObsidianDestroyerArcaneOrb getAbility1() {
        return ability1;
    }

    public ObsidianDestroyerAstralImprisonment getAbility2() {
        return ability2;
    }

    public ObsidianDestroyerEssenceAura getAbility3() {
        return ability3;
    }

    public ObsidianDestroyerSanityEclipse getAbility4() {
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ObsidianDestroyer))
            return false;
        if (object == this)
            return true;
        ObsidianDestroyer otherObject = (ObsidianDestroyer) object;
        return otherObject.getKey().equals(getKey());
    }

}
