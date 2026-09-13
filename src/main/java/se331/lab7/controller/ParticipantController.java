package se331.lab7.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se331.lab7.entity.dto.ParticipantDTO;
import se331.lab7.service.ParticipantService;
import se331.lab7.util.LabMapper;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ParticipantController {
    final ParticipantService participantService;

    @GetMapping("/participants")
    public ResponseEntity<List<ParticipantDTO>> getParticipants() {
        return ResponseEntity.ok(
                LabMapper.INSTANCE.toParticipantDTO(participantService.getAllParticipants())
        );
    }
}