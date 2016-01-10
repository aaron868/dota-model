package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Huskar extends Hero {

    private static Huskar instance;

    private final HuskarInnerVitality ability1;
    private final HuskarBurningSpear ability2;
    private final HuskarBerserkersBlood ability3;
    private final HuskarLifeBreak ability4;
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

    private Huskar() {
        ability1 = HuskarInnerVitality.instance();
        ability2 = HuskarBurningSpear.instance();
        ability3 = HuskarBerserkersBlood.instance();
        ability4 = HuskarLifeBreak.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 30;
        attackDamageMin = 21;
        attackRange = 400;
        attackRate = 1.6;
        attributeAgilityGain = 1.4;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 1.5;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.4;
        cMEnabled = 1;
        enabled = 1;
        heroID = 59;
        key = "npc_dota_hero_huskar";
        movementSpeed = 300;
        movementTurnRate = .5;
        projectileSpeed = 1400;
        team = "Good";
        active = true;
        localizedName = "Huskar";
        url = "Huskar";
    }

    public static Huskar instance() {
        if( instance == null ){
            instance = new Huskar();
        }
        return instance;
    }

    public HuskarInnerVitality getAbility1() {
        return ability1;
    }

    public HuskarBurningSpear getAbility2() {
        return ability2;
    }

    public HuskarBerserkersBlood getAbility3() {
        return ability3;
    }

    public HuskarLifeBreak getAbility4() {
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
        if (!(object instanceof Huskar))
            return false;
        if (object == this)
            return true;
        Huskar otherObject = (Huskar) object;
        return otherObject.getKey().equals(getKey());
    }

}
