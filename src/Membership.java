import java.util.Date;

public class Membership {
    protected int number;
    protected Owner owner;
    protected Date dateCreated;
    protected Date dateFinshed;
    protected Zone zone;
    protected Membership( int number, Owner owner, Date dateCreated, Date dateFinshed, Zone zone ){
        this.number = number;
        this.owner = owner;
        this.dateCreated = dateCreated;
        this.dateFinshed = dateFinshed;
        this.zone = zone;
    }
}
