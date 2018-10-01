package net.proselyte.javacore.practice.multithreading;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProcessing implements Runnable{
    private File file;

    public FileProcessing(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        System.out.println("'" + file.getName() + "'" +
                " has extention: " + getExtension(file)
                +" and " + " size: " + file.length() + " bytes");
        }


    private String getExtension(File file) {
        String extension = "";

        try {
            if (file != null && file.exists()) {
                String name = file.getName();
                extension = name.substring(name.lastIndexOf("."));
            }
        } catch (Exception e) {
            extension = "";
        }
        return extension;
    }
}
//==============================================================================
class FileThread{
    File folder = new File("testDirectory");
    File[] listOfFiles = folder.listFiles();

    private void fileHandler(){
        ExecutorService executor = Executors.newFixedThreadPool(4);
        for(File file : listOfFiles){
            executor.submit(new FileProcessing(file));
        }
        executor.shutdown();
    }
    public void start(){
        fileHandler();
    }
}

