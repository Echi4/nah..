import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;


public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException, IllegalBlockSizeException, InvalidKeyException,
            BadPaddingException, InvalidAlgorithmParameterException, NoSuchPaddingException {

        //you can try editing the text in here
        String input = "edwin";
        SecretKey key = Util.generateKey(128);
        IvParameterSpec ivParameterSpec = Util.generateIv();
        String algorithm = "AES/CBC/PKCS5Padding";
        String cipherText = Util.encrypt(algorithm, input, key, ivParameterSpec);
        String plainText = Util.decrypt(algorithm, cipherText, key, ivParameterSpec);

        //Console output to show the results
        System.out.println(Boolean.parseBoolean(Util.check(input, plainText).toString()));
        System.out.println(plainText);
    }


}
