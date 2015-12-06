package us.sharknet.dota.model.hero;

import us.sharknet.dota.model.Hero;
import us.sharknet.dota.model.ability.*;

public final class LifeStealer extends Hero {

    private static LifeStealer instance;

    private final LifeStealerRage ability1;
    private final LifeStealerFeast ability2;
    private final LifeStealerOpenWounds ability3;
    private final LifeStealerAssimilate ability4;
    private final LifeStealerAssimilateEject ability5;
    private final LifeStealerInfest ability6;
    private final LifeStealerControl ability7;
    private final LifeStealerConsume ability8;
    private final AttributeBonus ability9;
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
    private final int hasAggressiveStance;
    private final int healthBarOffset;
    private final int[] heroGlowColor;
    private final int heroID;
    private final String heroSelectSoundEffect;
    private final int heroUnlockOrder;
    private final int iD;
    private final String idleExpression;
    private final String key;
    private final String lastHitChallengeRival;
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

    private LifeStealer() {
        ability1 = LifeStealerRage.instance();
        ability2 = LifeStealerFeast.instance();
        ability3 = LifeStealerOpenWounds.instance();
        ability4 = LifeStealerAssimilate.instance();
        ability5 = LifeStealerAssimilateEject.instance();
        ability6 = LifeStealerInfest.instance();
        ability7 = LifeStealerControl.instance();
        ability8 = LifeStealerConsume.instance();
        ability9 = AttributeBonus.instance();
        armorPhysical = -1;
        attackAcquisitionRange = 600;
        attackAnimationPoint = .39;
        attackCapabilities = "DOTA_UNIT_CAP_MELEE_ATTACK";
        attackDamageMax = 42;
        attackDamageMin = 32;
        attackRange = 128;
        attackRate = 1.7;
        attributeAgilityGain = 1.9;
        attributeBaseAgility = 18;
        attributeBaseIntelligence = 15;
        attributeBaseStrength = 25;
        attributeIntelligenceGain = 1.75;
        attributePrimary = "DOTA_ATTRIBUTE_STRENGTH";
        attributeStrengthGain = 2.4;
        banSound = "life_stealer_lifest_anger_05";
        boundsHullName = "DOTA_HULL_SIZE_HERO";
        cMEnabled = 1;
        enabled = 1;
        hasAggressiveStance = 1;
        healthBarOffset = 130;
        heroGlowColor = new int[]{209,4,1};
        heroID = 54;
        heroSelectSoundEffect = "Hero_LifeStealer.Pick";
        heroUnlockOrder = 1;
        iD = 54;
        idleExpression = "scenes/life_stealer/life_stealer_exp_idle_01.vcd";
        key = "npc_dota_hero_life_stealer";
        lastHitChallengeRival = "npc_dota_hero_skeleton_king";
        model = "models/heroes/life_stealer/life_stealer.vmdl";
        modelScale = .81;
        movementSpeed = 315;
        movementTurnRate = 1;
        pickSound = "life_stealer_lifest_spawn_01";
        portrait = "vgui/hud/heroportraits/portrait_life_stealer";
        role = new String[]{"Carry","Durable","Jungler","Escape","Disabler"};
        rolelevels = new int[]{2,2,1,1,1};
        soundSet = "Hero_LifeStealer";
        team = "Bad";
        voiceFile = "soundevents/voscripts/game_sounds_vo_life_stealer.vsndevts";
        active = true;
        localizedName = "Lifestealer";
        shortKey = "life_stealer";
        url = "Lifestealer";
    }

    public static LifeStealer instance() {
        if( instance == null ){
            instance = new LifeStealer();
        }
        return instance;
    }

    public LifeStealerRage getAbility1() {
        return ability1;
    }

    public LifeStealerFeast getAbility2() {
        return ability2;
    }

    public LifeStealerOpenWounds getAbility3() {
        return ability3;
    }

    public LifeStealerAssimilate getAbility4() {
        return ability4;
    }

    public LifeStealerAssimilateEject getAbility5() {
        return ability5;
    }

    public LifeStealerInfest getAbility6() {
        return ability6;
    }

    public LifeStealerControl getAbility7() {
        return ability7;
    }

    public LifeStealerConsume getAbility8() {
        return ability8;
    }

    public AttributeBonus getAbility9() {
        return ability9;
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
        if (!(object instanceof LifeStealer))
            return false;
        if (object == this)
            return true;
        LifeStealer otherObject = (LifeStealer) object;
        return otherObject.getKey().equals(getKey());
    }

}
