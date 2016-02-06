package us.sharknet.dota.model;

import org.junit.BeforeClass;
import org.junit.Test;
import us.sharknet.dota.model.hero.Abaddon;
import us.sharknet.dota.model.hero.Lich;
import us.sharknet.dota.model.hero.WitchDoctor;
import us.sharknet.dota.model.item.Yasha;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private static Library library;

    @BeforeClass
    public static void setUpBeforeClass() {
        library = new Library();
    }

    @Test
    public void testGetItem() throws Exception {
        Yasha yasha = (Yasha) library.getItem("item_yasha");
        assertEquals("item_yasha", yasha.getKey());
    }

    @Test
    public void testGetNumberOfItems() throws Exception {
        assertEquals(207, library.getNumberOfItems());
    }

    @Test
    public void testGetItemKeys() throws Exception {

    }

    @Test
    public void testGetItems() throws Exception {

    }

    @Test
    public void testGetHero() throws Exception {
        assertEquals(112, library.getNumberOfHeroes());
    }

    @Test
    public void testGetNumberOfHeroes() throws Exception {

    }

    @Test
    public void testGetHeroKeys() throws Exception {

    }

    @Test
    public void testGetHeros() throws Exception {

    }

    @Test
    public void testGetAbility() throws Exception {

    }

    @Test
    public void testGetNumberOfAbilities() throws Exception {
        assertEquals(619, library.getNumberOfAbilities());
    }

    @Test
    public void testGetAbilityKeys() throws Exception {

    }

    @Test
    public void testGetAbilities() throws Exception {

    }

    @Test
    public void testGetUnit() throws Exception {

    }

    @Test
    public void testGetNumberOfUnits() throws Exception {
        assertEquals(204, library.getNumberOfUnits());
    }

    @Test
    public void testGetUnitKeys() throws Exception {

    }

    @Test
    public void testGetUnits() throws Exception {

    }

    @Test
    public void testGetHeroByID() throws Exception {
        assertEquals(Abaddon.instance(), library.getHeroByID(102));
        assertEquals(Lich.instance(), library.getHeroByID(31));
        assertEquals(WitchDoctor.instance(), library.getHeroByID(30));
    }
}