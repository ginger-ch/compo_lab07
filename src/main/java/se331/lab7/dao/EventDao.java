package se331.lab7.dao;

import se331.lab7.entity.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface EventDao {
    Integer getEventSize();
    Page<Event> getEvents(Integer page, Integer pageSize);
    Event getEvent(Long id);
    Event save(Event event);
    Page<Event> getEvents(String name, Pageable pageable);
}
