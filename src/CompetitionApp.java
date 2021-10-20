import java.util.Scanner;

public class CompetitionApp {
    public static void main(String[] args) {
        int decision = 0;
        Scanner scanner = new Scanner(System.in);
        Competition competition = new Competition();

        do {

            System.out.println("select options");
            System.out.println("add new group and members - press 1");
            System.out.println("display all groups and members - press 2");
            System.out.println("add new member to group - press 3");
            System.out.println("display members from group - press 4");
            System.out.println("delete member from group - press 5");
            System.out.println("close the program - press 0");

            decision = scanner.nextInt();

            switch (decision) {
                case 1:
                    competition.addGroupAndMembers(scanner);
                    break;
                case 2:
                    competition.displayAllGroupsAndMembers();
                    break;
                case 3:
                    competition.addNewMemberToGroup(scanner);
                    break;
                case 4:
                    competition.displayAllMembersFromGroup(scanner);
                    break;
                case 5:
                    competition.deleteMemberFromGroup(scanner);
                    break;
            }
        } while (decision != 0);

    }
}
