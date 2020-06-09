package com.example.tengfei.day11_classloader;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author by tengfei on 2020/6/9.
 * @description：
 */
@SuppressWarnings("Duplicates")
public class DiskClassLoader extends ClassLoader {

    /**
     * class文件的路径
     */
    private String path;

    public DiskClassLoader(String path) {
        this.path = path;
    }


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String classPath = path + name + ".class";

        try (InputStream in = new FileInputStream(classPath)) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int i = 0;
            while ((i = in.read()) != -1) {
                out.write(i);
            }
            byte[] byteArray = out.toByteArray();

            return defineClass(null,byteArray, 0, byteArray.length);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }


}
