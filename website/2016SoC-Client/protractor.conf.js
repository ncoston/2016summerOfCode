exports.config = {
  // The address of a running selenium server.
  seleniumServerJar: 'node_modules/protractor/selenium/selenium-server-standalone-2.45.0.jar',


  // Spec patterns are relative to the location of this config.
  specs: [
    'spec/*_spec.js'
  ],


  multiCapabilities: [{
    'browserName': 'firefox'
  }, {
    'browserName': 'chrome'
  }],


  // A base URL for your application under test. Calls to protractor.get()
  // with relative paths will be prepended with this.
  baseUrl: 'http://localhost',


  jasmineNodeOpts: {
    onComplete: null,
    isVerbose: false,
    showColors: true,
    includeStackTrace: true,
    defaultTimeoutInterval: 20000
  }
};
