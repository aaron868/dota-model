package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Enigma extends Hero {

    private static Enigma instance;

    private final EnigmaMalefice ability1;
    private final EnigmaDemonicConversion ability2;
    private final EnigmaMidnightPulse ability3;
    private final EnigmaBlackHole ability4;
    private final int armorPhysical;
    private final int attackAcquisitionRange;
    private final double attackAnimationPoint;
    private final String attackCapabilities;
    private final int attackDamageMax;
    private final int attackDamageMin;
    private final int attackRange;
    private final double attackRate;
    private final int attributeAgilityGain;
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
    private final String idleSoundLoop;
    private final String key;
    private final String lastHitChallengeRival;
    private final int loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final int noCombine;
    private final String pickSound;
    private final String portrait;
    private final String projectileModel;
    private final int projectileSpeed;
    private final int ringRadius;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final double statusHealthRegen;
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Enigma() {
        ability1 = EnigmaMalefice.instance();
        ability2 = EnigmaDemonicConversion.instance();
        ability3 = EnigmaMidnightPulse.instance();
        ability4 = EnigmaBlackHole.instance();
        armorPhysical = 2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 28;
        attackDamageMin = 22;
        attackRange = 500;
        attackRate = 1.7;
        attributeAgilityGain = 1;
        attributeBaseAgility = 14;
        attributeBaseIntelligence = 20;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 3.4;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 2.1;
        banSound = "enigma_enig_anger_01";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 220;
        heroGlowColor = new int[]{64,0,255};
        heroID = 33;
        heroSelectSoundEffect = "Hero_Enigma.Pick";
        heroUnlockOrder = 1;
        idleSoundLoop = "Hero_Enigma.IdleLoop";
        key = "npc_dota_hero_enigma";
        lastHitChallengeRival = "npc_dota_hero_bane";
        loadoutScale = 1;
        model = "models/heroes/enigma/enigma.vmdl";
        modelScale = .81;
        movementSpeed = 300;
        movementTurnRate = .5;
        noCombine = 1;
        pickSound = "enigma_enig_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_enigma";
        projectileModel = "particles/units/heroes/hero_enigma/enigma_base_attack.vpcf";
        projectileSpeed = 900;
        ringRadius = 90;
        role = new String[]{"Disabler","Jungler","Initiator","Pusher"};
        rolelevels = new int[]{2,3,2,2};
        soundSet = "Hero_Enigma";
        statusHealthRegen = .25;
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_enigma.vsndevts";
        active = true;
        localizedName = "Enigma";
        shortKey = "enigma";
        url = "Enigma";
    }

    public static Enigma instance() {
        if( instance == null ){
            instance = new Enigma();
        }
        return instance;
    }

    public EnigmaMalefice getAbility1() {
        return ability1;
    }

    public EnigmaDemonicConversion getAbility2() {
        return ability2;
    }

    public EnigmaMidnightPulse getAbility3() {
        return ability3;
    }

    public EnigmaBlackHole getAbility4() {
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

    public int getAttributeAgilityGain() {
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

    public String getIdleSoundLoop() {
        return idleSoundLoop;
    }

    public String getKey() {
        return key;
    }

    public String getLastHitChallengeRival() {
        return lastHitChallengeRival;
    }

    public int getLoadoutScale() {
        return loadoutScale;
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

    public int getNoCombine() {
        return noCombine;
    }

    public String getPickSound() {
        return pickSound;
    }

    public String getPortrait() {
        return portrait;
    }

    public String getProjectileModel() {
        return projectileModel;
    }

    public int getProjectileSpeed() {
        return projectileSpeed;
    }

    public int getRingRadius() {
        return ringRadius;
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

    public double getStatusHealthRegen() {
        return statusHealthRegen;
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
        if (!(object instanceof Enigma))
            return false;
        if (object == this)
            return true;
        Enigma otherObject = (Enigma) object;
        return otherObject.getKey().equals(getKey());
    }

}
