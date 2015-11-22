package us.sharknet.dota.model;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private static Library library;

    @BeforeClass
    public static void setUpBeforeClass() {
        library = new Library();
    }

    @Test
    public void testGetItem() throws Exception {

    }

    @Test
    public void testGetNumberOfItems() throws Exception {
        assertEquals(235, library.getNumberOfItems());
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
        assertEquals(618, library.getNumberOfAbilities());
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
        assertEquals(203, library.getNumberOfUnits());
    }

    @Test
    public void testGetUnitKeys() throws Exception {

    }

    @Test
    public void testGetUnits() throws Exception {

    }
}