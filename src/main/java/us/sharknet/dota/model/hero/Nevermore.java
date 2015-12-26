package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Nevermore extends Hero {

    private static Nevermore instance;

    private final NevermoreShadowraze1 ability1;
    private final NevermoreShadowraze2 ability2;
    private final NevermoreShadowraze3 ability3;
    private final NevermoreNecromastery ability4;
    private final NevermoreDarkLord ability5;
    private final NevermoreRequiem ability6;
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
    private final String shortKey;
    private final String url;

    private Nevermore() {
        ability1 = NevermoreShadowraze1.instance();
        ability2 = NevermoreShadowraze2.instance();
        ability3 = NevermoreShadowraze3.instance();
        ability4 = NevermoreNecromastery.instance();
        ability5 = NevermoreDarkLord.instance();
        ability6 = NevermoreRequiem.instance();
        ability7 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        armorPhysical = -2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 21;
        attackDamageMin = 15;
        attackRange = 500;
        attackRate = 1.7;
        attributeAgilityGain = 2.9;
        attributeBaseAgility = 20;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 15;
        attributeIntelligenceGain = 2;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2;
        cMEnabled = 1;
        enabled = 1;
        heroID = 11;
        key = "npc_dota_hero_nevermore";
        movementSpeed = 305;
        movementTurnRate = 1;
        projectileSpeed = 1200;
        statusHealthRegen = .5;
        team = "Bad";
        active = true;
        localizedName = "Shadow Fiend";
        shortKey = "nevermore";
        url = "Shadow_Fiend";
    }

    public static Nevermore instance() {
        if( instance == null ){
            instance = new Nevermore();
        }
        return instance;
    }

    public NevermoreShadowraze1 getAbility1() {
        return ability1;
    }

    public NevermoreShadowraze2 getAbility2() {
        return ability2;
    }

    public NevermoreShadowraze3 getAbility3() {
        return ability3;
    }

    public NevermoreNecromastery getAbility4() {
        return ability4;
    }

    public NevermoreDarkLord getAbility5() {
        return ability5;
    }

    public NevermoreRequiem getAbility6() {
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Nevermore))
            return false;
        if (object == this)
            return true;
        Nevermore otherObject = (Nevermore) object;
        return otherObject.getKey().equals(getKey());
    }

}
