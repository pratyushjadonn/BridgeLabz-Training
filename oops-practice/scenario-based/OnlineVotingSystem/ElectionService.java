package OnlineVotingSystem;

import java.util.ArrayList;

public abstract class ElectionService {

    ArrayList<Voter> voters = new ArrayList<>();
    ArrayList<Candidate> candidates = new ArrayList<>();
    ArrayList<Vote> votes = new ArrayList<>();

    // voter registration
    public void registerVoter(Voter voter) {
        voters.add(voter);
    }

    // candidate management
    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    // abstract vote casting
    public abstract void castVote(Voter voter, Candidate candidate)
            throws DuplicateVoteException;

    // result declaration
    public void declareResult() {
        for (Candidate c : candidates) {
            int count = 0;
            for (Vote v : votes) {
                if (v.candidate == c) {
                    count++;
                }
            }
            System.out.println(c.CandidateName + " : " + count + " votes");
        }
    }
}
