import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Membership {
    protected Type type;
    protected Zone zone;
    protected int number;
    protected Owner owner;
    protected LocalDateTime dateCreated;
    protected LocalDateTime dateFinished;

    public Membership(Type type, Zone zone, int number, Owner owner, String dateTime) {
        this.type = type;
        this.zone = zone;
        this.number = number;
        this.owner = owner;
        this.dateCreated = LocalDateTime.now();
        this.dateFinished = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }

    public Zone getZone() {
        return zone;
    }

    public int getNumber() {
        return number;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public LocalDateTime getDateFinished() {
        return dateFinished;
    }

    public Type getType() {
        return type;
    }

    protected Membership(Type type, Zone zone, int number, Owner owner, LocalDateTime dateCreated, LocalDateTime dateFinished) {
        this.type = type;
        this.zone = zone;
        this.number = number;
        this.owner = owner;
        this.dateCreated = dateCreated;
        this.dateFinished = dateFinished;
    }
}