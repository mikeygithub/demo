package java.throwable;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/3/20 12:29 AM
 * @Version 1.0
 * @Description:异常类
 *
 *
 *                                   -StackOverFlowError
 *                 -VitulMachineError-
 *                 -                 -OutOfMemoryError(OOM)
 *          -Error -
 *          -      -AWTERROR
 * Throwable-                     -EofException
 *          -         -IOException-
 *          -         -           -FileNotFoundException
 *          -Exception-
 *                    -                -ArithmeticException
 *                    -                -MissingResourceException
 *                    -                -ClassNotFoundException
 *                    -RuntimeException-NullPointerException
 *                    -                -IllegalArgumentException
 *                    -                -ArrayIndexOutOfBoundsException
 *                    -                -UnknownTypeException
 *
 *
 *
 **/

public class Main {

    public static void demo(String[] args) {

//        new Throwable();

//        new UnknownTypeException();
    }

    public static void main(String[] args) {

        try{
            System.out.println("in try");
            return;
        }catch (Exception e){
            System.out.println("exception");
        }finally {
            System.out.println("final");
        }
    }

}
