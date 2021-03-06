package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Shredder extends Hero {

    private static Shredder instance;

    private final ShredderWhirlingDeath ability1;
    private final ShredderTimberChain ability2;
    private final ShredderReactiveArmor ability3;
    private final ShredderChakram2 ability4;
    private final ShredderReturnChakram2 ability5;
    private final ShredderChakram ability6;
    private final ShredderReturnChakram ability7;
    private final AttributeBonus ability8;
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

    private Shredder() {
        ability1 = ShredderWhirlingDeath.instance();
        ability2 = ShredderTimberChain.instance();
        ability3 = ShredderReactiveArmor.instance();
        ability4 = ShredderChakram2.instance();
        ability5 = ShredderReturnChakram2.instance();
        ability6 = ShredderChakram.instance();
        ability7 = ShredderReturnChakram.instance();
        ability8 = AttributeBonus.instance();
        armorPhysical = -2;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .36;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 30;
        attackDamageMin = 26;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.3;
        attributeBaseAgility = 16;
        attributeBaseIntelligence = 21;
        attributeBaseStrength = 22;
        attributeIntelligenceGain = 2.4;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.1;
        cMEnabled = 1;
        enabled = 1;
        heroID = 98;
        key = "npc_dota_hero_shredder";
        movementSpeed = 290;
        movementTurnRate = .6;
        team = "Good";
        active = true;
        localizedName = "Timbersaw";
        url = "Timbersaw";
    }

    public static Shredder instance() {
        if( instance == null ){
            instance = new Shredder();
        }
        return instance;
    }

    public ShredderWhirlingDeath getAbility1() {
        return ability1;
    }

    public ShredderTimberChain getAbility2() {
        return ability2;
    }

    public ShredderReactiveArmor getAbility3() {
        return ability3;
    }

    public ShredderChakram2 getAbility4() {
        return ability4;
    }

    public ShredderReturnChakram2 getAbility5() {
        return ability5;
    }

    public ShredderChakram getAbility6() {
        return ability6;
    }

    public ShredderReturnChakram getAbility7() {
        return ability7;
    }

    public AttributeBonus getAbility8() {
        return ability8;
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
        if (!(object instanceof Shredder))
            return false;
        if (object == this)
            return true;
        Shredder otherObject = (Shredder) object;
        return otherObject.getKey().equals(getKey());
    }

}
