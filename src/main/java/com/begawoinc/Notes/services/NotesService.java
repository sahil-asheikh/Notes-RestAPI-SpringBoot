package com.begawoinc.Notes.services;

import java.util.List;

import com.begawoinc.Notes.model.TblNotes;

public interface NotesService {
	
	public TblNotes addNote(TblNotes note);
	public List<TblNotes> getNotes();
	public TblNotes getNote(int id);
	public TblNotes updateNote(TblNotes note);
	public void deleteNote(int id);
	
}
