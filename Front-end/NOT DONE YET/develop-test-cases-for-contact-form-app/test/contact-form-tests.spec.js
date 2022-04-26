const chai = require('chai');
const expect = chai.expect;
const path = require('path');
const { readFileSync } = require('fs');
const testSpecFile = readFileSync(path.join(__dirname, '../_tests_/contact-form-spec.js'), 'utf-8');

describe("Contact Form Tests", function () {
    it("should contain test suite", function () {

        expect(testSpecFile).contain("describe(");

    });

    it("should contain test suite with two test functions", function () {

        let regex = /\b(it|test)\(\".*\",.*\{/g;
        console.log(testSpecFile.replace("\r\n"," ").match(regex));
        expect(testSpecFile.replace("\r\n"," ").match(regex).length).to.equal(2);
    });
});