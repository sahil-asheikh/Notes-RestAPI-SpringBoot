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
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Notes Rest API, developed by <a href=\"https://sahil-asheikh.github.io\">Sahil A. Sheikh</a>";
	}
	
	@PostMapping("/notes")
	public TblNotes notes(@RequestBody TblNotes notes) {
		return noteService.addNote(notes);
	}
	
	@GetMapping("/notes")
	public List<TblNotes> notes() {
		return noteService.getNotes();
	}
	
	@GetMapping("/notes/{notes}")
	public TblNotes notes(@PathVariable int id) {
		return noteService.getNote(id);
	}
	
	@PutMapping("/updateNote")
	public TblNotes updateNote(@RequestBody TblNotes notes) {
		return noteService.updateNote(notes);
	}
	
	@DeleteMapping("/deleteNote/{notes}")
	public void deleteNote(@PathVariable int id) {
		noteService.deleteNote(id);
	}
	
}
