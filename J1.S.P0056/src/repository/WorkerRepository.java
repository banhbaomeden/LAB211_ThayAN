package repository;

import dto.WorkerDTO;
import java.util.*;
import model.Worker;

public class WorkerRepository {

    private Map<String, Worker> workers = new HashMap<>();

    public boolean isCodeExist(String code) {
        return workers.containsKey(code);
    }

    public boolean addWorker(WorkerDTO dto) {

        if (isCodeExist(dto.getId())) {
            return false;
        }

        Worker worker = new Worker(
                dto.getId(),
                dto.getName(),
                dto.getAge(),
                dto.getSalary(),
                dto.getWorkLocation()
        );

        workers.put(worker.getId(), worker);
        return true;
    }

    public Worker getWorker(String code) {
        return workers.get(code);
    }

    public Map<String, Worker> getAll() {
        return workers;
    }
}