package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Jakiro extends Hero {

    private static Jakiro instance;

    private final JakiroDualBreath ability1;
    private final JakiroIcePath ability2;
    private final JakiroLiquidFire ability3;
    private final JakiroMacropyre ability4;
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

    private Jakiro() {
        ability1 = JakiroDualBreath.instance();
        ability2 = JakiroIcePath.instance();
        ability3 = JakiroLiquidFire.instance();
        ability4 = JakiroMacropyre.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 25;
        attackRange = 400;
        attackRate = 1.7;
        attributeAgilityGain = 1.2;
        attributeBaseAgility = 10;
        attributeBaseIntelligence = 28;
        attributeBaseStrength = 25;
        attributeIntelligenceGain = 2.8;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.3;
        cMEnabled = 1;
        enabled = 1;
        heroID = 64;
        key = "npc_dota_hero_jakiro";
        movementSpeed = 290;
        movementTurnRate = .5;
        projectileSpeed = 1100;
        team = "Good";
        active = true;
        localizedName = "Jakiro";
        shortKey = "jakiro";
        url = "Jakiro";
    }

    public static Jakiro instance() {
        if( instance == null ){
            instance = new Jakiro();
        }
        return instance;
    }

    public JakiroDualBreath getAbility1() {
        return ability1;
    }

    public JakiroIcePath getAbility2() {
        return ability2;
    }

    public JakiroLiquidFire getAbility3() {
        return ability3;
    }

    public JakiroMacropyre getAbility4() {
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
        if (!(object instanceof Jakiro))
            return false;
        if (object == this)
            return true;
        Jakiro otherObject = (Jakiro) object;
        return otherObject.getKey().equals(getKey());
    }

}
