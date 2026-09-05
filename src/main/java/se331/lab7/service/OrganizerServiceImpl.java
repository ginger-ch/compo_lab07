package se331.lab7.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se331.lab7.dao.OrganizerDao;
import se331.lab7.entity.Organizer;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrganizerServiceImpl implements OrganizerService {
    final OrganizerDao eventDao;

    @Override
    public Integer getOrganizerSize() {
        return eventDao.getOrganizerSize();
    }

    @Override
    public List<Organizer> getOrganizer(Integer pageSize, Integer page) {
        return eventDao.getOrganizer(pageSize, page);
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return eventDao.getOrganizer(id);
    }

    @Override
    public Organizer save(Organizer organizer) {
        return eventDao.save(organizer);
    }
}