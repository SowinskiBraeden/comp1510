package ca.bcit.comp1510.assignment3.q2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestTimesheetRow {

    @Test
    void testEmptyConstructor() {
        TimesheetRow row = new TimesheetRow();
        
        boolean c1 = row.getProject() == 0;
        boolean c2 = row.getWorkPackage().equals("");
        boolean c3 = row.getHours() == 0;
        
        assertTrue(c1 && c2 && c3);
    }
    
    @Test
    void testConstructor() {
        final int id = 984757;
        final String pack = "abc2xyz";
       
        TimesheetRow row = new TimesheetRow(
            id,
            pack,
            0
        );
        
        boolean c1 = row.getProject() == id;
        boolean c2 = row.getWorkPackage() == pack;

        assertTrue(c1 && c2);
    }
    
    @Test
    void testGetProject() {
        final int id = 984757;
        final String pack = "abc2xyz";
        
        TimesheetRow row = new TimesheetRow(
            id,
            pack,
            0
        );
        
        assertEquals(row.getProject(), id);
    }
    
    @Test
    void testGetWorkPackage() {
        final int id = 984757;
        final String pack = "abc2xyz";
        
        TimesheetRow row = new TimesheetRow(
            id,
            pack,
            0
        );
        
        assertEquals(row.getWorkPackage(), pack);
    }

    @Test
    void testGetHours() {
        final int id = 984757;
        final String pack = "abc2xyz";
        
        final float hours1 = 2;
        final float hours2 = 32 / 10;
        final float hours3 = 38 / 10;
        
        TimesheetRow row = new TimesheetRow(
            id,
            pack,
            hours1, hours2, hours3
        );
        
        final long correct = 1973780;
        
        assertEquals(row.getHours(), correct);
    }
    
    @Test
    void testSetProject() {
        TimesheetRow row = new TimesheetRow();
        
        final int id = 984757;
        
        row.setProject(id);
        
        assertEquals(row.getProject(), id);
    }
    
    @Test
    void testSetWorkPackage() {
        TimesheetRow row = new TimesheetRow();
        
        final String pack = "abc2xyz";
        
        row.setWorkPackage(pack);        

        assertEquals(row.getWorkPackage(), pack);
    }
    
    @Test
    void testSetHours() {
        TimesheetRow row = new TimesheetRow();
        
        final long hours = 12345678;
        
        row.setHours(hours);        

        assertEquals(row.getHours(), hours);
    }
    
    @Test
    void testToString() {
        final int id = 984757;
        final String pack = "abc2xyz";
        
        final float hours1 = 2;
        final float hours2 = 32 / 10;
        final float hours3 = 38 / 10;
        
        TimesheetRow row = new TimesheetRow(
            id,
            pack,
            hours1, hours2, hours3
        );
        
        final String correct = "984757 abc2xyz 2.0 3.0 3.0 0.0 0.0 0.0 0.0 ";
        
        System.out.println(row.toString());
        assertEquals(row.toString(), correct);
    }
    
    @Test
    void testGetHour() {
        final int id = 984757;
        final String pack = "abc2xyz";
        
        final float hours1 = 2;
        final float hours2 = 32 / 10;
        final float hours3 = 38 / 10;
        
        TimesheetRow row = new TimesheetRow(
            id,
            pack,
            hours1, hours2, hours3
        );
                
        assertEquals(row.getHour(2), hours2);
    }
    
    @Test
    void testSetHour() {
        final int id = 984757;
        final String pack = "abc2xyz";
        
        final float hours1 = 2;
        final float hours2 = 32 / 10;
        final float hours3 = 38 / 10;
        
        TimesheetRow row = new TimesheetRow(
            id,
            pack,
            hours1, hours2, hours3
        );
                
        row.setHour(2, hours3);
        
        assertEquals(row.getHour(2), hours3);
    }
}
