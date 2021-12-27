public class index {

    public static void main(String[] args)
    {

        String originalString = "My name is George";


        String encryptedString
                = AES.encrypt(originalString);


        String decryptedString
                = AES.decrypt(encryptedString);


        System.out.println(originalString);
        System.out.println("");
        System.out.println("crypto: " + encryptedString);
        System.out.println("");
        System.out.println(decryptedString);
    }
}

