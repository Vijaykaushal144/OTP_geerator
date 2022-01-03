import java.util.Random;

public class otp_Generator {
    static char[] otp(int len)
    {
        System.out.println("Generating OTP using random() :");
        System.out.println("Your OTP is : ");
        String numbers="0123456789";
        Random rnd_method=new Random();
        char[] otp=new char[len];
        for (int i=0;i<len;i++)
        {
            otp[i]=
            numbers.charAt(rnd_method.nextInt(numbers.length()));

        }
        return otp;
    }

    public static void main(String[] args) {
        int length=4;
        System.out.println(otp(length));
    }
}
