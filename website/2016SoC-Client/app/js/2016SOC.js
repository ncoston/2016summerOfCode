(function () {
	//create our angular module

	var app = angular.module('2016SOC', ['ui.router', 'ngSanitize', 'ui.bootstrap', 'ngLodash','oitozero.ngSweetAlert',]);

	//configure routing
	app.config(function ($stateProvider, $urlRouterProvider, $httpProvider) {
    
		$urlRouterProvider.otherwise('/');
        $stateProvider
            .state('login', {
                url: '/',
                templateUrl: 'html/views/login.html',
                controller: 'LoginController'
            });
            
        $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
	});

})();
