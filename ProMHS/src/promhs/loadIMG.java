package promhs;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
/**
 *
 * @author Ruben Maaf 20101249
 */
public class loadIMG {
     public static BufferedImage loadImage(String ref){
        BufferedImage bimg = null;
        try{
            bimg = ImageIO.read(new File(ref));
        }catch(Exception e){}
        return bimg;
    }
}
