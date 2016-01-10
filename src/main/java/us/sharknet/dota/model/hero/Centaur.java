package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Centaur extends Hero {

    private static Centaur instance;

    private final CentaurHoofStomp ability1;
    private final CentaurDoubleEdge ability2;
    private final CentaurReturn ability3;
    private final CentaurStampede ability4;
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
    private final String team;
    private final int visionDaytimeRange;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private Centaur() {
        ability1 = CentaurHoofStomp.instance();
        ability2 = CentaurDoubleEdge.instance();
        ability3 = CentaurReturn.instance();
        ability4 = CentaurStampede.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 34;
        attackDamageMin = 32;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 1.6;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 3.8;
        cMEnabled = 1;
        enabled = 1;
        heroID = 96;
        key = "npc_dota_hero_centaur";
        movementSpeed = 300;
        movementTurnRate = .5;
        team = "Good";
        visionDaytimeRange = 1800;
        active = true;
        localizedName = "Centaur Warrunner";
        url = "Centaur_Warrunner";
    }

    public static Centaur instance() {
        if( instance == null ){
            instance = new Centaur();
        }
        return instance;
    }

    public CentaurHoofStomp getAbility1() {
        return ability1;
    }

    public CentaurDoubleEdge getAbility2() {
        return ability2;
    }

    public CentaurReturn getAbility3() {
        return ability3;
    }

    public CentaurStampede getAbility4() {
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

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Centaur))
            return false;
        if (object == this)
            return true;
        Centaur otherObject = (Centaur) object;
        return otherObject.getKey().equals(getKey());
    }

}
