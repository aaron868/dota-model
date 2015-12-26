package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Razor extends Hero {

    private static Razor instance;

    private final RazorPlasmaField ability1;
    private final RazorStaticLink ability2;
    private final RazorUnstableCurrent ability3;
    private final RazorEyeOfTheStorm ability4;
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

    private Razor() {
        ability1 = RazorPlasmaField.instance();
        ability2 = RazorStaticLink.instance();
        ability3 = RazorUnstableCurrent.instance();
        ability4 = RazorEyeOfTheStorm.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 25;
        attackDamageMin = 23;
        attackRange = 475;
        attackRate = 1.7;
        attributeAgilityGain = 2;
        attributeBaseAgility = 22;
        attributeBaseIntelligence = 19;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.3;
        cMEnabled = 1;
        enabled = 1;
        heroID = 15;
        key = "npc_dota_hero_razor";
        movementSpeed = 295;
        movementTurnRate = .4;
        projectileSpeed = 2000;
        team = "Bad";
        active = true;
        localizedName = "Razor";
        shortKey = "razor";
        url = "Razor";
    }

    public static Razor instance() {
        if( instance == null ){
            instance = new Razor();
        }
        return instance;
    }

    public RazorPlasmaField getAbility1() {
        return ability1;
    }

    public RazorStaticLink getAbility2() {
        return ability2;
    }

    public RazorUnstableCurrent getAbility3() {
        return ability3;
    }

    public RazorEyeOfTheStorm getAbility4() {
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
        if (!(object instanceof Razor))
            return false;
        if (object == this)
            return true;
        Razor otherObject = (Razor) object;
        return otherObject.getKey().equals(getKey());
    }

}
