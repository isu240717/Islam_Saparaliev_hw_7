public class Warrior extends Hero{
    public Warrior(int Health, int Damage, String SuperAbility){
        super(Health, Damage, SuperAbility);
    }
    public void applySuperAbility(){
        System.out.println("The Warrior applied the CRITICAL DAMAGE ability" + SuperAbility);
    }
}
