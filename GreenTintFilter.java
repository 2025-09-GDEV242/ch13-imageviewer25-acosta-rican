import java.awt.Color;
/**
 * This filter adds a red tint based on RGB fields.
 *
 * @author Franco Acosta
 * @version 12/13/2025
 */


public class GreenTintFilter extends Filter
{
    /**
     * CONSTRUCTOR for GreenTintFilter class.
     */
    public GreenTintFilter(String name)
    {
        super(name);
    }

    /**
     * This method adds a red tint to the image's RGB fields.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {

                Color pix = image.getPixel(x, y);

                int green = Math.min(255, pix.getGreen() + 50); //adds 50 to green value
                int red = pix.getRed();
                int blue = pix.getBlue();

                image.setPixel(x, y, new Color(red, green, blue));
            }
        }
    }
}