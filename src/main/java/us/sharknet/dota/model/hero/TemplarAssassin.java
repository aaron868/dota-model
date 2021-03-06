package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class TemplarAssassin extends Hero {

    private static TemplarAssassin instance;

    private final TemplarAssassinRefraction ability1;
    private final TemplarAssassinMeld ability2;
    private final TemplarAssassinPsiBlades ability3;
    private final TemplarAssassinTrap ability4;
    private final TemplarAssassinPsionicTrap ability5;
    private final AttributeBonus ability6;
    private final int abilityDraftDisabled;
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

    private TemplarAssassin() {
        ability1 = TemplarAssassinRefraction.instance();
        ability2 = TemplarAssassinMeld.instance();
        ability3 = TemplarAssassinPsiBlades.instance();
        ability4 = TemplarAssassinTrap.instance();
        ability5 = TemplarAssassinPsionicTrap.instance();
        ability6 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        armorPhysical = 1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 36;
        attackDamageMin = 30;
        attackRange = 140;
        attackRate = 1.7;
        attributeAgilityGain = 2.7;
        attributeBaseAgility = 23;
        attributeBaseIntelligence = 20;
        attributeBaseStrength = 18;
        attributeIntelligenceGain = 2;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.1;
        cMEnabled = 1;
        enabled = 1;
        heroID = 46;
        key = "npc_dota_hero_templar_assassin";
        movementSpeed = 305;
        movementTurnRate = .7;
        projectileSpeed = 900;
        team = "Good";
        active = true;
        localizedName = "Templar Assassin";
        url = "Templar_Assassin";
    }

    public static TemplarAssassin instance() {
        if( instance == null ){
            instance = new TemplarAssassin();
        }
        return instance;
    }

    public TemplarAssassinRefraction getAbility1() {
        return ability1;
    }

    public TemplarAssassinMeld getAbility2() {
        return ability2;
    }

    public TemplarAssassinPsiBlades getAbility3() {
        return ability3;
    }

    public TemplarAssassinTrap getAbility4() {
        return ability4;
    }

    public TemplarAssassinPsionicTrap getAbility5() {
        return ability5;
    }

    public AttributeBonus getAbility6() {
        return ability6;
    }

    public int getAbilityDraftDisabled() {
        return abilityDraftDisabled;
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
        if (!(object instanceof TemplarAssassin))
            return false;
        if (object == this)
            return true;
        TemplarAssassin otherObject = (TemplarAssassin) object;
        return otherObject.getKey().equals(getKey());
    }

}
