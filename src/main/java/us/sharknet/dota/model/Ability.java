package us.sharknet.dota.model;

public abstract class Ability {

    public enum AbilityOwnerType { Neutral, Tower, Summoned, Courier, Hero, Roshan }

    private final String abilityType;


    public Ability(){
        abilityType = "DOTA_ABILITY_TYPE_BASIC";
    }

    /**
    * @return The English, human readable name of the ability.
    */
    public abstract String getLocalizedName();


    /**
    * @return The string key used by Valve for this ability in the VPK files.
    */
    public abstract String getKey();


    /**
    * @return The string key of the owning object. Use getOwnerType() to determine
    * what type of object owns this ability. If it is a hero for example then this
    * will return the hero's key. The other type values mean it will return a key
    * from an NpcUnit.
    *
    * There are several cases where the owner key won't match anything:
    * "attribute_bonus" because it is common to all heroes, "neutral_spell_immunity" becuase it is common
    * to all neutral, the tower ones, and several NpcUnit keys because the keys have a 1,2,3 appended to the end
    * (e.g., "npc_dota_lone_druid_bear" in Ability but "npc_dota_lone_druid_bear1" in NpcUnit).
    */
    public abstract String getOwnerKey();

    /**
    * @return The type of entity which owns this ability.
    */
    public abstract AbilityOwnerType getOwnerType();

    /**
    * @return The Valve-assigned unique integer ID of this ability.
    */
    public abstract int getID();


    /**
    * @return An array of the Valve behavior constants. For example, "DOTA_ABILITY_BEHAVIOR_UNIT_TARGET". I have not been able to find
    * a list of defintions for these.
    */
    public abstract String[] getAbilityBehavior();


    /**
    * @return True if this ability is simply a placeholder for another (such as for Rubick's spell steal) and doesn't do anything
    * on its own.
    */
    public abstract boolean isPlaceholder();


    /**
    * @return True if this is a passive ability. It may also be castable such as Wraith King's Vampiric Aura.
    */
    public abstract boolean isPassive();


    /**
    * @return The Valve constant for ability types.
    */
    public String getAbilityType() {
        return abilityType;
    }

    /**
    * @return True if this ability is a hero's ultimate.
    */
    public boolean isUltimate(){
        return getAbilityType().equals("DOTA_ABILITY_TYPE_ULTIMATE");
    }

    /**
    * @return True if this ability is only granted when the hero has an Aghanim's Scepter.
    */
    public boolean getIsGrantedByScepter() {
        return false;
    }







    @Override
    public int hashCode() {
        return getKey().hashCode();
    }

    @Override
    public String toString() {
        return getLocalizedName();
    }

}
