import java.util.Objects;
abstract class PeopleINT implements people {
    protected String name;
    protected Gender gender;
    protected String ending;

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
    @Override
    public boolean equals(Object o){
        if (this == o)return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeopleINT people1 = (PeopleINT) o;
        return Objects.equals(name, people1.name);
    }
    @Override
    public String toString(){
        return "people{" + "name = '" + name + '\'' + ", gender = " + gender + '}';
    }
    public String getName(){
        return this.name = name;

    }
}
