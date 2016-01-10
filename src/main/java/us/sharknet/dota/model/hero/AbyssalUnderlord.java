package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class AbyssalUnderlord extends Hero {

    private static AbyssalUnderlord instance;

    private final AbyssalUnderlordFirestorm ability1;
    private final AbyssalUnderlordPitOfMalice ability2;
    private final AbyssalUnderlordAtrophyAura ability3;
    private final AbyssalUnderlordDarkRift ability4;
    private final AbyssalUnderlordCancelDarkRift ability5;
    private final AttributeBonus ability6;
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
    private final int enabled;
    private final int heroID;
    private final String key;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String team;
    private final int visionDaytimeRange;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private AbyssalUnderlord() {
        ability1 = AbyssalUnderlordFirestorm.instance();
        ability2 = AbyssalUnderlordPitOfMalice.instance();
        ability3 = AbyssalUnderlordAtrophyAura.instance();
        ability4 = AbyssalUnderlordDarkRift.instance();
        ability5 = AbyssalUnderlordCancelDarkRift.instance();
        ability6 = AttributeBonus.instance();
        armorPhysical = 2;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .45;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 43;
        attackDamageMin = 37;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.3;
        attributeBaseAgility = 12;
        attributeBaseIntelligence = 17;
        attributeBaseStrength = 25;
        attributeIntelligenceGain = 2.6;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.6;
        enabled = 0;
        heroID = 108;
        key = "npc_dota_hero_abyssal_underlord";
        movementSpeed = 305;
        movementTurnRate = .6;
        team = "Bad";
        visionDaytimeRange = 1800;
        active = false;
        localizedName = "Abyssal Underlord";
        url = "AbyssalUnderlord";
    }

    public static AbyssalUnderlord instance() {
        if( instance == null ){
            instance = new AbyssalUnderlord();
        }
        return instance;
    }

    public AbyssalUnderlordFirestorm getAbility1() {
        return ability1;
    }

    public AbyssalUnderlordPitOfMalice getAbility2() {
        return ability2;
    }

    public AbyssalUnderlordAtrophyAura getAbility3() {
        return ability3;
    }

    public AbyssalUnderlordDarkRift getAbility4() {
        return ability4;
    }

    public AbyssalUnderlordCancelDarkRift getAbility5() {
        return ability5;
    }

    public AttributeBonus getAbility6() {
        return ability6;
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
        if (!(object instanceof AbyssalUnderlord))
            return false;
        if (object == this)
            return true;
        AbyssalUnderlord otherObject = (AbyssalUnderlord) object;
        return otherObject.getKey().equals(getKey());
    }

}
