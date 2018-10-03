package uk.ac.tees.q5315908;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import uk.ac.tees.q5315908.entity.vehicle.HeavyTank;
import uk.ac.tees.q5315908.entity.vehicle.LightTank;
import uk.ac.tees.q5315908.entity.vehicle.Vehicle;

/** A set of test cases to check the output of the Vehicle class.
 *
 * Based on work created by Mark Truran.
 * October 2018
 * AJP class
 */
public class VehicleTest
{

    /**
     * Testing global points counter in Vehicle.
     */
    @Test
    public void testCounter()
    {
    	Vehicle.totalPoints = 0;
    	
        System.out.println("Testing global counter in Vehicle");
        final ArrayList<Killable> al = new ArrayList<Killable>();
        al.add(new LightTank(Faction.NOD));
        al.add(new HeavyTank(Faction.SCRIN));
        al.add(new LightTank(Faction.GDI));
        al.add(new HeavyTank(Faction.GDI));
        al.add(new LightTank(Faction.SCRIN));

        for (Killable k : al)
        {
            k.kill();
        }
        final int expectedTotalVehiclePoints = 970;
        assertEquals(expectedTotalVehiclePoints, Vehicle.totalPoints);
    }
}