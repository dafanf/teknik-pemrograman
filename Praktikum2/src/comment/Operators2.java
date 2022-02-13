package comment;

/**
 * @author  DAFA N.F
 * @version 1.0
 * @since   2022-02-13
 */
public class Operators2 {
    static short methodOne(long l){
        int i = (int) l;
        return (short)l;
    }
    public static void main(String[] args){
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}
