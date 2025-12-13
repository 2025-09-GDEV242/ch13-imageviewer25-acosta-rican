import java.awt.Color;
/**
 * This filter adds a red tint based on image RGB fields.
 *
 * @author Franco Acosta
 * @version 12/13/2025
 */


public class RedTintFilter extends Filter
{
    /**
     * CONSTRUCTOR for RedTintFilter class.
     */
    public RedTintFilter(String name)
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

                int red = Math.min(255, pix.getRed() + 50); //adds 50 to red value
                int green = pix.getGreen();
                int blue = pix.getBlue();

                image.setPixel(x, y, new Color(red, green, blue));
            }
        }
    }
}