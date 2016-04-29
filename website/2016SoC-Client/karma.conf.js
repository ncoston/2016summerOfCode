module.exports = function(config) {
  config.set({
    basePath: '',
    frameworks: ['jasmine'],
    preprocessors: {
      'app/**/*.html': ['ng-html2js']
    },
     files: [
      "app/bower_components/angular/angular.js",
      "app/bower_components/angular-bootstrap/ui-bootstrap-tpls.js",
      "app/bower_components/angular-resource/angular-resource.js",
      "app/bower_components/angular-ui-router/release/angular-ui-router.min.js",
      "app/bower_components/ng-file-upload/ng-file-upload-all.min.js",
      "app/bower_components/ng-lodash/build/ng-lodash.min.js",
      "app/bower_components/angular-moment/angular-moment.min.js",
      "app/bower_components/dygraphs/dygraph-combined.js",
      "app/bower_components/lodash/dist/lodash.min.js",
      "app/bower_components/angular-cookies/angular-cookies.min.js",
      "app/bower_components/angular-sweetalert/SweetAlert.min.js",
      "app/bower_components/sweetalert/dist/sweetalert.min.js",
      "app/bower_components/angular-sanitize/angular-sanitize.min.js",
      "app/bower_components/angular-spinner/angular-spinner.min.js",
      "app/bower_components/ngprogress/build/ngprogress.min.js",
      "app/bower_components/angular-mocks/angular-mocks.js",
      'app/**/*.html',
      "app/js/saphira.js",
      "app/js/directives/*.js",
      "app/js/services/*.js",
      "app/js/services/*/*.js",
      "app/js/controllers/*.js",
      'jasmine_tests/*.js'

    ],
    ngHtml2JsPreprocessor: {
      stripPrefix: 'app/',
      moduleName: 'templates'
    },

    exclude: [
    ],
    reporters: ['dots'],
    port: 9876,
    colors: true,
    logLevel: config.LOG_INFO,
    autoWatch: true,
    browsers: ['PhantomJS'],
    singleRun: true
  });
};
