package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Tinker extends Hero {

    private static Tinker instance;

    private final TinkerLaser ability1;
    private final TinkerHeatSeekingMissile ability2;
    private final TinkerMarchOfTheMachines ability3;
    private final TinkerRearm ability4;
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

    private Tinker() {
        ability1 = TinkerLaser.instance();
        ability2 = TinkerHeatSeekingMissile.instance();
        ability3 = TinkerMarchOfTheMachines.instance();
        ability4 = TinkerRearm.instance();
        armorPhysical = 2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .35;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 28;
        attackDamageMin = 22;
        attackRange = 500;
        attackRate = 1.7;
        attributeAgilityGain = 1.2;
        attributeBaseAgility = 13;
        attributeBaseIntelligence = 27;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 2.2;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2;
        cMEnabled = 1;
        enabled = 1;
        heroID = 34;
        key = "npc_dota_hero_tinker";
        movementSpeed = 305;
        movementTurnRate = .6;
        projectileSpeed = 900;
        team = "Good";
        active = true;
        localizedName = "Tinker";
        url = "Tinker";
    }

    public static Tinker instance() {
        if( instance == null ){
            instance = new Tinker();
        }
        return instance;
    }

    public TinkerLaser getAbility1() {
        return ability1;
    }

    public TinkerHeatSeekingMissile getAbility2() {
        return ability2;
    }

    public TinkerMarchOfTheMachines getAbility3() {
        return ability3;
    }

    public TinkerRearm getAbility4() {
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
        if (!(object instanceof Tinker))
            return false;
        if (object == this)
            return true;
        Tinker otherObject = (Tinker) object;
        return otherObject.getKey().equals(getKey());
    }

}
