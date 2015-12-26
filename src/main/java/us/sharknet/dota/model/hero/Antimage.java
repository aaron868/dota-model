package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Antimage extends Hero {

    private static Antimage instance;

    private final AntimageManaBreak ability1;
    private final AntimageBlink ability2;
    private final AntimageSpellShield ability3;
    private final AntimageManaVoid ability4;
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

    private Antimage() {
        ability1 = AntimageManaBreak.instance();
        ability2 = AntimageBlink.instance();
        ability3 = AntimageSpellShield.instance();
        ability4 = AntimageManaVoid.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 31;
        attackDamageMin = 27;
        attackRange = 128;
        attackRate = 1.45;
        attributeAgilityGain = 2.8;
        attributeBaseAgility = 22;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 22;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.2;
        cMEnabled = 1;
        enabled = 1;
        heroID = 1;
        key = "npc_dota_hero_antimage";
        movementSpeed = 315;
        movementTurnRate = .5;
        projectileSpeed = 0;
        team = "Good";
        active = true;
        localizedName = "Anti-Mage";
        shortKey = "antimage";
        url = "Anti-Mage";
    }

    public static Antimage instance() {
        if( instance == null ){
            instance = new Antimage();
        }
        return instance;
    }

    public AntimageManaBreak getAbility1() {
        return ability1;
    }

    public AntimageBlink getAbility2() {
        return ability2;
    }

    public AntimageSpellShield getAbility3() {
        return ability3;
    }

    public AntimageManaVoid getAbility4() {
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
        if (!(object instanceof Antimage))
            return false;
        if (object == this)
            return true;
        Antimage otherObject = (Antimage) object;
        return otherObject.getKey().equals(getKey());
    }

}
