package Task9.Problem1;

import java.io.*;

public class FileOperation {
    File file = new File("javafileOperation.txt");
    File filenew;
    File wordCountFile = new File("wordcount.txt");
    File backupFile = new File("backup.txt");


    public void createdFile() throws IOException {
        if (file.createNewFile()) {
            System.out.println("File is created" + file.getName());
            writetofile("New File created");

        } else {
            System.out.println("File already exist");
            writetofile("File already exist");
        }
    }

    public void writetofile(String str)throws IOException{
        FileWriter Writer = new FileWriter(file);
        Writer.write(str);
        Writer.close();
    }

    public void fileRename(String name) throws IOException {
        filenew = new File(name);
        if (filenew.exists()) {
            throw new IOException("File already Exists");
        }
        boolean success = file.renameTo(filenew);
        if (success) {
            System.out.println("File Renamed successfully");
        }
    }


    public void countWords(String str) throws IOException{
        String path="C:\\Users\\Prajna Poojary\\IdeaProjects\\test\\NewFile.txt";
        FileReader file = new FileReader("NewFile.txt");
        BufferedReader br = new BufferedReader(file);

        int wordCount=0;
        String line;
        while((line= br.readLine())!=null){
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }

        wordCountFile.createNewFile();
        FileWriter fr = new FileWriter(wordCountFile);
        fr.write(Integer.toString(wordCount));
        fr.close();

    }
    public void copyToBackup() throws IOException{
        boolean success = backupFile.createNewFile();
        if(success) {
            String str;
            BufferedWriter br = new BufferedWriter(new FileWriter(backupFile));
            BufferedReader input1 = new BufferedReader(new FileReader("NewFile.txt"));
            while ((str = input1.readLine()) != null) {
                br.write(str);
                br.newLine();
            }
            BufferedReader input2 = new BufferedReader(new FileReader("wordcount.txt"));
            while ((str = input2.readLine()) != null) {
                br.write(str);
                br.newLine();
            }
            br.close();
        }
    }
    public void deleteFiles() {
        File file1 = new File("NewFile.txt");
        File file2 = new File("wordcount.txt");
        if (file1.delete() && file2.delete()) {
            System.out.println("Files deleted successfully");
        }
        else {
            System.out.println("Failed to delete the files");
        }
    }
}


