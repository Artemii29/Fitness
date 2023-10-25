import java.util.Date;

public class Fitness {
    private Membership[] gymMemberships = new Membership[20];
    private int count1 = 0;
    private int count2 = 0;
    private int count3 = 0;
    private Membership[] poolMemberships = new Membership[20];
    private Membership[] groupMemberships = new Membership[20];

    public void addMembership(Membership membership) {
        if (membership.zone == Zone.POOL) {
            if(membership instanceof Day){
                System.out.println("Day memberships are not allowed in the pool.");
            }
            else if (count1 < 20) {
                poolMemberships[count1++] = membership;
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
            if (count3 < 20) {
                groupMemberships[count3++] = membership;
            } else {
                System.out.println("Мест нет");
            }
        }
    }

}

