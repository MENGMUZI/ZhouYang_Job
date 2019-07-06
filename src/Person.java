import java.util.Objects;

/**
 * @author : mengmuzi
 * create at:  2019-07-04  23:53
 * @description: Person类
 */
public class Person {

    private Integer id;
    private String personName;

    public Person() {

    }

    public Person(String personName) {
        super();
        this.personName = personName;
    }

    public Integer getId() {
        return id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }


    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (personName == null) {
            if (other.personName != null)
                return false;
        }
        else if (!personName.equals(other.personName))
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((personName == null) ? 0 : personName.hashCode());
        return result;
    }

}
