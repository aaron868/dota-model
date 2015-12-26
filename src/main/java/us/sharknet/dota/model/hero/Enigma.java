package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Enigma extends Hero {

    private static Enigma instance;

    private final EnigmaMalefice ability1;
    private final EnigmaDemonicConversion ability2;
    private final EnigmaMidnightPulse ability3;
    private final EnigmaBlackHole ability4;
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
    private final double statusHealthRegen;
    private final String team;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Enigma() {
        ability1 = EnigmaMalefice.instance();
        ability2 = EnigmaDemonicConversion.instance();
        ability3 = EnigmaMidnightPulse.instance();
        ability4 = EnigmaBlackHole.instance();
        armorPhysical = 2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 28;
        attackDamageMin = 22;
        attackRange = 500;
        attackRate = 1.7;
        attributeAgilityGain = 1;
        attributeBaseAgility = 14;
        attributeBaseIntelligence = 20;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 3.4;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.1;
        cMEnabled = 1;
        enabled = 1;
        heroID = 33;
        key = "npc_dota_hero_enigma";
        movementSpeed = 300;
        movementTurnRate = .5;
        projectileSpeed = 900;
        statusHealthRegen = .25;
        team = "Bad";
        active = true;
        localizedName = "Enigma";
        shortKey = "enigma";
        url = "Enigma";
    }

    public static Enigma instance() {
        if( instance == null ){
            instance = new Enigma();
        }
        return instance;
    }

    public EnigmaMalefice getAbility1() {
        return ability1;
    }

    public EnigmaDemonicConversion getAbility2() {
        return ability2;
    }

    public EnigmaMidnightPulse getAbility3() {
        return ability3;
    }

    public EnigmaBlackHole getAbility4() {
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
        if (!(object instanceof Enigma))
            return false;
        if (object == this)
            return true;
        Enigma otherObject = (Enigma) object;
        return otherObject.getKey().equals(getKey());
    }

}
