package com.begawoinc.Notes.services;

import java.util.List;

import com.begawoinc.Notes.model.TblNotes;

public interface NotesService {
	
	public TblNotes addNote(TblNotes note);
	public List<TblNotes> getNotes();
	public TblNotes getNote(int id);
//	public TblNotes getNote(String notes_primary_key);
	public TblNotes updateNote(TblNotes note);
	public TblNotes softDelete(int id);
	public TblNotes softRecover(int id);
	public void deleteNote(int id);
	
}
