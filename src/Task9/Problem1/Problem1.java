package Task9.Problem1;

public class Problem1 {
    public static void main(String[] args) {
        FileOperation f=new FileOperation();
        try{
//            f.createdFile();
//            f.fileRename("NewFile.txt");
//              f.countWords("NewFile.txt");
//            f.copyToBackup();
            f.deleteFiles();
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}

