package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Slardar extends Hero {

    private static Slardar instance;

    private final SlardarSprint ability1;
    private final SlardarSlithereenCrush ability2;
    private final SlardarBash ability3;
    private final SlardarAmplifyDamage ability4;
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
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String pickSound;
    private final String portrait;
    private final int projectileSpeed;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Slardar() {
        ability1 = SlardarSprint.instance();
        ability2 = SlardarSlithereenCrush.instance();
        ability3 = SlardarBash.instance();
        ability4 = SlardarAmplifyDamage.instance();
        armorPhysical = 3;
        attackAcquisitionRange = 6;
        attackAnimationPoint = .36;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 38;
        attackDamageMin = 3;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.4;
        attributeBaseAgility = 17;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 1.5;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.8;
        banSound = "slardar_slar_anger_04";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 14;
        heroGlowColor = new int[]{78,127,208};
        heroID = 28;
        heroSelectSoundEffect = "Hero_Slardar.Pick";
        heroUnlockOrder = 1;
        idleExpression = "scenes/slardar/slardar_exp_idle_01.vcd";
        key = "npc_dota_hero_slardar";
        lastHitChallengeRival = "npc_dota_hero_tidehunter";
        model = "models/heroes/slardar/slardar.vmdl";
        modelScale = .88;
        movementSpeed = 3;
        movementTurnRate = .5;
        pickSound = "slardar_slar_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_slardar";
        projectileSpeed = 0;
        role = new String[]{"Carry","Durable","Initiator","Disabler","Escape"};
        rolelevels = new int[]{2,2,2,1,1};
        soundSet = "Hero_Slardar";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_slardar.vsndevts";
        active = true;
        localizedName = "Slardar";
        shortKey = "slardar";
        url = "Slardar";
    }

    public static Slardar instance() {
        if( instance == null ){
            instance = new Slardar();
        }
        return instance;
    }

    public SlardarSprint getAbility1() {
        return ability1;
    }

    public SlardarSlithereenCrush getAbility2() {
        return ability2;
    }

    public SlardarBash getAbility3() {
        return ability3;
    }

    public SlardarAmplifyDamage getAbility4() {
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

    public String getBanSound() {
        return banSound;
    }

    public String getBoundsHullName() {
        return boundsHullName;
    }

    public int getCMEnabled() {
        return cMEnabled;
    }

    public int getEnabled() {
        return enabled;
    }

    public int getHealthBarOffset() {
        return healthBarOffset;
    }

    public int[] getHeroGlowColor() {
        return heroGlowColor;
    }

    public int getHeroID() {
        return heroID;
    }

    public String getHeroSelectSoundEffect() {
        return heroSelectSoundEffect;
    }

    public int getHeroUnlockOrder() {
        return heroUnlockOrder;
    }

    public String getIdleExpression() {
        return idleExpression;
    }

    public String getKey() {
        return key;
    }

    public String getLastHitChallengeRival() {
        return lastHitChallengeRival;
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

    public String getPickSound() {
        return pickSound;
    }

    public String getPortrait() {
        return portrait;
    }

    public int getProjectileSpeed() {
        return projectileSpeed;
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
        if (!(object instanceof Slardar))
            return false;
        if (object == this)
            return true;
        Slardar otherObject = (Slardar) object;
        return otherObject.getKey().equals(getKey());
    }

}
