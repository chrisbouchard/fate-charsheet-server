package net.upliftinglemma.fate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(exported = false)
public interface StressTrackRepository extends CrudRepository<StressTrack, Integer> {}

