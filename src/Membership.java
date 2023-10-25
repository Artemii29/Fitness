import java.util.Date;

public class Membership {
    protected Type type;
    protected Zone zone;
    protected int number;
    protected Owner owner;
    protected Date dateCreated;
    protected Date dateFinshed;


    public Zone getZone() {
        return zone;
    }
    public int getNumber() {
        return number;
    }

    public Owner getOwner() {
        return owner;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getDateFinshed() {
        return dateFinshed;
    }

    public Type getType() {
        return type;
    }

    protected Membership(Type type, Zone zone, int number, Owner owner, Date dateCreated, Date dateFinshed ) {
        this.type = type;
        this.zone = zone;
        this.number = number;
        this.owner = owner;
        this.dateCreated = dateCreated;
        this.dateFinshed = dateFinshed;

    }
}
