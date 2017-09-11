var reporter = require('cucumber-html-reporter');


console.log("Cucumber HTML Reporter started");

try {

    var args = process.argv.slice(2);

    var options = {
            theme: 'bootstrap',
            jsonDir: args[0],
            output: args[1],
            reportSuiteAsScenarios: false,
            launchReport: false,
        ignoreBadJsonFile: true,
        name: "Desk-Net HTML Test Report",
        brandTitle: "Desk-Net HTML Test Report"
        };

    reporter.generate(options);

}
catch (err) {
    console.log("Error");
    console.log(err)
}
finally {
    console.log("Cucumber HTML Reporter finished");
}