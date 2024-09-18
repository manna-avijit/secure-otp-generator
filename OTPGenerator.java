import java.util.Random;

public class OTPGenerator {

    // Function to generate OTP of specified length
    static String generateOTP(int length) {
        System.out.println("Generating OTP using Random class...");
        
        // Set of digits to be used for OTP
        String digits = "0123456789";
        
        // Random object to generate random indices
        Random random = new Random();
        
        // StringBuilder to construct the OTP
        StringBuilder otp = new StringBuilder(length);
        
        // Generate OTP by randomly selecting digits
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(digits.length());
            otp.append(digits.charAt(index));
        }
        
        // Return the OTP as a string
        return otp.toString();
    }

    public static void main(String[] args) {
        int otpLength = 6; // You can change the OTP length here
        String otp = generateOTP(otpLength);
        System.out.println("Your OTP is: " + otp);
    }
}