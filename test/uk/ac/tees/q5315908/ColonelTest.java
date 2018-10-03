package uk.ac.tees.q5315908;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uk.ac.tees.q5315908.entity.soldier.Colonel;
import uk.ac.tees.q5315908.entity.soldier.Soldier;

/** A set of test cases to check the output of the Colonel class.
 *
 * Based on work created by Mark Truran.
 * October 2018
 * AJP class
 */
public class ColonelTest
{
    
    /** A no-args constructor.
     * 
     */
    public ColonelTest()
    {
    }

    /**
     * Testing the getPoints() method, of class Colonel.
     */
    @Test
    public void testGdiPoints()
    {    
        System.out.println("Testing correct points for GDI colonel");
        final Soldier s = new Colonel(Faction.GDI);
        final int expectedValue = 100;
        assertEquals(s.getPoints(), expectedValue);
    }
    
    /**
     * Testing the getPoints() method, of class Colonel.
     */
    @Test
    public void testNodPoints()
    {    
        System.out.println("Testing correct points for NOD colonel");
        final Soldier s = new Colonel(Faction.NOD);
        final int expectedValue = 95;
        assertEquals(s.getPoints(), expectedValue);
    }
     
    /**
     * Testing the getPoints() method, of class Colonel.
     */
    @Test
    public void testScrinPoints()
    {    
        System.out.println("Testing correct points for SCRIN colonel");
        final Soldier s = new Colonel(Faction.SCRIN);
        final int expectedValue = 90;
        assertEquals(s.getPoints(), expectedValue);
    }
     
    /**
     * Test of kill method, of class Colonel.
     */
    @Test
    public void testGdiKill()
    {
        System.out.println("Testing correct message for GDI colonel");
        final Soldier s = new Colonel(Faction.GDI);
        final String expectedMessage = "A GDI colonel retires, permanently: +100pts.\n";
        final String actualMessage = s.kill();
        //System.out.println(expectedMessage);
        //System.out.println(actualMessage);        
        assertEquals(expectedMessage, actualMessage);
    }
    
    /**
     * Test of kill method, of class Colonel.
     */
    @Test
    public void testNodKill()
    {
        System.out.println("Testing correct message for NOD colonel");
        final Soldier s = new Colonel(Faction.NOD);
        final String expectedMessage = "A NOD colonel retires, permanently: +95pts.\n";
        final String actualMessage = s.kill();
        //System.out.println(expectedMessage);
        //System.out.println(actualMessage);        
        assertEquals(expectedMessage, actualMessage);
    }
    
    /**
     * Test of kill method, of class Colonel.
     */
    @Test
    public void testScrinKill()
    {
        System.out.println("Testing correct message for SCRIN colonel");
        final Soldier s = new Colonel(Faction.SCRIN);
        final String expectedMessage = "A SCRIN colonel retires, permanently: +90pts.\n";
        final String actualMessage = s.kill();
        //System.out.println(expectedMessage);
        //System.out.println(actualMessage);        
        assertEquals(expectedMessage, actualMessage);
    }
   
}