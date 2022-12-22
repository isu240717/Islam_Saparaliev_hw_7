public abstract class Hero implements HavingSuperAbility {

    protected int Health;

    protected int Damage;

    protected String SuperAbility;

    public Hero(int Health, int Damage, String SuperAbility) {
        this.Health = Health;
        this.Damage = Damage;
        this.SuperAbility = SuperAbility;
    }

    public abstract void applySuperAbility();

}
