package net.upliftinglemma.fate;

import org.springframework.data.repository.PagingAndSortingRepository;

import net.upliftinglemma.fate.FateCharacter;

public interface CharacterRepository extends PagingAndSortingRepository<FateCharacter, Long> {}

