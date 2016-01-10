package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Treant extends Hero {

    private static Treant instance;

    private final TreantNaturesGuise ability1;
    private final TreantLeechSeed ability2;
    private final TreantLivingArmor ability3;
    private final TreantEyesInTheForest ability4;
    private final TreantOvergrowth ability5;
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

    private Treant() {
        ability1 = TreantNaturesGuise.instance();
        ability2 = TreantLeechSeed.instance();
        ability3 = TreantLivingArmor.instance();
        ability4 = TreantEyesInTheForest.instance();
        ability5 = TreantOvergrowth.instance();
        ability6 = AttributeBonus.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .6;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 64;
        attackDamageMin = 56;
        attackRange = 128;
        attackRate = 1.9;
        attributeAgilityGain = 2;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 17;
        attributeBaseStrength = 25;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 3.3;
        cMEnabled = 1;
        enabled = 1;
        heroID = 83;
        key = "npc_dota_hero_treant";
        movementSpeed = 300;
        movementTurnRate = .5;
        team = "Good";
        visionDaytimeRange = 1800;
        active = true;
        localizedName = "Treant Protector";
        url = "Treant_Protector";
    }

    public static Treant instance() {
        if( instance == null ){
            instance = new Treant();
        }
        return instance;
    }

    public TreantNaturesGuise getAbility1() {
        return ability1;
    }

    public TreantLeechSeed getAbility2() {
        return ability2;
    }

    public TreantLivingArmor getAbility3() {
        return ability3;
    }

    public TreantEyesInTheForest getAbility4() {
        return ability4;
    }

    public TreantOvergrowth getAbility5() {
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
        if (!(object instanceof Treant))
            return false;
        if (object == this)
            return true;
        Treant otherObject = (Treant) object;
        return otherObject.getKey().equals(getKey());
    }

}
