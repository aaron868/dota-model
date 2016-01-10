package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class DragonKnight extends Hero {

    private static DragonKnight instance;

    private final DragonKnightBreatheFire ability1;
    private final DragonKnightDragonTail ability2;
    private final DragonKnightDragonBlood ability3;
    private final DragonKnightElderDragonForm ability4;
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

    private DragonKnight() {
        ability1 = DragonKnightBreatheFire.instance();
        ability2 = DragonKnightDragonTail.instance();
        ability3 = DragonKnightDragonBlood.instance();
        ability4 = DragonKnightElderDragonForm.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 27;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.2;
        attributeBaseAgility = 19;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 19;
        attributeIntelligenceGain = 1.7;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.8;
        cMEnabled = 1;
        enabled = 1;
        heroID = 49;
        key = "npc_dota_hero_dragon_knight";
        movementSpeed = 290;
        movementTurnRate = .6;
        projectileSpeed = 900;
        team = "Good";
        active = true;
        localizedName = "Dragon Knight";
        url = "Dragon_Knight";
    }

    public static DragonKnight instance() {
        if( instance == null ){
            instance = new DragonKnight();
        }
        return instance;
    }

    public DragonKnightBreatheFire getAbility1() {
        return ability1;
    }

    public DragonKnightDragonTail getAbility2() {
        return ability2;
    }

    public DragonKnightDragonBlood getAbility3() {
        return ability3;
    }

    public DragonKnightElderDragonForm getAbility4() {
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
        if (!(object instanceof DragonKnight))
            return false;
        if (object == this)
            return true;
        DragonKnight otherObject = (DragonKnight) object;
        return otherObject.getKey().equals(getKey());
    }

}
