package ca.bcit.comp1510.lab06;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Reads baseball data in from a comma delimited file. Each line 
 * of the file contains a name followed by a list of symbols
 * indicating the result of each at bat: h for hit, o for out,
 * w for walk, s for sacrifice. Statistics are computed and
 * printed for each player.
 * @author Braeden Sowinski
 * @version 1.0.0
 */
public class BaseballStats {
    /**
     * main program entry.
     * Reads baseball stats from a file and counts
     *  total hits, outs, walks, and sacrifice flies
     * for each player.
     * @param args unused.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScan;
        Scanner lineScan;
        String fileName;
        
        Scanner scan = new Scanner(System.in);
        String basePath = "src/ca/bcit/comp1510/lab06/";
        
        System.out.print("Enter the name of the input file: ");
        fileName = scan.nextLine();
        fileScan = new Scanner(new File(basePath + fileName));

        while (fileScan.hasNext()) {
            lineScan = new Scanner(fileScan.nextLine());
            lineScan.useDelimiter(",");
            
            System.out.print(lineScan.next() + " ");
            
            int outs = 0;
            int hits = 0;
            int sacs = 0;
            int walks = 0;
            while (lineScan.hasNext()) {
                String current = lineScan.next();
                hits += current.equals("h") ? 1 : 0;
                outs += current.equals("o") ? 1 : 0;
                sacs += current.equals("s") ? 1 : 0;
                walks += current.equals("w") ? 1 : 0;
            }

            System.out.print(hits + " hits, "
                           + outs + " outs, "
                           + sacs + " sacrifices, "
                           + walks + " walks, ");

            final double percent = 100.0;
            double average = ((float) (hits) / (float) (hits + outs)) * percent;
            System.out.printf("batting average: %.2f%s", average, "%");
            
            System.out.println();
            lineScan.close();
        }
        
        scan.close();
        fileScan.close();
    }
}
