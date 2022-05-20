package com.capgemini.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.model.entity.Issue;

public interface IssueDao extends JpaRepository<Issue, String> {

}
