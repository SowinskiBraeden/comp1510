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
        return "";
    }

    /**
     * addRow to details array.
     * @param row TimeSheetRow
     */
    public void addRow(TimeSheetRow row) {
        this.details.add(row);
    }
    
    
}
