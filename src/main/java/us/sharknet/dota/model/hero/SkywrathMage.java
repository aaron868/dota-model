package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class SkywrathMage extends Hero {

    private static SkywrathMage instance;

    private final SkywrathMageArcaneBolt ability1;
    private final SkywrathMageConcussiveShot ability2;
    private final SkywrathMageAncientSeal ability3;
    private final SkywrathMageMysticFlare ability4;
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

    private SkywrathMage() {
        ability1 = SkywrathMageArcaneBolt.instance();
        ability2 = SkywrathMageConcussiveShot.instance();
        ability3 = SkywrathMageAncientSeal.instance();
        ability4 = SkywrathMageMysticFlare.instance();
        armorPhysical = -2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 22;
        attackDamageMin = 12;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = .8;
        attributeBaseAgility = 13;
        attributeBaseIntelligence = 27;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 3.6;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.5;
        cMEnabled = 1;
        enabled = 1;
        heroID = 101;
        key = "npc_dota_hero_skywrath_mage";
        movementSpeed = 325;
        movementTurnRate = .5;
        projectileSpeed = 1000;
        team = "Good";
        active = true;
        localizedName = "Skywrath Mage";
        url = "Skywrath_Mage";
    }

    public static SkywrathMage instance() {
        if( instance == null ){
            instance = new SkywrathMage();
        }
        return instance;
    }

    public SkywrathMageArcaneBolt getAbility1() {
        return ability1;
    }

    public SkywrathMageConcussiveShot getAbility2() {
        return ability2;
    }

    public SkywrathMageAncientSeal getAbility3() {
        return ability3;
    }

    public SkywrathMageMysticFlare getAbility4() {
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
        if (!(object instanceof SkywrathMage))
            return false;
        if (object == this)
            return true;
        SkywrathMage otherObject = (SkywrathMage) object;
        return otherObject.getKey().equals(getKey());
    }

}
