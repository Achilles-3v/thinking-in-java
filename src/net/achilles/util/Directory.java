package net.achilles.util;

import java.util.regex.*;
import java.io.*;
import java.util.*;

public final class Directory {
    public static File[]
    local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            public boolean accept(File dir, String name) {
                return pattern.matcher(
                        new File(name).getName()).matches();
            }
        });
    }
    public static File[]
    local(String path, final String regex) { // Overloaded
        return local(new File(path), regex);
    }
}
