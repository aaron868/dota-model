package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Clinkz extends Hero {

    private static Clinkz instance;

    private final ClinkzStrafe ability1;
    private final ClinkzSearingArrows ability2;
    private final ClinkzWindWalk ability3;
    private final ClinkzDeathPact ability4;
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

    private Clinkz() {
        ability1 = ClinkzStrafe.instance();
        ability2 = ClinkzSearingArrows.instance();
        ability3 = ClinkzWindWalk.instance();
        ability4 = ClinkzDeathPact.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .7;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 21;
        attackDamageMin = 15;
        attackRange = 630;
        attackRate = 1.7;
        attributeAgilityGain = 3.3;
        attributeBaseAgility = 22;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 15;
        attributeIntelligenceGain = 1.55;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.6;
        cMEnabled = 1;
        enabled = 1;
        heroID = 56;
        key = "npc_dota_hero_clinkz";
        movementSpeed = 300;
        movementTurnRate = .4;
        projectileSpeed = 900;
        team = "Bad";
        active = true;
        localizedName = "Clinkz";
        url = "Clinkz";
    }

    public static Clinkz instance() {
        if( instance == null ){
            instance = new Clinkz();
        }
        return instance;
    }

    public ClinkzStrafe getAbility1() {
        return ability1;
    }

    public ClinkzSearingArrows getAbility2() {
        return ability2;
    }

    public ClinkzWindWalk getAbility3() {
        return ability3;
    }

    public ClinkzDeathPact getAbility4() {
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
        if (!(object instanceof Clinkz))
            return false;
        if (object == this)
            return true;
        Clinkz otherObject = (Clinkz) object;
        return otherObject.getKey().equals(getKey());
    }

}
