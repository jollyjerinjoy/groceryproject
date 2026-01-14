package utilities;

import com.github.javafaker.Faker;

public class FakerUtility {
	Faker faker = new Faker();

	public String creatARandomUserName(String ruser) {

		return faker.name().username();

	}

	public String creatARandomFirstName() {

		return faker.name().firstName();

	}

	public String creatARandomLastName() {

		return faker.name().lastName();

	}

	public String generateAddress() {

		return faker.address().fullAddress();

	}

	public String generateEmail() {

		return faker.internet().emailAddress();

	}
}
//Generates random fake test data:
//    Names, Emails, Phone numbers
//    Useful for avoiding duplicate data issues.
