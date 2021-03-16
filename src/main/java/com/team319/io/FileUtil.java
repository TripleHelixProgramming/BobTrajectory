package com.team319.io;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FileUtil {
    /**
     * Writes <code>String</code> data to a <code>File</code>.
     * 
     * @param filePath target directory <code>File</code> where <code>data</code> is saved
     * @param fileName name of file
     * @param data <code>String</code> data to be written to <code>filePath</code>
     */
    public static void write(File filePath, String fileName, String data) {
        if (filePath == null) {
            return;
        }
        try {
            File file = new File(filePath, fileName);
            System.out.println("Saving to file: " + file.getCanonicalPath());
            file.getParentFile().mkdirs();
            // if file doesn't exist, then create it
            if (!file.exists()) {
                if(!file.createNewFile()) {
                    System.out.println("Could not create output file " + file.getCanonicalPath());
                    return;
                }                
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
        } catch (Exception e) {
            System.out.println("Problem printing file: " + e);
        }
    }

    /**
     * Parses a CSV <code>File</code> to a <code>List</code>.
     * CSV Headers are included in the parsed <code>List</code>
     * 
     * @param file <code>File</code> to parse
     */
    public static List<List<String>> parseCSV(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<List<String>> list = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                list.add(Arrays.asList(values));
            }
            while (list.get(list.size() - 1).size() == 1 && list.get(list.size() - 1).get(0).trim().equals("")) {
                list.remove(list.size() - 1);
            }
            reader.close();
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
