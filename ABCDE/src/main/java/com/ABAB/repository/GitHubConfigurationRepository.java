package com.ABAB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ABAB.model.GitHubConfiguration;

public interface GitHubConfigurationRepository extends JpaRepository<GitHubConfiguration, Long> {
	
	GitHubConfiguration findByUserNameAndPasswordAndUrl(String userName, String password, String url);
	
	GitHubConfiguration findByRepositoryName(String repositoryName);
	
	GitHubConfiguration findByTitleAndUserNameAndUrl(String title, String userName, String url);
	
	void deleteByTitle(String title);

}