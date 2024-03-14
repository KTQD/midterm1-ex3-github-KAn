import java.io.*;

public class Main {
    public static void main(String[] args) {


//        Bài làm viết tại đây
        String inputFile="input.txt";
        String outputFile="output.txt";
        try {
            BufferedReader reader=new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer=new BufferedWriter(new FileWriter(outputFile));
            String line;
            while ((line=reader.readLine())!=null){
                line=line.replaceAll("Nha Trang","Vũng Tàu");
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Thanh thế thành công và đã in ra "+outputFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
