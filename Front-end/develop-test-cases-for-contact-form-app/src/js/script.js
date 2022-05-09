let addContactButton = document.getElementById('addContactNo');

if (addContactButton !== null)
    addContactButton.addEventListener('click', (event) => {
        event.preventDefault();
        let contactsDiv = document.getElementById('contactNos');
        let count = contactsDiv.childElementCount;
        if (count < 4) {
            let contactNoDiv = document.createElement('div');

            contactNoDiv.innerHTML = `<input style="width: 90% !important;display: inline !important" 
        class="form-control form-control-sm" 
        placeholder="Enter Contact No" id=contactNo${count + 1}>
        <small id="contactNo${count + 1}Error"></small>`

            contactNoDiv.classList.add('col-md-6');
            contactsDiv.appendChild(contactNoDiv);
        }
    })

const submitContact = (formData) => {

    console.log(formData);
    //contact object captures all the inputs provided
    let contact = Object.fromEntries(new FormData(formData))
    console.log(contact)
    //errors object captures all the validation errors
    let errors = {
        firstNameError: validateFirstName(contact.firstname),
        lastNameError: validateLastName(contact.lastname),
        emailError: validateEmail(contact.email),
        homeNoError: validateHomeNo(contact.homeNo),
        workNoError: validateWorkNo(contact.workNo),
        notesError: validateNotes(contact.notes)
    }

    if (document.getElementById('contactNo3') !== null) {
        contact.contactNo3 = document.getElementById('contactNo3').value;
        errors.contactNo3Error = validateContactNo3(contact.contactNo3);
    }

    if (document.getElementById('contactNo4') !== null) {
        contact.contactNo4 = document.getElementById('contactNo4').value;
        errors.contactNo4Error = validateContactNo4(contact.contactNo4);
    }

    //filter out empty error messages
    let errorMessages = Object.values(errors).filter(e => e !== '');

    if (errorMessages.length > 0) {
        //display error messages alongside the input fields
        displayIndividualErrorMessages(errors);
        //display validation summary with error messages
        displayValidationSummary(errorMessages);
        return false;
    }
    else {
        //if no errors, save the contact
        persistSubmittedContact(contact);
        return true;
    }
    //contacts can be logged on to console, or can even be updated on UI
    console.log(contact);
}

//function to display validation summary with error messages provided
function displayValidationSummary(errorMessages) {
    document.getElementsByTagName('ul')[0].innerHTML = '';
    errorMessages.forEach(e => {
        document.getElementsByTagName('ul')[0].innerHTML += `<li>${e}</li>`
    });
}

//function to display error messages alongside the input fields
function displayIndividualErrorMessages(errorMessages) {
    document.getElementById('firstNameError').innerText = errorMessages.firstNameError ? "*" : "";// errorMessages.firstNameError;

    document.getElementById('lastNameError').innerText = errorMessages.lastNameError ? "*" : "";//;

    document.getElementById('emailError').innerText = errorMessages.emailError ? "*" : "";

    document.getElementById('homeNoError').innerText = errorMessages.homeNoError ? "*" : "";

    document.getElementById('workNoError').innerText = errorMessages.workNoError ? "*" : "";

    document.getElementById('notesError').innerText = errorMessages.notesError ? "*" : "";

    if (document.getElementById('contactNo3') !== null)
        document.getElementById('contactNo3Error').innerText = errorMessages.contactNo3Error ? "*" : "";

    if (document.getElementById('contactNo4') !== null)
        document.getElementById('contactNo4Error').innerText = errorMessages.contactNo4Error ? "*" : "";
}

//function to validate firstName
const validateFirstName = (firstName) => {

    let firstNameError = "";

    if (isFieldBlank(firstName))
        firstNameError = "FirstName cannot be left blank";

    else if (!isNameValid(firstName))
        firstNameError = "FirstName can contain only alphabets and (.)";

    return firstNameError;
}

//function to validate lastName
const validateLastName = (lastName) => {

    let lastNameError = '';
    if (!(isFieldBlank(lastName)) && !isNameValid(lastName))
        lastNameError = "LastName can contain only alphabets and (.)";;

    return lastNameError;
}

//function to validate email
const validateEmail = (email) => {
    let emailError = '';
    let validRegex = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;

    if (isFieldBlank(email))
        emailError += "Email cannot be left blank";

    else if (!email.match(validRegex))
        emailError += 'Invalid Email';

    return emailError;

}

//function to validate home contact no
const validateHomeNo = (homeNo) => {
    let homeNoError = '';

    if (isFieldBlank(homeNo))
        homeNoError += "Home No cannot be left blank";

    else if (!isContactNoValid(homeNo))
        homeNoError += 'Invalid Home No';

    return homeNoError;
}


//function to validate work no
const validateWorkNo = (workNo) => {
    let workNoError = '';
    if (!isContactNoValid(workNo))
        workNoError += 'Work Contact No start with country code prefixed by + and followed by 10 digits';

    return workNoError;
}

//function to validate additional contact no 3
const validateContactNo3 = (contactNo) => {
    let contactNoError = '';
    if (!isContactNoValid(contactNo))
        contactNoError += 'Contact No 3 start with country code prefixed by + and followed by 10 digits';

    return contactNoError;
}

//function to validate additional contact no 4
const validateContactNo4 = (contactNo) => {
    if (!isContactNoValid(contactNo))
        contactNoError += 'Contact No 4 start with country code prefixed by + and followed by 10 digits';

    return contactNoError;
}

//function to validate job title
const validateJobTitle = (jobTitle) => {
    if (isFieldBlank(jobTitle))
        return "Job Title cannot be left blank"
    else
        return "";
}

//function to validate company
const validateCompany = (company) => {
    if (isFieldBlank(company))
        return "Company cannot be left blank"
    else
        return "";
}

//function to validate notes
const validateNotes = (notes) => {
    let notesError = '';
    if (!isFieldBlank(notes) && notes.length > 200)
        notesError = 'Notes should contain maximum of 200 characters';
    return notesError;
}

//function to validate birthdate
const validateBirthDate = (birthDate) => {
    let birthDateError = '';
    if (isFieldBlank(birthDate))
        birthDateError = "Birth Date cannot be left blank";

    return birthDateError;
}

// reusable validation functions

// 1. function to check for valid names (firstname / lastname)
const isNameValid = (name) => {
    let validRegEx = "^[a-zA-Z.]+$";
    return name.match(validRegEx)
}

// 2. function to check for blank fields
const isFieldBlank = (value) => {
    return value === '' || value === undefined || value === null;
}

// 3. function to check if entered contact no is valid or not
const isContactNoValid = (contactNo) => {

    //to validate following patterns of contact nos
    //+1 0999999999, +1 099-999-9999, +1 (099)-999-9999, +1 (099)9999999, +1 099 999 9999, +1 099 999-9999, +1 (099) 999-9999, +1 099.999.9999
    //+10999999999, +1099-999-9999, +1(099)-999-9999, +1(099)9999999, +1099 999 9999, +1099 999-9999, +1(099) 999-9999, +1099.999.9999

    let validRegex = /^(\+[0-9]{1,3})[ ]?\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;

    return !(!isFieldBlank(contactNo) && !contactNo.match(validRegex))

}



//disable all dates for whom age is less than 18
let birthdate = document.getElementById('birthdate');
let maxDate = new Date(new Date().getFullYear() - 15, new Date().getMonth(), new Date().getDay());
if (birthdate !== null) birthdate.setAttribute('max', maxDate.toISOString().split('T')[0])