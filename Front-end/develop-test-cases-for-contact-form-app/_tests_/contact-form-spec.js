/*
User Story : Contact Submission
Scenario 1 : All Details correctly provided
Given: contact
When: contact is submitted
Then: return true
And: persistSubmittedContact() is called

Scenario 2 : Invalid Details provided
Given: contact
When: contact is submitted
Then: return false
And: displayValidationSummary() is called
And: displayIndividualErrorMessages() is called
*/
const chai = require('chai');
const expect = chai.expect;
const path = require('path');
const contactService = require("../js/contact_service");
const script = require("../js/script");

describe("Contact Submission",function(){
        it("provides all correct details",  () =>{
            if(expect(script.submitContact).to.be.true){
                expect(contactService.persistSubmittedContact).to.have.been.called;
            }
        
    });
        it("provides invalid details",  () =>{
            if(expect(script.submitContact).to.be.false){
                expect(script.displayValidationSummary).to.have.been.called;
                expect(script.displayIndividualErrorMessages).to.have.been.called;
            }
    });
})
