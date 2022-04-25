
/*
The drawPattern() function should accept number of rows as input.
The function should return string that contains the pyramid structure for the number of rows inputted.
The pyramid structure should have the following pattern:
        *
       * *
      * * *
     * * * *
    * * * * *
The function should return error message "Invalid Input Type, Row Input Should Be of Type Number !!", 
if non-numeric value is passed to the function.


*/
module.exports = function drawPattern(rows) {
  // Provide Solution Code Heretyp

  if(typeof(rows)=='number')
 {
  let s="";

  for(let i = 1; i <= rows; i++){
    let str = '';
    
    //Add the white space to the left
    for(let k = 1; k <= rows - i; k++){
      str += ' ';
    }
    
    //Add the '*' for each row
    for(let j = 1; j <= i; j++){
      str += '* ';
    }
    
    //Print the pyramid pattern for each row
    s+=str+"\n";
  
  }

  return s;
}
else{
  return "Invalid Input Type, Row Input Should Be of Type Number !!";
}
}


