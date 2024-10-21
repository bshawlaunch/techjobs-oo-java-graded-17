package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job jobTest1 = new Job();
        Job jobTest2 = new Job();

        assertNotEquals(jobTest1.getId(), jobTest2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job jobTest3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobTest3.getName() instanceof String);
        assertTrue(jobTest3.getEmployer() instanceof Employer);
        assertTrue(jobTest3.getLocation() instanceof Location);
        assertTrue(jobTest3.getPositionType() instanceof PositionType);
        assertTrue(jobTest3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(jobTest3.getName(), "Product tester");
        assertEquals(jobTest3.getEmployer().getValue(), "ACME");
        assertEquals(jobTest3.getLocation().getValue(), "Desert");
        assertEquals(jobTest3.getPositionType().getValue(), "Quality control");
        assertEquals(jobTest3.getCoreCompetency().getValue(), "Persistence");
    }
    @Test
    public void testJobsForEquality() {
        Job jobTest4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobTest5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertNotEquals(jobTest4.getId(), jobTest5.getId());
        assertNotEquals(jobTest4, jobTest5);
    }

}
