package com.aca.week9.Class16.task3;

import java.io.File;

import static java.lang.String.format;

public class FileDownloadRunnable implements FileOperationRunnable {
    private final File file;
    private final String url;

    public FileDownloadRunnable(File file, String url) {
        this.file = file;
        this.url = url;
    }

    @Override
    public void run() {
        System.out.println(
                format("Starting the upload of File - %s to %s",
                        file.getAbsoluteFile(),
                        url)
        );
        AppUtils.sleep(1);
        System.out.println(
                format("Successfully uploaded the File - %s to %s",
                        file.getAbsoluteFile(),
                        url)
        );
    }
}
