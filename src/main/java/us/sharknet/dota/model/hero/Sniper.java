package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Sniper extends Hero {

    private static Sniper instance;

    private final SniperShrapnel ability1;
    private final SniperHeadshot ability2;
    private final SniperTakeAim ability3;
    private final SniperAssassinate ability4;
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
    private final int visionNighttimeRange;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private Sniper() {
        ability1 = SniperShrapnel.instance();
        ability2 = SniperHeadshot.instance();
        ability3 = SniperTakeAim.instance();
        ability4 = SniperAssassinate.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 950;
        attackAnimationPoint = .17;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 21;
        attackDamageMin = 15;
        attackRange = 550;
        attackRate = 1.7;
        attributeAgilityGain = 2.5;
        attributeBaseAgility = 21;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 16;
        attributeIntelligenceGain = 2.6;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.7;
        cMEnabled = 1;
        enabled = 1;
        heroID = 35;
        key = "npc_dota_hero_sniper";
        movementSpeed = 290;
        movementTurnRate = .6;
        projectileSpeed = 3000;
        team = "Good";
        visionNighttimeRange = 1000;
        active = true;
        localizedName = "Sniper";
        url = "Sniper";
    }

    public static Sniper instance() {
        if( instance == null ){
            instance = new Sniper();
        }
        return instance;
    }

    public SniperShrapnel getAbility1() {
        return ability1;
    }

    public SniperHeadshot getAbility2() {
        return ability2;
    }

    public SniperTakeAim getAbility3() {
        return ability3;
    }

    public SniperAssassinate getAbility4() {
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
        if (!(object instanceof Sniper))
            return false;
        if (object == this)
            return true;
        Sniper otherObject = (Sniper) object;
        return otherObject.getKey().equals(getKey());
    }

}
