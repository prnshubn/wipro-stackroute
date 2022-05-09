let url = "http://localhost:3000/contacts"

function persistSubmittedContact(contact){
  let xhr = new XMLHttpRequest();
  xhr.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 201) {
      console.log("Data added successfully");
      let tableBody = document.getElementById('contact-list').getElementsByTagName('table')[0].getElementsByTagName('tbody')[0];
      tableBody.innerHTML += `<tr>
      <td>${contact.firstName}</td>
      <td>${contact.lastName}</td>
      <td>${contact.email}</td>
      <td>${contact.homeNo}</td>
      <td><button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" onmousedown='getDetails(${contact.id})'>+</button></td>
      </tr>`
    }
  };
  xhr.open("POST", url, true);
  xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
  xhr.send(JSON.stringify(contact));

}

const getDetails = (id)=>{
// console.log(id)
  let promise = axios.get(`${url}/${id}`);
  promise.then(response=>{
    let contact = response.data;
    document.getElementById('contact-data').innerHTML = `
    <li><strong>${contact.firstName} ${contact.lastName}</strong></li>
    <li>Home ${contact.homeNo} </li>
    <li>Work ${contact.workNo} </li>
    <li>Birthdate ${contact.birthDate}</li>
    <li>Company ${contact.company}</li>
    <li>Job Title ${contact.jobTitle}</li>
    <li>${contact.notes}</li>`;
  })

}

// Code to show the persisted data
const showPersistedData = () => {

  let promise = axios.get(url);

  promise.then(response=>{
    
    let tableBody = document.getElementById('contact-list').getElementsByTagName('table')[0].getElementsByTagName('tbody')[0];
    let contacts = response.data.sort((a,b)=> {
      if(a.firstName > b.firstName) 
        return 1;
      else
        return -1;
    })
    contacts.forEach(contact=>{
      
      tableBody.innerHTML += `<tr>
      <td>${contact.firstName}</td>
      <td>${contact.lastName}</td>
      <td>${contact.email}</td>
      <td>${contact.homeNo}</td>
      <td><button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" onmousedown='getDetails(${contact.id})'>+</button></td>
      </tr>`
    })
  })
}
showPersistedData();

