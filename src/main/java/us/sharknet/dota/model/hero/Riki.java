package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Riki extends Hero {

    private static Riki instance;

    private final RikiSmokeScreen ability1;
    private final RikiBlinkStrike ability2;
    private final RikiPermanentInvisibility ability3;
    private final RikiTricksOfTheTrade ability4;
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
    private final boolean active;
    private final String localizedName;
    private final String url;

    private Riki() {
        ability1 = RikiSmokeScreen.instance();
        ability2 = RikiBlinkStrike.instance();
        ability3 = RikiPermanentInvisibility.instance();
        ability4 = RikiTricksOfTheTrade.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 8;
        attackDamageMin = 4;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.2;
        attributeBaseAgility = 34;
        attributeBaseIntelligence = 14;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 1.3;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.6;
        cMEnabled = 0;
        enabled = 1;
        heroID = 32;
        key = "npc_dota_hero_riki";
        movementSpeed = 290;
        movementTurnRate = .6;
        statusHealthRegen = .25;
        team = "Good";
        active = true;
        localizedName = "Riki";
        url = "Riki";
    }

    public static Riki instance() {
        if( instance == null ){
            instance = new Riki();
        }
        return instance;
    }

    public RikiSmokeScreen getAbility1() {
        return ability1;
    }

    public RikiBlinkStrike getAbility2() {
        return ability2;
    }

    public RikiPermanentInvisibility getAbility3() {
        return ability3;
    }

    public RikiTricksOfTheTrade getAbility4() {
        return ability4;
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
        if (!(object instanceof Riki))
            return false;
        if (object == this)
            return true;
        Riki otherObject = (Riki) object;
        return otherObject.getKey().equals(getKey());
    }

}
