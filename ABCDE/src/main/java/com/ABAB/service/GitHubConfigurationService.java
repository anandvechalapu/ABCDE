package com.ABAB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ABAB.model.GitHubConfiguration;
import com.ABAB.repository.GitHubConfigurationRepository;

@Service
@Transactional
public class GitHubConfigurationService {
	
	@Autowired
	private GitHubConfigurationRepository gitHubConfigurationRepository;
	
	public GitHubConfiguration getConfigurationByUserNameAndPasswordAndUrl(String userName, String password, String url) {
		return gitHubConfigurationRepository.findByUserNameAndPasswordAndUrl(userName, password, url);
	}
	
	public GitHubConfiguration getConfigurationByRepositoryName(String repositoryName) {
		return gitHubConfigurationRepository.findByRepositoryName(repositoryName);
	}
	
	public GitHubConfiguration getConfigurationByTitleAndUserNameAndUrl(String title, String userName, String url) {
		return gitHubConfigurationRepository.findByTitleAndUserNameAndUrl(title, userName, url);
	}
	
	public List<GitHubConfiguration> getAllConfigurations() {
		return gitHubConfigurationRepository.findAll();
	}
	
	public void deleteConfigurationByTitle(String title) {
		gitHubConfigurationRepository.deleteByTitle(title);
	}

}