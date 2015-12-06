package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Kunkka extends Hero {

    private static Kunkka instance;

    private final KunkkaTorrent ability1;
    private final KunkkaTidebringer ability2;
    private final KunkkaXMarksTheSpot ability3;
    private final KunkkaGhostship ability4;
    private final KunkkaReturn ability6;
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

    private Kunkka() {
        ability1 = KunkkaTorrent.instance();
        ability2 = KunkkaTidebringer.instance();
        ability3 = KunkkaXMarksTheSpot.instance();
        ability4 = KunkkaGhostship.instance();
        ability6 = KunkkaReturn.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .4;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 36;
        attackDamageMin = 26;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.3;
        attributeBaseAgility = 14;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 24;
        attributeIntelligenceGain = 1.5;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 3;
        banSound = "kunkka_kunk_anger_04";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 150;
        heroGlowColor = new int[]{50,150,165};
        heroID = 23;
        heroSelectSoundEffect = "Hero_Kunkka.Pick";
        heroUnlockOrder = 3;
        iD = 23;
        idleExpression = "scenes/kunkka/kunkka_exp_idle_01.vcd";
        key = "npc_dota_hero_kunkka";
        lastHitChallengeRival = "npc_dota_hero_tidehunter";
        loadoutScale = .93;
        model = "models/heroes/kunkka/kunkka.vmdl";
        modelScale = .84;
        movementSpeed = 300;
        movementTurnRate = .6;
        pickSound = "kunkka_kunk_spawn_11";
        portrait = "vgui/hud/heroportraits/portrait_kunkka";
        role = new String[]{"Carry","Disabler","Initiator","Durable","Nuker"};
        rolelevels = new int[]{1,1,1,1,1};
        soundSet = "Hero_Kunkka";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_kunkka.vsndevts";
        active = true;
        localizedName = "Kunkka";
        shortKey = "kunkka";
        url = "Kunkka";
    }

    public static Kunkka instance() {
        if( instance == null ){
            instance = new Kunkka();
        }
        return instance;
    }

    public KunkkaTorrent getAbility1() {
        return ability1;
    }

    public KunkkaTidebringer getAbility2() {
        return ability2;
    }

    public KunkkaXMarksTheSpot getAbility3() {
        return ability3;
    }

    public KunkkaGhostship getAbility4() {
        return ability4;
    }

    public KunkkaReturn getAbility6() {
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
        if (!(object instanceof Kunkka))
            return false;
        if (object == this)
            return true;
        Kunkka otherObject = (Kunkka) object;
        return otherObject.getKey().equals(getKey());
    }

}
