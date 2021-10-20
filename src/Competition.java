import java.util.*;

public class Competition {
    private final Map<Group, List<String>> groups = new TreeMap<>();

    public void addGroupAndMembers(Scanner scanner) {
        Group group = dataGroup(scanner);

        int decision = 1;
        List<String> members = new ArrayList<>();
        scanner.nextLine();

        do {
            System.out.println("enter member name");

            String memberName = scanner.nextLine();
            members.add(memberName);
            System.out.println("complete adding members - press 0");
            System.out.println("add next member - press other number");
            decision = scanner.nextInt();
            scanner.nextLine();
        } while (decision != 0);
        groups.put(group, members);
    }

    public void displayAllGroupsAndMembers() {
        for (Map.Entry<Group, List<String>> element : groups.entrySet()) {
            System.out.println("group name: " + element.getKey());
            for (String memberName : element.getValue()) {
                System.out.println("member name: " + memberName);
            }
        }
    }

    public void displayAllMembersFromGroup(Scanner scanner) {
        Group group = dataGroup(scanner);

        for (String memberName : groups.get(group)) {
            System.out.println("member from group " + group + " name: " + memberName);
        }

    }

    private Group dataGroup(Scanner scanner) {
        System.out.println("choose day");
        System.out.println("1 - Monday");
        System.out.println("2 - Tuesday");
        System.out.println("3 - Wednesday");
        System.out.println("4 - Thursday");
        System.out.println("5 - Friday");
        System.out.println("6 - Saturday");
        System.out.println("7 - Sunday");

        Day day;
        int groupDayChoose = scanner.nextInt();
        if (groupDayChoose == 1) {
            day = Day.MONDAY;
        } else if (groupDayChoose == 2) {
            day = Day.TUESDAY;
        } else if (groupDayChoose == 3) {
            day = Day.WEDNESDAY;
        } else if (groupDayChoose == 4) {
            day = Day.THURSDAY;
        } else if (groupDayChoose == 5) {
            day = Day.FRIDAY;
        } else if (groupDayChoose == 6) {
            day = Day.SATURDAY;
        } else {
            day = Day.SUNDAY;
        }

        System.out.println("enter hour");
        int hour = scanner.nextInt();
        System.out.println("enter minute");
        int minute = scanner.nextInt();
        return new Group(day, hour, minute);
    }

    public void addNewMemberToGroup(Scanner scanner) {
        System.out.println("enter new member name");
        scanner.nextLine();
        String memberName = scanner.nextLine();

        groups.get(dataGroup(scanner)).add(memberName);
    }

    public void deleteMemberFromGroup(Scanner scanner) {
        System.out.println("enter member name");
        scanner.nextLine();
        String memberName = scanner.nextLine();

        groups.get(dataGroup(scanner)).remove(memberName);

    }
}
