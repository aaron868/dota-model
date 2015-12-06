package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Broodmother extends Hero {

    private static Broodmother instance;

    private final BroodmotherSpawnSpiderlings ability1;
    private final BroodmotherSpinWeb ability2;
    private final BroodmotherIncapacitatingBite ability3;
    private final BroodmotherInsatiableHunger ability4;
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
    private final int[] heroGlowColor;
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
    private final String nameAliases;
    private final String pickSound;
    private final String portrait;
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

    private Broodmother() {
        ability1 = BroodmotherSpawnSpiderlings.instance();
        ability2 = BroodmotherSpinWeb.instance();
        ability3 = BroodmotherIncapacitatingBite.instance();
        ability4 = BroodmotherInsatiableHunger.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 32;
        attackDamageMin = 26;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 2.2;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 17;
        attributeIntelligenceGain = 2;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.5;
        banSound = "broodmother_broo_anger_01";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 120;
        heroGlowColor = new int[]{74,76,217};
        heroID = 61;
        heroSelectSoundEffect = "Hero_Broodmother.Pick";
        heroUnlockOrder = 2;
        idleExpression = "scenes/broodmother/broodmother_exp_idle_01.vcd";
        key = "npc_dota_hero_broodmother";
        lastHitChallengeRival = "npc_dota_hero_earthshaker";
        model = "models/heroes/broodmother/broodmother.vmdl";
        modelScale = .93;
        movementSpeed = 295;
        movementTurnRate = .5;
        nameAliases = "bm";
        pickSound = "broodmother_broo_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_broodmother";
        role = new String[]{"Carry","Pusher","Escape","Nuker"};
        rolelevels = new int[]{1,3,3,1};
        soundSet = "Hero_Broodmother";
        team = "Bad";
        visionDaytimeRange = 1800;
        visionNighttimeRange = 800;
        voiceFile = "soundevents/voscripts/game_sounds_vo_broodmother.vsndevts";
        active = true;
        localizedName = "Broodmother";
        shortKey = "broodmother";
        url = "Broodmother";
    }

    public static Broodmother instance() {
        if( instance == null ){
            instance = new Broodmother();
        }
        return instance;
    }

    public BroodmotherSpawnSpiderlings getAbility1() {
        return ability1;
    }

    public BroodmotherSpinWeb getAbility2() {
        return ability2;
    }

    public BroodmotherIncapacitatingBite getAbility3() {
        return ability3;
    }

    public BroodmotherInsatiableHunger getAbility4() {
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
        if (!(object instanceof Broodmother))
            return false;
        if (object == this)
            return true;
        Broodmother otherObject = (Broodmother) object;
        return otherObject.getKey().equals(getKey());
    }

}
