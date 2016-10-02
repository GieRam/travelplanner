package com.travelplanner.utilities;

import org.mindrot.jbcrypt.BCrypt;

public class Password {

    private static int workload = 12;

    public static String hashPassword(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt(workload));
    }

    public static boolean checkPassword(String plainPassword, String hashPassword) {
        if (hashPassword == null || !hashPassword.startsWith("$2a$")) {
            throw new IllegalArgumentException("Invalid hash provided for comparison");
        }
        return BCrypt.checkpw(plainPassword, hashPassword);
    }


}
