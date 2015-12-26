package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class DarkSeer extends Hero {

    private static DarkSeer instance;

    private final DarkSeerVacuum ability1;
    private final DarkSeerIonShell ability2;
    private final DarkSeerSurge ability3;
    private final DarkSeerWallOfReplica ability4;
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

    private DarkSeer() {
        ability1 = DarkSeerVacuum.instance();
        ability2 = DarkSeerIonShell.instance();
        ability3 = DarkSeerSurge.instance();
        ability4 = DarkSeerWallOfReplica.instance();
        armorPhysical = 5;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .59;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 37;
        attackDamageMin = 31;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.2;
        attributeBaseAgility = 12;
        attributeBaseIntelligence = 25;
        attributeBaseStrength = 22;
        attributeIntelligenceGain = 2.7;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.3;
        cMEnabled = 1;
        enabled = 1;
        heroID = 55;
        key = "npc_dota_hero_dark_seer";
        movementSpeed = 300;
        movementTurnRate = .6;
        team = "Bad";
        active = true;
        localizedName = "Dark Seer";
        shortKey = "dark_seer";
        url = "Dark_Seer";
    }

    public static DarkSeer instance() {
        if( instance == null ){
            instance = new DarkSeer();
        }
        return instance;
    }

    public DarkSeerVacuum getAbility1() {
        return ability1;
    }

    public DarkSeerIonShell getAbility2() {
        return ability2;
    }

    public DarkSeerSurge getAbility3() {
        return ability3;
    }

    public DarkSeerWallOfReplica getAbility4() {
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
        if (!(object instanceof DarkSeer))
            return false;
        if (object == this)
            return true;
        DarkSeer otherObject = (DarkSeer) object;
        return otherObject.getKey().equals(getKey());
    }

}
