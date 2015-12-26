package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class BountyHunter extends Hero {

    private static BountyHunter instance;

    private final BountyHunterShurikenToss ability1;
    private final BountyHunterJinada ability2;
    private final BountyHunterWindWalk ability3;
    private final BountyHunterTrack ability4;
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
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private BountyHunter() {
        ability1 = BountyHunterShurikenToss.instance();
        ability2 = BountyHunterJinada.instance();
        ability3 = BountyHunterWindWalk.instance();
        ability4 = BountyHunterTrack.instance();
        armorPhysical = 3;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .59;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 38;
        attackDamageMin = 24;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 3;
        attributeBaseAgility = 21;
        attributeBaseIntelligence = 19;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 2;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.8;
        cMEnabled = 1;
        enabled = 1;
        heroID = 62;
        key = "npc_dota_hero_bounty_hunter";
        movementSpeed = 315;
        movementTurnRate = .6;
        statusHealthRegen = .75;
        team = "Good";
        visionDaytimeRange = 1800;
        visionNighttimeRange = 1000;
        active = true;
        localizedName = "Bounty Hunter";
        shortKey = "bounty_hunter";
        url = "Bounty_Hunter";
    }

    public static BountyHunter instance() {
        if( instance == null ){
            instance = new BountyHunter();
        }
        return instance;
    }

    public BountyHunterShurikenToss getAbility1() {
        return ability1;
    }

    public BountyHunterJinada getAbility2() {
        return ability2;
    }

    public BountyHunterWindWalk getAbility3() {
        return ability3;
    }

    public BountyHunterTrack getAbility4() {
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof BountyHunter))
            return false;
        if (object == this)
            return true;
        BountyHunter otherObject = (BountyHunter) object;
        return otherObject.getKey().equals(getKey());
    }

}
