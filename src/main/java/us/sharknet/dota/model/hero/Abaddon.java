package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Abaddon extends Hero {

    private static Abaddon instance;

    private final AbaddonDeathCoil ability1;
    private final AbaddonAphoticShield ability2;
    private final AbaddonFrostmourne ability3;
    private final AbaddonBorrowedTime ability4;
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
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Abaddon() {
        ability1 = AbaddonDeathCoil.instance();
        ability2 = AbaddonAphoticShield.instance();
        ability3 = AbaddonFrostmourne.instance();
        ability4 = AbaddonBorrowedTime.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .56;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 42;
        attackDamageMin = 32;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.5;
        attributeBaseAgility = 17;
        attributeBaseIntelligence = 21;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 2;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.7;
        cMEnabled = 1;
        enabled = 1;
        heroID = 102;
        key = "npc_dota_hero_abaddon";
        movementSpeed = 310;
        movementTurnRate = .5;
        team = "Bad";
        active = true;
        localizedName = "Abaddon";
        shortKey = "abaddon";
        url = "Abaddon";
    }

    public static Abaddon instance() {
        if( instance == null ){
            instance = new Abaddon();
        }
        return instance;
    }

    public AbaddonDeathCoil getAbility1() {
        return ability1;
    }

    public AbaddonAphoticShield getAbility2() {
        return ability2;
    }

    public AbaddonFrostmourne getAbility3() {
        return ability3;
    }

    public AbaddonBorrowedTime getAbility4() {
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
        if (!(object instanceof Abaddon))
            return false;
        if (object == this)
            return true;
        Abaddon otherObject = (Abaddon) object;
        return otherObject.getKey().equals(getKey());
    }

}
