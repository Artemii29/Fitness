import java.time.LocalDateTime;

public class Fitness {
    private LocalDateTime currentDate = LocalDateTime.now();
    private Membership[] gymMemberships = new Membership[20];
    private int count1 = 0;
    private int count2 = 0;
    private int count3 = 0;
    private Membership[] poolMemberships = new Membership[20];
    private Membership[] groupMemberships = new Membership[20];

    public void addMembership(Membership membership) {
        if (membership.getDateFinished().isBefore(currentDate)) {
            System.out.println("Ваш абонемент просрочен");
        } else {
            if (membership.zone == Zone.POOL) {
                if (membership.getType() == Type.DAY) {
                    System.out.println("Day memberships are not allowed in the pool.");
                } else if (count1 < 20) {
                    for (int i = 0; i < count1; i++) {
                        if (poolMemberships[i] != membership) {
                            poolMemberships[count1++] = membership;
                        }
                    }
                } else {
                    System.out.println("Мест нет");
                }
            } else if (membership.zone == Zone.GYM) {
                if (count2 < 20) {
                    gymMemberships[count2++] = membership;
                } else {
                    System.out.println("Мест нет");
                }
            } else if (membership.zone == Zone.GROUP) {
                if (membership.type == Type.DAY) {
                    System.out.println("One memberships are not allowed in the pool.");

                }
                if (count3 < 20) {
                    groupMemberships[count3++] = membership;
                } else {
                    System.out.println("Мест нет");
                }
            }
        }
    }
}

