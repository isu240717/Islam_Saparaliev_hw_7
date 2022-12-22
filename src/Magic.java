public class Magic extends Hero{
    public Magic(int Health, int Damage, String SuperAbility){
        super(Health, Damage, SuperAbility);
    }
    public void applySuperAbility(){
        System.out.println("The magician used the STORM ability");
    }
}
