// provide the validation code here
const cs = require("./contact_service.js");

function submitContact() {
	let contact = {
		firstName: "P",
		lastName: "B",
		email: "PB@gmail.com",
		homeNo: "119",
		contactAddedOn: "12",
	};
	cs.persistSubmittedContact(contact);
}

function showPersistedData() {
	cs.showPersistedData();
}
