import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		Webcam webcam = Webcam.getDefault();
                webcam.setViewSize(WebcamResolution.VGA.getSize());
                webcam.open();
                for(int i=0;i<10;i++){
                    String path = i+".Sadik.jpg";
                    ImageIO.write(webcam.getImage(),"JPG",new File(path));
                    
                }
                webcam.close();
	}
}