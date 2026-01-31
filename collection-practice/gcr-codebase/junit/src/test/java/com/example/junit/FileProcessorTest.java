package com.example.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class FileProcessorTest {

    FileProcessor processor = new FileProcessor();
    String filename = "testfile.txt";
    String content = "JUnit File Testing";

    @AfterEach
    void cleanup() {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
        }
    }

    @Test
    void testWriteAndReadFile() throws IOException {
        processor.writeToFile(filename, content);
        String result = processor.readFromFile(filename);
        assertEquals(content, result);
    }

    @Test
    void testFileExistsAfterWrite() throws IOException {
        processor.writeToFile(filename, content);
        File file = new File(filename);
        assertTrue(file.exists());
    }

    @Test
    void testReadNonExistingFile() {
        assertThrows(IOException.class, () -> {
            processor.readFromFile("nofile.txt");
        });
    }
}
