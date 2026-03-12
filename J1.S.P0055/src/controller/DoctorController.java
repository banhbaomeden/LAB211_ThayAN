package controller;

import dto.DoctorDTO;
import dto.ResponseDTO;
import java.util.HashMap;
import repository.DoctorRepository;
import view.DoctorView;

public class DoctorController {

    private DoctorRepository repository = new DoctorRepository();
    private DoctorView view = new DoctorView();

    // Add doctor
    public void addDoctor(DoctorDTO dto) {

        boolean result = repository.addDoctor(dto);

        if (result) {
            view.printMessage(constant.Message.ADD_SUCCESS);
        } else {
            view.printMessage(constant.Message.CODE_EXIST);
        }
    }

    // Update doctor
    public void updateDoctor(DoctorDTO dto) {

        boolean result = repository.updateDoctor(dto);

        if (result) {
            view.printMessage(constant.Message.UPDATE_SUCCESS);
        } else {
            view.printMessage(constant.Message.CODE_NOT_EXIST);
        }
    }

    // Delete doctor
    public void deleteDoctor(String code) {

        boolean result = repository.deleteDoctor(code);

        if (result) {
            view.printMessage(constant.Message.DELETE_SUCCESS);
        } else {
            view.printMessage(constant.Message.CODE_NOT_EXIST);
        }
    }

    // Search doctor
    public void searchDoctor(String text) {

        HashMap<String, ResponseDTO> result = repository.searchDoctor(text);

        if (result.isEmpty()) {
            view.printMessage(constant.Message.NO_DOCTOR_FOUND);
        } else {
            view.displaySearch(result);
        }
    }

    // Check duplicate code
    public boolean isCodeExist(String code) {
        return repository.isCodeExist(code);
    }
}