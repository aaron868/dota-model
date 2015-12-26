package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Lina extends Hero {

    private static Lina instance;

    private final LinaDragonSlave ability1;
    private final LinaLightStrikeArray ability2;
    private final LinaFierySoul ability3;
    private final LinaLagunaBlade ability4;
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

    private Lina() {
        ability1 = LinaDragonSlave.instance();
        ability2 = LinaLightStrikeArray.instance();
        ability3 = LinaFierySoul.instance();
        ability4 = LinaLagunaBlade.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .75;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 31;
        attackDamageMin = 13;
        attackRange = 670;
        attackRate = 1.7;
        attributeAgilityGain = 1.5;
        attributeBaseAgility = 16;
        attributeBaseIntelligence = 27;
        attributeBaseStrength = 18;
        attributeIntelligenceGain = 3.2;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.5;
        cMEnabled = 1;
        enabled = 1;
        heroID = 25;
        key = "npc_dota_hero_lina";
        movementSpeed = 295;
        movementTurnRate = .5;
        projectileSpeed = 1000;
        team = "Good";
        active = true;
        localizedName = "Lina";
        shortKey = "lina";
        url = "Lina";
    }

    public static Lina instance() {
        if( instance == null ){
            instance = new Lina();
        }
        return instance;
    }

    public LinaDragonSlave getAbility1() {
        return ability1;
    }

    public LinaLightStrikeArray getAbility2() {
        return ability2;
    }

    public LinaFierySoul getAbility3() {
        return ability3;
    }

    public LinaLagunaBlade getAbility4() {
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
        if (!(object instanceof Lina))
            return false;
        if (object == this)
            return true;
        Lina otherObject = (Lina) object;
        return otherObject.getKey().equals(getKey());
    }

}
