package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Techies extends Hero {

    private static Techies instance;

    private final TechiesLandMines ability1;
    private final TechiesStasisTrap ability2;
    private final TechiesSuicide ability3;
    private final TechiesFocusedDetonate ability4;
    private final TechiesMinefieldSign ability5;
    private final TechiesRemoteMines ability6;
    private final AttributeBonus ability7;
    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final String attackDamageType;
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
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int enabled;
    private final int heroID;
    private final String key;
    private final int magicalResistance;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int projectileSpeed;
    private final double statusManaRegen;
    private final String team;
    private final int visionDaytimeRange;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Techies() {
        ability1 = TechiesLandMines.instance();
        ability2 = TechiesStasisTrap.instance();
        ability3 = TechiesSuicide.instance();
        ability4 = TechiesFocusedDetonate.instance();
        ability5 = TechiesMinefieldSign.instance();
        ability6 = TechiesRemoteMines.instance();
        ability7 = AttributeBonus.instance();
        armorPhysical = 5;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 9;
        attackDamageMin = 7;
        attackDamageType = "DAMAGE_TYPE_ArmorPhysical";
        attackRange = 700;
        attackRate = 1.7;
        attributeAgilityGain = 1.3;
        attributeBaseAgility = 14;
        attributeBaseIntelligence = 22;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 2.9;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2;
        cMEnabled = 1;
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_HERO";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_HERO";
        enabled = 1;
        heroID = 105;
        key = "npc_dota_hero_techies";
        magicalResistance = 25;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 270;
        movementTurnRate = .5;
        projectileSpeed = 900;
        statusManaRegen = .2;
        team = "Good";
        visionDaytimeRange = 1800;
        active = true;
        localizedName = "Techies";
        shortKey = "techies";
        url = "Techies";
    }

    public static Techies instance() {
        if( instance == null ){
            instance = new Techies();
        }
        return instance;
    }

    public TechiesLandMines getAbility1() {
        return ability1;
    }

    public TechiesStasisTrap getAbility2() {
        return ability2;
    }

    public TechiesSuicide getAbility3() {
        return ability3;
    }

    public TechiesFocusedDetonate getAbility4() {
        return ability4;
    }

    public TechiesMinefieldSign getAbility5() {
        return ability5;
    }

    public TechiesRemoteMines getAbility6() {
        return ability6;
    }

    public AttributeBonus getAbility7() {
        return ability7;
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

    public String getAttackDamageType() {
        return attackDamageType;
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

    public String getCombatClassAttack() {
        return combatClassAttack;
    }

    public String getCombatClassDefend() {
        return combatClassDefend;
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

    public int getMagicalResistance() {
        return magicalResistance;
    }

    public String getMovementCapabilities() {
        return movementCapabilities;
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

    public double getStatusManaRegen() {
        return statusManaRegen;
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
        if (!(object instanceof Techies))
            return false;
        if (object == this)
            return true;
        Techies otherObject = (Techies) object;
        return otherObject.getKey().equals(getKey());
    }

}
