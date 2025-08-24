class Voting {
    boolean canVote(int age) {
        return age >= 18;
    }

    void printEligibility(int age) {
        if (canVote(age)) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not Eligible to vote");
        }
    }
}

public class VotingDemo {
    public static void main(String[] args) {
        Voting v = new Voting();
        v.printEligibility(16);
        v.printEligibility(18);
        v.printEligibility(20);
    }
}
