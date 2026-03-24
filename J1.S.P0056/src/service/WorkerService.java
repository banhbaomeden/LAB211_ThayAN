package service;

import constants.SalaryStatus;
import dto.ResponseDTO;
import dto.WorkerDTO;
import java.util.*;
import model.SalaryHistory;
import model.Worker;
import repository.WorkerRepository;

public class WorkerService {

    private WorkerRepository repository = new WorkerRepository();

    // ===== CHANGE SALARY =====
    public int changeSalary(String code, int amount, SalaryStatus status) {

        Worker worker = repository.getWorker(code);

        if (worker == null) {
            return 0;
        }

        int oldSalary = worker.getSalary();

        int newSalary = calculateSalary(oldSalary, status, amount);
        
        if (newSalary < 0) {
            return -1;
        }

        worker.getHistorySalary().add(
                new SalaryHistory(oldSalary, status, new Date())
        );

        worker.setSalary(newSalary);

        return 1;
    }

    // ===== CALCULATE =====
    public int calculateSalary(int currentSalary,
            SalaryStatus status, int amount) {

        if (status == SalaryStatus.UP) {
            return currentSalary + amount;
        } else {
            return currentSalary - amount;
        }
    }

    // ===== BUILD RESPONSE =====
    public List<ResponseDTO> getHistory() {

        List<ResponseDTO> list = new ArrayList<>();

        for (Worker w : repository.getAll().values()) {

            for (SalaryHistory h : w.getHistorySalary()) {

                list.add(new ResponseDTO(
                        w.getId(),
                        w.getName(),
                        w.getAge(),
                        h.getSalary(),
                        h.getStatus(),
                        h.getDate()
                ));
            }
        }

        list.sort(Comparator.comparing(ResponseDTO::getCode));

        return list;
    }

    public boolean addWorker(WorkerDTO dto) {
        return repository.addWorker(dto);
    }

    public boolean isCodeExist(String code) {
        return repository.isCodeExist(code);
    }
}