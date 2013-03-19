package com.github.nhuray.javatests.triton.filesystem;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class FileSystemTest {

    @Test
    public void freeSpace() throws Exception {
        // Given a directory on the filesystem
        String path = System.getProperty("java.io.tmpdir");

        // When we look for free space 2 times
        long size = FileSystem.freeSpace();
        long size2 = FileSystem.freeSpace();


        // Then the size is the same (idempotent)
        Assert.assertThat(size2, equalTo(size));
        System.out.println("FreeSpace in MB : " + (size / 1024 / 1024 ));
    }
}
