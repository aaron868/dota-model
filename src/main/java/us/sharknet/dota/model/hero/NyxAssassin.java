package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class NyxAssassin extends Hero {

    private static NyxAssassin instance;

    private final NyxAssassinImpale ability1;
    private final NyxAssassinManaBurn ability2;
    private final NyxAssassinSpikedCarapace ability3;
    private final NyxAssassinBurrow ability4;
    private final NyxAssassinUnburrow ability5;
    private final NyxAssassinVendetta ability6;
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
    private final double statusHealthRegen;
    private final String team;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private NyxAssassin() {
        ability1 = NyxAssassinImpale.instance();
        ability2 = NyxAssassinManaBurn.instance();
        ability3 = NyxAssassinSpikedCarapace.instance();
        ability4 = NyxAssassinBurrow.instance();
        ability5 = NyxAssassinUnburrow.instance();
        ability6 = NyxAssassinVendetta.instance();
        ability7 = AttributeBonus.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .46;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 34;
        attackDamageMin = 30;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.2;
        attributeBaseAgility = 19;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 18;
        attributeIntelligenceGain = 2.1;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2;
        cMEnabled = 1;
        enabled = 1;
        heroID = 88;
        key = "npc_dota_hero_nyx_assassin";
        movementSpeed = 300;
        movementTurnRate = .5;
        statusHealthRegen = 2.5;
        team = "Bad";
        active = true;
        localizedName = "Nyx Assassin";
        shortKey = "nyx_assassin";
        url = "Nyx_Assassin";
    }

    public static NyxAssassin instance() {
        if( instance == null ){
            instance = new NyxAssassin();
        }
        return instance;
    }

    public NyxAssassinImpale getAbility1() {
        return ability1;
    }

    public NyxAssassinManaBurn getAbility2() {
        return ability2;
    }

    public NyxAssassinSpikedCarapace getAbility3() {
        return ability3;
    }

    public NyxAssassinBurrow getAbility4() {
        return ability4;
    }

    public NyxAssassinUnburrow getAbility5() {
        return ability5;
    }

    public NyxAssassinVendetta getAbility6() {
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

    public double getStatusHealthRegen() {
        return statusHealthRegen;
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
        if (!(object instanceof NyxAssassin))
            return false;
        if (object == this)
            return true;
        NyxAssassin otherObject = (NyxAssassin) object;
        return otherObject.getKey().equals(getKey());
    }

}
