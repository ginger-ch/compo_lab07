package se331.lab7.service;

import org.springframework.data.domain.Page;
import se331.lab7.entity.Organizer;
import java.util.List;

public interface OrganizerService {
    Integer getOrganizerSize();
    Organizer getOrganizer(Long id);
    Organizer save(Organizer organizer);
    List<Organizer> getAllOrganizer();
    Page<Organizer> getOrganizer(Integer page, Integer pageSize);

}