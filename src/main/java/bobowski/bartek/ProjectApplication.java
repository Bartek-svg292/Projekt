package bobowski.bartek;

import bobowski.bartek.service.ScannerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {


    private final ScannerService scannerService;

    public ProjectApplication(ScannerService scannerService) {
        this.scannerService = scannerService;
    }


    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        scannerService.run();

    }
}
