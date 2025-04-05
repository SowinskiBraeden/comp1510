package ca.bcit.comp1510.assignment3.q2;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestTimeSheet {

    @Test
    void testGetEmpNum() {
        TimeSheet sheet = new TimeSheet(
            "984757",
            null
        );
        assertEquals(sheet.getEmpNum(), "984757");
    }
    
    @Test
    void testGetEndWeek() {
        LocalDate now = LocalDate.now();
        TimeSheet sheet = new TimeSheet(
            "",
            now
        );
        assertEquals(sheet.getEndWeek(), now);
    }
    
    @Test
    void testGetDetails() {
        TimeSheet sheet = new TimeSheet("123", null);
        
        final float hours1 = 2;
        final float hours2 = 32 / 10;
        final float hours3 = 38 / 10;
        
        final int id3 = 3;
     
        TimeSheetRow r1 = new TimeSheetRow(
            1, 
            "assignment1", 
            hours1, hours2, hours3
        );
        
        TimeSheetRow r2 = new TimeSheetRow(
            2, 
            "assignment2", 
            hours3, hours2, hours1
        );
        
        TimeSheetRow r3 = new TimeSheetRow(
            id3, 
            "assignment3", 
            hours2, hours3, hours1
        );
        
        sheet.addRow(r1);
        sheet.addRow(r2);        
        sheet.addRow(r3);
        
        List<TimeSheetRow> correct = new ArrayList<TimeSheetRow>();
        correct.add(r1);
        correct.add(r2);
        correct.add(r3);
        
        assertEquals(sheet.getDetails(), correct);
    }
    
    @Test
    void testSetEmpNum() {
        TimeSheet sheet = new TimeSheet(
            "",
            null
        );
        sheet.setEmpNum("984757");
        
        assertEquals(sheet.getEmpNum(), "984757");
    }
    
    @Test
    void testSetEndWeek() {
        TimeSheet sheet = new TimeSheet(
            "",
            null
        );
        LocalDate now = LocalDate.now();

        sheet.setEndWeek(now);
        
        assertEquals(sheet.getEndWeek(), now);
    }
    
    @Test
    void testToString() {
        TimeSheet sheet = new TimeSheet("123", null);
        
        final float hours1 = 2;
        final float hours2 = 32 / 10;
        final float hours3 = 38 / 10;
     
        TimeSheetRow r1 = new TimeSheetRow(
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
        TimeSheet sheet = new TimeSheet("123", null);
        
        final float hours1 = 2;
        final float hours2 = 32 / 10;
        final float hours3 = 38 / 10;
     
        TimeSheetRow r1 = new TimeSheetRow(
            1, 
            "assignment1", 
            hours1, hours2, hours3
        );
                
        sheet.addRow(r1);
        
        List<TimeSheetRow> correct = new ArrayList<TimeSheetRow>();
        correct.add(r1);
        
        assertEquals(sheet.getDetails(), correct);
    }
}


