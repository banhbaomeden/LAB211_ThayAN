package controller;

import constants.SalaryStatus;
import dto.ResponseDTO;
import dto.WorkerDTO;
import java.util.List;
import service.WorkerService;
import view.WorkerView;

public class WorkerController {

    private WorkerService service = new WorkerService();
    private WorkerView view = new WorkerView();

    public void addWorker(WorkerDTO dto) {

        boolean result = service.addWorker(dto);

        if (result) {
            view.displayMessage("Add worker successfully");
        } else {
            view.displayMessage("Worker already exists");
        }
    }

    public void changeSalary(String code, int amount, SalaryStatus status) {

        int result = service.changeSalary(code, amount, status);

        if (result == 0) {
            view.displayMessage("Worker not found");
        } else if (result == -1) {
            view.displayMessage("Salary cannot be negative");
        }
    }

    public void displaySalaryHistory() {

        List<ResponseDTO> list = service.getHistory();
        view.setList(list);
        view.displayHistory();
    }

    public boolean isCodeExist(String code) {
        return service.isCodeExist(code);
    }
}