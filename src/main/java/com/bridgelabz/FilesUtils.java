package com.bridgelabz;

import java.io.File;

public class FilesUtils {
    public static boolean deleteFiles(File contentToDelete) {
        File[] allData = contentToDelete.listFiles();
        if (allData != null)
        {
            for (File file : allData)
            {
                deleteFiles(file);
            }
        }
        return contentToDelete.delete();
    }
}