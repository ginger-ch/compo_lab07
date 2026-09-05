package se331.lab7.dao;

import se331.lab7.entity.Event;
import org.springframework.data.domain.Page;

public interface EventDao {
    Integer getEventSize();
    Page<Event> getEvents(Integer page, Integer pageSize);
    Event getEvent(Long id);
}
