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
		return "<html><body>" + "<h1>Welcome to Notes Rest API, developed by <a href=\"https://sahil-asheikh.github.io\">Sahil A. Sheikh</a></h1>" + "</body></html>";
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
	
	@PutMapping("/updateNote")
	public TblNotes updateNote(@RequestBody TblNotes notes) {
		return noteService.updateNote(notes);
	}
	
	@DeleteMapping("/deleteNote/{id}")
	public void deleteNote(@PathVariable Integer id) {
		noteService.deleteNote(id);
	}
	
}
