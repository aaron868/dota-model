package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Leshrac extends Hero {

    private static Leshrac instance;

    private final LeshracSplitEarth ability1;
    private final LeshracDiabolicEdict ability2;
    private final LeshracLightningStorm ability3;
    private final LeshracPulseNova ability4;
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

    private Leshrac() {
        ability1 = LeshracSplitEarth.instance();
        ability2 = LeshracDiabolicEdict.instance();
        ability3 = LeshracLightningStorm.instance();
        ability4 = LeshracPulseNova.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 19;
        attackDamageMin = 15;
        attackRange = 600;
        attackRate = 1.7;
        attributeAgilityGain = 1.7;
        attributeBaseAgility = 23;
        attributeBaseIntelligence = 26;
        attributeBaseStrength = 16;
        attributeIntelligenceGain = 3;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.5;
        cMEnabled = 1;
        enabled = 1;
        heroID = 52;
        key = "npc_dota_hero_leshrac";
        movementSpeed = 320;
        movementTurnRate = .5;
        projectileSpeed = 900;
        team = "Bad";
        active = true;
        localizedName = "Leshrac";
        url = "Leshrac";
    }

    public static Leshrac instance() {
        if( instance == null ){
            instance = new Leshrac();
        }
        return instance;
    }

    public LeshracSplitEarth getAbility1() {
        return ability1;
    }

    public LeshracDiabolicEdict getAbility2() {
        return ability2;
    }

    public LeshracLightningStorm getAbility3() {
        return ability3;
    }

    public LeshracPulseNova getAbility4() {
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

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Leshrac))
            return false;
        if (object == this)
            return true;
        Leshrac otherObject = (Leshrac) object;
        return otherObject.getKey().equals(getKey());
    }

}
