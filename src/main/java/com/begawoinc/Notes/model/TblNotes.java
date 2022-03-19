package com.begawoinc.Notes.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tblnotes")
public class TblNotes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="notes_primary_key", nullable = false, length = 45)
	private String notes_primary_key;
	@Column(name="title", nullable = false, length = 2000)
	private String title;
	@Column(name="description", nullable = false, length = 4000)
	private String description;
	@Column(name="folder", nullable = true, length = 400)
	private String folder;
	@Column(name="is_deleted", nullable = true)
	private int is_deleted;
	
	@CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
	private Date created_at;
	@UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modified_at", nullable = true)
	private Date modified_at;
	
	public TblNotes() {
		super();
	}

	public TblNotes(String notes_primary_key, String title, String description, String folder, int is_deleted) {
		super();
		this.notes_primary_key = notes_primary_key;
		this.title = title;
		this.description = description;
		this.folder = folder;
		this.is_deleted = is_deleted;
	}

	public TblNotes(int id, String notes_primary_key, String title, String description, String folder, int is_deleted,
			Date created_at, Date modified_at) {
		super();
		this.id = id;
		this.notes_primary_key = notes_primary_key;
		this.title = title;
		this.description = description;
		this.folder = folder;
		this.is_deleted = is_deleted;
		this.created_at = created_at;
		this.modified_at = modified_at;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNotes_primary_key() {
		return notes_primary_key;
	}

	public void setNotes_primary_key(String notes_primary_key) {
		this.notes_primary_key = notes_primary_key;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	public int getIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getModified_at() {
		return modified_at;
	}

	public void setModified_at(Date modified_at) {
		this.modified_at = modified_at;
	}

}
