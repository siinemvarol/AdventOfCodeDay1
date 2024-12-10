import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();
        long sum = 0;

        BufferedReader reader;

        try{
            reader = new BufferedReader(new FileReader("day1.txt"));
            String line = reader.readLine();

            while (line != null) {
                String [] splitted = line.split("   ");
                firstList.add(Integer.valueOf(splitted[0]));
                secondList.add(Integer.valueOf(splitted[1]));
                line = reader.readLine();
            }
            reader.close();

            Collections.sort(firstList);
            System.out.println(firstList);

            Collections.sort(secondList);
            System.out.println(secondList);

            for(int i = 0; i < firstList.size(); i++) {
                sum += Math.abs(firstList.get(i) - secondList.get(i));
            }

            System.out.println("Distance between list is... " + sum);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}