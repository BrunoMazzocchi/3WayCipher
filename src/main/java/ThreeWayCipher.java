import org.jasypt.encryption.pbe.*;
import org.jasypt.encryption.pbe.config.SimplePBEConfig;
import java.nio.charset.*;
import java.util.*;

public class ThreeWayCipher {
    public static  void   main (String [] args) throws Exception {

        // Inicia o objeto de criptografia
        SimplePBEConfig config = new SimplePBEConfig();
        config.setAlgorithm("PBEWithMD5AndTripleDES");
        StandardPBEByteEncryptor encryptor = new StandardPBEByteEncryptor();
        encryptor.setConfig(config);

        // Definimos la clave
        String password = "Esta es la clave";
        encryptor.setPassword(password);


        // Encripta la data y la imprime
        byte[] data = "Hello World".getBytes();
        byte[] encryptedData  = encryptor.encrypt(data);
        String  encryptedDataString = Base64.getEncoder().encodeToString(encryptedData);
        System.out.println("Encrypted data: " + encryptedDataString);

        // Desencripta la data y la imprime
        byte[] decryptedData = encryptor.decrypt(encryptedData);
        String decryptedDataString = new String(decryptedData, StandardCharsets.UTF_8);
        System.out.println("Decrypted Data: " + decryptedDataString);

    }
}
