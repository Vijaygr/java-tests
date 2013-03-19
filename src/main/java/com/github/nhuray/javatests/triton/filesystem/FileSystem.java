package com.github.nhuray.javatests.triton.filesystem;

import com.google.common.base.Preconditions;

import java.io.File;

/**
 * Unit testing
 * <p>
 * Write a class that determines the free space on a file system. The class should be unit testable and have idempotent behaviour when run on a
 * build server.
 * </p>
 *
 * Note: We can use FileSystemUtils from commons-io for the same thing !!!
 */
public class FileSystem {

    public static long freeSpace(String path) {
        Preconditions.checkArgument(path != null, "Path must not be empty");
        File filesystem = new File(path);
        return filesystem.getFreeSpace();
    }

    public static long freeSpace() {
        return freeSpace(new File(".").getAbsolutePath());
    }
}
