public class Phone_Dial {
    // GOOGLE
    public static void main(String [] args) {
        phonedialcombo("", "12");

    }

    static void phonedialcombo(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        // Converts character to numbers here. Characters are converted into ASCII and then subtracted by 0 
        // This will convert '2' into 2
        for(int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            phonedialcombo(p + ch, up.substring(1));

        }
    }
}