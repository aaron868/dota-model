package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class SkeletonKing extends Hero {

    private static SkeletonKing instance;

    private final SkeletonKingHellfireBlast ability1;
    private final SkeletonKingVampiricAura ability2;
    private final SkeletonKingMortalStrike ability3;
    private final SkeletonKingReincarnation ability4;
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
    private final int heroPool1;
    private final int heroPool2;
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
    private final String[] nameAliases;
    private final String pickSound;
    private final String portrait;
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

    private SkeletonKing() {
        ability1 = SkeletonKingHellfireBlast.instance();
        ability2 = SkeletonKingVampiricAura.instance();
        ability3 = SkeletonKingMortalStrike.instance();
        ability4 = SkeletonKingReincarnation.instance();
        armorPhysical = 0;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .56;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 41;
        attackDamageMin = 39;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.7;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 18;
        attributeBaseStrength = 22;
        attributeIntelligenceGain = 1.6;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.9;
        banSound = "skeleton_king_wraith_anger_04";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 190;
        heroGlowColor = new int[]{226,224,36};
        heroID = 42;
        heroPool1 = 1;
        heroPool2 = 1;
        heroSelectSoundEffect = "Hero_SkeletonKing.Pick";
        heroUnlockOrder = 0;
        iD = 42;
        idleExpression = "scenes/skeleton_king/skeleton_king_exp_idle_01.vcd";
        key = "npc_dota_hero_skeleton_king";
        lastHitChallengeRival = "npc_dota_hero_sand_king";
        loadoutScale = .92;
        model = "models/heroes/wraith_king/wraith_king.vmdl";
        modelScale = .94;
        movementSpeed = 300;
        movementTurnRate = .4;
        nameAliases = new String[]{"sk","snk","wk"};
        pickSound = "skeleton_king_wraith_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_skeletonking";
        projectileSpeed = 0;
        role = new String[]{"Carry","Support","Durable","Disabler","Initiator"};
        rolelevels = new int[]{2,1,3,2,1};
        soundSet = "Hero_SkeletonKing";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_skeleton_king.vsndevts";
        active = true;
        localizedName = "Wraith King";
        new_player_enable = 1;
        shortKey = "skeleton_king";
        url = "Wraith_King";
    }

    public static SkeletonKing instance() {
        if( instance == null ){
            instance = new SkeletonKing();
        }
        return instance;
    }

    public SkeletonKingHellfireBlast getAbility1() {
        return ability1;
    }

    public SkeletonKingVampiricAura getAbility2() {
        return ability2;
    }

    public SkeletonKingMortalStrike getAbility3() {
        return ability3;
    }

    public SkeletonKingReincarnation getAbility4() {
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

    public int getHeroPool1() {
        return heroPool1;
    }

    public int getHeroPool2() {
        return heroPool2;
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

    public String[] getNameAliases() {
        return nameAliases;
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
        if (!(object instanceof SkeletonKing))
            return false;
        if (object == this)
            return true;
        SkeletonKing otherObject = (SkeletonKing) object;
        return otherObject.getKey().equals(getKey());
    }

}
