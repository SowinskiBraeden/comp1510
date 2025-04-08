package ca.bcit.comp1510.assignment3.q2;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestTimesheet {

    @Test
    void testGetEmpNum() {
        Timesheet sheet = new Timesheet(
            "984757",
            null
        );
        assertEquals(sheet.getEmpNum(), "984757");
    }
    
    @Test
    void testGetEndWeek() {
        final int year = 2025;
        final int month = 4;
        final int day = 4;
        LocalDate now = LocalDate.of(year, month, day);
        Timesheet sheet = new Timesheet(
            "",
            now
        );
        assertEquals(sheet.getEndWeek(), now);
    }
    
    @Test
    void testGetDetails() {
        Timesheet sheet = new Timesheet("123", null);
        
        final float hours1 = 2;
        final float hours2 = 32 / 10;
        final float hours3 = 38 / 10;
        
        final int id3 = 3;
     
        TimesheetRow r1 = new TimesheetRow(
            1, 
            "assignment1", 
            hours1, hours2, hours3
        );
        
        TimesheetRow r2 = new TimesheetRow(
            2, 
            "assignment2", 
            hours3, hours2, hours1
        );
        
        TimesheetRow r3 = new TimesheetRow(
            id3, 
            "assignment3", 
            hours2, hours3, hours1
        );
        
        sheet.addRow(r1);
        sheet.addRow(r2);        
        sheet.addRow(r3);
        
        List<TimesheetRow> correct = new ArrayList<TimesheetRow>();
        correct.add(r1);
        correct.add(r2);
        correct.add(r3);
        
        assertEquals(sheet.getDetails(), correct);
    }
    
    @Test
    void testSetEmpNum() {
        Timesheet sheet = new Timesheet(
            "",
            null
        );
        sheet.setEmpNum("984757");
        
        assertEquals(sheet.getEmpNum(), "984757");
    }
    
    @Test
    void testSetEndWeek() {
        Timesheet sheet = new Timesheet(
            "",
            null
        );
        final int year = 2025;
        final int month = 4;
        final int day = 4;
        LocalDate now = LocalDate.of(year, month, day);

        sheet.setEndWeek(now);
        
        assertEquals(sheet.getEndWeek(), now);
    }
    
    @Test
    void testToString() {
        Timesheet sheet = new Timesheet("123", null);
        
        final float hours1 = 2;
        final float hours2 = 32 / 10;
        final float hours3 = 38 / 10;
     
        TimesheetRow r1 = new TimesheetRow(
            1, 
            "assignment1", 
            hours1, hours2, hours3
        );
        
        sheet.addRow(r1);
        
        System.out.println(sheet.toString());
        
        assertEquals(sheet.toString(), r1.toString() + "\n");
    }
    
    @Test
    void testAddRow() {
        Timesheet sheet = new Timesheet("123", null);
        
        final float hours1 = 2;
        final float hours2 = 32 / 10;
        final float hours3 = 38 / 10;
     
        TimesheetRow r1 = new TimesheetRow(
            1, 
            "assignment1", 
            hours1, hours2, hours3
        );
                
        sheet.addRow(r1);
        
        List<TimesheetRow> correct = new ArrayList<TimesheetRow>();
        correct.add(r1);
        
        assertEquals(sheet.getDetails(), correct);
    }
}


