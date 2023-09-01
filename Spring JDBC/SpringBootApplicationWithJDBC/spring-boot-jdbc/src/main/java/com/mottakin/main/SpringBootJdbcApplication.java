package com.mottakin.main;

/*import com.mottakin.main.dao.BirthdayDao;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.AliasFor;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}
	/*@Autowired
	private BirthdayDao birthdayDao;
	@Override
	public void run(String... args) throws Exception {
		this.birthdayDao.createTable();
	}*/
}
