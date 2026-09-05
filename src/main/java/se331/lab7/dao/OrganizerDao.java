package se331.lab7.dao;

import se331.lab7.entity.Organizer;
import java.util.List;

public interface OrganizerDao {
    Integer getOrganizerSize();
    List<Organizer> getOrganizer(Integer page, Integer pageSize);
    Organizer getOrganizer(Long id);
    Organizer save(Organizer organizer);
}
