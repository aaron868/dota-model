package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class KeeperOfTheLight extends Hero {

    private static KeeperOfTheLight instance;

    private final KeeperOfTheLightIlluminate ability1;
    private final AttributeBonus ability10;
    private final KeeperOfTheLightManaLeak ability2;
    private final KeeperOfTheLightChakraMagic ability3;
    private final KeeperOfTheLightRecall ability4;
    private final KeeperOfTheLightBlindingLight ability5;
    private final KeeperOfTheLightSpiritForm ability6;
    private final KeeperOfTheLightIlluminateEnd ability7;
    private final KeeperOfTheLightSpiritFormIlluminate ability8;
    private final KeeperOfTheLightSpiritFormIlluminateEnd ability9;
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
    private final String team;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private KeeperOfTheLight() {
        ability1 = KeeperOfTheLightIlluminate.instance();
        ability10 = AttributeBonus.instance();
        ability2 = KeeperOfTheLightManaLeak.instance();
        ability3 = KeeperOfTheLightChakraMagic.instance();
        ability4 = KeeperOfTheLightRecall.instance();
        ability5 = KeeperOfTheLightBlindingLight.instance();
        ability6 = KeeperOfTheLightSpiritForm.instance();
        ability7 = KeeperOfTheLightIlluminateEnd.instance();
        ability8 = KeeperOfTheLightSpiritFormIlluminate.instance();
        ability9 = KeeperOfTheLightSpiritFormIlluminateEnd.instance();
        abilityDraftDisabled = 1;
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 32;
        attackDamageMin = 18;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1.6;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 22;
        attributeBaseStrength = 14;
        attributeIntelligenceGain = 2.8;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.8;
        cMEnabled = 1;
        enabled = 1;
        heroID = 90;
        key = "npc_dota_hero_keeper_of_the_light";
        movementSpeed = 315;
        movementTurnRate = .5;
        projectileSpeed = 900;
        team = "Good";
        active = true;
        localizedName = "Keeper of the Light";
        url = "Keeper_of_the_Light";
    }

    public static KeeperOfTheLight instance() {
        if( instance == null ){
            instance = new KeeperOfTheLight();
        }
        return instance;
    }

    public KeeperOfTheLightIlluminate getAbility1() {
        return ability1;
    }

    public AttributeBonus getAbility10() {
        return ability10;
    }

    public KeeperOfTheLightManaLeak getAbility2() {
        return ability2;
    }

    public KeeperOfTheLightChakraMagic getAbility3() {
        return ability3;
    }

    public KeeperOfTheLightRecall getAbility4() {
        return ability4;
    }

    public KeeperOfTheLightBlindingLight getAbility5() {
        return ability5;
    }

    public KeeperOfTheLightSpiritForm getAbility6() {
        return ability6;
    }

    public KeeperOfTheLightIlluminateEnd getAbility7() {
        return ability7;
    }

    public KeeperOfTheLightSpiritFormIlluminate getAbility8() {
        return ability8;
    }

    public KeeperOfTheLightSpiritFormIlluminateEnd getAbility9() {
        return ability9;
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
        if (!(object instanceof KeeperOfTheLight))
            return false;
        if (object == this)
            return true;
        KeeperOfTheLight otherObject = (KeeperOfTheLight) object;
        return otherObject.getKey().equals(getKey());
    }

}
