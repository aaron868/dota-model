package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Undying extends Hero {

    private static Undying instance;

    private final UndyingDecay ability1;
    private final UndyingSoulRip ability2;
    private final UndyingTombstone ability3;
    private final UndyingFleshGolem ability4;
    private final AttributeBonus ability5;
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
    private final String team;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private Undying() {
        ability1 = UndyingDecay.instance();
        ability2 = UndyingSoulRip.instance();
        ability3 = UndyingTombstone.instance();
        ability4 = UndyingFleshGolem.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = 2;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 43;
        attackDamageMin = 35;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = .8;
        attributeBaseAgility = 10;
        attributeBaseIntelligence = 27;
        attributeBaseStrength = 22;
        attributeIntelligenceGain = 2.5;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.1;
        cMEnabled = 1;
        enabled = 1;
        heroID = 85;
        key = "npc_dota_hero_undying";
        movementSpeed = 310;
        movementTurnRate = .6;
        team = "Bad";
        active = true;
        localizedName = "Undying";
        url = "Undying";
    }

    public static Undying instance() {
        if( instance == null ){
            instance = new Undying();
        }
        return instance;
    }

    public UndyingDecay getAbility1() {
        return ability1;
    }

    public UndyingSoulRip getAbility2() {
        return ability2;
    }

    public UndyingTombstone getAbility3() {
        return ability3;
    }

    public UndyingFleshGolem getAbility4() {
        return ability4;
    }

    public AttributeBonus getAbility5() {
        return ability5;
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
        if (!(object instanceof Undying))
            return false;
        if (object == this)
            return true;
        Undying otherObject = (Undying) object;
        return otherObject.getKey().equals(getKey());
    }

}
