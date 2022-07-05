package com.connerly.peopledbweb.data;

import com.connerly.peopledbweb.biz.model.Person;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

//@Component
public class PersonDataLoader implements ApplicationRunner {
    private PersonRepository personRepository;


    public PersonDataLoader (PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (personRepository.count() == 0) {
            List<Person> people = List.of(
                    new Person(null, "Caitlin", "Snake", LocalDate.of(1950, 1, 1), "dummy@sample.com", new BigDecimal("50000")),
                    new Person(null, "Sarah", "Connerly", LocalDate.of(1960, 2, 10), "dummy@sample.com", new BigDecimal("60000")),
                    new Person(null, "Johnny", "Jackson", LocalDate.of(1970, 3, 8), "dummy@sample.com", new BigDecimal("70000")),
                    new Person(null, "Bobby", "Kim", LocalDate.of(1980, 4, 21), "dummy@sample.com", new BigDecimal("80000")),
                    new Person(null, "Johnny", "Jackson", LocalDate.of(1970, 3, 8), "dummy@sample.com", new BigDecimal("70000")),
                    new Person(null, "Bobby", "Kim", LocalDate.of(1980, 4, 21), "dummy@sample.com", new BigDecimal("80000"))
            );
            personRepository.saveAll(people);
        }
    }
}
