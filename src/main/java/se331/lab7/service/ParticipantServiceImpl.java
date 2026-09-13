package se331.lab7.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se331.lab7.dao.ParticipantDao;
import se331.lab7.entity.Participant;


import java.util.List;

@Service
@RequiredArgsConstructor
public class ParticipantServiceImpl implements ParticipantService {
    final ParticipantDao participantDao;

    @Override
    public List<Participant> getAllParticipants() {
        return participantDao.getParticipants();
    }
}