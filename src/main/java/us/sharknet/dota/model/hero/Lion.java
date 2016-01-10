package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Lion extends Hero {

    private static Lion instance;

    private final LionImpale ability1;
    private final LionVoodoo ability2;
    private final LionManaDrain ability3;
    private final LionFingerOfDeath ability4;
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

    private Lion() {
        ability1 = LionImpale.instance();
        ability2 = LionVoodoo.instance();
        ability3 = LionManaDrain.instance();
        ability4 = LionFingerOfDeath.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .43;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 27;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1.5;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 22;
        attributeBaseStrength = 16;
        attributeIntelligenceGain = 3;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.7;
        cMEnabled = 1;
        enabled = 1;
        heroID = 26;
        key = "npc_dota_hero_lion";
        movementSpeed = 290;
        movementTurnRate = .5;
        projectileSpeed = 900;
        team = "Bad";
        active = true;
        localizedName = "Lion";
        url = "Lion";
    }

    public static Lion instance() {
        if( instance == null ){
            instance = new Lion();
        }
        return instance;
    }

    public LionImpale getAbility1() {
        return ability1;
    }

    public LionVoodoo getAbility2() {
        return ability2;
    }

    public LionManaDrain getAbility3() {
        return ability3;
    }

    public LionFingerOfDeath getAbility4() {
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
        if (!(object instanceof Lion))
            return false;
        if (object == this)
            return true;
        Lion otherObject = (Lion) object;
        return otherObject.getKey().equals(getKey());
    }

}
