package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class LoneDruid extends Hero {

    private static LoneDruid instance;

    private final LoneDruidSpiritBear ability1;
    private final LoneDruidRabid ability2;
    private final LoneDruidSavageRoar ability3;
    private final LoneDruidTrueFormBattleCry ability4;
    private final LoneDruidTrueForm ability5;
    private final LoneDruidTrueFormDruid ability6;
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
    private final int projectileSpeed;
    private final double statusHealthRegen;
    private final String team;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private LoneDruid() {
        ability1 = LoneDruidSpiritBear.instance();
        ability2 = LoneDruidRabid.instance();
        ability3 = LoneDruidSavageRoar.instance();
        ability4 = LoneDruidTrueFormBattleCry.instance();
        ability5 = LoneDruidTrueForm.instance();
        ability6 = LoneDruidTrueFormDruid.instance();
        ability7 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .33;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 26;
        attackDamageMin = 22;
        attackRange = 550;
        attackRate = 1.7;
        attributeAgilityGain = 2.7;
        attributeBaseAgility = 24;
        attributeBaseIntelligence = 13;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 1.4;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.1;
        cMEnabled = 1;
        enabled = 1;
        heroID = 80;
        key = "npc_dota_hero_lone_druid";
        movementSpeed = 325;
        movementTurnRate = .4;
        projectileSpeed = 900;
        statusHealthRegen = .5;
        team = "Good";
        active = true;
        localizedName = "Lone Druid";
        url = "Lone_Druid";
    }

    public static LoneDruid instance() {
        if( instance == null ){
            instance = new LoneDruid();
        }
        return instance;
    }

    public LoneDruidSpiritBear getAbility1() {
        return ability1;
    }

    public LoneDruidRabid getAbility2() {
        return ability2;
    }

    public LoneDruidSavageRoar getAbility3() {
        return ability3;
    }

    public LoneDruidTrueFormBattleCry getAbility4() {
        return ability4;
    }

    public LoneDruidTrueForm getAbility5() {
        return ability5;
    }

    public LoneDruidTrueFormDruid getAbility6() {
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

    public int getProjectileSpeed() {
        return projectileSpeed;
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

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof LoneDruid))
            return false;
        if (object == this)
            return true;
        LoneDruid otherObject = (LoneDruid) object;
        return otherObject.getKey().equals(getKey());
    }

}
