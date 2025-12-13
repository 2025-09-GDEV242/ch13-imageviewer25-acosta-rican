import java.awt.Color;
/**
 * This filter shows a grayscale of an image based on its green RGB components.
 *
 * @author Franco Acosta
 * @version 12/13/2025
 */
public class GreenChannelFilter extends Filter
{
    /**
     * CONSTRUCTOR for GreenChannelFilter class.
     */
    public GreenChannelFilter(String name)
    {
        super(name);
    }

    /**
     * This method converts the pixel's into a green-based grayscale.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                int gray = pix.getGreen();
                image.setPixel(x, y, new Color(gray, gray, gray));
            }
        }
    }
}