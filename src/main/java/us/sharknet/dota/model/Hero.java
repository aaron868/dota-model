package us.sharknet.dota.model;

public abstract class Hero {

    public enum DamageType {Melee, Ranged }

    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final String attackDamageType;
    private final int attackRange;
    private final double attackRate;
    private final String attributePrimary;
    private final String combatClassAttack;
    private final String combatClassDefend;
    private final int magicalResistance;
    private final String movementCapabilities;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int projectileSpeed;
    private final int statusHealth;
    private final double statusHealthRegen;
    private final double statusManaRegen;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final int cMEnabled;


    public Hero(){
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .75;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 1;
        attackDamageMin = 1;
        attackDamageType = "DAMAGE_TYPE_ArmorPhysical";
        attackRange = 600;
        attackRate = 1.7;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        combatClassAttack = "DOTA_COMBAT_CLASS_ATTACK_HERO";
        combatClassDefend = "DOTA_COMBAT_CLASS_DEFEND_HERO";
        magicalResistance = 25;
        movementCapabilities = "DOTA_UNIT_CAP_MOVE_GROUND";
        movementSpeed = 300;
        movementTurnRate = .5;
        projectileSpeed = 900;
        statusHealth = 180;
        statusHealthRegen = .25;
        statusManaRegen = .1;
        visionDaytimeRange = 1800;
        visionNighttimeRange = 800;
        cMEnabled = 0;
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

    public String getAttributePrimary() {
        return attributePrimary;
    }

    public String getCombatClassAttack() {
        return combatClassAttack;
    }

    public String getCombatClassDefend() {
        return combatClassDefend;
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

    public int getStatusHealth() {
        return statusHealth;
    }

    public double getStatusHealthRegen() {
        return statusHealthRegen;
    }

    public double getStatusManaRegen() {
        return statusManaRegen;
    }

    public int getVisionDaytimeRange() {
        return visionDaytimeRange;
    }

    public int getVisionNighttimeRange() {
        return visionNighttimeRange;
    }


    public int getCMEnabled() {
        return cMEnabled;
    }

    public abstract int getHeroID();
    public abstract String getLocalizedName();
    public abstract String getKey();
    public abstract boolean isActive();
    public abstract double getAttributeAgilityGain();
    public abstract int getAttributeBaseAgility();
    public abstract int getAttributeBaseIntelligence();
    public abstract int getAttributeBaseStrength();
    public abstract double getAttributeIntelligenceGain();
    public abstract double getAttributeStrengthGain();
    public abstract int getEnabled();
    public abstract String getTeam();
    public abstract String getUrl();

    public DamageType getDamageType() {
        if( getAttackRange() > 150 ) {
            return DamageType.Ranged;
        }
        else {
            return DamageType.Melee;
        }
    }

    @Override
    public int hashCode() {
        return getKey().hashCode();
    }

    @Override
    public String toString() {
        return getLocalizedName();
    }

}
