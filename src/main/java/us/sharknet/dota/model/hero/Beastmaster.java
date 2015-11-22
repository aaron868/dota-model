package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class Beastmaster extends Hero {

    private static Beastmaster instance;

    private final BeastmasterWildAxes ability1;
    private final BeastmasterCallOfTheWild ability2;
    private final BeastmasterCallOfTheWildBoar ability3;
    private final BeastmasterInnerBeast ability4;
    private final BeastmasterPrimalRoar ability5;
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
    private final String key;
    private final String lastHitChallengeRival;
    private final String model;
    private final double modelScale;
    private final int movementSpeed;
    private final double movementTurnRate;
    private final String nameAliases;
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
    private final String shortKey;
    private final String url;

    private Beastmaster() {
        ability1 = BeastmasterWildAxes.instance();
        ability2 = BeastmasterCallOfTheWild.instance();
        ability3 = BeastmasterCallOfTheWildBoar.instance();
        ability4 = BeastmasterInnerBeast.instance();
        ability5 = BeastmasterPrimalRoar.instance();
        ability6 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        abilityLayout = 5;
        armorPhysical = 2;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 45;
        attackDamageMin = 41;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.6;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 16;
        attributeBaseStrength = 23;
        attributeIntelligenceGain = 1.9;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.2;
        banSound = "beastmaster_beas_anger_01";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 180;
        heroGlowColor = new int[]{215,174,81};
        heroID = 38;
        heroSelectSoundEffect = "Hero_Beastmaster.Pick";
        heroUnlockOrder = 1;
        idleExpression = "scenes/beastmaster/beastmaster_exp_idle_01.vcd";
        key = "npc_dota_hero_beastmaster";
        lastHitChallengeRival = "npc_dota_hero_skeleton_king";
        model = "models/heroes/beastmaster/beastmaster.vmdl";
        modelScale = .77;
        movementSpeed = 310;
        movementTurnRate = .4;
        nameAliases = "bm";
        pickSound = "beastmaster_beas_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_beastmaster";
        projectileSpeed = 0;
        role = new String[]{"Initiator","Disabler","Durable","Nuker"};
        rolelevels = new int[]{2,2,2,1};
        soundSet = "Hero_Beastmaster";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_beastmaster.vsndevts";
        active = true;
        localizedName = "Beastmaster";
        shortKey = "beastmaster";
        url = "Beastmaster";
    }

    public static Beastmaster instance() {
        if( instance == null ){
            instance = new Beastmaster();
        }
        return instance;
    }

    public BeastmasterWildAxes getAbility1() {
        return ability1;
    }

    public BeastmasterCallOfTheWild getAbility2() {
        return ability2;
    }

    public BeastmasterCallOfTheWildBoar getAbility3() {
        return ability3;
    }

    public BeastmasterInnerBeast getAbility4() {
        return ability4;
    }

    public BeastmasterPrimalRoar getAbility5() {
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
        if (!(object instanceof Beastmaster))
            return false;
        if (object == this)
            return true;
        Beastmaster otherObject = (Beastmaster) object;
        return otherObject.getKey().equals(getKey());
    }

}
