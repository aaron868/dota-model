package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Bloodseeker extends Hero {

    private static Bloodseeker instance;

    private final BloodseekerBloodrage ability1;
    private final BloodseekerBloodBath ability2;
    private final BloodseekerThirst ability3;
    private final BloodseekerRupture ability4;
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
    private final int attributeStrengthGain;
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
    private final String key;
    private final String lastHitChallengeRival;
    private final double loadoutScale;
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
    private final String team;
    private final String voiceFile;
    private final boolean active;
    private final String localizedName;
    private final String shortKey;
    private final String url;

    private Bloodseeker() {
        ability1 = BloodseekerBloodrage.instance();
        ability2 = BloodseekerBloodBath.instance();
        ability3 = BloodseekerThirst.instance();
        ability4 = BloodseekerRupture.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .43;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 35;
        attackDamageMin = 29;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 3;
        attributeBaseAgility = 24;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 1.7;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2;
        banSound = "bloodseeker_blod_anger_06";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 130;
        heroGlowColor = new int[]{247,60,12};
        heroID = 4;
        heroSelectSoundEffect = "Hero_Bloodseeker.Pick";
        heroUnlockOrder = 3;
        iD = 4;
        idleExpression = "scenes/bloodseeker/bloodseeker_exp_idle_01.vcd";
        key = "npc_dota_hero_bloodseeker";
        lastHitChallengeRival = "npc_dota_hero_juggernaut";
        loadoutScale = 1.1;
        model = "models/heroes/blood_seeker/blood_seeker.vmdl";
        modelScale = .88;
        movementSpeed = 290;
        movementTurnRate = .5;
        nameAliases = "bs";
        pickSound = "bloodseeker_blod_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_blood_seeker";
        role = new String[]{"Carry","Disabler","Jungler","Nuker","Initiator"};
        rolelevels = new int[]{1,1,1,1,1};
        soundSet = "Hero_Bloodseeker";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_bloodseeker.vsndevts";
        active = true;
        localizedName = "Bloodseeker";
        shortKey = "bloodseeker";
        url = "Bloodseeker";
    }

    public static Bloodseeker instance() {
        if( instance == null ){
            instance = new Bloodseeker();
        }
        return instance;
    }

    public BloodseekerBloodrage getAbility1() {
        return ability1;
    }

    public BloodseekerBloodBath getAbility2() {
        return ability2;
    }

    public BloodseekerThirst getAbility3() {
        return ability3;
    }

    public BloodseekerRupture getAbility4() {
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
        if (!(object instanceof Bloodseeker))
            return false;
        if (object == this)
            return true;
        Bloodseeker otherObject = (Bloodseeker) object;
        return otherObject.getKey().equals(getKey());
    }

}
