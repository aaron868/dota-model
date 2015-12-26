package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Broodmother extends Hero {

    private static Broodmother instance;

    private final BroodmotherSpawnSpiderlings ability1;
    private final BroodmotherSpinWeb ability2;
    private final BroodmotherIncapacitatingBite ability3;
    private final BroodmotherInsatiableHunger ability4;
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
    private final String shortKey;
    private final String url;

    private Broodmother() {
        ability1 = BroodmotherSpawnSpiderlings.instance();
        ability2 = BroodmotherSpinWeb.instance();
        ability3 = BroodmotherIncapacitatingBite.instance();
        ability4 = BroodmotherInsatiableHunger.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 32;
        attackDamageMin = 26;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.2;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 2;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.5;
        cMEnabled = 1;
        enabled = 1;
        heroID = 61;
        key = "npc_dota_hero_broodmother";
        movementSpeed = 295;
        movementTurnRate = .5;
        team = "Bad";
        visionDaytimeRange = 1800;
        active = true;
        localizedName = "Broodmother";
        shortKey = "broodmother";
        url = "Broodmother";
    }

    public static Broodmother instance() {
        if( instance == null ){
            instance = new Broodmother();
        }
        return instance;
    }

    public BroodmotherSpawnSpiderlings getAbility1() {
        return ability1;
    }

    public BroodmotherSpinWeb getAbility2() {
        return ability2;
    }

    public BroodmotherIncapacitatingBite getAbility3() {
        return ability3;
    }

    public BroodmotherInsatiableHunger getAbility4() {
        return ability4;
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Broodmother))
            return false;
        if (object == this)
            return true;
        Broodmother otherObject = (Broodmother) object;
        return otherObject.getKey().equals(getKey());
    }

}
