package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class PhantomAssassin extends Hero {

    private static PhantomAssassin instance;

    private final PhantomAssassinStiflingDagger ability1;
    private final PhantomAssassinPhantomStrike ability2;
    private final PhantomAssassinBlur ability3;
    private final PhantomAssassinCoupDeGrace ability4;
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
    private final int hasAggressiveStance;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
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

    private PhantomAssassin() {
        ability1 = PhantomAssassinStiflingDagger.instance();
        ability2 = PhantomAssassinPhantomStrike.instance();
        ability3 = PhantomAssassinBlur.instance();
        ability4 = PhantomAssassinCoupDeGrace.instance();
        armorPhysical = 1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 25;
        attackDamageMin = 23;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 3.15;
        attributeBaseAgility = 23;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 20;
        attributeIntelligenceGain = 1.4;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 1.85;
        banSound = "phantom_assassin_phass_anger_08";
        botImplemented = 1;
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        hasAggressiveStance = 1;
        healthBarOffset = 180;
        heroGlowColor = new int[]{154,97,133};
        heroID = 44;
        heroSelectSoundEffect = "Hero_PhantomAssassin.Pick";
        heroUnlockOrder = 1;
        idleExpression = "scenes/phantom_assassin/phantom_assassin_exp_idle_01.vcd";
        key = "npc_dota_hero_phantom_assassin";
        lastHitChallengeRival = "npc_dota_hero_bounty_hunter";
        loadoutScale = .93;
        model = "models/heroes/phantom_assassin/phantom_assassin.vmdl";
        modelScale = .86;
        movementSpeed = 310;
        movementTurnRate = .4;
        nameAliases = "pa";
        pickSound = "phantom_assassin_phass_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_phantom_assassin";
        role = new String[]{"Carry","Escape"};
        rolelevels = new int[]{3,1};
        soundSet = "Hero_PhantomAssassin";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_phantom_assassin.vsndevts";
        active = true;
        localizedName = "Phantom Assassin";
        shortKey = "phantom_assassin";
        url = "Phantom_Assassin";
    }

    public static PhantomAssassin instance() {
        if( instance == null ){
            instance = new PhantomAssassin();
        }
        return instance;
    }

    public PhantomAssassinStiflingDagger getAbility1() {
        return ability1;
    }

    public PhantomAssassinPhantomStrike getAbility2() {
        return ability2;
    }

    public PhantomAssassinBlur getAbility3() {
        return ability3;
    }

    public PhantomAssassinCoupDeGrace getAbility4() {
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

    public int getHasAggressiveStance() {
        return hasAggressiveStance;
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
        if (!(object instanceof PhantomAssassin))
            return false;
        if (object == this)
            return true;
        PhantomAssassin otherObject = (PhantomAssassin) object;
        return otherObject.getKey().equals(getKey());
    }

}
