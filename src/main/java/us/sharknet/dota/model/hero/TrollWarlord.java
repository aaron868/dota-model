package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class TrollWarlord extends Hero {

    private static TrollWarlord instance;

    private final TrollWarlordBerserkersRage ability1;
    private final TrollWarlordWhirlingAxesRanged ability2;
    private final TrollWarlordWhirlingAxesMelee ability3;
    private final TrollWarlordFervor ability4;
    private final TrollWarlordBattleTrance ability5;
    private final AttributeBonus ability6;
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
    private final int visionDaytimeRange;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private TrollWarlord() {
        ability1 = TrollWarlordBerserkersRage.instance();
        ability2 = TrollWarlordWhirlingAxesRanged.instance();
        ability3 = TrollWarlordWhirlingAxesMelee.instance();
        ability4 = TrollWarlordFervor.instance();
        ability5 = TrollWarlordBattleTrance.instance();
        ability6 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 35;
        attackDamageMin = 17;
        attackRange = 500;
        attackRate = 1.7;
        attributeAgilityGain = 2.75;
        attributeBaseAgility = 21;
        attributeBaseIntelligence = 13;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 1;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.2;
        cMEnabled = 1;
        enabled = 1;
        heroID = 95;
        key = "npc_dota_hero_troll_warlord";
        movementSpeed = 300;
        movementTurnRate = .5;
        projectileSpeed = 1200;
        team = "Good";
        visionDaytimeRange = 1800;
        active = true;
        localizedName = "Troll Warlord";
        url = "Troll_Warlord";
    }

    public static TrollWarlord instance() {
        if( instance == null ){
            instance = new TrollWarlord();
        }
        return instance;
    }

    public TrollWarlordBerserkersRage getAbility1() {
        return ability1;
    }

    public TrollWarlordWhirlingAxesRanged getAbility2() {
        return ability2;
    }

    public TrollWarlordWhirlingAxesMelee getAbility3() {
        return ability3;
    }

    public TrollWarlordFervor getAbility4() {
        return ability4;
    }

    public TrollWarlordBattleTrance getAbility5() {
        return ability5;
    }

    public AttributeBonus getAbility6() {
        return ability6;
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
        if (!(object instanceof TrollWarlord))
            return false;
        if (object == this)
            return true;
        TrollWarlord otherObject = (TrollWarlord) object;
        return otherObject.getKey().equals(getKey());
    }

}
