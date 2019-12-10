package mFinanceLoanManagement;

import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PaymentConfirmation {

    private final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private final String NUMBERS = "0123456789";
    private final String DATA_FOR_RANDOM_CONFIRMATION_NUMBER = CHAR_LOWER + CHAR_UPPER + NUMBERS;
    private SecureRandom randomObject = new SecureRandom();
    private String confirmationNumber;
    private String transactionDate;

    /**
     * Constructor generates a random confirmation number every time during instantiation
     * it also gets the date of transaction
     */
    public PaymentConfirmation() {
        confirmationNumber = generateRandomConfirmationNumber(10);
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        transactionDate = dateFormat.format(new Date());
    }

    /**
     * generates a random confirmation number
     * @param length
     * @return String
     */
    private String generateRandomConfirmationNumber(int length) {
        if (length < 1) throw new IllegalArgumentException();

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {

            // 0-62 (exclusive), random returns 0-61
            int rndCharAt = randomObject.nextInt(DATA_FOR_RANDOM_CONFIRMATION_NUMBER.length());
            char rndChar = DATA_FOR_RANDOM_CONFIRMATION_NUMBER.charAt(rndCharAt);
            sb.append(rndChar);
        }
        return sb.toString();
    }

    /**
     * gets the confirmationNumber attribute
     * @return String
     */
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * sets the ConfirmationNumber attribute
     * @param confirmationNumber
     */
    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    /**
     * gets the transactionDate attribute
     * @return String
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * sets the transactionDate attribute
     * @param transactionDate
     */
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
}
