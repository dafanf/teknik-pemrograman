package comment;

/**
 * @author  DAFA N.F
 * @version 1.0
 * @since   2022-02-13
 */
public class Variables2 {
    public static final double CM_PER_INCH = 2.54;
    public static void main(String[] args){
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters : " + paperWidth * CM_PER_INCH +" by "+paperHeight*CM_PER_INCH);
    }
}
