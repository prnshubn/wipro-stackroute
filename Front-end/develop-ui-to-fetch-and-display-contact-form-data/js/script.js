// put validation code here

function submitContact(event){ 
    let contact={
        firstName:event.target[0].value,
        lastName:event.target[1].value,
        email:event.target[2].value,
        homeNo:event.target[3].value,
        workNo:event.target[4].value,
        addContactNo:event.target[5].value,
        birthDate:event.target[6].value,
        company:event.target[7].value,
        jobTitle:event.target[8].value,
        notes:event.target[9].value,
    }  
    
        
        persistSubmittedContact(contact);
    
    }
    function validateNameFirst(name){
        let regex = /^[a-zA-Z ]{2,30}$/;
        if(!regex.test(name)){
            document.getElementById('firstNameError').innerHTML="Error in First Name";
            return false;
        }else{
        document.getElementById('firstNameError').innerHTML="";
        return true;
        }
      }
      
      function validateNameLast(name){
        let regex = /^[a-zA-Z ]{2,30}$/;
        if(!regex.test(name)){
            document.getElementById('lastNameError').innerHTML="Error in Last Name";
            return false;
        }else{
        document.getElementById('lastNameError').innerHTML="";
        return true;
        }
      }
      
      function validatePhoneNumberHome(number){
        const regex = /^\+?\d.\s?\(?\d{3}\)?[-.\s]?\d{3}[-.\s]?\d{4}?/; 
        if(!regex.test(number)){
            document.getElementById('homeNoError').innerHTML="Error in Home Phone Number";
            return false;
        }else{
        document.getElementById('homeNoError').innerHTML="";
        return true;
        }
      }
      
      function validatePhoneNumberWork(number){
        const regex = /^\+?\d.\s?\(?\d{3}\)?[-.\s]?\d{3}[-.\s]?\d{4}?/; 
        if(!regex.test(number)){
            document.getElementById('workNoError').innerHTML="Error in Work Phone Number";
            return false;
        }else{
        document.getElementById('workNoError').innerHTML="";
        return true;
        }
      }
      
      function validateEmail(email){
        let regex=/^\w+([\.-]?\w+)@\w+([\.-]?\w+)(\.\w{2,3})+$/;
        if(!regex.test(email)){
          document.getElementById('emailError').innerHTML="Error in Email";
          return false;
        }else{
          document.getElementById('emailError').innerHTML="";
          return true;
        }
      }
      
      function validateBirthDate(birthDate){
        let birthDateError = '';
        if (isFieldBlank(birthDate))
        {
            document.getElementById('birthDateError').innerHTML="Birth Date cannot be left blank";
            return false;
        }
        else{
            document.getElementById('birthDateError').innerHTML="";
            return true;
        }
    }
    const isFieldBlank = (value) => {
        return value === '' || value === undefined || value === null;
    }
    
      
      function validateCompany(cname){
        let regex = /^[a-zA-Z ]{2,30}$/;
        if(!regex.test(cname)){
            document.getElementById('companyError').innerHTML="Error in Company Name";
            return false;
        }else{
        document.getElementById('companyError').innerHTML="";
        return true;
        }
      }
      
      function validateJobTitle(title){
        let regex = /^[a-zA-Z ]{2,30}$/;
        if(!regex.test(title)){
            document.getElementById('jobTitleError').innerHTML="Error in Job Title";
            return false;
        }else{
        document.getElementById('jobTitleError').innerHTML="";
        return true;
        }
      }
    //disable all dates for whom age is less than 18
    let birthdate = document.getElementById('birthdate');
    let maxDate = new Date(new Date().getFullYear() - 15, new Date().getMonth(), new Date().getDay());
    if (birthdate !== null) birthdate.setAttribute('max', maxDate.toISOString().split('T')[0]);