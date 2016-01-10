package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Tusk extends Hero {

    private static Tusk instance;

    private final TuskIceShards ability1;
    private final TuskSnowball ability2;
    private final TuskFrozenSigil ability3;
    private final TuskLaunchSnowball ability4;
    private final TuskWalrusKick ability5;
    private final TuskWalrusPunch ability6;
    private final AttributeBonus ability7;
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

    private Tusk() {
        ability1 = TuskIceShards.instance();
        ability2 = TuskSnowball.instance();
        ability3 = TuskFrozenSigil.instance();
        ability4 = TuskLaunchSnowball.instance();
        ability5 = TuskWalrusKick.instance();
        ability6 = TuskWalrusPunch.instance();
        ability7 = AttributeBonus.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .36;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 31;
        attackDamageMin = 27;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.1;
        attributeBaseAgility = 23;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 1.7;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.3;
        cMEnabled = 1;
        enabled = 1;
        heroID = 100;
        key = "npc_dota_hero_tusk";
        movementSpeed = 300;
        movementTurnRate = .5;
        team = "Good";
        active = true;
        localizedName = "Tusk";
        url = "Tusk";
    }

    public static Tusk instance() {
        if( instance == null ){
            instance = new Tusk();
        }
        return instance;
    }

    public TuskIceShards getAbility1() {
        return ability1;
    }

    public TuskSnowball getAbility2() {
        return ability2;
    }

    public TuskFrozenSigil getAbility3() {
        return ability3;
    }

    public TuskLaunchSnowball getAbility4() {
        return ability4;
    }

    public TuskWalrusKick getAbility5() {
        return ability5;
    }

    public TuskWalrusPunch getAbility6() {
        return ability6;
    }

    public AttributeBonus getAbility7() {
        return ability7;
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
        if (!(object instanceof Tusk))
            return false;
        if (object == this)
            return true;
        Tusk otherObject = (Tusk) object;
        return otherObject.getKey().equals(getKey());
    }

}
