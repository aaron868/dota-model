package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class EarthSpirit extends Hero {

    private static EarthSpirit instance;

    private final EarthSpiritBoulderSmash ability1;
    private final EarthSpiritRollingBoulder ability2;
    private final EarthSpiritGeomagneticGrip ability3;
    private final EarthSpiritStoneCaller ability4;
    private final EarthSpiritPetrify ability5;
    private final EarthSpiritMagnetize ability6;
    private final AttributeBonus ability7;
    private final int abilityDraftDisabled;
    private final int abilityLayout;
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
    private final String banSound;
    private final int cMEnabled;
    private final int enabled;
    private final int hasAggressiveStance;
    private final int healthBarOffset;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int iD;
    private final String idleExpression;
    private final String key;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String[] nameAliases;
    private final int noCombine;
    private final String pickSound;
    private final String portrait;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private EarthSpirit() {
        ability1 = EarthSpiritBoulderSmash.instance();
        ability2 = EarthSpiritRollingBoulder.instance();
        ability3 = EarthSpiritGeomagneticGrip.instance();
        ability4 = EarthSpiritStoneCaller.instance();
        ability5 = EarthSpiritPetrify.instance();
        ability6 = EarthSpiritMagnetize.instance();
        ability7 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        abilityLayout = 5;
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .35;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 35;
        attackDamageMin = 25;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.5;
        attributeBaseAgility = 17;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 2.4;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.9;
        banSound = "earth_spirit_earthspi_anger_08";
        cMEnabled = 0;
        enabled = 1;
        hasAggressiveStance = 1;
        healthBarOffset = 200;
        heroID = 107;
        heroSelectSoundEffect = "Hero_EarthSpirit.Pick";
        iD = 107;
        idleExpression = "scenes/earth_spirit/earth_spirit_exp_idle_01.vcd";
        key = "npc_dota_hero_earth_spirit";
        model = "models/heroes/earth_spirit/earth_spirit.vmdl";
        modelScale = .95;
        movementSpeed = 305;
        movementTurnRate = .6;
        nameAliases = new String[]{"Kaolin","Earth"};
        noCombine = 0;
        pickSound = "earth_spirit_earthspi_spawn_02";
        portrait = "vgui/hud/heroportraits/earth_spirit";
        role = new String[]{"Nuker","Escape","Disabler","Initiator","Durable"};
        rolelevels = new int[]{2,2,1,1,1};
        soundSet = "Hero_EarthSpirit";
        team = "Good";
        visionDaytimeRange = 1800;
        visionNighttimeRange = 800;
        voiceFile = "soundevents/voscripts/game_sounds_vo_earth_spirit.vsndevts";
        active = true;
        localizedName = "Earth Spirit";
        shortKey = "earth_spirit";
        url = "Earth_Spirit";
    }

    public static EarthSpirit instance() {
        if( instance == null ){
            instance = new EarthSpirit();
        }
        return instance;
    }

    public EarthSpiritBoulderSmash getAbility1() {
        return ability1;
    }

    public EarthSpiritRollingBoulder getAbility2() {
        return ability2;
    }

    public EarthSpiritGeomagneticGrip getAbility3() {
        return ability3;
    }

    public EarthSpiritStoneCaller getAbility4() {
        return ability4;
    }

    public EarthSpiritPetrify getAbility5() {
        return ability5;
    }

    public EarthSpiritMagnetize getAbility6() {
        return ability6;
    }

    public AttributeBonus getAbility7() {
        return ability7;
    }

    public int getAbilityDraftDisabled() {
        return abilityDraftDisabled;
    }

    public int getAbilityLayout() {
        return abilityLayout;
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

    public String getBanSound() {
        return banSound;
    }

    public int getCMEnabled() {
        return cMEnabled;
    }

    public int getEnabled() {
        return enabled;
    }

    public int getHasAggressiveStance() {
        return hasAggressiveStance;
    }

    public int getHealthBarOffset() {
        return healthBarOffset;
    }

    public int getHeroID() {
        return heroID;
    }

    public String getHeroSelectSoundEffect() {
        return heroSelectSoundEffect;
    }

    public int getID() {
        return iD;
    }

    public String getIdleExpression() {
        return idleExpression;
    }

    public String getKey() {
        return key;
    }

    public String getModel() {
        return model;
    }

    public double getModelScale() {
        return modelScale;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public double getMovementTurnRate() {
        return movementTurnRate;
    }

    public String[] getNameAliases() {
        return nameAliases;
    }

    public int getNoCombine() {
        return noCombine;
    }

    public String getPickSound() {
        return pickSound;
    }

    public String getPortrait() {
        return portrait;
    }

    public String[] getRole() {
        return role;
    }

    public int[] getRolelevels() {
        return rolelevels;
    }

    public String getSoundSet() {
        return soundSet;
    }

    public String getTeam() {
        return team;
    }

    public int getVisionDaytimeRange() {
        return visionDaytimeRange;
    }

    public int getVisionNighttimeRange() {
        return visionNighttimeRange;
    }

    public String getVoiceFile() {
        return voiceFile;
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
        if (!(object instanceof EarthSpirit))
            return false;
        if (object == this)
            return true;
        EarthSpirit otherObject = (EarthSpirit) object;
        return otherObject.getKey().equals(getKey());
    }

}
