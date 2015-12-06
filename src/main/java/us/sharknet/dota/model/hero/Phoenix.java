package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Phoenix extends Hero {

    private static Phoenix instance;

    private final PhoenixIcarusDive ability1;
    private final AttributeBonus ability10;
    private final PhoenixFireSpirits ability2;
    private final PhoenixSunRay ability3;
    private final PhoenixSunRayToggleMoveEmpty ability4;
    private final PhoenixSupernova ability5;
    private final PhoenixLaunchFireSpirit ability6;
    private final PhoenixIcarusDiveStop ability7;
    private final PhoenixSunRayStop ability8;
    private final PhoenixSunRayToggleMove ability9;
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
    private final String baseClass;
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String idleSoundLoop;
    private final String key;
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
    private final String shortKey;
    private final String url;

    private Phoenix() {
        ability1 = PhoenixIcarusDive.instance();
        ability10 = AttributeBonus.instance();
        ability2 = PhoenixFireSpirits.instance();
        ability3 = PhoenixSunRay.instance();
        ability4 = PhoenixSunRayToggleMoveEmpty.instance();
        ability5 = PhoenixSupernova.instance();
        ability6 = PhoenixLaunchFireSpirit.instance();
        ability7 = PhoenixIcarusDiveStop.instance();
        ability8 = PhoenixSunRayStop.instance();
        ability9 = PhoenixSunRayToggleMove.instance();
        abilityDraftDisabled = 1;
        abilityLayout = 5;
        armorPhysical = -2;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .35;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 36;
        attackDamageMin = 26;
        attackRange = 500;
        attackRate = 1.7;
        attributeAgilityGain = 1.3;
        attributeBaseAgility = 12;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 1.8;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.9;
        banSound = "phoenix_phoenix_bird_moving01";
        baseClass = "npc_dota_hero_phoenix";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 0;
        enabled = 1;
        healthBarOffset = 240;
        heroID = 110;
        heroSelectSoundEffect = "Hero_Phoenix.Pick";
        heroUnlockOrder = 1;
        idleExpression = "scenes/phoenix/phoenix/exp_idle_01.vcd";
        idleSoundLoop = "Hero_Phoenix.IdleLoop";
        key = "npc_dota_hero_phoenix";
        model = "models/heroes/phoenix/phoenix_bird.vmdl";
        modelScale = .95;
        movementSpeed = 285;
        movementTurnRate = 1;
        nameAliases = "ph";
        noCombine = 1;
        pickSound = "phoenix_phoenix_bird_respawn";
        portrait = "vgui/hud/heroportraits/portrait_phoenix";
        projectileModel = "particles/units/heroes/hero_phoenix/phoenix_base_attack.vpcf";
        projectileSpeed = 1100;
        role = new String[]{"Support","Nuker","Initiator","Escape","Disabler"};
        rolelevels = new int[]{1,3,2,2,1};
        soundSet = "Hero_Phoenix";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_phoenix.vsndevts";
        active = true;
        localizedName = "Phoenix";
        shortKey = "phoenix";
        url = "Phoenix";
    }

    public static Phoenix instance() {
        if( instance == null ){
            instance = new Phoenix();
        }
        return instance;
    }

    public PhoenixIcarusDive getAbility1() {
        return ability1;
    }

    public AttributeBonus getAbility10() {
        return ability10;
    }

    public PhoenixFireSpirits getAbility2() {
        return ability2;
    }

    public PhoenixSunRay getAbility3() {
        return ability3;
    }

    public PhoenixSunRayToggleMoveEmpty getAbility4() {
        return ability4;
    }

    public PhoenixSupernova getAbility5() {
        return ability5;
    }

    public PhoenixLaunchFireSpirit getAbility6() {
        return ability6;
    }

    public PhoenixIcarusDiveStop getAbility7() {
        return ability7;
    }

    public PhoenixSunRayStop getAbility8() {
        return ability8;
    }

    public PhoenixSunRayToggleMove getAbility9() {
        return ability9;
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

    public String getBaseClass() {
        return baseClass;
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

    public String getIdleSoundLoop() {
        return idleSoundLoop;
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof Phoenix))
            return false;
        if (object == this)
            return true;
        Phoenix otherObject = (Phoenix) object;
        return otherObject.getKey().equals(getKey());
    }

}
