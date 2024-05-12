package designPattern.Adapter;

/**
 *
 * @author ddilipk
 */
public class PenAdapter implements Pen{
    PilotPen pp = new PilotPen(); //geting independent pilot pen and trying to write which pen does
    @Override
    public void write(String s) {
        pp.mark(s);
    }
    
}
