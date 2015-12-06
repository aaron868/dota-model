package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class NagaSiren extends Hero {

    private static NagaSiren instance;

    private final NagaSirenMirrorImage ability1;
    private final NagaSirenEnsnare ability2;
    private final NagaSirenRipTide ability3;
    private final NagaSirenSongOfTheSiren ability4;
    private final NagaSirenSongOfTheSirenCancel ability5;
    private final AttributeBonus ability6;
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
    private final String idleExpression;
    private final String idleSoundLoop;
    private final String key;
    private final String lastHitChallengeRival;
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
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private NagaSiren() {
        ability1 = NagaSirenMirrorImage.instance();
        ability2 = NagaSirenEnsnare.instance();
        ability3 = NagaSirenRipTide.instance();
        ability4 = NagaSirenSongOfTheSiren.instance();
        ability5 = NagaSirenSongOfTheSirenCancel.instance();
        ability6 = AttributeBonus.instance();
        armorPhysical = 3;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .5;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 25;
        attackDamageMin = 23;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.75;
        attributeBaseAgility = 21;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 21;
        attributeIntelligenceGain = 1.95;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.3;
        banSound = "naga_siren_naga_anger_12";
        boundsHullName = "DOTA_HULL_SIZE_SMALL";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 180;
        heroGlowColor = new int[]{154,97,133};
        heroID = 89;
        heroSelectSoundEffect = "Hero_NagaSiren.Pick";
        idleExpression = "scenes/naga_siren/naga_siren_exp_idle_01.vcd";
        idleSoundLoop = "Hero_NagaSiren.IdleLoop";
        key = "npc_dota_hero_naga_siren";
        lastHitChallengeRival = "npc_dota_hero_kunkka";
        model = "models/heroes/siren/siren.vmdl";
        modelScale = .77;
        movementSpeed = 320;
        movementTurnRate = .5;
        nameAliases = "naga";
        pickSound = "naga_siren_naga_spawn_02";
        portrait = "vgui/hud/heroportraits/portrait_naga_siren";
        role = new String[]{"Carry","Support","Pusher","Disabler","Initiator","Escape"};
        rolelevels = new int[]{3,1,2,2,1,1};
        soundSet = "Hero_NagaSiren";
        statusHealthRegen = .75;
        team = "good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_naga_siren.vsndevts";
        active = true;
        localizedName = "Naga Siren";
        shortKey = "naga_siren";
        url = "Naga_Siren";
    }

    public static NagaSiren instance() {
        if( instance == null ){
            instance = new NagaSiren();
        }
        return instance;
    }

    public NagaSirenMirrorImage getAbility1() {
        return ability1;
    }

    public NagaSirenEnsnare getAbility2() {
        return ability2;
    }

    public NagaSirenRipTide getAbility3() {
        return ability3;
    }

    public NagaSirenSongOfTheSiren getAbility4() {
        return ability4;
    }

    public NagaSirenSongOfTheSirenCancel getAbility5() {
        return ability5;
    }

    public AttributeBonus getAbility6() {
        return ability6;
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
        if (!(object instanceof NagaSiren))
            return false;
        if (object == this)
            return true;
        NagaSiren otherObject = (NagaSiren) object;
        return otherObject.getKey().equals(getKey());
    }

}
