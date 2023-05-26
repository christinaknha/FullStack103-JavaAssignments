package PracticingIOBasics;

import java.io.*;


public class IOBasics {
    public static void main(String[] args) {

////      Regular input stream
//        try (FileInputStream fis = new FileInputStream("src/PracticingIOBasics/randomtext.txt")){
//            int i;
//                while ((i = fis.read()) != -1){
//                    System.out.println((char) i);
//                }
//        } catch (IOException e){
//            e.printStackTrace();
//        }

////      Regular output stream
//        try(FileOutputStream fos = new FileOutputStream("src/PracticingIOBasics/newRandomtext.txt")){
//            String str = "Please work for me";
//            fos.write(str.getBytes());
//        }catch (IOException e){
//            e.printStackTrace();
//        }

//      Buffer input Stream
        try(BufferedInputStream bis  =  new BufferedInputStream(new FileInputStream("src/PracticingIOBasics/randomtext.txt"))){
            int data = bis.read();
            while(data != -1){
                System.out.println((char) data);
                data = bis.read();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

//      Buffered output stream
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("newRandomText.txt"))){
            String text = "Hello, world!";
            bos.write(text.getBytes());
            bos.flush();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
