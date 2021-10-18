
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Sport> sport = new ArrayList<>();

        System.out.println("File: ");
        String file = scan.nextLine();

        try ( Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String a = scanner.nextLine();
                String[] b = a.split(",");

                String hometeam = b[0];
                String visitingteam = b[1];
                int hometeampt = Integer.valueOf(b[2]);
                int visitingteampt = Integer.valueOf(b[3]);
                sport.add(new Sport(hometeam, visitingteam, hometeampt, visitingteampt));
            }

            System.out.println("Team: ");
            String y = scan.nextLine();
            int i = 0;
            int win=0;
            int lose=0;
            for (Sport s : sport) {
                if (s.getSecond().equals(y) || s.getFirst().equals(y)) {
                    i++;
                    
                    if(s.getFirst().equals(y)){
                    if (s.getFPoint() > s.getSPoint()) {
                         win++;
                    } else {
                         lose++;
                    }
                    }else if(s.getSPoint()>s.getFPoint()) {
                        win++;
                    }else{
                        lose++;
                    }
                }
            }
            System.out.println("Games: " + i);
            System.out.println("Wins: "+win);
            System.out.println("Losses: "+lose);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
