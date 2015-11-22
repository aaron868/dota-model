package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class TrollWarlord extends Hero {

    private static TrollWarlord instance;

    private final TrollWarlordBerserkersRage ability1;
    private final TrollWarlordWhirlingAxesRanged ability2;
    private final TrollWarlordWhirlingAxesMelee ability3;
    private final TrollWarlordFervor ability4;
    private final TrollWarlordBattleTrance ability5;
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
    private final int attributeIntelligenceGain;
    private final String attributePrimary;
    private final double attributeStrengthGain;
    private final String banSound;
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
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
    private final String[] nameAliases;
    private final int noCombine;
    private final String pickSound;
    private final String portrait;
    private final String projectileModel;
    private final int projectileSpeed;
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

    private TrollWarlord() {
        ability1 = TrollWarlordBerserkersRage.instance();
        ability2 = TrollWarlordWhirlingAxesRanged.instance();
        ability3 = TrollWarlordWhirlingAxesMelee.instance();
        ability4 = TrollWarlordFervor.instance();
        ability5 = TrollWarlordBattleTrance.instance();
        ability6 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        armorPhysical = -1;
        attackAcquisitionRange = 8;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 35;
        attackDamageMin = 17;
        attackRange = 5;
        attackRate = 1.7;
        attributeAgilityGain = 2.75;
        attributeBaseAgility = 21;
        attributeBaseIntelligence = 13;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 1;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.2;
        banSound = "troll_warlord_troll_anger_03";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 2;
        heroID = 95;
        heroSelectSoundEffect = "Hero_TrollWarlord.Pick";
        heroUnlockOrder = 0;
        idleExpression = "scenes/troll_warlord/troll_warlord_exp_idle_01.vcd";
        key = "npc_dota_hero_troll_warlord";
        lastHitChallengeRival = "npc_dota_hero_windrunner";
        model = "models/heroes/troll_warlord/troll_warlord.vmdl";
        modelScale = .9;
        movementSpeed = 3;
        movementTurnRate = .5;
        nameAliases = new String[]{"troll","jahrakal"};
        noCombine = 0;
        pickSound = "troll_warlord_troll_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_troll_warlord";
        projectileModel = "particles/units/heroes/hero_troll_warlord/troll_warlord_base_attack.vpcf";
        projectileSpeed = 12;
        role = new String[]{"Carry","Pusher","Disabler","Durable"};
        rolelevels = new int[]{3,2,1,1};
        soundSet = "Hero_TrollWarlord";
        team = "Good";
        visionDaytimeRange = 18;
        visionNighttimeRange = 8;
        voiceFile = "soundevents/voscripts/game_sounds_vo_troll_warlord.vsndevts";
        active = true;
        localizedName = "Troll Warlord";
        shortKey = "troll_warlord";
        url = "Troll_Warlord";
    }

    public static TrollWarlord instance() {
        if( instance == null ){
            instance = new TrollWarlord();
        }
        return instance;
    }

    public TrollWarlordBerserkersRage getAbility1() {
        return ability1;
    }

    public TrollWarlordWhirlingAxesRanged getAbility2() {
        return ability2;
    }

    public TrollWarlordWhirlingAxesMelee getAbility3() {
        return ability3;
    }

    public TrollWarlordFervor getAbility4() {
        return ability4;
    }

    public TrollWarlordBattleTrance getAbility5() {
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
        if (!(object instanceof TrollWarlord))
            return false;
        if (object == this)
            return true;
        TrollWarlord otherObject = (TrollWarlord) object;
        return otherObject.getKey().equals(getKey());
    }

}
