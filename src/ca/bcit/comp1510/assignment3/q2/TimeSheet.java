package ca.bcit.comp1510.assignment3.q2;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.List;
import java.util.ArrayList;

/**
 * TimeSheet data.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class TimeSheet {

    /** empNum is employee number. */
    private String empNum;
    
    /** endDate of week, must be Friday. */
    private LocalDate endWeek;
    
    /** details of TimeSheetRows. */
    private List<TimeSheetRow> details;

    /**
     * TimeSheet no-argument constructor.
     */
    public TimeSheet() {
        this.empNum = "";
        this.endWeek = null;
        this.details = new ArrayList<TimeSheetRow>();
    }

    /**
     * TimeSheet constructor.
     * @param empNum string of employee number
     * @param endWeek date
     */
    public TimeSheet(String empNum, LocalDate endWeek) {
        this.empNum = empNum;
        this.endWeek = endWeek;
        this.details = new ArrayList<TimeSheetRow>();
    }
    
    /**
     * getEmpNum.
     * @return empNum String employee number
     */
    public String getEmpNum() {
        return this.empNum;
    }
    
    /**
     * getEndWeek.
     * @return endWeek LocalDate
     */
    public LocalDate getEndWeek() {
        return this.endWeek;
    }
    
    /**
     * getDetails.
     * @return details List of TimeSheetRow
     */
    public List<TimeSheetRow> getDetails() {
        return this.details;
    }
    
    /**
     * setEmpNum to update employee number.
     * @param empNum String to update
     */
    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    /**
     * setEndWeek to update endWeek.
     * @param endDate to update
     * @throws IllegalArgumentException if not Friday
     */
    public void setEndWeek(LocalDate endDate) throws IllegalArgumentException {
        if (endDate.getDayOfWeek() != DayOfWeek.FRIDAY) {
            throw new IllegalArgumentException(
                "End date must be set to a Friday."
            );
        }
        this.endWeek = endDate;
    }

    /**
     * toString.
     * @return TimeSheet representation
     */
    public String toString() {
        String data = "";
        for (int i = 0; i < this.details.size(); i++) {
            data += this.details.get(i).toString() + "\n";
        }
        return data;
    }

    /**
     * addRow to details array.
     * @param row TimeSheetRow
     */
    public void addRow(TimeSheetRow row) {
        this.details.add(row);
    }
    
    /**
     * main program entry to show it works.
     * @param args unused
     */
    public static void main(String[] args) {
        TimeSheet sheet = new TimeSheet();
        
        final float hours1 = 2;
        final float hours2 = 32 / 10;
        final float hours3 = 38 / 10;
        
        final int id3 = 3;
        
        sheet.addRow(new TimeSheetRow(
            1, 
            "assignment1", 
            hours1, hours2, hours3
        ));
        
        sheet.addRow(new TimeSheetRow(
            2, 
            "assignment2", 
            hours3, hours2, hours1
        ));
        
        sheet.addRow(new TimeSheetRow(
            id3, 
            "assignment3", 
            hours2, hours3, hours1
        ));
        
        System.out.println(sheet.toString());
    }
}

