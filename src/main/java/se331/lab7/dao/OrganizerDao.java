package se331.lab7.dao;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.lab7.entity.Organizer;
import java.util.List;

public interface OrganizerDao {
    Integer getOrganizerSize();
    List<Organizer> getOrganizer(Integer page, Integer pageSize);
    Organizer getOrganizer(Long id);
    Organizer save(Organizer organizer);
    Page<Organizer> getOrganizer(Pageable pageRequest);
    Optional<Organizer> findById(Long id);
}
