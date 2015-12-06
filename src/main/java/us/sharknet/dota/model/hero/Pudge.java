package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Pudge extends Hero {

    private static Pudge instance;

    private final PudgeMeatHook ability1;
    private final PudgeRot ability2;
    private final PudgeFleshHeap ability3;
    private final PudgeDismember ability4;
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
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final int iD;
    private final String idleExpression;
    private final String idleSoundLoop;
    private final String key;
    private final String lastHitChallengeRival;
    private final double loadoutScale;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String pickSound;
    private final String portrait;
    private final int projectileSpeed;
    private final String[] role;
    private final int[] rolelevels;
    private final String soundSet;
    private final String team;
    private final String voiceBackgroundSound;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Pudge() {
        ability1 = PudgeMeatHook.instance();
        ability2 = PudgeRot.instance();
        ability3 = PudgeFleshHeap.instance();
        ability4 = PudgeDismember.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 33;
        attackDamageMin = 27;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.5;
        attributeBaseAgility = 14;
        attributeBaseIntelligence = 14;
        attributeBaseStrength = 25;
        attributeIntelligenceGain = 1.5;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 3.2;
        banSound = "pudge_pud_anger_01";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 180;
        heroGlowColor = new int[]{178,128,114};
        heroID = 14;
        heroSelectSoundEffect = "Hero_Pudge.Pick";
        heroUnlockOrder = 3;
        iD = 14;
        idleExpression = "scenes/pudge/pudge_exp_idle_01.vcd";
        idleSoundLoop = "Hero_Pudge.IdleLoop";
        key = "npc_dota_hero_pudge";
        lastHitChallengeRival = "npc_dota_hero_skeleton_king";
        loadoutScale = .92;
        model = "models/heroes/pudge/pudge.vmdl";
        modelScale = .98;
        movementSpeed = 285;
        movementTurnRate = .7;
        pickSound = "pudge_pud_spawn_10";
        portrait = "vgui/hud/heroportraits/portrait_pudge";
        projectileSpeed = 0;
        role = new String[]{"Disabler","Initiator","Durable","Nuker"};
        rolelevels = new int[]{2,2,2,1};
        soundSet = "Hero_Pudge";
        team = "Bad";
        voiceBackgroundSound = "Pudge.Background";
        voiceFile = "soundevents/voscripts/game_sounds_vo_pudge.vsndevts";
        active = true;
        localizedName = "Pudge";
        shortKey = "pudge";
        url = "Pudge";
    }

    public static Pudge instance() {
        if( instance == null ){
            instance = new Pudge();
        }
        return instance;
    }

    public PudgeMeatHook getAbility1() {
        return ability1;
    }

    public PudgeRot getAbility2() {
        return ability2;
    }

    public PudgeFleshHeap getAbility3() {
        return ability3;
    }

    public PudgeDismember getAbility4() {
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

    public String getHeroSelectSoundEffect() {
        return heroSelectSoundEffect;
    }

    public int getHeroUnlockOrder() {
        return heroUnlockOrder;
    }

    public int getID() {
        return iD;
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

    public String getVoiceBackgroundSound() {
        return voiceBackgroundSound;
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
        if (!(object instanceof Pudge))
            return false;
        if (object == this)
            return true;
        Pudge otherObject = (Pudge) object;
        return otherObject.getKey().equals(getKey());
    }

}
