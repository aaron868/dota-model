package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class FacelessVoid extends Hero {

    private static FacelessVoid instance;

    private final FacelessVoidTimeWalk ability1;
    private final FacelessVoidTimeDilation ability2;
    private final FacelessVoidTimeLock ability3;
    private final FacelessVoidChronosphere ability4;
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
    private final String shortKey;
    private final String url;

    private FacelessVoid() {
        ability1 = FacelessVoidTimeWalk.instance();
        ability2 = FacelessVoidTimeDilation.instance();
        ability3 = FacelessVoidTimeLock.instance();
        ability4 = FacelessVoidChronosphere.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 43;
        attackDamageMin = 37;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.65;
        attributeBaseAgility = 23;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 1.5;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.6;
        cMEnabled = 1;
        enabled = 1;
        heroID = 41;
        key = "npc_dota_hero_faceless_void";
        movementSpeed = 300;
        movementTurnRate = 1;
        statusHealthRegen = .75;
        team = "Bad";
        active = true;
        localizedName = "Faceless Void";
        shortKey = "faceless_void";
        url = "Faceless_Void";
    }

    public static FacelessVoid instance() {
        if( instance == null ){
            instance = new FacelessVoid();
        }
        return instance;
    }

    public FacelessVoidTimeWalk getAbility1() {
        return ability1;
    }

    public FacelessVoidTimeDilation getAbility2() {
        return ability2;
    }

    public FacelessVoidTimeLock getAbility3() {
        return ability3;
    }

    public FacelessVoidChronosphere getAbility4() {
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof FacelessVoid))
            return false;
        if (object == this)
            return true;
        FacelessVoid otherObject = (FacelessVoid) object;
        return otherObject.getKey().equals(getKey());
    }

}
