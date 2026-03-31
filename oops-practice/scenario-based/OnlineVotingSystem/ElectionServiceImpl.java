package OnlineVotingSystem;

public class ElectionServiceImpl extends ElectionService {

    @Override
    public void castVote(Voter voter, Candidate candidate)
            throws DuplicateVoteException {

        // check duplicate vote
        if (voter.done) {
            throw new DuplicateVoteException("Duplicate vote not allowed");
        }

        // add vote
        votes.add(new Vote(voter, candidate));
        voter.done = true;

        System.out.println(voter.VoterName +
                " voted for " + candidate.CandidateName);
    }
}
