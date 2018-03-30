package comp1110.mse;

/**
 * COMP1110 Mid-Semester Exam, Question 4
 */
public class Q4Cypher {

    /**
     * Constructor for a cypher instance
     *
     * @param key The key used by the cypher
     */
    int key;

    Q4Cypher(int key) {
        this.key = key;
        // FIXME Question 4b: complete this constructor
    }

    /**
     * Determine whether the input string is well-formed according to the following rules:
     * - it must not be null
     * - it must not be empty
     * - it must only contain the characters in the character range ' ' to 'Z' (values 32 to 90 inclusive).
     * - it must not start or end with a space
     *
     * @param input The string to be checked
     * @return True if the input string is well-formed
     */
    static boolean isWellFormed(String input) {
        if (input == null || input.equals(""))
            return false;
        for (int i = 0; i < input.length(); i++)
            if ((int) input.charAt(i) > 90 || (int) input.charAt(i) < 32)
                return false;
        if (input.charAt(0) == ' ' || input.charAt(input.length() - 1) == ' ')
            return false;
        return true; // FIXME Question 4a: complete this function
    }

    /**
     * Encode the input string using a simple rotation cypher.
     * <p>
     * For a character c at position i in the string, it is shifted i + key places
     * in the sequence of 59 characters ' ' ... 'Z', where a shift beyond 'Z'
     * wraps around to the start of the sequence.
     * <p>
     * For example, if key was 2, the string "CAT" becomes "EDW", with the character
     * 'C' rotated 2, 'A' rotated 3, and 'T' rotated 4.   The string "YOU" becomes
     * " RY", with 'Y' rotated 2 (wrapping around to ' '), 'R' rotated 3, and 'W'
     * rotated 4.
     * @param input THe string to be encoded
     * @return An encoded string
     */
    //Code from tutor
    String encode(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            int shift = (((int) input.charAt(i)) + key + i - (int) ' ') % 59;
            output += (char) ((int) ' ' + shift);
        }
        // FIXME Question 4c: complete this function
        return output;
    }

    /*
      ASCII Character codes (for information)

      32  SPACE     64  @
      33  !         65  A
      34  "         66  B
      35  #         67  C
      36  $         68  D
      37  %         69  E
      38  &         70  F
      39  '         71  G
      40  (         72  H
      41  )         73  I
      42  *         74  J
      43  +         75  K
      44  ,         76  L
      45  -         77  M
      46  .         78  N
      47  /         79  O
      48  0         80  P
      49  1         81  Q
      50  2         82  R
      51  3         83  S
      52  4         84  T
      53  5         85  U
      54  6         86  V
      55  7         87  W
      56  8         88  X
      57  9         89  Y
      58  :         90  Z
      59  ;
      60  <
      61  =
      62  >
      63  ?
     */
}
