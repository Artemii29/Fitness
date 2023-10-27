public class Main {
    public static void main(String[] args) {
        Fitness fitness = new Fitness();
        Owner owner1 = new Owner("Nikolay","Aleksandrov",1997);
        Owner owner2 = new Owner("Aleksandr","Aleksandrov",1997);
        // Создаем абонементы
        Membership membership1 = new Membership(Type.FULL,Zone.POOL,1,owner1,"22-05-2025 12:12:12");
        Membership membership2 = new Membership(Type.FULL, Zone.POOL, 2, owner2,"22-05-2025 12:12:12");

        // Добавляем абонементы в фитнес-центр
        fitness.addMembership(membership1);
        fitness.addMembership(membership2);
    }
}