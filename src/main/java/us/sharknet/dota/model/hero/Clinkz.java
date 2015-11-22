package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Clinkz extends Hero {

    private static Clinkz instance;

    private final ClinkzStrafe ability1;
    private final ClinkzSearingArrows ability2;
    private final ClinkzWindWalk ability3;
    private final ClinkzDeathPact ability4;
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
    private final double loadoutScale;
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
    private final int new_player_enable;
    private final String shortKey;
    private final String url;

    private Clinkz() {
        ability1 = ClinkzStrafe.instance();
        ability2 = ClinkzSearingArrows.instance();
        ability3 = ClinkzWindWalk.instance();
        ability4 = ClinkzDeathPact.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .7;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 21;
        attackDamageMin = 15;
        attackRange = 630;
        attackRate = 1.7;
        attributeAgilityGain = 3;
        attributeBaseAgility = 22;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 15;
        attributeIntelligenceGain = 1.55;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.6;
        banSound = "clinkz_clinkz_anger_08";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 144;
        heroGlowColor = new int[]{205,58,0};
        heroID = 56;
        heroSelectSoundEffect = "Hero_Clinkz.Pick";
        heroUnlockOrder = 2;
        idleExpression = "scenes/clinkz/clinkz_exp_idle_01.vcd";
        idleSoundLoop = "Hero_Clinkz.IdleLoop";
        key = "npc_dota_hero_clinkz";
        lastHitChallengeRival = "npc_dota_hero_windrunner";
        loadoutScale = .75;
        model = "models/heroes/clinkz/clinkz.vmdl";
        modelScale = .65;
        movementSpeed = 300;
        movementTurnRate = .4;
        pickSound = "clinkz_clinkz_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_clinkz";
        projectileModel = "particles/units/heroes/hero_clinkz/clinkz_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Carry","Escape","Pusher"};
        rolelevels = new int[]{2,3,1};
        soundSet = "Hero_Clinkz";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_clinkz.vsndevts";
        active = true;
        localizedName = "Clinkz";
        new_player_enable = 1;
        shortKey = "clinkz";
        url = "Clinkz";
    }

    public static Clinkz instance() {
        if( instance == null ){
            instance = new Clinkz();
        }
        return instance;
    }

    public ClinkzStrafe getAbility1() {
        return ability1;
    }

    public ClinkzSearingArrows getAbility2() {
        return ability2;
    }

    public ClinkzWindWalk getAbility3() {
        return ability3;
    }

    public ClinkzDeathPact getAbility4() {
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
        if (!(object instanceof Clinkz))
            return false;
        if (object == this)
            return true;
        Clinkz otherObject = (Clinkz) object;
        return otherObject.getKey().equals(getKey());
    }

}
