package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class PhantomAssassin extends Hero {

    private static PhantomAssassin instance;

    private final PhantomAssassinStiflingDagger ability1;
    private final PhantomAssassinPhantomStrike ability2;
    private final PhantomAssassinBlur ability3;
    private final PhantomAssassinCoupDeGrace ability4;
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
    private final String shortKey;
    private final String url;

    private PhantomAssassin() {
        ability1 = PhantomAssassinStiflingDagger.instance();
        ability2 = PhantomAssassinPhantomStrike.instance();
        ability3 = PhantomAssassinBlur.instance();
        ability4 = PhantomAssassinCoupDeGrace.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 25;
        attackDamageMin = 23;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 3.15;
        attributeBaseAgility = 23;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 20;
        attributeIntelligenceGain = 1.4;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.85;
        cMEnabled = 1;
        enabled = 1;
        heroID = 44;
        key = "npc_dota_hero_phantom_assassin";
        movementSpeed = 310;
        movementTurnRate = .4;
        team = "Bad";
        active = true;
        localizedName = "Phantom Assassin";
        shortKey = "phantom_assassin";
        url = "Phantom_Assassin";
    }

    public static PhantomAssassin instance() {
        if( instance == null ){
            instance = new PhantomAssassin();
        }
        return instance;
    }

    public PhantomAssassinStiflingDagger getAbility1() {
        return ability1;
    }

    public PhantomAssassinPhantomStrike getAbility2() {
        return ability2;
    }

    public PhantomAssassinBlur getAbility3() {
        return ability3;
    }

    public PhantomAssassinCoupDeGrace getAbility4() {
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
        if (!(object instanceof PhantomAssassin))
            return false;
        if (object == this)
            return true;
        PhantomAssassin otherObject = (PhantomAssassin) object;
        return otherObject.getKey().equals(getKey());
    }

}
