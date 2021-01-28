package sarasai;

import java.util.Objects;

public class Zmogus {

    private String firstName;
    private String lastName;

    public Zmogus(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if( this == o) {
            return true;
        }
        if(this.getClass() != o.getClass()) {
            return false;
        }
        Zmogus z = (Zmogus) o; // i objekta o ziuresiu per prizme Zmogus
        if(this.firstName == null && z.firstName == null || this.firstName.equals(z.firstName)) { // paliginu dveju zmoniu varda
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Zmogus{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
