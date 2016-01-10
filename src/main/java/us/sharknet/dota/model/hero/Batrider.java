package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Batrider extends Hero {

    private static Batrider instance;

    private final BatriderStickyNapalm ability1;
    private final BatriderFlamebreak ability2;
    private final BatriderFirefly ability3;
    private final BatriderFlamingLasso ability4;
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
    private final int visionDaytimeRange;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private Batrider() {
        ability1 = BatriderStickyNapalm.instance();
        ability2 = BatriderFlamebreak.instance();
        ability3 = BatriderFirefly.instance();
        ability4 = BatriderFlamingLasso.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 18;
        attackDamageMin = 14;
        attackRange = 375;
        attackRate = 1.7;
        attributeAgilityGain = 1.5;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 24;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 2.5;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.4;
        cMEnabled = 1;
        enabled = 1;
        heroID = 65;
        key = "npc_dota_hero_batrider";
        movementSpeed = 290;
        movementTurnRate = 1;
        projectileSpeed = 900;
        statusHealthRegen = 2;
        team = "Bad";
        visionDaytimeRange = 1200;
        active = true;
        localizedName = "Batrider";
        url = "Batrider";
    }

    public static Batrider instance() {
        if( instance == null ){
            instance = new Batrider();
        }
        return instance;
    }

    public BatriderStickyNapalm getAbility1() {
        return ability1;
    }

    public BatriderFlamebreak getAbility2() {
        return ability2;
    }

    public BatriderFirefly getAbility3() {
        return ability3;
    }

    public BatriderFlamingLasso getAbility4() {
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

    public int getVisionDaytimeRange() {
        return visionDaytimeRange;
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
        if (!(object instanceof Batrider))
            return false;
        if (object == this)
            return true;
        Batrider otherObject = (Batrider) object;
        return otherObject.getKey().equals(getKey());
    }

}
