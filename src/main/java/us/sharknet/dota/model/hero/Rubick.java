package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Rubick extends Hero {

    private static Rubick instance;

    private final RubickTelekinesis ability1;
    private final RubickHidden2 ability10;
    private final RubickHidden3 ability11;
    private final RubickTelekinesisLand ability2;
    private final RubickFadeBolt ability3;
    private final RubickNullField ability4;
    private final RubickEmpty1 ability5;
    private final RubickEmpty2 ability6;
    private final RubickSpellSteal ability7;
    private final AttributeBonus ability8;
    private final RubickHidden1 ability9;
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
    private final String shortKey;
    private final String url;

    private Rubick() {
        ability1 = RubickTelekinesis.instance();
        ability10 = RubickHidden2.instance();
        ability11 = RubickHidden3.instance();
        ability2 = RubickTelekinesisLand.instance();
        ability3 = RubickFadeBolt.instance();
        ability4 = RubickNullField.instance();
        ability5 = RubickEmpty1.instance();
        ability6 = RubickEmpty2.instance();
        ability7 = RubickSpellSteal.instance();
        ability8 = AttributeBonus.instance();
        ability9 = RubickHidden1.instance();
        abilityDraftDisabled = 1;
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 27;
        attackDamageMin = 17;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1.6;
        attributeBaseAgility = 14;
        attributeBaseIntelligence = 27;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 2.4;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.5;
        cMEnabled = 1;
        enabled = 1;
        heroID = 86;
        key = "npc_dota_hero_rubick";
        movementSpeed = 290;
        movementTurnRate = .5;
        projectileSpeed = 1125;
        team = "Good";
        active = true;
        localizedName = "Rubick";
        shortKey = "rubick";
        url = "Rubick";
    }

    public static Rubick instance() {
        if( instance == null ){
            instance = new Rubick();
        }
        return instance;
    }

    public RubickTelekinesis getAbility1() {
        return ability1;
    }

    public RubickHidden2 getAbility10() {
        return ability10;
    }

    public RubickHidden3 getAbility11() {
        return ability11;
    }

    public RubickTelekinesisLand getAbility2() {
        return ability2;
    }

    public RubickFadeBolt getAbility3() {
        return ability3;
    }

    public RubickNullField getAbility4() {
        return ability4;
    }

    public RubickEmpty1 getAbility5() {
        return ability5;
    }

    public RubickEmpty2 getAbility6() {
        return ability6;
    }

    public RubickSpellSteal getAbility7() {
        return ability7;
    }

    public AttributeBonus getAbility8() {
        return ability8;
    }

    public RubickHidden1 getAbility9() {
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Rubick))
            return false;
        if (object == this)
            return true;
        Rubick otherObject = (Rubick) object;
        return otherObject.getKey().equals(getKey());
    }

}
