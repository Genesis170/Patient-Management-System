package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

public class PatientMapper {


    public static PatientResponseDTO toDTO (Patient patient) {
        PatientResponseDTO dto = new PatientResponseDTO();
        dto.setId(patient.getId().toString());
        dto.setId(patient.getName());
        dto.setId(patient.getAddress());
        dto.setId(patient.getEmail());
        dto.setId(patient.getDateOfBirth().toString());
        return dto;
    }

}
