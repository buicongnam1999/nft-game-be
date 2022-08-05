package com.nftbe.database;

import com.nftbe.models.Skill;
import com.nftbe.repositories.ISkillRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SkillData extends BaseData {
    @Bean
    CommandLineRunner initDatabaseSkill(ISkillRepository skillRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                if (skillRepository.count() == 0) {
                    Skill skill = new Skill.Builder()
                            .skillLevel(1)
                            .skillThumbnail("Skill.png")
                            .skillDame(80)
                            .skillDef(50)
                            .skillNote("")
                            .build();

                    skillRepository.save(skill);
                }
            }
        };
    }
}
