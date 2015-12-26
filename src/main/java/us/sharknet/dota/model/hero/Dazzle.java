package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Dazzle extends Hero {

    private static Dazzle instance;

    private final DazzlePoisonTouch ability1;
    private final DazzleShallowGrave ability2;
    private final DazzleShadowWave ability3;
    private final DazzleWeave ability4;
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
    private final String shortKey;
    private final String url;

    private Dazzle() {
        ability1 = DazzlePoisonTouch.instance();
        ability2 = DazzleShallowGrave.instance();
        ability3 = DazzleShadowWave.instance();
        ability4 = DazzleWeave.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 32;
        attackDamageMin = 14;
        attackRange = 550;
        attackRate = 1.7;
        attributeAgilityGain = 1.7;
        attributeBaseAgility = 21;
        attributeBaseIntelligence = 27;
        attributeBaseStrength = 16;
        attributeIntelligenceGain = 3.4;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.85;
        cMEnabled = 1;
        enabled = 1;
        heroID = 50;
        key = "npc_dota_hero_dazzle";
        movementSpeed = 305;
        movementTurnRate = .6;
        projectileSpeed = 1200;
        team = "Bad";
        active = true;
        localizedName = "Dazzle";
        shortKey = "dazzle";
        url = "Dazzle";
    }

    public static Dazzle instance() {
        if( instance == null ){
            instance = new Dazzle();
        }
        return instance;
    }

    public DazzlePoisonTouch getAbility1() {
        return ability1;
    }

    public DazzleShallowGrave getAbility2() {
        return ability2;
    }

    public DazzleShadowWave getAbility3() {
        return ability3;
    }

    public DazzleWeave getAbility4() {
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Dazzle))
            return false;
        if (object == this)
            return true;
        Dazzle otherObject = (Dazzle) object;
        return otherObject.getKey().equals(getKey());
    }

}
