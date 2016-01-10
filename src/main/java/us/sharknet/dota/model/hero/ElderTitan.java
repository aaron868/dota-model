package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class ElderTitan extends Hero {

    private static ElderTitan instance;

    private final ElderTitanEchoStomp ability1;
    private final ElderTitanAncestralSpirit ability2;
    private final ElderTitanNaturalOrder ability3;
    private final ElderTitanReturnSpirit ability4;
    private final ElderTitanEarthSplitter ability5;
    private final AttributeBonus ability6;
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

    private ElderTitan() {
        ability1 = ElderTitanEchoStomp.instance();
        ability2 = ElderTitanAncestralSpirit.instance();
        ability3 = ElderTitanNaturalOrder.instance();
        ability4 = ElderTitanReturnSpirit.instance();
        ability5 = ElderTitanEarthSplitter.instance();
        ability6 = AttributeBonus.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .35;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 23;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.5;
        attributeBaseAgility = 14;
        attributeBaseIntelligence = 23;
        attributeBaseStrength = 24;
        attributeIntelligenceGain = 1.6;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.3;
        cMEnabled = 1;
        enabled = 1;
        heroID = 103;
        key = "npc_dota_hero_elder_titan";
        movementSpeed = 315;
        movementTurnRate = .4;
        team = "Good";
        active = true;
        localizedName = "Elder Titan";
        url = "Elder_Titan";
    }

    public static ElderTitan instance() {
        if( instance == null ){
            instance = new ElderTitan();
        }
        return instance;
    }

    public ElderTitanEchoStomp getAbility1() {
        return ability1;
    }

    public ElderTitanAncestralSpirit getAbility2() {
        return ability2;
    }

    public ElderTitanNaturalOrder getAbility3() {
        return ability3;
    }

    public ElderTitanReturnSpirit getAbility4() {
        return ability4;
    }

    public ElderTitanEarthSplitter getAbility5() {
        return ability5;
    }

    public AttributeBonus getAbility6() {
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
        if (!(object instanceof ElderTitan))
            return false;
        if (object == this)
            return true;
        ElderTitan otherObject = (ElderTitan) object;
        return otherObject.getKey().equals(getKey());
    }

}
