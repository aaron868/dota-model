package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Kunkka extends Hero {

    private static Kunkka instance;

    private final KunkkaTorrent ability1;
    private final KunkkaTidebringer ability2;
    private final KunkkaXMarksTheSpot ability3;
    private final KunkkaGhostship ability4;
    private final KunkkaReturn ability6;
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

    private Kunkka() {
        ability1 = KunkkaTorrent.instance();
        ability2 = KunkkaTidebringer.instance();
        ability3 = KunkkaXMarksTheSpot.instance();
        ability4 = KunkkaGhostship.instance();
        ability6 = KunkkaReturn.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 36;
        attackDamageMin = 26;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.3;
        attributeBaseAgility = 14;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 24;
        attributeIntelligenceGain = 1.5;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 3;
        cMEnabled = 1;
        enabled = 1;
        heroID = 23;
        key = "npc_dota_hero_kunkka";
        movementSpeed = 300;
        movementTurnRate = .6;
        team = "Good";
        active = true;
        localizedName = "Kunkka";
        shortKey = "kunkka";
        url = "Kunkka";
    }

    public static Kunkka instance() {
        if( instance == null ){
            instance = new Kunkka();
        }
        return instance;
    }

    public KunkkaTorrent getAbility1() {
        return ability1;
    }

    public KunkkaTidebringer getAbility2() {
        return ability2;
    }

    public KunkkaXMarksTheSpot getAbility3() {
        return ability3;
    }

    public KunkkaGhostship getAbility4() {
        return ability4;
    }

    public KunkkaReturn getAbility6() {
        return ability6;
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
        if (!(object instanceof Kunkka))
            return false;
        if (object == this)
            return true;
        Kunkka otherObject = (Kunkka) object;
        return otherObject.getKey().equals(getKey());
    }

}
