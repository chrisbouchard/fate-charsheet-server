package net.upliftinglemma.fate;

import org.springframework.data.repository.PagingAndSortingRepository;
import net.upliftinglemma.fate.Character;

public interface CharacterRepository extends PagingAndSortingRepository<Character, Integer> {}
