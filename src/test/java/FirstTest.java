import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FirstTest {

    private ArrayList<String> names;

    @Before
    public void setUp(){
        this.names = new ArrayList<>();
        this.names.add("Fer");

    }


    @Test
    public void testIfCompanyNameEquals() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);

    }
        @Test
        public void testIfChangeIsCorrect() {
            Double price = 10.0;
            Double discount = 4.5;

            assertEquals(5.5, price - discount, 0);
            assertEquals(5.1, price - discount, 0.5);
            assertEquals(5.9, price - discount, 0.5);
        }
    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        Object clonedSheep = sheep;

        assertNotSame(sheep, dog);
        assertSame(sheep, clonedSheep);
//        Notice that the sheep and dog objects occupy different memory locations, but sheep and clonedsheep are the same memory location
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    @Test
    public void testIfNamesIsInitialized(){
        assertNotNull(names);
    }

    @Test
    public void testIfANameCanBeAdded(){
        assertEquals(1, this.names.size());
        this.names.add("Zach");
        assertEquals(2, this.names.size());
        assertSame("Fer", this.names.get(0));
        assertSame("Zach", this.names.get(1));
    }

    @Test
    public void testIfTwoListsAreNotTheSame(){

        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

//        Assert.assertArrayEquals(languages.toArray(), moreLanguages.toArray());
        assertNotSame(languages,moreLanguages);
    }

    @Test
    public void testIfTwoArraysAreEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers,otherNumbers);
    }

    @Test
    public void testIfStatementsAreTrueAndFalse(){
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }


    }

