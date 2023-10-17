package Java.Classes;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {

    public static void main(String[] args) {

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);

        }catch (FileNotFoundException exception){
            System.out.println("file tidak ketemu");
        }catch (IOException exception){
            System.out.println("Gagagl load data file");
        }

        try {
            Properties properties = new Properties();
            properties.put("name.buah", "anggur");
            properties.put("name kebun", "mekar sari");
            properties.store(new FileOutputStream("name.properties"), "konfigurasi");
        }catch (FileNotFoundException exception){
            System.out.println("tidak bisa membuat file properties");
        }catch (IOException exception){
            System.out.println("tidak bisa menyimpan properties");
        }


    }
}
