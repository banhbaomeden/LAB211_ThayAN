package repository;

import dto.PersonDTO;
import dto.ResponseDTO;
import java.util.ArrayList;
import java.util.List;
import model.Person;

public class PersonRepository {

    private List<Person> personList = new ArrayList<>();

    public void addPerson(PersonDTO dto) {

        Person person = new Person(
                dto.getName(),
                dto.getAddress(),
                dto.getSalary()
        );

        personList.add(person);
    }

    public List<ResponseDTO> getAll() {

        List<ResponseDTO> responseList = new ArrayList<>();

        for (Person p : personList) {
            responseList.add(
                new ResponseDTO(
                    p.getName(),
                    p.getAddress(),
                    p.getSalary()
                )
            );
        }

        return responseList;
    }
}