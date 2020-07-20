
package com.aeteams ;



import com.spire.barcode.BarCodeGenerator ;
import com.spire.barcode.BarcodeSettings ;
import com.spire.barcode.BarCodeType ;
import java.awt.image.BufferedImage ;
import javax.imageio.ImageIO ;
import java.io.File ;
import java.io.IOException ;





public class QRLCodeGeneration {





    public static void main (String [] args) throws IOException {







        // QRCODE SETTINGS ...


        BarcodeSettings barcodeSettings = new BarcodeSettings() ;




        barcodeSettings.setType(BarCodeType.QR_Code);
        barcodeSettings.setData("stackoverflow.com");
        barcodeSettings.setData2D("stackoverflow.com");
        barcodeSettings.setImageWidth(2000);
        barcodeSettings.setImageHeight(2000);







        // QRCODE GENERATOR ...



        BarCodeGenerator barCodeGenerator = new BarCodeGenerator(barcodeSettings) ;








        // QRCODE IMAGE ...



        BufferedImage bufferedImage = barCodeGenerator.generateImage() ;







        // GENERATION REQUEST ...



        ImageIO.write(bufferedImage , "png" , new File("ChangeName.png")) ;








        // SUCCESSFUL GENERATION MESSAGE ...



        System.out.println("\n \n Generation Completed Successfully ...");











    }



}