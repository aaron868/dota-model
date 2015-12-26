package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Venomancer extends Hero {

    private static Venomancer instance;

    private final VenomancerVenomousGale ability1;
    private final VenomancerPoisonSting ability2;
    private final VenomancerPlagueWard ability3;
    private final VenomancerPoisonNova ability4;
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

    private Venomancer() {
        ability1 = VenomancerVenomousGale.instance();
        ability2 = VenomancerPoisonSting.instance();
        ability3 = VenomancerPlagueWard.instance();
        ability4 = VenomancerPoisonNova.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 21;
        attackDamageMin = 19;
        attackRange = 450;
        attackRate = 1.7;
        attributeAgilityGain = 2.6;
        attributeBaseAgility = 22;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 18;
        attributeIntelligenceGain = 1.75;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.85;
        cMEnabled = 1;
        enabled = 1;
        heroID = 40;
        key = "npc_dota_hero_venomancer";
        movementSpeed = 285;
        movementTurnRate = .4;
        projectileSpeed = 900;
        statusHealthRegen = .25;
        team = "Bad";
        active = true;
        localizedName = "Venomancer";
        shortKey = "venomancer";
        url = "Venomancer";
    }

    public static Venomancer instance() {
        if( instance == null ){
            instance = new Venomancer();
        }
        return instance;
    }

    public VenomancerVenomousGale getAbility1() {
        return ability1;
    }

    public VenomancerPoisonSting getAbility2() {
        return ability2;
    }

    public VenomancerPlagueWard getAbility3() {
        return ability3;
    }

    public VenomancerPoisonNova getAbility4() {
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
        if (!(object instanceof Venomancer))
            return false;
        if (object == this)
            return true;
        Venomancer otherObject = (Venomancer) object;
        return otherObject.getKey().equals(getKey());
    }

}
