package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class PhantomLancer extends Hero {

    private static PhantomLancer instance;

    private final PhantomLancerSpiritLance ability1;
    private final PhantomLancerDoppelwalk ability2;
    private final PhantomLancerPhantomEdge ability3;
    private final PhantomLancerJuxtapose ability4;
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

    private PhantomLancer() {
        ability1 = PhantomLancerSpiritLance.instance();
        ability2 = PhantomLancerDoppelwalk.instance();
        ability3 = PhantomLancerPhantomEdge.instance();
        ability4 = PhantomLancerJuxtapose.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 44;
        attackDamageMin = 22;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.6;
        attributeBaseAgility = 29;
        attributeBaseIntelligence = 21;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 2;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.7;
        cMEnabled = 1;
        enabled = 1;
        heroID = 12;
        key = "npc_dota_hero_phantom_lancer";
        movementSpeed = 290;
        movementTurnRate = .6;
        statusHealthRegen = .75;
        team = "Good";
        active = true;
        localizedName = "Phantom Lancer";
        shortKey = "phantom_lancer";
        url = "Phantom_Lancer";
    }

    public static PhantomLancer instance() {
        if( instance == null ){
            instance = new PhantomLancer();
        }
        return instance;
    }

    public PhantomLancerSpiritLance getAbility1() {
        return ability1;
    }

    public PhantomLancerDoppelwalk getAbility2() {
        return ability2;
    }

    public PhantomLancerPhantomEdge getAbility3() {
        return ability3;
    }

    public PhantomLancerJuxtapose getAbility4() {
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
        if (!(object instanceof PhantomLancer))
            return false;
        if (object == this)
            return true;
        PhantomLancer otherObject = (PhantomLancer) object;
        return otherObject.getKey().equals(getKey());
    }

}
