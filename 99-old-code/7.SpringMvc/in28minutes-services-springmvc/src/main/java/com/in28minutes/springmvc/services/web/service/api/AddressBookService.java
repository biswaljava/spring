package com.biswaljava.springmvc.services.web.service.api;

import java.util.List;

import com.biswaljava.springmvc.services.web.model.AddressBook;

public interface AddressBookService {
	List<AddressBook> viewAllAddressBook();

	void createAddressBook(AddressBook addressBook);

	void updateAddressBook(int pos, AddressBook updateAddressBook);

	void deleteAddressBook(int id);

	void deleteAllAddressBook();

	AddressBook findAddressBook(int id);
}
