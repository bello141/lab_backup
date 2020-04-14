package kr.ac.univ.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LabApplication {

   public static void main(String[] args) {
      System.out.println("Test2");
      SpringApplication.run(LabApplication.class, args);
      
   }

   @GetMapping("/")
   public String Home() {
      System.out.println("Test");
   
        return "Hello World";
    }

}