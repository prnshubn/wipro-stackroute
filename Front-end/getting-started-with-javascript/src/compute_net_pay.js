/*

The calculateNetPayable() function should accept 3 inputs:
pricePerKilo, quantityInKilo and discountPercentage.

Calculate the net amount post discount that would be payable.

The function should return the computed value.

The function should return error message "Invalid Input Types, All Inputs Should Be of Type Number !!", 
for any non-numeric value passed to the function.

*/

module.exports = function calculateNetPayable(pricePerKilo, quantityInKilo , discountPercentage) {

	if(typeof(pricePerKilo)=='number' && typeof(quantityInKilo)=='number' && typeof(discountPercentage)=='number' )
	{
		var t=pricePerKilo* quantityInKilo ;
		return ""+(t-(t*discountPercentage*0.01));
	}
	else
	{
		return "Invalid Input Types, All Inputs Should Be of Type Number !!";
	}

}


