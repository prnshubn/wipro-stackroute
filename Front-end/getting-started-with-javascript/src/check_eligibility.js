/*

The checkEligibility() function should accept age as input and check for eligibility to vote

The validity criteria for age is 18 and above.

The function should return true if eligibility criteria is satisfied else should retun false.

The function should return error message "Invalid Age Input, Age Should Only Be Number !!", 
for any non-numeric value passed to the function.

*/

module.exports = function checkEligibility(age) {
   
  
  var reg = new RegExp('^[0-9]*$');
  
  if (reg.test(age)==false) {
   
    return "Invalid Age Input, Age Should Only Be Number !!";
  }
  else if(age<18)
  return false;
  else
  return true;


}
