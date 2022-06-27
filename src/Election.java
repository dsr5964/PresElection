import java.util.ArrayList;
import java.util.Dictionary;

public class Election {
    int year;
    ArrayList<String> candidates;
    String presidentElect;
    String vicePresElect;
    String runnerUp;
    String predecessor;
    int totalElectVotes;

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }



    public void setCandidates(String[] s){
        int i = 0;
        Candidate newCandidate = new Candidate();
        while (!s[i].isEmpty()) {
            if (!candidates.contains(newCandidate.name)) {
                newCandidate.setSingleCandidateName(s);
                candidates.add(newCandidate.name);
            } else {
                continue;
            }
        }
    }





}
