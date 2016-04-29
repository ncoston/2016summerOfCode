/*
 * Created by Luke on 29 December 2015
 */

(function() {

angular.module("2016SOC")

.controller("LoginController", ["$scope","SweetAlert", function ($scope, SweetAlert) {
	$scope.login = {
		username: "",
		password: ""
	};

	$scope.handleLogin = function () {
		SweetAlert.swal("Not ready!", "Sorry everyone, the 2016 summer of code isn't quite ready yet, check back soon!", "warning");
	};
}]);

})();