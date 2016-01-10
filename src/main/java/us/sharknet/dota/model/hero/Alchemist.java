package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Alchemist extends Hero {

    private static Alchemist instance;

    private final AlchemistAcidSpray ability1;
    private final AlchemistUnstableConcoction ability2;
    private final AlchemistGoblinsGreed ability3;
    private final AlchemistChemicalRage ability4;
    private final AttributeBonus ability5;
    private final AlchemistUnstableConcoctionThrow ability6;
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
    private final String team;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private Alchemist() {
        ability1 = AlchemistAcidSpray.instance();
        ability2 = AlchemistUnstableConcoction.instance();
        ability3 = AlchemistGoblinsGreed.instance();
        ability4 = AlchemistChemicalRage.instance();
        ability5 = AttributeBonus.instance();
        ability6 = AlchemistUnstableConcoctionThrow.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .35;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 24;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.2;
        attributeBaseAgility = 11;
        attributeBaseIntelligence = 25;
        attributeBaseStrength = 25;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 1.8;
        cMEnabled = 1;
        enabled = 1;
        heroID = 73;
        key = "npc_dota_hero_alchemist";
        movementSpeed = 295;
        movementTurnRate = .6;
        team = "Good";
        active = true;
        localizedName = "Alchemist";
        url = "Alchemist";
    }

    public static Alchemist instance() {
        if( instance == null ){
            instance = new Alchemist();
        }
        return instance;
    }

    public AlchemistAcidSpray getAbility1() {
        return ability1;
    }

    public AlchemistUnstableConcoction getAbility2() {
        return ability2;
    }

    public AlchemistGoblinsGreed getAbility3() {
        return ability3;
    }

    public AlchemistChemicalRage getAbility4() {
        return ability4;
    }

    public AttributeBonus getAbility5() {
        return ability5;
    }

    public AlchemistUnstableConcoctionThrow getAbility6() {
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
        if (!(object instanceof Alchemist))
            return false;
        if (object == this)
            return true;
        Alchemist otherObject = (Alchemist) object;
        return otherObject.getKey().equals(getKey());
    }

}
