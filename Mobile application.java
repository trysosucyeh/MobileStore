//MobileStoreApplication.java                                                                  package com.mobile.store;

    import com.mobile.store.model.Mobile;
    import com.mobile.store.repository.MobileRepository;
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.context.annotation.Bean;
    import org.springframework.web.bind.annotation.CrossOrigin;

    @SpringBootApplication
    @CrossOrigin(origins = "http://localhost:4200") // Enable CORS for Angular frontend
    public class MobileStoreBackendApplication {

        public static void main(String[] args) {
            SpringApplication.run(MobileStoreBackendApplication.class, args);
        }

        @Bean
        public CommandLineRunner loadData(MobileRepository repository) {
            return args -> {
                if (repository.count() == 0) {
                    // Ensure your Mobile constructor includes the image URL
                    repository.save(new Mobile("Samsung", "GalaxyS23", 69999.99,"http://localhost:8080/images/galaxy-s23.jpeg"));
                    repository.save(new Mobile("Apple", "iPhone14", 79999.99, "http://localhost:8080/images/iphone14.jpeg"));
                   // repository.save(new Mobile("OnePlus", "NordCE3", 24999.99, "assets/images/nordce3.jpeg"));
                    repository.save(new Mobile("OnePlus", "Nord3", 24999.99, "http://localhost:8080/images/nord3.jpeg"));
                    repository.save(new Mobile("Pixel", "Pixel7", 54999.99, "http://localhost:8080/images/pixel7.jpeg"));
                }
            };
        }
        }
