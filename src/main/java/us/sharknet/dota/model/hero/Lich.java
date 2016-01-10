package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Lich extends Hero {

    private static Lich instance;

    private final LichFrostNova ability1;
    private final LichFrostArmor ability2;
    private final LichDarkRitual ability3;
    private final LichChainFrost ability4;
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

    private Lich() {
        ability1 = LichFrostNova.instance();
        ability2 = LichFrostArmor.instance();
        ability3 = LichDarkRitual.instance();
        ability4 = LichChainFrost.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .46;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 24;
        attackRange = 550;
        attackRate = 1.7;
        attributeAgilityGain = 2;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 18;
        attributeIntelligenceGain = 3.25;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.55;
        cMEnabled = 1;
        enabled = 1;
        heroID = 31;
        key = "npc_dota_hero_lich";
        movementSpeed = 315;
        movementTurnRate = .5;
        projectileSpeed = 900;
        team = "Bad";
        active = true;
        localizedName = "Lich";
        url = "Lich";
    }

    public static Lich instance() {
        if( instance == null ){
            instance = new Lich();
        }
        return instance;
    }

    public LichFrostNova getAbility1() {
        return ability1;
    }

    public LichFrostArmor getAbility2() {
        return ability2;
    }

    public LichDarkRitual getAbility3() {
        return ability3;
    }

    public LichChainFrost getAbility4() {
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
        if (!(object instanceof Lich))
            return false;
        if (object == this)
            return true;
        Lich otherObject = (Lich) object;
        return otherObject.getKey().equals(getKey());
    }

}
