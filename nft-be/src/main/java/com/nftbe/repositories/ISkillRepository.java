package com.nftbe.repositories;

import com.nftbe.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISkillRepository extends JpaRepository<Skill, Integer> {
}
