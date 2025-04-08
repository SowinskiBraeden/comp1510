package ca.bcit.comp1510.assignment3.q2;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.List;
import java.util.ArrayList;

/**
 * TimeSheet stores the amount of hours worked
 * during a given week period for an employee.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class Timesheet {

    /** empNum is employee number. */
    private String empNum;
    
    /** endDate of week, must be Friday. */
    private LocalDate endWeek;
    
    /** details of TimeSheetRows. */
    private List<TimesheetRow> details;

    /**
     * TimeSheet no-argument constructor.
     */
    public Timesheet() {
        this.empNum = "";
        this.endWeek = null;
        this.details = new ArrayList<TimesheetRow>();
    }

    /**
     * TimeSheet constructor.
     * @param empNum string of employee number
     * @param endWeek date
     */
    public Timesheet(String empNum, LocalDate endWeek) {
        this.empNum = empNum;
        this.endWeek = endWeek;
        this.details = new ArrayList<TimesheetRow>();
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
    public List<TimesheetRow> getDetails() {
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
    public void addRow(TimesheetRow row) {
        this.details.add(row);
    }
    
    /**
     * main program entry to show it works.
     * @param args unused
     */
    public static void main(String[] args) {
        Timesheet sheet = new Timesheet();
        
        final float hours1 = 2;
        final float hours2 = 32 / 10;
        final float hours3 = 38 / 10;
        
        final int id3 = 3;
        
        sheet.addRow(new TimesheetRow(
            1, 
            "assignment1", 
            hours1, hours2, hours3
        ));
        
        sheet.addRow(new TimesheetRow(
            2, 
            "assignment2", 
            hours3, hours2, hours1
        ));
        
        sheet.addRow(new TimesheetRow(
            id3, 
            "assignment3", 
            hours2, hours3, hours1
        ));
        
        System.out.println(sheet.toString());
    }
}

