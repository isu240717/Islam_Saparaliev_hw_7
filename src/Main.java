public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 20, "Magic"),
                new Medic(100, 10, "Medic", 50),
                new Warrior(100, 30, "Warrior")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}