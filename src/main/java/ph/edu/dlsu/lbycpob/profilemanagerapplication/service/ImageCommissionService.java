package ph.edu.dlsu.lbycpob.profilemanagerapplication.service;

import com.luciad.imageio.webp.WebPWriteParam;
import org.springframework.stereotype.Service;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.MemoryCacheImageOutputStream;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Resizes an uploaded avatar (max 224px on the long edge, aspect ratio
 * preserved, never upscaled) and encodes it to WebP -- the same
 * dimension/quality targets the original app's sharp-based pipeline used,
 * just done in pure Java via the webp-imageio ImageIO plugin instead of
 * sharp/libvips.
 */
@Service
public class ImageCompressionService {

    private static final int MAX_DIMENSION = 224;
    private static final float WEBP_QUALITY = 0.8f; // 0.0 - 1.0


}

