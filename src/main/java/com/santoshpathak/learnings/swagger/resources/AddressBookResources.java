/**
 * 
 */
package com.santoshpathak.learnings.swagger.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santoshpathak.learnings.swagger.model.Contact;

import io.swagger.annotations.ApiOperation;

/**
 * @author santoshpathak
 *
 */
@RestController
@RequestMapping("/api/contacts")
public class AddressBookResources {
	
	ConcurrentMap<String, Contact> contacts = new ConcurrentHashMap<>();
	
	@GetMapping("/")
	@ApiOperation(value = "gets all the contacts", notes = "provides an way to query all the records from DB")
	public List<Contact> getAllContacts() {
		return (new ArrayList<Contact>(contacts.values()));
	}
	
	@GetMapping("/{id}")
	@ApiOperation(value = "gets the contact detail by contactId", notes = "provides an way to query the specific record based on Id")
	public Contact getContact(@PathVariable String id) {
		
		return contacts.get(id);
	}
	
	@PostMapping("/add")
	@ApiOperation(value = "Adds the contact detail in DB", notes = "provides an way to add the record in DB")
	public Contact addContact(@RequestBody Contact contact) {
		contacts.put(contact.getId(), contact);
		return contact;
	}

}
