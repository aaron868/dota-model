package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Slark extends Hero {

    private static Slark instance;

    private final SlarkDarkPact ability1;
    private final SlarkPounce ability2;
    private final SlarkEssenceShift ability3;
    private final SlarkShadowDance ability4;
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
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private Slark() {
        ability1 = SlarkDarkPact.instance();
        ability2 = SlarkPounce.instance();
        ability3 = SlarkEssenceShift.instance();
        ability4 = SlarkShadowDance.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 41;
        attackDamageMin = 33;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.5;
        attributeBaseAgility = 21;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 1.9;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.8;
        cMEnabled = 1;
        enabled = 1;
        heroID = 93;
        key = "npc_dota_hero_slark";
        movementSpeed = 305;
        movementTurnRate = .5;
        projectileSpeed = 0;
        team = "Bad";
        visionDaytimeRange = 1800;
        visionNighttimeRange = 1800;
        active = true;
        localizedName = "Slark";
        url = "Slark";
    }

    public static Slark instance() {
        if( instance == null ){
            instance = new Slark();
        }
        return instance;
    }

    public SlarkDarkPact getAbility1() {
        return ability1;
    }

    public SlarkPounce getAbility2() {
        return ability2;
    }

    public SlarkEssenceShift getAbility3() {
        return ability3;
    }

    public SlarkShadowDance getAbility4() {
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

    public int getVisionDaytimeRange() {
        return visionDaytimeRange;
    }

    public int getVisionNighttimeRange() {
        return visionNighttimeRange;
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
        if (!(object instanceof Slark))
            return false;
        if (object == this)
            return true;
        Slark otherObject = (Slark) object;
        return otherObject.getKey().equals(getKey());
    }

}
