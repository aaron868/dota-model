package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class EarthSpirit extends Hero {

    private static EarthSpirit instance;

    private final EarthSpiritBoulderSmash ability1;
    private final EarthSpiritRollingBoulder ability2;
    private final EarthSpiritGeomagneticGrip ability3;
    private final EarthSpiritStoneCaller ability4;
    private final EarthSpiritPetrify ability5;
    private final EarthSpiritMagnetize ability6;
    private final AttributeBonus ability7;
    private final int abilityDraftDisabled;
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
    private final int visionDaytimeRange;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private EarthSpirit() {
        ability1 = EarthSpiritBoulderSmash.instance();
        ability2 = EarthSpiritRollingBoulder.instance();
        ability3 = EarthSpiritGeomagneticGrip.instance();
        ability4 = EarthSpiritStoneCaller.instance();
        ability5 = EarthSpiritPetrify.instance();
        ability6 = EarthSpiritMagnetize.instance();
        ability7 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .35;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 35;
        attackDamageMin = 25;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.5;
        attributeBaseAgility = 17;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 2.1;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.9;
        cMEnabled = 1;
        enabled = 1;
        heroID = 107;
        key = "npc_dota_hero_earth_spirit";
        movementSpeed = 305;
        movementTurnRate = .6;
        team = "Good";
        visionDaytimeRange = 1800;
        active = true;
        localizedName = "Earth Spirit";
        url = "Earth_Spirit";
    }

    public static EarthSpirit instance() {
        if( instance == null ){
            instance = new EarthSpirit();
        }
        return instance;
    }

    public EarthSpiritBoulderSmash getAbility1() {
        return ability1;
    }

    public EarthSpiritRollingBoulder getAbility2() {
        return ability2;
    }

    public EarthSpiritGeomagneticGrip getAbility3() {
        return ability3;
    }

    public EarthSpiritStoneCaller getAbility4() {
        return ability4;
    }

    public EarthSpiritPetrify getAbility5() {
        return ability5;
    }

    public EarthSpiritMagnetize getAbility6() {
        return ability6;
    }

    public AttributeBonus getAbility7() {
        return ability7;
    }

    public int getAbilityDraftDisabled() {
        return abilityDraftDisabled;
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
        if (!(object instanceof EarthSpirit))
            return false;
        if (object == this)
            return true;
        EarthSpirit otherObject = (EarthSpirit) object;
        return otherObject.getKey().equals(getKey());
    }

}
