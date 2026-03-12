package controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import dto.PersonDTO;
import dto.ResponseDTO;
import repository.PersonRepository;
import view.PersonView;

public class PersonController {

    private PersonRepository repository = new PersonRepository();
    private PersonView view = new PersonView();

    public void addPerson(PersonDTO dto) {

        repository.addPerson(dto);
    }

    public void displayAll() {

        List<ResponseDTO> list = repository.getAll();

        Collections.sort(list, Comparator.comparingDouble(ResponseDTO::getSalary));

        view.setList(list);        // ⭐ DÒNG QUAN TRỌNG
        view.displayPerson();      // Sau khi đã setList
    }
}
