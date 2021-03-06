package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Juggernaut extends Hero {

    private static Juggernaut instance;

    private final JuggernautBladeFury ability1;
    private final JuggernautHealingWard ability2;
    private final JuggernautBladeDance ability3;
    private final JuggernautOmniSlash ability4;
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
    private final double statusHealthRegen;
    private final String team;
    private final boolean active;
    private final String localizedName;
    private final String url;

    private Juggernaut() {
        ability1 = JuggernautBladeFury.instance();
        ability2 = JuggernautHealingWard.instance();
        ability3 = JuggernautBladeDance.instance();
        ability4 = JuggernautOmniSlash.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .33;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 28;
        attackDamageMin = 24;
        attackRange = 128;
        attackRate = 1.4;
        attributeAgilityGain = 2.4;
        attributeBaseAgility = 26;
        attributeBaseIntelligence = 14;
        attributeBaseStrength = 20;
        attributeIntelligenceGain = 1.4;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.9;
        cMEnabled = 1;
        enabled = 1;
        heroID = 8;
        key = "npc_dota_hero_juggernaut";
        movementSpeed = 305;
        movementTurnRate = .6;
        projectileSpeed = 0;
        statusHealthRegen = .75;
        team = "Good";
        active = true;
        localizedName = "Juggernaut";
        url = "Juggernaut";
    }

    public static Juggernaut instance() {
        if( instance == null ){
            instance = new Juggernaut();
        }
        return instance;
    }

    public JuggernautBladeFury getAbility1() {
        return ability1;
    }

    public JuggernautHealingWard getAbility2() {
        return ability2;
    }

    public JuggernautBladeDance getAbility3() {
        return ability3;
    }

    public JuggernautOmniSlash getAbility4() {
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

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Juggernaut))
            return false;
        if (object == this)
            return true;
        Juggernaut otherObject = (Juggernaut) object;
        return otherObject.getKey().equals(getKey());
    }

}
