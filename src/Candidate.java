import java.util.ArrayList;
import java.io.*;

public class Candidate {
    String name;
    String runningMate;
    String party;
    ArrayList<String> statesWon;
    int electVotes;
    int popularVotes;

    public String getName(){
        return this.name;
    }

    /**
     * Sets a candidates name by looping through a single line.
     * The name is found at index 6 and starts with a quote and ends with a quote
     * If the string ends with a quote it adds the last part of the name and ends the loop.
     * Then it sets the candidates name.
     * @param l the line of the file that contains all the strings that are split
     */
    public void setSingleCandidateName(String[] l){
        StringBuilder candidateName = new StringBuilder();
        int i = 6;
        while (!l[i].isEmpty()){
            if (l[i].endsWith("\"")){
                candidateName.append(l[i]);
                candidateName.append(" ");
                break;
            } else {
                candidateName.append(l[i]);
                candidateName.append(" ");
                i++;
            }
        }
        this.name = candidateName.substring(1, candidateName.length()-2); //remove the quotes from the string
    }

}


