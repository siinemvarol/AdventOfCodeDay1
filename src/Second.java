import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Objects;

public class Second {
    public static void main(String[] args) {

        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();
        long similarity = 0;

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

            int occurence;

            for(int i = 0; i < firstList.size(); i++) {
                occurence = 0;
                for(int j = 0; j < secondList.size(); j++) {
                    if (Objects.equals(firstList.get(i), secondList.get(j))) {
                        occurence++;
                    }
                }
                similarity += ((long) firstList.get(i) * occurence);
            }

            System.out.println("Similarity score is... " + similarity);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}