import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class WebCamTest {
    public static void main(String[] args) throws IOException {
        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(WebcamResolution.VGA.getSize());
        webcam.open();
        ImageIO.write(webcam.getImage(),"JPG",new File("Sadik.jpg"));
        webcam.close();

        for (Dimension supportedSize: webcam.getViewSizes()){
            System.out.println(supportedSize.toString());
        }


    }
}
