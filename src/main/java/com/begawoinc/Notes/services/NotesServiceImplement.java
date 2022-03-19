package com.begawoinc.Notes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.begawoinc.Notes.dao.NotesDao;
import com.begawoinc.Notes.model.TblNotes;
import com.begawoinc.Notes.utility.Utils;

@Service
public class NotesServiceImplement implements NotesService {
	
	@Autowired
	private NotesDao notesDao;

	@Override
	public TblNotes addNote(TblNotes note) {
		note.setNotes_primary_key(Utils.generatePublicId(30));
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
	
//	@Override
//	public TblNotes getNote(String notes_primary_key) {
//		return notesDao.findByNotes_primary_key(notes_primary_key);
//	}

	@Override
	public TblNotes updateNote(TblNotes note) {
		return notesDao.save(note);
	}

	@Override
	public TblNotes softDelete(int id) {
		TblNotes note = notesDao.findById(id);
		note.setIs_deleted(1);
		return notesDao.save(note);
	}

	@Override
	public TblNotes softRecover(int id) {
		TblNotes note = notesDao.findById(id);
		note.setIs_deleted(0);
		return notesDao.save(note);
	}

	@Override
	public void deleteNote(int id) {
		notesDao.deleteById(id);
	}
	
}
