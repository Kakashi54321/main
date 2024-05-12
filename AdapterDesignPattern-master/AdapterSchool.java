package designPattern.Adapter;

/**
 *
 * @author ddilipk
 */
public class AdapterSchool {
    public static void main(String[] args) {
        AssignmentWork aw = new AssignmentWork();
        Pen p = new PenAdapter(); // getting pen instance but from penAdapater which actaully return pen instance but from piloPpen help, so basically penAdapter converting independent piltoPen to needed pen
        aw.setP(p);
        aw.writeAssignment("I am bit tired of writing assignment");
    }
}
