package pl.wsiiz.patientservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.wsiiz.patientservice.dto.Patient;
import pl.wsiiz.patientservice.entity.PatientEntity;
import pl.wsiiz.patientservice.service.PatientService;

import java.util.List;

@Controller
@RequestMapping(value="/patient")
public class PatientController extends PatientService {
    @Autowired
    private PatientService patientService;

    @GetMapping(path="/name")
    @ResponseBody
    public String name() {
        return "Witamy w naszym systemie";
    }

    @GetMapping(path="/age")
    @ResponseBody
    public String age(@RequestParam(required = true) int yearNow, @RequestParam int yearBirth) {
        return Integer.toString(yearNow-yearBirth);
    }

    @GetMapping(path="/names")
    @ResponseBody
    public String patientName(@RequestParam String lastName){
        return patientService.findbyName(lastName);
    }

    @RequestMapping(value = "/pacjent")
    public String index(final ModelMap model, Long idP) {
        model.addAttribute("nr", idP);
        Patient patient = patientService.findbyId(idP);
        model.addAttribute("imie", patient.getName());
        model.addAttribute("nazwisko", (patient.getLastName()));
        model.addAttribute("pesel", (patient.getPesel()));
        return "patient.html";
    }

    @GetMapping(path="/patientsall")
    public String listPatients(final ModelMap model) throws Exception {
        List<PatientEntity> allPatient = patientService.findAll();
        model.addAttribute("patients", allPatient);
        return  "patientAll.html";
    }
    @GetMapping(path="/all")
    @ResponseBody
    public String patientAll(){
        return (patientService.findAll()).toString();
    }

    @GetMapping(path="/namesWeb")
    public String patientNameWeb(final ModelMap model, @RequestParam String lastName){
        List<PatientEntity>patientByName = patientService.findByLastName(lastName);
        model.addAttribute("patientsByName", patientByName);
        return "patientByName.html";
    }
    @GetMapping(path="/index0")
    @ResponseBody
    public String indexOld() {
        return "Witamy w naszym systemie";
    }

    @GetMapping(path="/index")
    public String index() {
        return "index.html";
    }

}