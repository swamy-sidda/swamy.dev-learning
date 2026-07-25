package designpatterns.composite;

import java.util.ArrayList;

public class CompositeDriver {
     static void main(String[] args) {
         Folder folder=new Folder("-->java");
         File f1=new File("singleton");
         folder.addFile(f1);
         f1=new File("prototype");
         folder.addFile(f1);
         f1=new File("factory");
         folder.addFile(f1);
         Folder f2=new Folder("-->jdbc");
         f1=new File("statement ");
         f2.addFile(f1);
         f1=new File("prepared statement");
         f2.addFile(f1);

         Folder f3=new Folder("-->c drive<--");
         f3.addFile(folder);
         f3.addFile(f2);
         f3.showDetails();
     }
}
interface FileSystem{
    void showDetails();
}
class File implements FileSystem{
    private String name;
    public File(String name) {
        this.name = name;
    }
    @Override
    public void showDetails() {
        System.out.println(name );
    }
}
class Folder  implements FileSystem{
    private String name;
    private ArrayList<FileSystem> list=new ArrayList<>();
    public Folder(String name) {
        this.name = name;
    }
    public void addFile(FileSystem file){
        list.add(file);
    }
    @Override
    public void showDetails() {
        System.out.println(name );
        for(FileSystem file:list){
            file.showDetails();
        }
    }

}
