import java.awt.Color;
/**
 * This filter adds a red tint based on image RGB fields.
 *
 * @author Franco Acosta
 * @version 12/13/2025
 */


public class BlueTintFilter extends Filter
{
    /**
     * CONSTRUCTOR for BlueTintFilter class.
     */
    public BlueTintFilter(String name)
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

                int blue = Math.min(255, pix.getBlue() + 50); //adds 50 to blue value
                int green = pix.getGreen();
                int red = pix.getRed();

                image.setPixel(x, y, new Color(red, green, blue));
            }
        }
    }
}