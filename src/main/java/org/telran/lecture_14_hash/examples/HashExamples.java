package org.telran.lecture_14_hash.examples;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class HashExamples {

    public static int hashKeyMode(String key, int tableSize) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash += key.charAt(i);
        }
        return hash % tableSize;
    }

    public static int multiplicationHash(String key, int tableSize) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash += key.charAt(i);
        }
        double A = 0.6180339887; // Константа (золотое сечение)
        double fractionalPart = (hash * A) % 1;
        return (int) Math.floor(fractionalPart * tableSize);
    }

    public static String sha256Hash(String data) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedHash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
        return bytesToHex(encodedHash);
    }

    public static String sha1Hash(String data) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-1");
        byte[] encodedHash = digest.digest(data.getBytes(StandardCharsets.UTF_8));
        return bytesToHex(encodedHash);
    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String myData = "Hello, world!";
        String hashedData1 = sha1Hash(myData);
        String hashedData256 = sha256Hash(myData);
        System.out.println("hashedData1 =      " + hashedData1);
        System.out.println("hashedData256 =    " + hashedData256);

        String[] keys = {"Hello", "Hell", "hell", "help", "Hi", "Alex", "Ivan", "John", "Kapibara", "My name is", "Abu", "key", "22"};
        int tableSize = 100;

        for (String key : keys) {
            System.out.println("hash_key_mode(\"" + key + "\", " + tableSize + ") = " + hashKeyMode(key, tableSize));
        }
        System.out.println("-------------------------------------");
        for (String key : keys) {
            System.out.println("multiplicationHash(\"" + key + "\", " + tableSize + ") = " + multiplicationHash(key, tableSize));
        }
    }
}
