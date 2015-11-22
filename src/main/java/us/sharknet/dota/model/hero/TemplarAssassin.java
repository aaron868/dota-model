package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class TemplarAssassin extends Hero {

    private static TemplarAssassin instance;

    private final TemplarAssassinRefraction ability1;
    private final TemplarAssassinMeld ability2;
    private final TemplarAssassinPsiBlades ability3;
    private final TemplarAssassinTrap ability4;
    private final TemplarAssassinPsionicTrap ability5;
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
    private final String shortKey;
    private final String url;

    private TemplarAssassin() {
        ability1 = TemplarAssassinRefraction.instance();
        ability2 = TemplarAssassinMeld.instance();
        ability3 = TemplarAssassinPsiBlades.instance();
        ability4 = TemplarAssassinTrap.instance();
        ability5 = TemplarAssassinPsionicTrap.instance();
        ability6 = AttributeBonus.instance();
        abilityDraftDisabled = 1;
        abilityLayout = 5;
        armorPhysical = 1;
        attackAcquisitionRange = 800;
        attackAnimationPoint = .3;
        attackCapabilities = "DOTA_UNIT_CAP_RANGED_ATTACK";
        attackDamageMax = 36;
        attackDamageMin = 30;
        attackRange = 140;
        attackRate = 1.7;
        attributeAgilityGain = 2.7;
        attributeBaseAgility = 23;
        attributeBaseIntelligence = 20;
        attributeBaseStrength = 18;
        attributeIntelligenceGain = 2;
        attributePrimary = "DOTA_ATTRIBUTE_AGILITY";
        attributeStrengthGain = 2.1;
        banSound = "templar_assassin_temp_anger_03";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        healthBarOffset = 180;
        heroGlowColor = new int[]{242,200,198};
        heroID = 46;
        heroSelectSoundEffect = "Hero_TemplarAssassin.Pick";
        heroUnlockOrder = 3;
        idleExpression = "scenes/templar_assassin/templar_assassin_exp_idle_01.vcd";
        key = "npc_dota_hero_templar_assassin";
        lastHitChallengeRival = "npc_dota_hero_omniknight";
        loadoutScale = .92;
        model = "models/heroes/lanaya/lanaya.vmdl";
        modelScale = .88;
        movementSpeed = 305;
        movementTurnRate = .7;
        pickSound = "templar_assassin_temp_spawn_02";
        portrait = "vgui/hud/heroportraits/portrait_templar_assassin";
        projectileModel = "particles/units/heroes/hero_templar_assassin/templar_assassin_base_attack.vpcf";
        projectileSpeed = 900;
        role = new String[]{"Carry","Escape"};
        rolelevels = new int[]{2,1};
        soundSet = "Hero_TemplarAssassin";
        team = "Good";
        voiceFile = "soundevents/voscripts/game_sounds_vo_templar_assassin.vsndevts";
        active = true;
        localizedName = "Templar Assassin";
        shortKey = "templar_assassin";
        url = "Templar_Assassin";
    }

    public static TemplarAssassin instance() {
        if( instance == null ){
            instance = new TemplarAssassin();
        }
        return instance;
    }

    public TemplarAssassinRefraction getAbility1() {
        return ability1;
    }

    public TemplarAssassinMeld getAbility2() {
        return ability2;
    }

    public TemplarAssassinPsiBlades getAbility3() {
        return ability3;
    }

    public TemplarAssassinTrap getAbility4() {
        return ability4;
    }

    public TemplarAssassinPsionicTrap getAbility5() {
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

    public String getShortKey() {
        return shortKey;
    }

    public String getUrl() {
        return url;
    }


    @Override
    public boolean equals(final Object object) {
        if (!(object instanceof TemplarAssassin))
            return false;
        if (object == this)
            return true;
        TemplarAssassin otherObject = (TemplarAssassin) object;
        return otherObject.getKey().equals(getKey());
    }

}
