package DefShrimp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class Base64Code {
    public static String getBase64Imagine(String imgPath){
        byte[] data = null;
        Base64.Encoder encoder = Base64.getEncoder();

        try (var inputStream = new FileInputStream(imgPath)){
            data = new byte[inputStream.available()];
            inputStream.read(data);

        } catch (IOException e) {
            e.printStackTrace();

        }

        return encoder.encodeToString(data);

    }
}
