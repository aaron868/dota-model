package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Slardar extends Hero {

    private static Slardar instance;

    private final SlardarSprint ability1;
    private final SlardarSlithereenCrush ability2;
    private final SlardarBash ability3;
    private final SlardarAmplifyDamage ability4;
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

    private Slardar() {
        ability1 = SlardarSprint.instance();
        ability2 = SlardarSlithereenCrush.instance();
        ability3 = SlardarBash.instance();
        ability4 = SlardarAmplifyDamage.instance();
        armorPhysical = 3;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .36;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 38;
        attackDamageMin = 30;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.4;
        attributeBaseAgility = 17;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 1.5;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.8;
        cMEnabled = 1;
        enabled = 1;
        heroID = 28;
        key = "npc_dota_hero_slardar";
        movementSpeed = 300;
        movementTurnRate = .5;
        projectileSpeed = 0;
        team = "Bad";
        active = true;
        localizedName = "Slardar";
        url = "Slardar";
    }

    public static Slardar instance() {
        if( instance == null ){
            instance = new Slardar();
        }
        return instance;
    }

    public SlardarSprint getAbility1() {
        return ability1;
    }

    public SlardarSlithereenCrush getAbility2() {
        return ability2;
    }

    public SlardarBash getAbility3() {
        return ability3;
    }

    public SlardarAmplifyDamage getAbility4() {
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
        if (!(object instanceof Slardar))
            return false;
        if (object == this)
            return true;
        Slardar otherObject = (Slardar) object;
        return otherObject.getKey().equals(getKey());
    }

}
