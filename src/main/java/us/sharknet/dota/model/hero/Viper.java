package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Viper extends Hero {

    private static Viper instance;

    private final ViperPoisonAttack ability1;
    private final ViperNethertoxin ability2;
    private final ViperCorrosiveSkin ability3;
    private final ViperViperStrike ability4;
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

    private Viper() {
        ability1 = ViperPoisonAttack.instance();
        ability2 = ViperNethertoxin.instance();
        ability3 = ViperCorrosiveSkin.instance();
        ability4 = ViperViperStrike.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .33;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 25;
        attackDamageMin = 23;
        attackRange = 575;
        attackRate = 1.7;
        attributeAgilityGain = 2.9;
        attributeBaseAgility = 21;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 20;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.9;
        cMEnabled = 1;
        enabled = 1;
        heroID = 47;
        key = "npc_dota_hero_viper";
        movementSpeed = 285;
        movementTurnRate = .4;
        projectileSpeed = 1200;
        team = "Bad";
        active = true;
        localizedName = "Viper";
        shortKey = "viper";
        url = "Viper";
    }

    public static Viper instance() {
        if( instance == null ){
            instance = new Viper();
        }
        return instance;
    }

    public ViperPoisonAttack getAbility1() {
        return ability1;
    }

    public ViperNethertoxin getAbility2() {
        return ability2;
    }

    public ViperCorrosiveSkin getAbility3() {
        return ability3;
    }

    public ViperViperStrike getAbility4() {
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
        if (!(object instanceof Viper))
            return false;
        if (object == this)
            return true;
        Viper otherObject = (Viper) object;
        return otherObject.getKey().equals(getKey());
    }

}
