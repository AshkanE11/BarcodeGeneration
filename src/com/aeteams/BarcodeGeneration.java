
package com.aeteams ;





import com.spire.barcode.BarCodeGenerator ;
import com.spire.barcode.BarcodeSettings ;
import com.spire.barcode.BarCodeType ;
import java.awt.*;
import java.awt.image.BufferedImage ;
import javax.imageio.ImageIO ;
import java.io.File ;
import java.io.IOException ;








public class BarcodeGeneration {






    public static void main(String[] args) throws IOException {






        // BARCODE SETTINGS ...


        BarcodeSettings barcodeSettings = new BarcodeSettings() ;




        barcodeSettings.setType(BarCodeType.EAN_128);
        barcodeSettings.setData("MyTextHere");
        barcodeSettings.setData2D("MyTextHere");
        barcodeSettings.setFontColor(Color.WHITE);
        barcodeSettings.setImageWidth(2000);
        barcodeSettings.setImageHeight(2000);
        barcodeSettings.hasBorder(false);
        barcodeSettings.setShowTextOnBottom(true);







        // BARCODE GENERATOR ...



        BarCodeGenerator barCodeGenerator = new BarCodeGenerator(barcodeSettings) ;








        // BARCODE IMAGE ...



        BufferedImage bufferedImage = barCodeGenerator.generateImage() ;







        // GENERATION REQUEST ...



        ImageIO.write(bufferedImage , "png" , new File("ChangeName.png")) ;








        // SUCCESSFUL GENERATION MESSAGE ...



        System.out.println("\n \n Generation Completed Successfully ...");









    }





}
