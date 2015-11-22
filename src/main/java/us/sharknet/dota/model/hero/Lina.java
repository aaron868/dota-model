package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Lina extends Hero {

    private static Lina instance;

    private final LinaDragonSlave ability1;
    private final LinaLightStrikeArray ability2;
    private final LinaFierySoul ability3;
    private final LinaLagunaBlade ability4;
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
    private final int botForceSelection;
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
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Lina() {
        ability1 = LinaDragonSlave.instance();
        ability2 = LinaLightStrikeArray.instance();
        ability3 = LinaFierySoul.instance();
        ability4 = LinaLagunaBlade.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 8;
        attackAnimationPoint = .75;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 31;
        attackDamageMin = 13;
        attackRange = 67;
        attackRate = 1.7;
        attributeAgilityGain = 1.5;
        attributeBaseAgility = 16;
        attributeBaseIntelligence = 27;
        attributeBaseStrength = 18;
        attributeIntelligenceGain = 3.2;
        attributePrimary = "DOTA_ATTRIBUTE_INTELLECT";
        attributeStrengthGain = 1.5;
        banSound = "lina_lina_anger_02";
        botForceSelection = 0;
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 17;
        heroGlowColor = new int[]{254,90,5};
        heroID = 25;
        heroPool1 = 1;
        heroSelectSoundEffect = "Hero_Lina.Pick";
        heroUnlockOrder = 0;
        idleExpression = "scenes/lina/lina_exp_idle_01.vcd";
        idleSoundLoop = "Hero_Lina.IdleLoop";
        key = "npc_dota_hero_lina";
        lastHitChallengeRival = "npc_dota_hero_crystal_maiden";
        model = "models/heroes/lina/lina.vmdl";
        modelScale = .81;
        movementSpeed = 295;
        movementTurnRate = .5;
        pickSound = "lina_lina_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_lina";
        projectileModel = "particles/units/heroes/hero_lina/lina_base_attack.vpcf";
        projectileSpeed = 1;
        role = new String[]{"Support","Carry","Nuker","Disabler"};
        rolelevels = new int[]{1,1,3,1};
        soundSet = "Hero_Lina";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_lina.vsndevts";
        active = true;
        localizedName = "Lina";
        shortKey = "lina";
        url = "Lina";
    }

    public static Lina instance() {
        if( instance == null ){
            instance = new Lina();
        }
        return instance;
    }

    public LinaDragonSlave getAbility1() {
        return ability1;
    }

    public LinaLightStrikeArray getAbility2() {
        return ability2;
    }

    public LinaFierySoul getAbility3() {
        return ability3;
    }

    public LinaLagunaBlade getAbility4() {
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

    public int getBotForceSelection() {
        return botForceSelection;
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
        if (!(object instanceof Lina))
            return false;
        if (object == this)
            return true;
        Lina otherObject = (Lina) object;
        return otherObject.getKey().equals(getKey());
    }

}
