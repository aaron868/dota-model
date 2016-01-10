package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Bloodseeker extends Hero {

    private static Bloodseeker instance;

    private final BloodseekerBloodrage ability1;
    private final BloodseekerBloodBath ability2;
    private final BloodseekerThirst ability3;
    private final BloodseekerRupture ability4;
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

    private Bloodseeker() {
        ability1 = BloodseekerBloodrage.instance();
        ability2 = BloodseekerBloodBath.instance();
        ability3 = BloodseekerThirst.instance();
        ability4 = BloodseekerRupture.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .43;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 35;
        attackDamageMin = 29;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 3;
        attributeBaseAgility = 24;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 1.7;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2;
        cMEnabled = 1;
        enabled = 1;
        heroID = 4;
        key = "npc_dota_hero_bloodseeker";
        movementSpeed = 290;
        movementTurnRate = .5;
        team = "Bad";
        active = true;
        localizedName = "Bloodseeker";
        url = "Bloodseeker";
    }

    public static Bloodseeker instance() {
        if( instance == null ){
            instance = new Bloodseeker();
        }
        return instance;
    }

    public BloodseekerBloodrage getAbility1() {
        return ability1;
    }

    public BloodseekerBloodBath getAbility2() {
        return ability2;
    }

    public BloodseekerThirst getAbility3() {
        return ability3;
    }

    public BloodseekerRupture getAbility4() {
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

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Bloodseeker))
            return false;
        if (object == this)
            return true;
        Bloodseeker otherObject = (Bloodseeker) object;
        return otherObject.getKey().equals(getKey());
    }

}
