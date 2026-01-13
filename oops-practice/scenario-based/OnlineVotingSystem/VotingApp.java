package OnlineVotingSystem;

public class VotingApp {

    public static void main(String[] args) {

        ElectionService service = new ElectionServiceImpl();

        // candidates
        Candidate c1 = new Candidate(1, "Alice");
        Candidate c2 = new Candidate(2, "Bob");

        service.addCandidate(c1);
        service.addCandidate(c2);

        // voters
        Voter v1 = new Voter(20, "Shagun");
        Voter v2 = new Voter(22, "Aman");

        service.registerVoter(v1);
        service.registerVoter(v2);

        try {
            service.castVote(v1, c1);
            service.castVote(v2, c2);

            // duplicate vote (exception)
            service.castVote(v1, c2);

        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }

        // result
        service.declareResult();
    }
}
