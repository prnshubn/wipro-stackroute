import { persistSubmittedContact, showPersistedData, getDetails } from './contact_service';
import { submitContact } from './script';

import  '../css/style.css';

// console.log('tracking user');

let contactForm = document.forms['contactForm'];

contactForm.addEventListener('submit',event=>{
  event.preventDefault();
  submitContact(Object.fromEntries(new FormData(contactForm)))
})


