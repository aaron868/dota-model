package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Furion extends Hero {

    private static Furion instance;

    private final FurionSprout ability1;
    private final FurionTeleportation ability2;
    private final FurionForceOfNature ability3;
    private final FurionWrathOfNature ability4;
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

    private Furion() {
        ability1 = FurionSprout.instance();
        ability2 = FurionTeleportation.instance();
        ability3 = FurionForceOfNature.instance();
        ability4 = FurionWrathOfNature.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 38;
        attackDamageMin = 24;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1.9;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 25;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 2.9;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.8;
        cMEnabled = 1;
        enabled = 1;
        heroID = 53;
        key = "npc_dota_hero_furion";
        movementSpeed = 295;
        movementTurnRate = .6;
        projectileSpeed = 1125;
        team = "Good";
        active = true;
        localizedName = "Nature's Prophet";
        url = "Natures_Prophet";
    }

    public static Furion instance() {
        if( instance == null ){
            instance = new Furion();
        }
        return instance;
    }

    public FurionSprout getAbility1() {
        return ability1;
    }

    public FurionTeleportation getAbility2() {
        return ability2;
    }

    public FurionForceOfNature getAbility3() {
        return ability3;
    }

    public FurionWrathOfNature getAbility4() {
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
        if (!(object instanceof Furion))
            return false;
        if (object == this)
            return true;
        Furion otherObject = (Furion) object;
        return otherObject.getKey().equals(getKey());
    }

}
