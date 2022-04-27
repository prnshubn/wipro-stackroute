// Provide persistence solution code here
const fs = require("fs");

const persistSubmittedContact = (contact) => {
	var xhr = new XMLHttpRequest();
	xhr.open("POST", "http://localhost:3000/contacts", contact);
	if (contact) {
		xhr.setRequestHeader("Content-Type", "application/json");
	}
	xhr.onload = () => {
		console.log(xhr.response);
	};
	xhr.onerror = () => {
		console.log(xhr.response);
	};
	xhr.send(JSON.stringify(contact));
};

// Code to show the persisted data
const showPersistedData = () => {
	var xhr = new XMLHttpRequest();
	xhr.open("GET", "http://localhost:3000/contacts");

	xhr.onload = () => {
		console.log(JSON.parse(xhr.response));
	};
	xhr.onerror = () => {
		console.log(xhr.response);
	};
	xhr.send();
};

module.exports = { persistSubmittedContact, showPersistedData };
