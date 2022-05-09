const axios = require('axios');
let url = "http://localhost:3000/contacts"
// put the solution code to persist and fetch data here
 
/*
    persistSumittedContact() should contain code to persist given contact to server
    use axios to call the post method and persist data
    ensure the return from axios handles both success and error
    the posted data should be displayed on the browser as well.
*/
const persistSubmittedContact = (contact) => {   
    axios.post(url,contact).then((response)=>{
        console.log(response);
    }).catch((error)=>{
        console.log(error);
    });

}



/*
    getDetails() should contain code to fetch details of contact for the given contact-id from server
    use axios to call the get method and fetch data
    ensure the return from axios handles both success and error
    the fetched data should be displayed on the browser in a modal dialog.
*/
const getDetails = (id)=>{
   let returnPromise=axios.get(`${url}/${id}`);
   returnPromise.then((response)=>{
    let contact = response.data;
    document.getElementById('contact-data').innerHTML = `
    <li id="bold">${contact.firstName} ${contact.lastName}</li>
    <li>Home ${contact.homeNo} </li>
    <li>Work ${contact.workNo} </li>
    <li>Birthdate ${contact.birthDate}</li>
    <li>Company ${contact.company}</li>
    <li>Job Title ${contact.jobTitle}</li>
    <li>${contact.notes}</li>`;
   });
}

/*
    showPersistedData() should contain code to fetch details of all existing contacts from server
    use axios to call the get method and fetch data
    ensure the return from axios handles both success and error
    the fetched data should be displayed on the browser
*/

const showPersistedData = () => {
    
    let returnPromise=axios.get(url);

      returnPromise.then(response=>{
      let contacts = response.data.sort((a,b)=> {
        if(a.firstName > b.firstName) 
          return 1;
        else
          return -1;
      })
      //let tableBody = document.getElementById('contact-list').getElementsByTagName('table')[0].getElementsByTagName('tbody')[0];
      let list=document.getElementById('list');
      contacts.forEach(contact=>{
        list.innerHTML += `<tr>
        <td>${contact.firstName}</td>
        <td>${contact.lastName}</td>
        <td>${contact.email}</td>
        <td>${contact.homeNo}</td>
        <td><button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" onmousedown='getDetails(${contact.id})'>+</button></td>
        </tr>`
      })

})
}
 showPersistedData(); //uncomment this code to display the existing contacts on browser


module.exports = { persistSubmittedContact, showPersistedData, getDetails }