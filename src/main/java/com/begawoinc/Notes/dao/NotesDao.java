package com.begawoinc.Notes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.begawoinc.Notes.model.TblNotes;

@Repository
public interface NotesDao extends JpaRepository<TblNotes, Integer> {
	
	TblNotes findById(int id);
	
}
