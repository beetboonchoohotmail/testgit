import java.security.SecureRandom;

public class HotspotKeyGenerator {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int KEY_LENGTH = 20; // ความยาว password

    public static String generateKey() {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(KEY_LENGTH);

        for (int i = 0; i < KEY_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
           for (int i = 1; i <= 2; i++) { // สร้าง 10 user ตัวอย่าง
            String username = "user" + i;
            String password = generateKey();
            System.out.println(username + "," + password);
            // สามารถ save ลง DB หรือ CSV ได้เลย
        }
    }
}
