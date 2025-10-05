public class UserInfoParser {
    public static void main(String[] args) {
        String userData = "USERID:Raja | FULLNAME:Rajashri Kalshetti | ROLE:User";

        // Extract Full Name
        int nameStart = userData.indexOf("FULLNAME:") + 9;
        int nameEnd = userData.indexOf("|", nameStart);
        String fullName = userData.substring(nameStart, nameEnd).trim();

        // Extract Role
        int roleStart = userData.indexOf("ROLE:") + 5;
        String role = userData.substring(roleStart).trim().toLowerCase();

        // Print Results
        System.out.println("Full Name: " + fullName);
        System.out.println("Role: " + role);
    }
}
