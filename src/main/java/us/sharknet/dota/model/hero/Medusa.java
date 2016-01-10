package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Medusa extends Hero {

    private static Medusa instance;

    private final MedusaSplitShot ability1;
    private final MedusaMysticSnake ability2;
    private final MedusaManaShield ability3;
    private final MedusaStoneGaze ability4;
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
    private final boolean active;
    private final String localizedName;
    private final String url;

    private Medusa() {
        ability1 = MedusaSplitShot.instance();
        ability2 = MedusaMysticSnake.instance();
        ability3 = MedusaManaShield.instance();
        ability4 = MedusaStoneGaze.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 30;
        attackDamageMin = 24;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 2.5;
        attributeBaseAgility = 20;
        attributeBaseIntelligence = 19;
        attributeBaseStrength = 14;
        attributeIntelligenceGain = 1.85;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.65;
        cMEnabled = 1;
        enabled = 1;
        heroID = 94;
        key = "npc_dota_hero_medusa";
        movementSpeed = 290;
        movementTurnRate = .5;
        projectileSpeed = 1200;
        team = "Bad";
        visionDaytimeRange = 1800;
        active = true;
        localizedName = "Medusa";
        url = "Medusa";
    }

    public static Medusa instance() {
        if( instance == null ){
            instance = new Medusa();
        }
        return instance;
    }

    public MedusaSplitShot getAbility1() {
        return ability1;
    }

    public MedusaMysticSnake getAbility2() {
        return ability2;
    }

    public MedusaManaShield getAbility3() {
        return ability3;
    }

    public MedusaStoneGaze getAbility4() {
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
        if (!(object instanceof Medusa))
            return false;
        if (object == this)
            return true;
        Medusa otherObject = (Medusa) object;
        return otherObject.getKey().equals(getKey());
    }

}
