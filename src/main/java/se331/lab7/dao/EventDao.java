package se331.lab7.dao;

import se331.lab7.entity.Event;
import java.util.List;

public interface EventDao {
    Integer getEventSize();
    List<Event> getEvents(Integer page, Integer pageSize);
    Event getEvent(Long id);
}
