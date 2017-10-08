/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steg;

import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.*;


/**
 *
 * @author dell
 */
public class Crypto {
    
    private static final String _ALGO = "AES";
   
    
    public static String encrypt(String Data, String pass){
        String encVALUE=null;
        try{
            Key key = generateKey(pass);
            Cipher c = Cipher.getInstance(_ALGO);
            c.init(Cipher.ENCRYPT_MODE, key);
            byte[] encVal = c.doFinal(Data.getBytes());
            encVALUE = new BASE64Encoder().encode(encVal);
        }catch(Exception e){
            e.printStackTrace();
        }
        return encVALUE;
    }
    
    
    public static String decrypt(String encryptedData, String pass){
        String decVALUE=null;
        try{
            Key key = generateKey(pass);
            Cipher c = Cipher.getInstance(_ALGO);
            c.init(Cipher.DECRYPT_MODE, key);
            byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
            byte[] decValue = c.doFinal(decordedValue);
            decVALUE = new String(decValue);
        }catch(Exception e){
            e.printStackTrace();
        }
        return decVALUE;
    }
    
    
    
    private static Key generateKey(String pass) throws Exception{
        byte[] bt = pass.getBytes("UTF-8");
        
        byte[] fbt = Arrays.copyOf(bt, 16);
        
        Key key = new SecretKeySpec(fbt,_ALGO);
        return key;
    }
    
}
