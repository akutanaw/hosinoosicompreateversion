package hoge5;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
public class ReadImageComponent extends Component {
    Image bufferedImage = null;
    ReadImageComponent() throws IOException {
        String imageFilename = "C:/hoge/hoge5/app/src/main/java/hoge5/tamago.png";
            bufferedImage = ImageIO.read(new File(imageFilename));
    }
    @Override
    public void paint(Graphics graphics) {
        graphics.drawImage(bufferedImage, 0, 0, null);
    }
    @Override
    public Dimension getPreferredSize() {
        int width = 100;
        int height = 100;
        if (bufferedImage != null) {
            width = bufferedImage.getWidth(null);
            height = bufferedImage.getHeight(null);
        }
        return new Dimension(width, height);
    }
}
