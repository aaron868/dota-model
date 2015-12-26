package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Vengefulspirit extends Hero {

    private static Vengefulspirit instance;

    private final VengefulspiritMagicMissile ability1;
    private final VengefulspiritWaveOfTerror ability2;
    private final VengefulspiritCommandAura ability3;
    private final VengefulspiritNetherSwap ability4;
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

    private Vengefulspirit() {
        ability1 = VengefulspiritMagicMissile.instance();
        ability2 = VengefulspiritWaveOfTerror.instance();
        ability3 = VengefulspiritCommandAura.instance();
        ability4 = VengefulspiritNetherSwap.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .33;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 26;
        attackDamageMin = 12;
        attackRange = 400;
        attackRate = 1.7;
        attributeAgilityGain = 3.3;
        attributeBaseAgility = 27;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 18;
        attributeIntelligenceGain = 1.75;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.6;
        cMEnabled = 1;
        enabled = 1;
        heroID = 20;
        key = "npc_dota_hero_vengefulspirit";
        movementSpeed = 300;
        movementTurnRate = .6;
        projectileSpeed = 1500;
        team = "Good";
        active = true;
        localizedName = "Vengeful Spirit";
        shortKey = "vengefulspirit";
        url = "Vengeful_Spirit";
    }

    public static Vengefulspirit instance() {
        if( instance == null ){
            instance = new Vengefulspirit();
        }
        return instance;
    }

    public VengefulspiritMagicMissile getAbility1() {
        return ability1;
    }

    public VengefulspiritWaveOfTerror getAbility2() {
        return ability2;
    }

    public VengefulspiritCommandAura getAbility3() {
        return ability3;
    }

    public VengefulspiritNetherSwap getAbility4() {
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
        if (!(object instanceof Vengefulspirit))
            return false;
        if (object == this)
            return true;
        Vengefulspirit otherObject = (Vengefulspirit) object;
        return otherObject.getKey().equals(getKey());
    }

}
