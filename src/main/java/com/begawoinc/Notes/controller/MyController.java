package com.begawoinc.Notes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.begawoinc.Notes.model.TblNotes;
import com.begawoinc.Notes.services.NotesService;

@RestController
public class MyController {
	
	@Autowired
	NotesService noteService;
	
	@GetMapping("/")
	public String welcome() {
		String message = "<html><body style=\"font-family: Arial, Helvetica, Verdana, sans-serif;\">";
		message += "<h1>Welcome to Notes Rest API, developed by <a href=\"https://sahil-asheikh.github.io\">Sahil A. Sheikh</a></h1>";
		message += "<p>";
		message += "&nbsp &nbsp 1.  (POST)  /notes/{note} = to add a note<br>";
		message += "&nbsp &nbsp 2.  (GET)  /notes = to get all notes<br>";
		message += "&nbsp &nbsp 3.  (GET)  /notes/id = to get specific note<br>";
		message += "&nbsp &nbsp 4.  (PUT)  /updateNote/{note} = to update a note<br>";
		message += "&nbsp &nbsp 5.  (PUT)  /softDelete/{id} = to delete the note (temporary)<br>";
		message += "&nbsp &nbsp 6.  (PUT)  /softRecover/{id} = to recover the note (only if it is deleted temporary)<br>";
		message += "&nbsp &nbsp 7.  (DELETE)  /delete/{id} = to delete the note (permanently)<br></p>";
		message += "</body></html>";
		
		return message;
	}
	
	@PostMapping("/notes")
	public TblNotes notes(@RequestBody TblNotes notes) {
		return noteService.addNote(notes);
	}
	
	@GetMapping("/notes")
	public List<TblNotes> notes() {
		return noteService.getNotes();
	}
	
	@GetMapping("/notes/{id}")
	public TblNotes notes(@PathVariable Integer id) {
		return noteService.getNote(id);
	}
	
//	@GetMapping("/notes/{notes_primary_key}")
//	public TblNotes notes(@RequestParam String notes_primary_key) {
//		return noteService.getNote(notes_primary_key.toString());
//	}
	
	@PutMapping("/updateNote")
	public TblNotes updateNote(@RequestBody TblNotes notes) {
		return noteService.updateNote(notes);
	}
	
	@PutMapping("/softDelete/{id}")
	public TblNotes softDelete(@PathVariable Integer id) {
		return noteService.softDelete(id);
	}
	
	@PutMapping("/softRecover/{id}")
	public TblNotes softRecover(@PathVariable Integer id) {
		return noteService.softRecover(id);
	}
	
	@DeleteMapping("/deleteNote/{id}")
	public void deleteNote(@PathVariable Integer id) {
		noteService.deleteNote(id);
	}
	
}
