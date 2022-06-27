import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    try {
            File file = new File("C:\\Users\\daniel\\IdeaProjects\\NewElection\\src\\2020.txt");
            Scanner sc = new Scanner(file);
            sc.nextLine();
            String firstLine = sc.nextLine();
            String[] line = firstLine.split(" ");
            int year = Integer.parseInt(line[0]);
            String state = line[1];
            String stateAbbrev = line[2];
            String raceType = line[3];
            Candidate newCandidate = new Candidate();
            Election election = new Election();
            newCandidate.setSingleCandidateName(line);
            election.setYear(year);
//            election.setCandidates(line);
            System.out.println("Hello Welcome to the " + year + " election");
            System.out.println(newCandidate.name);

	    } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
