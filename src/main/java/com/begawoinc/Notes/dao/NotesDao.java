package com.begawoinc.Notes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.begawoinc.Notes.model.TblNotes;

public interface NotesDao extends JpaRepository<TblNotes, Integer> {
	
}
