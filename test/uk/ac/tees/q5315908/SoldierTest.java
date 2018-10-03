package uk.ac.tees.q5315908;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import uk.ac.tees.q5315908.entity.soldier.Cadet;
import uk.ac.tees.q5315908.entity.soldier.Colonel;
import uk.ac.tees.q5315908.entity.soldier.Major;
import uk.ac.tees.q5315908.entity.soldier.Soldier;

/** A set of test cases to check the output of the Soldier abstract class.
 *
 * Based on work created by Mark Truran.
 * October 2018
 * AJP class
 */
public class SoldierTest
{

    /**
     * Testing global points counter in Soldier.
     */
    @Test
    public void testCounter()
    {
    	Soldier.totalPoints = 0;
    	
        System.out.println("Testing global counter in Soldier");
        final ArrayList<Killable> al = new ArrayList<Killable>();
        al.add(new Cadet(Faction.NOD));
        al.add(new Major(Faction.SCRIN));
        al.add(new Colonel(Faction.GDI));
        al.add(new Cadet(Faction.GDI));
        al.add(new Major(Faction.NOD));
        al.add(new Colonel(Faction.SCRIN));
        
        for (Killable k : al)
        {
            k.kill();
        }
        final int expectedTotalSoldierPoints = 365;
        assertEquals(Soldier.totalPoints, expectedTotalSoldierPoints);
    }
}
