package main;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class B extends A{
	@Override
	public void ma() throws ClassNotFoundException  {
		
	}
	public static void main1(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(new File("E://ss.jpg"));
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        
        try {
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                //Writes to this byte array output stream
                bos.write(buf, 0, readNum); 
               // System.out.println("read " + readNum + " bytes,");
            }
        } catch (IOException ex) {
           // Logger.getLogger(ConvertImage.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        byte[] bytes = bos.toByteArray();
        for(int i=0;i<bytes.length;i++){
        	if(i>1000 && i< 1500){
        		bytes[i]=-127;
        	}
        }
        
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator<?> readers = ImageIO.getImageReadersByFormatName("jpg");
 
        //ImageIO is a class containing static methods for locating ImageReaders
        //and ImageWriters, and performing simple encoding and decoding. 
 
        ImageReader reader = (ImageReader) readers.next();
        Object source = bis; 
        ImageInputStream iis = ImageIO.createImageInputStream(source); 
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
 
        Image image = reader.read(0, param);
        //got an image file
 
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
        //bufferedImage is the RenderedImage to be written
 
        Graphics2D g2 = bufferedImage.createGraphics();
        g2.drawImage(image, null, null);
 
        File imageFile = new File("E:\\newrose221.jpg");
        ImageIO.write(bufferedImage, "jpg", imageFile);
 
        System.out.println(imageFile.getPath());
	}

}
