package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Tidehunter extends Hero {

    private static Tidehunter instance;

    private final TidehunterGush ability1;
    private final TidehunterKrakenShell ability2;
    private final TidehunterAnchorSmash ability3;
    private final TidehunterRavage ability4;
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
    private final int attributeStrengthGain;
    private final String banSound;
    private final int botImplemented;
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final int heroPool1;
    private final int heroPool2;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
    private final double loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String pickSound;
    private final String portrait;
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

    private Tidehunter() {
        ability1 = TidehunterGush.instance();
        ability2 = TidehunterKrakenShell.instance();
        ability3 = TidehunterAnchorSmash.instance();
        ability4 = TidehunterRavage.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .6;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 31;
        attackDamageMin = 25;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.5;
        attributeBaseAgility = 15;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 22;
        attributeIntelligenceGain = 1.7;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 3;
        banSound = "tidehunter_tide_anger_04";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 190;
        heroGlowColor = new int[]{54,181,81};
        heroID = 29;
        heroPool1 = 1;
        heroPool2 = 1;
        heroSelectSoundEffect = "Hero_Tidehunter.Pick";
        heroUnlockOrder = 0;
        idleExpression = "scenes/tidehunter/tidehunter_exp_idle_01.vcd";
        key = "npc_dota_hero_tidehunter";
        lastHitChallengeRival = "npc_dota_hero_kunkka";
        loadoutScale = .78;
        model = "models/heroes/tidehunter/tidehunter.vmdl";
        modelScale = .84;
        movementSpeed = 305;
        movementTurnRate = .4;
        pickSound = "tidehunter_tide_spawn_09";
        portrait = "vgui/hud/heroportraits/portrait_tidehunter";
        role = new String[]{"Initiator","Durable","Disabler","Nuker"};
        rolelevels = new int[]{3,3,2,1};
        soundSet = "Hero_Tidehunter";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_tidehunter.vsndevts";
        active = true;
        localizedName = "Tidehunter";
        new_player_enable = 1;
        shortKey = "tidehunter";
        url = "Tidehunter";
    }

    public static Tidehunter instance() {
        if( instance == null ){
            instance = new Tidehunter();
        }
        return instance;
    }

    public TidehunterGush getAbility1() {
        return ability1;
    }

    public TidehunterKrakenShell getAbility2() {
        return ability2;
    }

    public TidehunterAnchorSmash getAbility3() {
        return ability3;
    }

    public TidehunterRavage getAbility4() {
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

    public int getAttributeStrengthGain() {
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

    public int getHeroPool2() {
        return heroPool2;
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
        if (!(object instanceof Tidehunter))
            return false;
        if (object == this)
            return true;
        Tidehunter otherObject = (Tidehunter) object;
        return otherObject.getKey().equals(getKey());
    }

}
