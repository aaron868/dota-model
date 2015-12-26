package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Omniknight extends Hero {

    private static Omniknight instance;

    private final OmniknightPurification ability1;
    private final OmniknightRepel ability2;
    private final OmniknightDegenAura ability3;
    private final OmniknightGuardianAngel ability4;
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
    private final String shortKey;
    private final String url;

    private Omniknight() {
        ability1 = OmniknightPurification.instance();
        ability2 = OmniknightRepel.instance();
        ability3 = OmniknightDegenAura.instance();
        ability4 = OmniknightGuardianAngel.instance();
        armorPhysical = 3;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .433;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 41;
        attackDamageMin = 31;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.75;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 17;
        attributeBaseStrength = 20;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.65;
        cMEnabled = 1;
        enabled = 1;
        heroID = 57;
        key = "npc_dota_hero_omniknight";
        movementSpeed = 305;
        movementTurnRate = .6;
        team = "Good";
        active = true;
        localizedName = "Omniknight";
        shortKey = "omniknight";
        url = "Omniknight";
    }

    public static Omniknight instance() {
        if( instance == null ){
            instance = new Omniknight();
        }
        return instance;
    }

    public OmniknightPurification getAbility1() {
        return ability1;
    }

    public OmniknightRepel getAbility2() {
        return ability2;
    }

    public OmniknightDegenAura getAbility3() {
        return ability3;
    }

    public OmniknightGuardianAngel getAbility4() {
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
        if (!(object instanceof Omniknight))
            return false;
        if (object == this)
            return true;
        Omniknight otherObject = (Omniknight) object;
        return otherObject.getKey().equals(getKey());
    }

}
