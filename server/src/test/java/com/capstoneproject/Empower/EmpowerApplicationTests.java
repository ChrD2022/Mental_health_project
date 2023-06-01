package com.capstoneproject.Empower;

import com.capstoneproject.Empower.models.Affirmation;
import com.capstoneproject.Empower.models.Category;

import com.capstoneproject.Empower.repository.AffirmationRepository;
import com.capstoneproject.Empower.repository.CategoryRepository;
import com.capstoneproject.Empower.repository.ForumRepository;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmpowerApplicationTests {

	@Autowired
	AffirmationRepository affirmationRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	ForumRepository forumRepository;

	@Test
	public void contextLoads() {
	}



}
