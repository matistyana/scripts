import java.io.File;
import java.io.IOException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;

class Test {

    public static void convertAndPrintBytes() throws IOException {
        byte[] data = FileUtils.readFileToByteArray(new File("/Users/smohamma/Downloads/dummy.pdf"));
        String string = Base64.encodeBase64String(data);
        for (byte b : string.getBytes()) {
            System.out.print(b + ", ");
        }
    }

    public static void main(String[] args) throws IOException {
        convertAndPrintBytes();
    }
};
