import javax.swing.*;
import java.awt.*;
import java.util.StringTokenizer;

public class Project1 {
    public static void main(String[] args) {
        fillGUI();
        RomanANumberalGUI();
    }

    private static int[][] fillGUI(String myFile) {
        TextFileInput in = new TextFileInput(myFile); 
        String line = in.readLine(); 
        StringTokenizer myTokens = new StringTokenizer(line, ","); 
        int row = Integer.parseInt(myTokens.nextToken()); 
        int col = Integer.parseInt(myTokens.nextToken()); 
        int[][] array = new int[row][col]; 
        for (int r = 0; r < array.length; r++) {
            String rowline = in.readLine(); 
            StringTokenizer numberTokens = new StringTokenizer(rowline, ","); 
            for (int c = 0; c < array[r].length; c++) {
                array[r][c] = Integer.parseInt(numberTokens.nextToken());
            }
        }
        return array;
    }

}