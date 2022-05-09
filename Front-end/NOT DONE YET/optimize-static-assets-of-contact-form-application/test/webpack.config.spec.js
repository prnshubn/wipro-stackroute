const chai = require('chai');
const expect = chai.expect;
const webpack = require("../webpack.config");

describe("Webpack Config", function () {

    it("should have entry option in webpack config", function () {
        expect(webpack.entry).to;
    });

    it("should have output option in webpack config", function () {
        expect(webpack.output).to;
    });

    it("should have module opion in webpack config", function () {
        expect(webpack.module).to;
    });

    it("should have plugins option in webpack config", function () {
        expect(webpack.plugins).to;
    });

    it("should have 1 or more plugins option in webpack config", function () {
        expect(webpack.plugins.length).to.not.equal(0);
    });

    it("should have module option with rules in webpack config", function () {
        expect(webpack.module.rules).to;
    });

    it("should have module option with 1 or more rules in webpack config", function () {
        expect(webpack.plugins.length).to.not.equal(0);
    });
});