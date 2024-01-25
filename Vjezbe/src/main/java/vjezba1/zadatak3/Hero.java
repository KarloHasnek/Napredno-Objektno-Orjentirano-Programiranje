package vjezba1.zadatak3;

public class Hero {

    private AbilityStrategy ability;

    public void setAndApplyAbility(AbilityStrategy ability) {
        this.ability = ability;
        ability.applyAbility();
    }

    @Override
    public String toString() {
        return "Hero{" + "ability=" + ability + '}';
    }
}
