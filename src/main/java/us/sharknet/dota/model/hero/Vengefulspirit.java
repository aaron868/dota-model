package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Vengefulspirit extends Hero {

    private static Vengefulspirit instance;

    private final VengefulspiritMagicMissile ability1;
    private final VengefulspiritWaveOfTerror ability2;
    private final VengefulspiritCommandAura ability3;
    private final VengefulspiritNetherSwap ability4;
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
    private final int botImplemented;
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final int heroPool1;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String nameAliases;
    private final int noCombine;
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
    private final int new_player_enable;
    private final String shortKey;
    private final String url;

    private Vengefulspirit() {
        ability1 = VengefulspiritMagicMissile.instance();
        ability2 = VengefulspiritWaveOfTerror.instance();
        ability3 = VengefulspiritCommandAura.instance();
        ability4 = VengefulspiritNetherSwap.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 8;
        attackAnimationPoint = .33;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 26;
        attackDamageMin = 12;
        attackRange = 4;
        attackRate = 1.7;
        attributeAgilityGain = 3.3;
        attributeBaseAgility = 27;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 18;
        attributeIntelligenceGain = 1.75;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.6;
        banSound = "vengefulspirit_vng_anger_04";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 17;
        heroGlowColor = new int[]{133,113,164};
        heroID = 2;
        heroPool1 = 1;
        heroSelectSoundEffect = "Hero_VengefulSpirit.Pick";
        heroUnlockOrder = 1;
        idleExpression = "scenes/vengefulspirit/vengefulspirit_exp_idle_01.vcd";
        key = "npc_dota_hero_vengefulspirit";
        lastHitChallengeRival = "npc_dota_hero_death_prophet";
        model = "models/heroes/vengeful/vengeful.vmdl";
        modelScale = .98;
        movementSpeed = 3;
        movementTurnRate = .6;
        nameAliases = "vs";
        noCombine = 1;
        pickSound = "vengefulspirit_vng_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_vengeful";
        projectileModel = "particles/units/heroes/hero_vengeful/vengeful_base_attack.vpcf";
        projectileSpeed = 15;
        role = new String[]{"Support","Initiator","Disabler","Nuker","Escape"};
        rolelevels = new int[]{3,2,2,1,1};
        soundSet = "Hero_VengefulSpirit";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_vengefulspirit.vsndevts";
        active = true;
        localizedName = "Vengeful Spirit";
        new_player_enable = 1;
        shortKey = "vengefulspirit";
        url = "Vengeful_Spirit";
    }

    public static Vengefulspirit instance() {
        if( instance == null ){
            instance = new Vengefulspirit();
        }
        return instance;
    }

    public VengefulspiritMagicMissile getAbility1() {
        return ability1;
    }

    public VengefulspiritWaveOfTerror getAbility2() {
        return ability2;
    }

    public VengefulspiritCommandAura getAbility3() {
        return ability3;
    }

    public VengefulspiritNetherSwap getAbility4() {
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

    public int getBotImplemented() {
        return botImplemented;
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

    public int getHeroPool1() {
        return heroPool1;
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

    public String getNameAliases() {
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

    public int getNewPlayerEnable() {
        return new_player_enable;
    }

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Vengefulspirit))
            return false;
        if (object == this)
            return true;
        Vengefulspirit otherObject = (Vengefulspirit) object;
        return otherObject.getKey().equals(getKey());
    }

}
