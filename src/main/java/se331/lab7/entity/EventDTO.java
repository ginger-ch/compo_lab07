package se331.lab7.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import se331.lab7.entity.dto.ParticipantDTO;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventDTO {
    Long id;
    String category;
    String title;
    String description;
    String location;
    String date;
    String time;
    Boolean petsAllowed;
    EventOrganizerDTO organizer;
    List<ParticipantDTO> participants;
}