package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Earthshaker extends Hero {

    private static Earthshaker instance;

    private final EarthshakerFissure ability1;
    private final EarthshakerEnchantTotem ability2;
    private final EarthshakerAftershock ability3;
    private final EarthshakerEchoSlam ability4;
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

    private Earthshaker() {
        ability1 = EarthshakerFissure.instance();
        ability2 = EarthshakerEnchantTotem.instance();
        ability3 = EarthshakerAftershock.instance();
        ability4 = EarthshakerEchoSlam.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .467;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 34;
        attackDamageMin = 24;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.4;
        attributeBaseAgility = 12;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 22;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.9;
        cMEnabled = 1;
        enabled = 1;
        heroID = 7;
        key = "npc_dota_hero_earthshaker";
        movementSpeed = 310;
        movementTurnRate = .9;
        projectileSpeed = 0;
        team = "Good";
        active = true;
        localizedName = "Earthshaker";
        url = "Earthshaker";
    }

    public static Earthshaker instance() {
        if( instance == null ){
            instance = new Earthshaker();
        }
        return instance;
    }

    public EarthshakerFissure getAbility1() {
        return ability1;
    }

    public EarthshakerEnchantTotem getAbility2() {
        return ability2;
    }

    public EarthshakerAftershock getAbility3() {
        return ability3;
    }

    public EarthshakerEchoSlam getAbility4() {
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
        if (!(object instanceof Earthshaker))
            return false;
        if (object == this)
            return true;
        Earthshaker otherObject = (Earthshaker) object;
        return otherObject.getKey().equals(getKey());
    }

}
