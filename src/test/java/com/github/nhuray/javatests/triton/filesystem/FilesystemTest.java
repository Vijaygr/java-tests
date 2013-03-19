package com.github.nhuray.javatests.triton.filesystem;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.FileSystem;

public class FilesystemTest {

    @Test
    public void freeSpace() throws Exception {
        // Given a directory on the filesystem
        File filesystem = new File(System.getProperty("java.io.tmpdir"));

        // When I try to determine the free space
        long freeSpace = filesystem.getFreeSpace();

        // Then the free space is printed
        System.out.println("freeSpace = " + freeSpace);

    }
}
