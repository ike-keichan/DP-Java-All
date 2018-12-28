//10・11-9
import java.io.*;
import java.util.zip.GZIPOutputStream;
public class GZip {
    void run(String[] args) throws IOException {
        File file = new File(args[0]);
        for (Integer i = 0; i < args.length; i++) {
            String filename = String.valueOf(file);
            Double beforesize = Double.valueOf(file.length());
            File zipfile = compress(new File(args[i]));
            Double aftersize = Double.valueOf(zipfile.length());
            Double rate = (aftersize / beforesize) * 100;
            System.out.println(filename + ":" + beforesize + "bytes ->" + aftersize + "bytes (" + rate + "%)");
        }
    }

    File compress(File file) throws IOException {
        String z = file.getPath() + ".gz";
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        GZIPOutputStream out = new GZIPOutputStream(new FileOutputStream(z));
        in.close();
        out.close();
        return new File(z);
    }

    public static void main(String[] args) throws IOException {
        GZip zip = new GZip();
        zip.run(args);
    }
}

