package levvel.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
//add EnableMongoAuditing for working dates (@CreatedDate and @LastModifiedDate)
@EnableMongoAuditing
public class WorkSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkSampleApplication.class, args);
	}

}
