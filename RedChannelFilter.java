import java.awt.Color;
/**
 * This filter shows a grayscale of an image based on its red RGB components.
 *
 * @author Franco Acosta
 * @version 12/13/2025
 */
public class RedChannelFilter extends Filter
{
    /**
     * CONSTRUCTOR for RedChannelFilter class.
     */
    public RedChannelFilter(String name)
    {
        super(name);
    }

    /**
     * This method converts the pixel's into a red-based grayscale.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                int gray = pix.getRed();
                image.setPixel(x, y, new Color(gray, gray, gray));
            }
        }
    }
}