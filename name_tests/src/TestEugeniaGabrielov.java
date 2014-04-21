import org.junit.Assert;
import org.junit.Test;

/**
 * Testing the Eugenia Gabrielov name class
 */
public class TestEugeniaGabrielov {

    /**
     * Tests for methods 1-5 - just testing getters
     */
    @Test
    public void testFullName() {
        EugeniaGabrielov tester = new EugeniaGabrielov();

        // Full name with space between first and last
        Assert.assertEquals("Eugenia Gabrielov", tester.getFullName());
    }

    @Test
    public void testFirstName() {
        EugeniaGabrielov tester = new EugeniaGabrielov();

        // First name string
        Assert.assertEquals("Eugenia", tester.getFirstName());
    }

    @Test
    public void testLastName() {
        EugeniaGabrielov tester = new EugeniaGabrielov();

        // Last name string
        Assert.assertEquals("Gabrielov", tester.getLastName());
    }

    @Test
    public void testUCInetID() {
        EugeniaGabrielov tester = new EugeniaGabrielov();

        // Test netID
        Assert.assertEquals("eugenig", tester.getUCInetID());
    }

    @Test
    public void testStudentNumber() {
        EugeniaGabrielov tester = new EugeniaGabrielov();

        // Test student id number
        Assert.assertEquals(35721871, tester.getStudentNumber());
    }

    /**
     * Tests for rotation
     *
     * I added three extra tests at the end to make sure 0-shift rotation works, and to
     * make sure shifts larger than the length of the name wrap properly too.
     */

    @Test
    public void testNameRotationPositive() {
        EugeniaGabrielov tester = new EugeniaGabrielov();

        // Positive numbers rotate to the left
        Assert.assertEquals("genia GabrielovEu", tester.getRotatedFullName(2));
    }

    @Test
    public void testNameRotationNegative() {
        EugeniaGabrielov tester = new EugeniaGabrielov();

        // Negative numbers rotate to the right
        Assert.assertEquals("GabrielovEugenia ", tester.getRotatedFullName(-9));
    }

    @Test
    public void testNameRotationNone() {
        EugeniaGabrielov tester = new EugeniaGabrielov();

        // 0 should not rotate at all
        Assert.assertEquals("Eugenia Gabrielov", tester.getRotatedFullName(0));
    }

    @Test
    public void testNameRotationLongPositive() {
        EugeniaGabrielov tester = new EugeniaGabrielov();

        // Out of bounds negative wrap should keep wrapping if shift is longer than name.
        Assert.assertEquals("genia GabrielovEu", tester.getRotatedFullName(36));
    }

    @Test
    public void testNameRotationLongNegative() {
        EugeniaGabrielov tester = new EugeniaGabrielov();

        // Out of bounds negative wrap should keep wrapping if shift is longer than name.
        Assert.assertEquals("genia GabrielovEu", tester.getRotatedFullName(-32));
    }
}
