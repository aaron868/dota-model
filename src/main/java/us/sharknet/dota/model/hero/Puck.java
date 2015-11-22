package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Puck extends Hero {

    private static Puck instance;

    private final PuckIllusoryOrb ability1;
    private final PuckWaningRift ability2;
    private final PuckPhaseShift ability3;
    private final PuckEtherealJaunt ability4;
    private final PuckDreamCoil ability5;
    private final AttributeBonus ability6;
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
    private final String boundsHullName;
    private final int cMEnabled;
    private final int enabled;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final String idleExpression;
    private final String idleSoundLoop;
    private final String key;
    private final String lastHitChallengeRival;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String pickSound;
    private final String portrait;
    private final String projectileModel;
    private final int projectileSpeed;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final int visionNighttimeRange;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Puck() {
        ability1 = PuckIllusoryOrb.instance();
        ability2 = PuckWaningRift.instance();
        ability3 = PuckPhaseShift.instance();
        ability4 = PuckEtherealJaunt.instance();
        ability5 = PuckDreamCoil.instance();
        ability6 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        abilityLayout = 5;
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 22;
        attackRange = 550;
        attackRate = 1.7;
        attributeAgilityGain = 1.7;
        attributeBaseAgility = 22;
        attributeBaseIntelligence = 25;
        attributeBaseStrength = 15;
        attributeIntelligenceGain = 2.4;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.7;
        banSound = "puck_puck_anger_02";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 165;
        heroGlowColor = new int[]{117,240,255};
        heroID = 13;
        heroSelectSoundEffect = "Hero_Puck.Pick";
        heroUnlockOrder = 3;
        idleExpression = "scenes/puck/puck_exp_idle_01.vcd";
        idleSoundLoop = "Hero_Puck.IdleLoop";
        key = "npc_dota_hero_puck";
        lastHitChallengeRival = "npc_dota_hero_jakiro";
        model = "models/heroes/puck/puck.vmdl";
        modelScale = .86;
        movementSpeed = 295;
        movementTurnRate = .4;
        pickSound = "puck_puck_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_puck";
        projectileModel = "particles/units/heroes/hero_puck/puck_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Initiator","Disabler","Escape","Nuker"};
        rolelevels = new int[]{3,3,3,2};
        soundSet = "Hero_Puck";
        team = "Good";
        visionNighttimeRange = 800;
        voiceFile = "soundevents/voscripts/game_sounds_vo_puck.vsndevts";
        active = true;
        localizedName = "Puck";
        shortKey = "puck";
        url = "Puck";
    }

    public static Puck instance() {
        if( instance == null ){
            instance = new Puck();
        }
        return instance;
    }

    public PuckIllusoryOrb getAbility1() {
        return ability1;
    }

    public PuckWaningRift getAbility2() {
        return ability2;
    }

    public PuckPhaseShift getAbility3() {
        return ability3;
    }

    public PuckEtherealJaunt getAbility4() {
        return ability4;
    }

    public PuckDreamCoil getAbility5() {
        return ability5;
    }

    public AttributeBonus getAbility6() {
        return ability6;
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

    public String getIdleSoundLoop() {
        return idleSoundLoop;
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
        if (!(object instanceof Puck))
            return false;
        if (object == this)
            return true;
        Puck otherObject = (Puck) object;
        return otherObject.getKey().equals(getKey());
    }

}
