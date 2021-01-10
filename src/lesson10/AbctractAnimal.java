package lesson10;

public abstract class AbctractAnimal implements ZooAimal{
    protected String name;
    @Override
    public void printName () {
        System.out.println(name);

    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (!(o instanceof AbctractAnimal)) return false;

        AbctractAnimal that = (AbctractAnimal) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode () {
        return name.hashCode();
    }
}
