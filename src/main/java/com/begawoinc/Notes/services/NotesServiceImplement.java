package com.begawoinc.Notes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begawoinc.Notes.dao.NotesDao;
import com.begawoinc.Notes.model.TblNotes;

@Service
public class NotesServiceImplement implements NotesService {
	
	@Autowired
	private NotesDao notesDao;

	@Override
	public TblNotes addNote(TblNotes note) {
		return notesDao.save(note);
	}

	@Override
	public List<TblNotes> getNotes() {
		return notesDao.findAll();
	}

	@Override
	public TblNotes getNote(int id) {
		return notesDao.findById(id);
	}

	@Override
	public TblNotes updateNote(TblNotes note) {
		return notesDao.save(note);
	}

	@Override
	public void deleteNote(int id) {
		notesDao.deleteById(id);
	}
	
}
