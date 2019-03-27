import java.security.SecureRandom;
import java.util.Random;

public class RandomGenerator {
  private static final String characters = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";

  public static String generateRandom(int length) {
    Random random = new SecureRandom();
    if (length <= 0) {
      throw new IllegalArgumentException("String length must be a positive integer");
    }

    StringBuilder sb = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
      sb.append(characters.charAt(random.nextInt(characters.length())));
    }

    return sb.toString();
  }
}
