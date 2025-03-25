package ca.bcit.comp1510.assignment3.q2;

/**
 * TimeSheetRow is a row of TimeSheet.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class TimeSheetRow {

    /** MASK of bits for days of week represented inside hours long. */
    private static final long[] MASK = {
        0xFFL, 0xFF00L, 0xFF0000L, 
        0xFF000000L, 0xFF00000000L,
        0xFF0000000000L, 0xFF000000000000L
    };

    /** UMASK to unmask stuff. */
    private static final long[] UMASK = {
        0xFFFFFFFFFFFFFF00L,
        0xFFFFFFFFFFFF00FFL,
        0xFFFFFFFFFF00FFFFL,
        0xFFFFFFFF00FFFFFFL,
        0xFFFFFF00FFFFFFFFL,
        0xFFFF00FFFFFFFFFFL,
        0xFF00FFFFFFFFFFFFL
    };
    
    /** DECI to convert hours. */
    private static final float DECI = 10;
    
    /** baseHex to convert hexidecimal */
    private static final int HEX_BASE = 16;
    
    /** SHIFT by bits */
    private static final int SHIFT = 8;
    
    /** project number as int. */
    private int project;
    
    /** workPackage string. */
    private String workPackage;
    
    /** hours worked long. */
    private long hours;
    
    /**
     * TimeSheetRow no-argument constructor.
     */
    public TimeSheetRow() {
        this.project = 0;
        this.workPackage = "";
        this.hours = 0;
    }
    
    /**4
     * TimeSheetRow constructor.
     * @param projectNumber int
     * @param workPackage String
     * @param hours float...
     */
    public TimeSheetRow(int projectNumber, String workPackage, float... hours) {
        this.project = projectNumber;
        this.workPackage = workPackage;
        
        String encoded = "";
        for (int i = hours.length - 1; i >= 0; i--) {
            String hex = Integer.toHexString((int) (hours[i] * DECI));
            hex = hex.length() == 1 ? "0" + hex : hex;
            encoded += hex;
        }
     
        this.hours = Long.parseLong(encoded, HEX_BASE);
    }
    
    /**
     * getProject number.
     * @return project int
     */
    public int getProject() {
        return this.project;
    }
    
    /**
     * getWorkPackage name.
     * @return workPackage string
     */
    public String getWorkPackage() {
        return this.workPackage;
    }
    
    /**
     * getHours worked.
     * @return hours long.
     */
    public long getHours() {
        return this.hours;
    }
    
    /**
     * setProject number.
     * @param project int
     */
    public void setProject(int project) {
        this.project = project;
    }
    
    /**
     * setProject name.
     * @param newWorkPackage string
     */
    public void setProject(String newWorkPackage) {
        this.workPackage = newWorkPackage;
    }
    
    /**
     * setProject worked.
     * @param newHours long.
     */
    public void setProject(long newHours) {
        this.hours = newHours;
    }
    
    /**
     * toString string representation.
     * @return string
     */
    public String toString() {
        return "";
    }
    
    /**
     * getHour of day.
     * @param day as int
     * @return hours float
     */
    public float getHour(int day) {
        return ((this.hours >> (day * SHIFT)) & MASK[0]) / DECI;
    }
    
    /**
     * setHour of a given day of week.
     * @param day as int
     * @param hour float
     */
    public void setHour(int day, float hour) {
//        long encoded = ((long) (hour * DECI) | MASK[day + 1]) << day * SHIFT;
//        this.hours = (this.hours & UMASK[day]) | encoded;
        String hex = Integer.toHexString((int) (hour * DECI));
        long encoded = Long.parseLong(hex, HEX_BASE) << (day * SHIFT);
        this.hours = (this.hours & UMASK[day]) | encoded;
    }
    
    /**
     * main test encode decode.
     * @param args unused
     */
    public static void main(String[] args) {
        final Long n = 0X321420372d0b20L;
        
        TimeSheetRow t = new TimeSheetRow(
            0, 
            "Test", 
            3.2f, 1.1f, 4.5f, 5.5f, 3.2f, 2.0f, 5.0f
        );
        
        System.out.println(Long.toHexString(t.getHours()));
//        t.setHour(2, 3.2f);
//        t.setHour(4, 5.5f);
        for (int i = 0; i < 7; i++) {
            t.setHour(i, 3.0f);
            System.out.print(t.getHour(i) + " ");
        }
    }
}
