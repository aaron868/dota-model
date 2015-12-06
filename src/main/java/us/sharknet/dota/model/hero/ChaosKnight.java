package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class ChaosKnight extends Hero {

    private static ChaosKnight instance;

    private final ChaosKnightChaosBolt ability1;
    private final ChaosKnightRealityRift ability2;
    private final ChaosKnightChaosStrike ability3;
    private final ChaosKnightPhantasm ability4;
    private final AttributeBonus ability5;
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
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
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
    private final String shortKey;
    private final String url;

    private ChaosKnight() {
        ability1 = ChaosKnightChaosBolt.instance();
        ability2 = ChaosKnightRealityRift.instance();
        ability3 = ChaosKnightChaosStrike.instance();
        ability4 = ChaosKnightPhantasm.instance();
        ability5 = AttributeBonus.instance();
        armorPhysical = 2;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 59;
        attackDamageMin = 29;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.1;
        attributeBaseAgility = 14;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 20;
        attributeIntelligenceGain = 1.2;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.9;
        banSound = "chaos_knight_chaknight_anger_06";
        botImplemented = 1;
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 220;
        heroID = 81;
        heroSelectSoundEffect = "Hero_ChaosKnight.Pick";
        heroUnlockOrder = 3;
        key = "npc_dota_hero_chaos_knight";
        lastHitChallengeRival = "npc_dota_hero_omniknight";
        loadoutScale = .72;
        model = "models/heroes/chaos_knight/chaos_knight.vmdl";
        modelScale = .79;
        movementSpeed = 325;
        movementTurnRate = .5;
        pickSound = "chaos_knight_chaknight_spawn_02";
        portrait = "vgui/hud/heroportraits/portrait_chaos_knight";
        role = new String[]{"Carry","Disabler","Durable","Pusher","Initiator"};
        rolelevels = new int[]{3,2,2,2,1};
        soundSet = "Hero_ChaosKnight";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_chaos_knight.vsndevts";
        active = true;
        localizedName = "Chaos Knight";
        shortKey = "chaos_knight";
        url = "Chaos_Knight";
    }

    public static ChaosKnight instance() {
        if( instance == null ){
            instance = new ChaosKnight();
        }
        return instance;
    }

    public ChaosKnightChaosBolt getAbility1() {
        return ability1;
    }

    public ChaosKnightRealityRift getAbility2() {
        return ability2;
    }

    public ChaosKnightChaosStrike getAbility3() {
        return ability3;
    }

    public ChaosKnightPhantasm getAbility4() {
        return ability4;
    }

    public AttributeBonus getAbility5() {
        return ability5;
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

    public int getCMEnabled() {
        return cMEnabled;
    }

    public int getEnabled() {
        return enabled;
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof ChaosKnight))
            return false;
        if (object == this)
            return true;
        ChaosKnight otherObject = (ChaosKnight) object;
        return otherObject.getKey().equals(getKey());
    }

}
