package app;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

class Test {
    public static void main(String[] args) throws IOException {
        File applicationFolder = new File("/opt/sisense/storage/tenants/6423ac0942a3a2001b21044e/farms/123");
        FileUtils.deleteDirectory(applicationFolder);
    }
}
