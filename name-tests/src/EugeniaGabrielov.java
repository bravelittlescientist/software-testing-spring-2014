/**
 * Basic Java and JUnit - Name Class
 * @author Eugenia Gabrielov [eugenia.g@uci.edu]
 */
public class EugeniaGabrielov {

    private String firstName;
    private String lastName;
    private String UCInetID;
    private int studentIdNumber;

    public EugeniaGabrielov () {
        firstName = "Eugenia";
        lastName = "Gabrielov";
        UCInetID = "eugenig";
        studentIdNumber = 35721871;
    }

    /**
     * getFullName - returns first and last name, with space in between
     * method 1
     *
     * @return String, representing full name
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * First name, Last name, netId, and studentId getters (methods 2-5 for the assignment)
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUCInetID() {
        return UCInetID;
    }

    public int getStudentNumber() {
        return studentIdNumber;
    }

    /**
     * getRotatedFullName (method 6)
     *
     * @param shift, an integer indicating wrap-around. Positive rotates left, negative rotates right.
     * @return shifted, a string representing full name shifted by shift.
     */
    public String getRotatedFullName(int shift) {
        // Grab local copy of full name
        String toRotate = getFullName();

        // Handle out of bound error by taking mod: this way the string can wrap fully around as many times as needed.
        shift = shift % toRotate.length();

        // Figure out where to split!
        int splitAt = 0;

        // If positive: rotate left by splitting after shift characters
        // If negative: rotate right by splitting at name length + shift
        if (shift >= 0) {
            splitAt = shift;
        } else {
            splitAt = toRotate.length() + shift;
        }

        return toRotate.substring(splitAt) + toRotate.substring(0, splitAt);
    }
}
