public class Medic extends Hero{
    protected int HealPoints;

    public Medic(int Health, int Damage, String SuperAbility, int HealPoints){
        super(Health, Damage, SuperAbility);
        this.HealPoints = HealPoints;
    }
    public void applySuperAbility(){
        System.out.println("The medic applied the ability to TREAT");
    }
    public void increaseExperience(){
        this.HealPoints += this.HealPoints * 0.1;
    }
}
