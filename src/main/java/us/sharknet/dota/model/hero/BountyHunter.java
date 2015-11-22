package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class BountyHunter extends Hero {

    private static BountyHunter instance;

    private final BountyHunterShurikenToss ability1;
    private final BountyHunterJinada ability2;
    private final BountyHunterWindWalk ability3;
    private final BountyHunterTrack ability4;
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
    private final int attributeIntelligenceGain;
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
    private final int loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String nameAliases;
    private final String pickSound;
    private final String portrait;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final double statusHealthRegen;
    private final String team;
    private final int visionDaytimeRange;
    private final int visionNighttimeRange;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private BountyHunter() {
        ability1 = BountyHunterShurikenToss.instance();
        ability2 = BountyHunterJinada.instance();
        ability3 = BountyHunterWindWalk.instance();
        ability4 = BountyHunterTrack.instance();
        armorPhysical = 3;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .59;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 38;
        attackDamageMin = 24;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 3;
        attributeBaseAgility = 21;
        attributeBaseIntelligence = 19;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 2;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.8;
        banSound = "bounty_hunter_bount_anger_04";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 120;
        heroGlowColor = new int[]{221,201,63};
        heroID = 62;
        heroPool1 = 1;
        heroSelectSoundEffect = "Hero_BountyHunter.Pick";
        heroUnlockOrder = 2;
        idleExpression = "scenes/bounty_hunter/bounty_hunter_exp_idle_01.vcd";
        key = "npc_dota_hero_bounty_hunter";
        lastHitChallengeRival = "npc_dota_hero_skeleton_king";
        loadoutScale = 1;
        model = "models/heroes/bounty_hunter/bounty_hunter.vmdl";
        modelScale = .84;
        movementSpeed = 315;
        movementTurnRate = .6;
        nameAliases = "bh";
        pickSound = "bounty_hunter_bount_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_bounty_hunter";
        role = new String[]{"Escape","Nuker"};
        rolelevels = new int[]{2,1};
        soundSet = "Hero_BountyHunter";
        statusHealthRegen = .75;
        team = "Good";
        visionDaytimeRange = 1800;
        visionNighttimeRange = 1000;
        voiceFile = "soundevents/voscripts/game_sounds_vo_bounty_hunter.vsndevts";
        active = true;
        localizedName = "Bounty Hunter";
        shortKey = "bounty_hunter";
        url = "Bounty_Hunter";
    }

    public static BountyHunter instance() {
        if( instance == null ){
            instance = new BountyHunter();
        }
        return instance;
    }

    public BountyHunterShurikenToss getAbility1() {
        return ability1;
    }

    public BountyHunterJinada getAbility2() {
        return ability2;
    }

    public BountyHunterWindWalk getAbility3() {
        return ability3;
    }

    public BountyHunterTrack getAbility4() {
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

    public int getAttributeIntelligenceGain() {
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

    public String getNameAliases() {
        return nameAliases;
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

    public double getStatusHealthRegen() {
        return statusHealthRegen;
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
        if (!(object instanceof BountyHunter))
            return false;
        if (object == this)
            return true;
        BountyHunter otherObject = (BountyHunter) object;
        return otherObject.getKey().equals(getKey());
    }

}
