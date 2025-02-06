package Classes;

public class NoGenericMethods {
    private String name, lastName, gender;

    public NoGenericMethods(String name, String lastName, String gender){
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){
        return "\n Name: %s\n Last name: %s\n Gender: %s".formatted(this.name,
                this.lastName, this.gender);
    }
}
