package se331.lab7.dao;

import se331.lab7.entity.Participant;
import java.util.List;

public interface ParticipantDao {
    List<Participant> getParticipants();
}