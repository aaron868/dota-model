package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Gyrocopter extends Hero {

    private static Gyrocopter instance;

    private final GyrocopterRocketBarrage ability1;
    private final GyrocopterHomingMissile ability2;
    private final GyrocopterFlakCannon ability3;
    private final AttributeBonus ability5;
    private final GyrocopterCallDown ability6;
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
    private final boolean active;
    private final String localizedName;
    private final String url;

    private Gyrocopter() {
        ability1 = GyrocopterRocketBarrage.instance();
        ability2 = GyrocopterHomingMissile.instance();
        ability3 = GyrocopterFlakCannon.instance();
        ability5 = AttributeBonus.instance();
        ability6 = GyrocopterCallDown.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .2;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 27;
        attackDamageMin = 17;
        attackRange = 365;
        attackRate = 1.7;
        attributeAgilityGain = 2.8;
        attributeBaseAgility = 24;
        attributeBaseIntelligence = 19;
        attributeBaseStrength = 18;
        attributeIntelligenceGain = 2.1;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.8;
        cMEnabled = 1;
        enabled = 1;
        heroID = 72;
        key = "npc_dota_hero_gyrocopter";
        movementSpeed = 315;
        movementTurnRate = .6;
        projectileSpeed = 3000;
        team = "Good";
        active = true;
        localizedName = "Gyrocopter";
        url = "Gyrocopter";
    }

    public static Gyrocopter instance() {
        if( instance == null ){
            instance = new Gyrocopter();
        }
        return instance;
    }

    public GyrocopterRocketBarrage getAbility1() {
        return ability1;
    }

    public GyrocopterHomingMissile getAbility2() {
        return ability2;
    }

    public GyrocopterFlakCannon getAbility3() {
        return ability3;
    }

    public AttributeBonus getAbility5() {
        return ability5;
    }

    public GyrocopterCallDown getAbility6() {
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

    public int getProjectileSpeed() {
        return projectileSpeed;
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
        if (!(object instanceof Gyrocopter))
            return false;
        if (object == this)
            return true;
        Gyrocopter otherObject = (Gyrocopter) object;
        return otherObject.getKey().equals(getKey());
    }

}
