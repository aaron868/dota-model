package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Queenofpain extends Hero {

    private static Queenofpain instance;

    private final QueenofpainShadowStrike ability1;
    private final QueenofpainBlink ability2;
    private final QueenofpainScreamOfPain ability3;
    private final QueenofpainSonicWave ability4;
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
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final int heroPool2;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String key;
    private final String lastHitChallengeRival;
    private final double loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String nameAliases;
    private final String pickSound;
    private final String portrait;
    private final String projectileModel;
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

    private Queenofpain() {
        ability1 = QueenofpainShadowStrike.instance();
        ability2 = QueenofpainBlink.instance();
        ability3 = QueenofpainScreamOfPain.instance();
        ability4 = QueenofpainSonicWave.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 8;
        attackAnimationPoint = .56;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 25;
        attackRange = 55;
        attackRate = 1.6;
        attributeAgilityGain = 2;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 24;
        attributeBaseStrength = 16;
        attributeIntelligenceGain = 2.5;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.7;
        banSound = "queenofpain_pain_anger_03";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 145;
        heroGlowColor = new int[]{175,41,128};
        heroID = 39;
        heroPool2 = 1;
        heroSelectSoundEffect = "Hero_QueenOfPain.Pick";
        heroUnlockOrder = 1;
        key = "npc_dota_hero_queenofpain";
        lastHitChallengeRival = "npc_dota_hero_vengefulspirit";
        loadoutScale = .92;
        model = "models/heroes/queenofpain/queenofpain.vmdl";
        modelScale = .84;
        movementSpeed = 295;
        movementTurnRate = .5;
        nameAliases = "qop";
        pickSound = "queenofpain_pain_spawn_04";
        portrait = "vgui/hud/heroportraits/portrait_queenofpain";
        projectileModel = "particles/units/heroes/hero_queenofpain/queen_base_attack.vpcf";
        projectileSpeed = 15;
        role = new String[]{"Carry","Nuker","Escape"};
        rolelevels = new int[]{1,3,3};
        soundSet = "Hero_QueenOfPain";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_queenofpain.vsndevts";
        active = true;
        localizedName = "Queen of Pain";
        shortKey = "queenofpain";
        url = "Queen_of_Pain";
    }

    public static Queenofpain instance() {
        if( instance == null ){
            instance = new Queenofpain();
        }
        return instance;
    }

    public QueenofpainShadowStrike getAbility1() {
        return ability1;
    }

    public QueenofpainBlink getAbility2() {
        return ability2;
    }

    public QueenofpainScreamOfPain getAbility3() {
        return ability3;
    }

    public QueenofpainSonicWave getAbility4() {
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

    public int getHeroPool2() {
        return heroPool2;
    }

    public String getHeroSelectSoundEffect() {
        return heroSelectSoundEffect;
    }

    public int getHeroUnlockOrder() {
        return heroUnlockOrder;
    }

    public String getKey() {
        return key;
    }

    public String getLastHitChallengeRival() {
        return lastHitChallengeRival;
    }

    public double getLoadoutScale() {
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

    public String getNameAliases() {
        return nameAliases;
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
        if (!(object instanceof Queenofpain))
            return false;
        if (object == this)
            return true;
        Queenofpain otherObject = (Queenofpain) object;
        return otherObject.getKey().equals(getKey());
    }

}
